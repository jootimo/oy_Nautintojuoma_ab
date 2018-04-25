
package host;

import java.io.Serializable;

/**
 * Ruuvikuljetinta kuvaava luokka
 *
 */
public class Conveyor extends Thread implements Serializable{
  /*
   * Luokan Conveyor parametrit:
   * reserved: Ilmaisee, onko kyseess� oleva laite reserved. (true = reserved, false = vapaa)
   * throughput: Ilmaisee, kuinka nopeasti laite pystyy kuljettamaan raaka-ainetta. (kg/s)
   * k�ytt�j�: Ilmaisee laitteen senhetkisen k�ytt�j�n.
   */
  private boolean reserved;
  private int throughput;
  private String user;
  
  /*
   * Luokan Conveyor konstruktori:
   * M��ritt�� laitteen aloitusarvot. Siirtonopeus teht�v�nannosta.
   */
  public Conveyor() {
    reserved = false;
    throughput = 200;
    user = "";

  }
  
  /*
   * Luokan Conveyor getterit ja setterit:
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
   * Run-metodi mallintaa aikaa, jonka Conveyor-laite veisi siirt�ess��n raaka-ainetta.
   * Se my�s huolehtii itsens� "vapauttamisesta" muille k�ytt�jille suorituksensa loppuvaiheessa.
   */
  public void run(int amount) {
    try{
      System.out.println("Conveyor Started, amount: " + amount);
      Thread.sleep((amount/this.throughput) * 1000);
      reserved = false;
      System.out.println("Conveyor finished");
    }
    catch(InterruptedException e) {
      e.printStackTrace();
    }
  }
}
