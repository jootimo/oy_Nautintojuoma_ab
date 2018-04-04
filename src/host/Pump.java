
package host;

import java.io.Serializable;

/**
 * Pumppua kuvaava luokka
 */
public class Pump extends Thread implements Serializable{
  /*
   * Luokan Pump parametrit:
   * varattu: Ilmaisee, onko kyseess‰ oleva laite varattu. (true = varattu, false = vapaa)
   * siirtonopeus: Ilmaisee, kuinka nopeasti laite pystyy kuljettamaan nestett‰. (litraa/s)
   * k‰ytt‰j‰: Ilmaisee laitteen senhetkisen k‰ytt‰j‰n.
   */
  private boolean varattu;
  private int siirtonopeus; // l/s
  private String k‰ytt‰j‰;
  
  /*
   * Luokan Pump konstruktori:
   * M‰‰ritt‰‰ laitteen aloitusarvot. Siirtonopeus teht‰v‰nannosta.
   */
  public Pump() {
    varattu = false;
    siirtonopeus = 500;
    k‰ytt‰j‰ = "";

  }
  
  /*
   * Luokan Pump getterit ja setterit:
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
  
  protected String getK‰ytt‰j‰() {
    return k‰ytt‰j‰;
  }
  protected void setK‰ytt‰j‰(String k‰ytt‰j‰) {
    this.k‰ytt‰j‰ = k‰ytt‰j‰;
  }
  
   /*
   * Run-metodi mallintaa aikaa, jonka Pump-laite veisi siirt‰ess‰‰n nestett‰.
   * Se myˆs huolehtii itsens‰ "vapauttamisesta" muille k‰ytt‰jille suorituksensa loppuvaiheessa.
   */
  public void run(int m‰‰r‰) {
    try{
      System.out.println("Pump Started, amount: " + m‰‰r‰);
      Thread.sleep((m‰‰r‰/this.siirtonopeus) * 1000);
      varattu = false;
      System.out.println("Pump finished");
    }
    catch(InterruptedException e) {
      e.printStackTrace();
    }
  }
}
