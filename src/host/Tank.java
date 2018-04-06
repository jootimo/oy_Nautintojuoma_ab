
package host;

import java.io.Serializable;

/**
 * Kypsytyss�ili�t� kuvaava luokka
 */
public class Tank extends Thread implements Serializable{
  /*
   * Luokan Tank parametrit:
   * varattu: Ilmaisee, onko kyseess� oleva laite varattu. (true = varattu, false = vapaa)
   * tilavuus: Ilmaisee, kuinka paljon nestett� laitteessa on litroissa. (max. 10000 l)
   * k�ytt�j�: Ilmaisee laitteen senhetkisen k�ytt�j�n.
   */
  private boolean varattu;
  private int tilavuus; 
  private String kayttaja;
  
  /*
   * Luokan Tank konstruktori:
   * M��ritt�� laitteen aloitusarvot (oletuksena tyhj�).
   */
  public Tank() {
    varattu = false;
    tilavuus = 0;
    kayttaja = "";

  }
  
  /*
   * Luokan Tank getterit ja setterit:
   * HUOM! tilavuus-parametrin set-metodi ollaan korvattu lis��- ja v�henn�-metodilla.
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
  
  protected boolean lisaa(int juoma) {
    if (juoma <= 10000) {
      this.tilavuus = juoma;
      return true;
    }
    else {
      return false;
    }
  }
  protected boolean vahenna(int juoma) {
    if (this.tilavuus - juoma >= 0) {
      this.tilavuus -= juoma;
      System.out.println("Pumping from tank: " + juoma);
      return true;
    }
    else {
      return false;
    }
  }
  
  protected String getKayttaja() {
    return kayttaja;
  }
  protected void setKayttaja(String kayttaja) {
    this.kayttaja = kayttaja;
    if(!kayttaja.equals("")) System.out.println("Tank reserved for " + kayttaja);
    else System.out.println("Tank freed up");
  }
  
  /* 
  * Tank-tyyppiset laitteet eiv�t tarvitse run-metodia.
  */
}
