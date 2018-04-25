package host;

import java.io.Serializable;

/**
 * Juomakeitint� kuvaava luokka
 */
public class Processor extends Thread implements Serializable{
  /*
   * Luokan Processor parametrit:
   * varattu: Ilmaisee, onko kyseess� oleva laite varattu. (true = varattu, false = vapaa)
   * water: Ilmaisee laitteessa olevan veden m��r�n litroissa. (max. 10000 litraa!)
   * kiinte�: Ilmaisee laitteessa olevan kiinte�n raaka-aineen m��r�n kilogrammoissa. (max. 2000 kg!)
   * drink: Ilmaisee laitteessa olevan valmiin juoman m��r�n litroissa. (max. 10000 litraa!)
   * cookingTime: Ilmaisee laitteen tarvitseman ajan juoman valmistukseen sekunneissa.
   * k�ytt�j�: Ilmaisee laitteen senhetkisen k�ytt�j�n.
   */
  private boolean reserved;
  private boolean running;
  private int water;
  private int solid;
  private int drink;
  private int cookingTime;
  private String user;
  
  /*
   * Luokan Processor konstruktori:
   * M��ritt�� laitteen aloitusarvot (laite aloittaa "tyhj�n�"). Keittoaika teht�v�nannosta.
   */
  public Processor() {
    reserved = false;
    running = false;
    water = 0;
    solid = 0;
    drink = 0;
    cookingTime = 20;
    user = "";
  }
  
  /*
   * Luokan Processor getterit ja setterit:
   * (HUOM! setWater- ja setKiinte�-metodien lis�ksi luodaan my�s selkeytyssyist� metodit lis��Vesi ja lis��Kiinte�,
   * jotka korvaamisen sijaan kasvattavat laitteessa olevaa parametria.)
   */
  protected boolean getReserved() {
    return reserved;
  }
  protected void setReserved(boolean varattu) {
    this.reserved = varattu;
  }
  
  protected boolean getRunning() {
	return running;
  }
  protected void setRunning(boolean running) {
	this.running = running;
  }
  
  protected int getWater() {
    return water;
  }
  protected boolean addWater(int water) {
    if ((this.water + water) <= 10000) {
      this.water += water;
      return true;
    }
    else {
      return false;
    }
  }
  protected boolean setWater(int water) {
    if (water <= 10000) {
      this.water = water;
      return true;
    }
    else {
      return false;
    }
  }
  
  protected int getSolid() {
    return solid;
  }
  protected boolean addSolid(int solid) {
    if ((this.solid + solid) <= 2000) {
      this.solid += solid;
      return true;
    }
    else {
      return false;
    }
  }
  protected boolean setSolid(int solid) {
    if (solid <= 2000) {
      this.solid = solid;
      return true;
    }
    else {
      return false;
    }
  }
  
  protected int getDrink() {
    return drink;
  }
  protected boolean setDrink(int drink) {
    if ((drink <= 10000) && (this.water == 0) && (this.solid == 0)) {
      this.drink = drink; // Aikaisempi drink menee hukkaan - Ei haluta sekoittaa vanhaa juomaa uuteen!
      return true;
    }
    else {
      return false;
    }
  }
  
  protected int getCookingTime() {
    return cookingTime;
  }
  protected int getCookingTimeMs() { // palauttaa keittoajan millisekunteina!
    return cookingTime * 1000;
  }
  protected void setCookingTime(int cookingTime) {
    this.cookingTime = cookingTime;
  }
  
  protected String getUser() {
    return user;
  }
  protected void setUser(String user) {
	this.user = user;
    if(!user.equals("")) System.out.println("Processor reserved for " + user);
    else System.out.println("Processor freed up");
  }
  
  /*
   * Run-metodi odottaa Processorin eli juomakeittimen keitosvaiheen loppuun (teht�v�nanto: 20s), ja sen j�lkeen muuttaa
   * laitteen water- ja kiinte�-parametrit nolliksi. drink-parametri saa arvokseen keittimess� olleen veden m��r�n.
   * Lopuksi keitin ilmoittaa, ett� se ei ole en�� k�ynniss�.
   */
  public void run() {
    try{
      System.out.println("Processor Started");
      Thread.sleep(this.getCookingTimeMs());
      int temp = this.getWater();
      setWater(0);
      setSolid(0);
      setDrink(temp);
      running = false;
      System.out.println("Processor Finised");
    }
    catch(InterruptedException e) {
      e.printStackTrace();
    }
  }
}
