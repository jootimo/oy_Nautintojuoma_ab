package host;

import java.io.Serializable;

/**
 * Juomakeitint‰ kuvaava luokka
 */
public class Processor extends Thread implements Serializable{
  /*
   * Luokan Processor parametrit:
   * varattu: Ilmaisee, onko kyseess‰ oleva laite varattu. (true = varattu, false = vapaa)
   * vesi: Ilmaisee laitteessa olevan veden m‰‰r‰n litroissa. (max. 10000 litraa!)
   * kiinte‰: Ilmaisee laitteessa olevan kiinte‰n raaka-aineen m‰‰r‰n kilogrammoissa. (max. 2000 kg!)
   * juoma: Ilmaisee laitteessa olevan valmiin juoman m‰‰r‰n litroissa. (max. 10000 litraa!)
   * keittoaika: Ilmaisee laitteen tarvitseman ajan juoman valmistukseen sekunneissa.
   * k‰ytt‰j‰: Ilmaisee laitteen senhetkisen k‰ytt‰j‰n.
   */
  private boolean varattu;
  private boolean running;
  private int vesi; 
  private int kiinte‰; 
  private int juoma; 
  private int keittoaika; 
  private String k‰ytt‰j‰;
  
  /*
   * Luokan Processor konstruktori:
   * M‰‰ritt‰‰ laitteen aloitusarvot (laite aloittaa "tyhj‰n‰"). Keittoaika teht‰v‰nannosta.
   */
  public Processor() {
    varattu = false;
    running = false;
    vesi = 0;
    kiinte‰ = 0;
    juoma = 0;
    keittoaika = 20;
    k‰ytt‰j‰ = "";
  }
  
  /*
   * Luokan Processor getterit ja setterit:
   * (HUOM! setVesi- ja setKiinte‰-metodien lis‰ksi luodaan myˆs selkeytyssyist‰ metodit lis‰‰Vesi ja lis‰‰Kiinte‰,
   * jotka korvaamisen sijaan kasvattavat laitteessa olevaa parametria.)
   */
  protected boolean getVarattu() {
    return varattu;
  }
  protected void setVarattu(boolean varattu) {
    this.varattu = varattu;
  }
  
  protected boolean getRunning() {
	return running;
  }
  protected void setRunning(boolean running) {
	this.running = running;
  }
  
  protected int getVesi() {
    return vesi;
  }
  protected boolean lis‰‰Vesi(int vesi) {
    if ((this.vesi + vesi) <= 10000) {
      this.vesi += vesi;
      return true;
    }
    else {
      return false;
    }
  }
  protected boolean setVesi(int vesi) {
    if (vesi <= 10000) {
      this.vesi = vesi;
      return true;
    }
    else {
      return false;
    }
  }
  
  protected int getKiinte‰() {
    return kiinte‰;
  }
  protected boolean lis‰‰Kiinte‰(int kiinte‰) {
    if ((this.kiinte‰ + kiinte‰) <= 2000) {
      this.kiinte‰ += kiinte‰;
      return true;
    }
    else {
      return false;
    }
  }
  protected boolean setKiinte‰(int kiinte‰) {
    if (kiinte‰ <= 2000) {
      this.kiinte‰ = kiinte‰;
      return true;
    }
    else {
      return false;
    }
  }
  
  protected int getJuoma() {
    return juoma;
  }
  protected boolean setJuoma(int juoma) {
    if ((juoma <= 10000) && (this.vesi == 0) && (this.kiinte‰ == 0)) {
      this.juoma = juoma; // Aikaisempi juoma menee hukkaan - Ei haluta sekoittaa vanhaa juomaa uuteen!
      return true;
    }
    else {
      return false;
    }
  }
  
  protected int getKeittoaika() {
    return keittoaika;
  }
  protected int getKeittoaikaMs() { // palauttaa keittoajan millisekunteina!
    return keittoaika * 1000; 
  }
  protected void setKeittoaika(int keittoaika) {
    this.keittoaika = keittoaika;
  }
  
  protected String getK‰ytt‰j‰() {
    return k‰ytt‰j‰;
  }
  protected void setK‰ytt‰j‰(String k‰ytt‰j‰) {
	this.k‰ytt‰j‰ = k‰ytt‰j‰;
    if(!k‰ytt‰j‰.equals("")) System.out.println("Processor reserved for " + k‰ytt‰j‰);
    else System.out.println("Processor freed up");
  }
  
  /*
   * Run-metodi odottaa Processorin eli juomakeittimen keitosvaiheen loppuun (teht‰v‰nanto: 20s), ja sen j‰lkeen muuttaa
   * laitteen vesi- ja kiinte‰-parametrit nolliksi. juoma-parametri saa arvokseen keittimess‰ olleen veden m‰‰r‰n.
   * Lopuksi keitin ilmoittaa, ett‰ se ei ole en‰‰ k‰ynniss‰.
   */
  public void run() {
    try{
      System.out.println("Processor Started");
      Thread.sleep(this.getKeittoaikaMs());
      int temp = this.getVesi();
      setVesi(0);
      setKiinte‰(0);
      setJuoma(temp);
      running = false;
      System.out.println("Processor Finised");
    }
    catch(InterruptedException e) {
      e.printStackTrace();
    }
  }
}
