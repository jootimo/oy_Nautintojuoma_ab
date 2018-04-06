
package host;

import java.io.Serializable;

/**
 * Raaka-ainesiiloa kuvaava luokka
 */
public class Silo extends Thread implements Serializable{
  /*
   * Luokan Silo parametrit:
   * varattu: Ilmaisee, onko kyseess� oleva laite varattu. (true = varattu, false = vapaa)
   * t�ytt�aste: Ilmaisee, kuinka paljon raaka-ainetta laitteessa on kilogrammoissa. (max. 10000 kg)
   * k�ytt�j�: Ilmaisee laitteen senhetkisen k�ytt�j�n.
   */
  private boolean varattu;
  private int tayttoaste;
  private String kayttaja;
  
  /*
   * Luokan Silo konstruktori:
   * M��ritt�� laitteen aloitusarvot (oletuksena tyhj�).
   */
  public Silo() {
    tayttoaste = 0;
    varattu = false;
    kayttaja = "";
  }
  
  /*
   * Luokan Pump getterit ja setterit:
   * HUOM! t�ytt�asteen set-metodi ollaan korvattu lis��- ja v�henn�-metodilla.
   */
  protected boolean getVarattu() {
    return varattu;
  }
  protected void setVarattu(boolean varattu) {
    this.varattu = varattu;
  }
  
  protected int getTayttoaste() {
    return tayttoaste;
  }
  protected boolean lisaaTayttoaste(int tayttoaste) {
    if (this.tayttoaste + tayttoaste <= 10000) {
      this.tayttoaste += tayttoaste;
      return true;
    }
    else {
      return false;
    }
  }
  protected boolean vahennaTayttoaste(int tayttoaste) {
    if (this.tayttoaste - tayttoaste >= 0) {
      this.tayttoaste -= tayttoaste;
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
    System.out.println("Silo reserved for " + kayttaja);
  }
  
 /* 
  * Silo-tyyppiset laitteet eiv�t tarvitse run-metodia.
  */
}
