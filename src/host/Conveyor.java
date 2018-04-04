
package host;

import java.io.Serializable;

/**
 * Ruuvikuljetinta kuvaava luokka
 *
 */
public class Conveyor extends Thread implements Serializable{
  /*
   * Luokan Conveyor parametrit:
   * varattu: Ilmaisee, onko kyseess‰ oleva laite varattu. (true = varattu, false = vapaa)
   * siirtonopeus: Ilmaisee, kuinka nopeasti laite pystyy kuljettamaan raaka-ainetta. (kg/s)
   * k‰ytt‰j‰: Ilmaisee laitteen senhetkisen k‰ytt‰j‰n.
   */
  private boolean varattu;
  private int siirtonopeus; 
  private String k‰ytt‰j‰;
  
  /*
   * Luokan Conveyor konstruktori:
   * M‰‰ritt‰‰ laitteen aloitusarvot. Siirtonopeus teht‰v‰nannosta.
   */
  public Conveyor() {
    varattu = false;
    siirtonopeus = 200;
    k‰ytt‰j‰ = ""; 

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
  
  protected String getK‰ytt‰j‰() {
    return k‰ytt‰j‰;
  }
  protected void setK‰ytt‰j‰(String k‰ytt‰j‰) {
    this.k‰ytt‰j‰ = k‰ytt‰j‰;
  }
  
  /*
   * Run-metodi mallintaa aikaa, jonka Conveyor-laite veisi siirt‰ess‰‰n raaka-ainetta.
   * Se myˆs huolehtii itsens‰ "vapauttamisesta" muille k‰ytt‰jille suorituksensa loppuvaiheessa.
   */
  public void run(int m‰‰r‰) {
    try{
      System.out.println("Conveyor Started, amount: " + m‰‰r‰);
      Thread.sleep((m‰‰r‰/this.siirtonopeus) * 1000);
      varattu = false;
      System.out.println("Conveyor finished");
    }
    catch(InterruptedException e) {
      e.printStackTrace();
    }
  }
}
