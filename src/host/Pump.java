
package host;

import java.io.Serializable;

/**
 * Pumppua kuvaava luokka
 */
public class Pump extends Thread implements Serializable{
  /*
   * Luokan Pump parametrit:
   * reserved: Ilmaisee, onko kyseess� oleva laite reserved. (true = reserved, false = vapaa)
   * throughput: Ilmaisee, kuinka nopeasti laite pystyy kuljettamaan nestett�. (litraa/s)
   * k�ytt�j�: Ilmaisee laitteen senhetkisen k�ytt�j�n.
   */
  private boolean reserved;
  private int throughput; // l/s
  private String user;
  
  /*
   * Luokan Pump konstruktori:
   * M��ritt�� laitteen aloitusarvot. Siirtonopeus teht�v�nannosta.
   */
  public Pump() {
    reserved = false;
    throughput = 500;
    user = "";

  }
  
  /*
   * Luokan Pump getterit ja setterit:
   */
  protected boolean getReserved() {
    return reserved;
  }
  protected void setReserved(boolean reserved) {
    this.reserved = reserved;
  }
  
  protected int getThroughput() {
    return throughput;
  }
  protected void setThroughput(int throughput) {
    this.throughput = throughput;
  }
  
  protected String getUser() {
    return user;
  }
  protected void setUser(String user) {
    this.user = user;
  }
  
   /*
   * Run-metodi mallintaa aikaa, jonka Pump-laite veisi siirt�ess��n nestett�.
   * Se my�s huolehtii itsens� "vapauttamisesta" muille k�ytt�jille suorituksensa loppuvaiheessa.
   */
  public void run(int amount) {
    try{
      System.out.println("Pump Started, amount: " + amount);
      Thread.sleep((amount/this.throughput) * 1000);
      reserved = false;
      System.out.println("Pump finished");
    }
    catch(InterruptedException e) {
      e.printStackTrace();
    }
  }
}
