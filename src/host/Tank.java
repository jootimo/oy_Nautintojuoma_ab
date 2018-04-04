
package host;

import java.io.Serializable;

/**
 * Kypsytyss‰iliˆt‰ kuvaava luokka
 */
public class Tank extends Thread implements Serializable{
  /*
   * Luokan Tank parametrit:
   * varattu: Ilmaisee, onko kyseess‰ oleva laite varattu. (true = varattu, false = vapaa)
   * tilavuus: Ilmaisee, kuinka paljon nestett‰ laitteessa on litroissa. (max. 10000 l)
   * k‰ytt‰j‰: Ilmaisee laitteen senhetkisen k‰ytt‰j‰n.
   */
  private boolean varattu;
  private int tilavuus; 
  private String k‰ytt‰j‰;
  
  /*
   * Luokan Tank konstruktori:
   * M‰‰ritt‰‰ laitteen aloitusarvot (oletuksena tyhj‰).
   */
  public Tank() {
    varattu = false;
    tilavuus = 0;
    k‰ytt‰j‰ = "";

  }
  
  /*
   * Luokan Tank getterit ja setterit:
   * HUOM! tilavuus-parametrin set-metodi ollaan korvattu lis‰‰- ja v‰henn‰-metodilla.
   */
  protected boolean getVarattu() {
    return varattu;
  }
  protected void setVarattu(boolean varattu) {
    this.varattu = varattu;
  }
  
  protected int getTilavuus() {
    return tilavuus;
  }
  
  protected boolean lis‰‰(int juoma) {
    if (juoma <= 10000) {
      this.tilavuus = juoma;
      return true;
    }
    else {
      return false;
    }
  }
  protected boolean v‰henn‰(int juoma) {
    if (this.tilavuus - juoma >= 0) {
      this.tilavuus -= juoma;
      System.out.println("Pumping from tank: " + juoma);
      return true;
    }
    else {
      return false;
    }
  }
  
  protected String getK‰ytt‰j‰() {
    return k‰ytt‰j‰;
  }
  protected void setK‰ytt‰j‰(String k‰ytt‰j‰) {
    this.k‰ytt‰j‰ = k‰ytt‰j‰;
    if(!k‰ytt‰j‰.equals("")) System.out.println("Tank reserved for " + k‰ytt‰j‰);
    else System.out.println("Tank freed up");
  }
  
  /* 
  * Tank-tyyppiset laitteet eiv‰t tarvitse run-metodia.
  */
}
