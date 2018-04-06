
package host;

import java.io.Serializable;

/**
 * Ruuvikuljetinta kuvaava luokka
 *
 */
public class Conveyor extends Thread implements Serializable{
  /*
   * Luokan Conveyor parametrit:
   * varattu: Ilmaisee, onko kyseess� oleva laite varattu. (true = varattu, false = vapaa)
   * siirtonopeus: Ilmaisee, kuinka nopeasti laite pystyy kuljettamaan raaka-ainetta. (kg/s)
   * k�ytt�j�: Ilmaisee laitteen senhetkisen k�ytt�j�n.
   */
  private boolean varattu;
  private int siirtonopeus; 
  private String kayttaja;
  
  /*
   * Luokan Conveyor konstruktori:
   * M��ritt�� laitteen aloitusarvot. Siirtonopeus teht�v�nannosta.
   */
  public Conveyor() {
    varattu = false;
    siirtonopeus = 200;
    kayttaja = "";

  }
  
  /*
   * Luokan Conveyor getterit ja setterit:
   */
  protected boolean getVarattu() {
    return varattu;
  }
  protected void setVarattu(boolean varattu) {
    this.varattu = varattu;
  }
  
  protected int getSiirtonopeus() {
    return siirtonopeus;
  }
  protected void setSiirtonopeus(int siirtonopeus) {
    this.siirtonopeus = siirtonopeus;
  }
  
  protected String getKayttaja() {
    return kayttaja;
  }
  protected void setKayttaja(String kayttaja) {
    this.kayttaja = kayttaja;
  }
  
  /*
   * Run-metodi mallintaa aikaa, jonka Conveyor-laite veisi siirt�ess��n raaka-ainetta.
   * Se my�s huolehtii itsens� "vapauttamisesta" muille k�ytt�jille suorituksensa loppuvaiheessa.
   */
  public void run(int maara) {
    try{
      System.out.println("Conveyor Started, amount: " + maara);
      Thread.sleep((maara/this.siirtonopeus) * 1000);
      varattu = false;
      System.out.println("Conveyor finished");
    }
    catch(InterruptedException e) {
      e.printStackTrace();
    }
  }
}
