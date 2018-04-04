
package host;

import java.io.Serializable;

/**
 * Raaka-ainesiiloa kuvaava luokka
 */
public class Silo extends Thread implements Serializable{
  /*
   * Luokan Silo parametrit:
   * varattu: Ilmaisee, onko kyseessä oleva laite varattu. (true = varattu, false = vapaa)
   * täyttöaste: Ilmaisee, kuinka paljon raaka-ainetta laitteessa on kilogrammoissa. (max. 10000 kg)
   * käyttäjä: Ilmaisee laitteen senhetkisen käyttäjän.
   */
  private boolean varattu;
  private int täyttöaste; 
  private String käyttäjä;
  
  /*
   * Luokan Silo konstruktori:
   * Määrittää laitteen aloitusarvot (oletuksena tyhjä).
   */
  public Silo() {
    täyttöaste = 0;
    varattu = false;
    käyttäjä = "";
  }
  
  /*
   * Luokan Pump getterit ja setterit:
   * HUOM! täyttöasteen set-metodi ollaan korvattu lisää- ja vähennä-metodilla.
   */
  protected boolean getVarattu() {
    return varattu;
  }
  protected void setVarattu(boolean varattu) {
    this.varattu = varattu;
  }
  
  protected int getTäyttöaste() {
    return täyttöaste;
  }
  protected boolean lisääTäyttöaste(int täyttöaste) {
    if (this.täyttöaste + täyttöaste <= 10000) {
      this.täyttöaste += täyttöaste;
      return true;
    }
    else {
      return false;
    }
  }
  protected boolean vähennäTäyttöaste(int täyttöaste) {
    if (this.täyttöaste - täyttöaste >= 0) {
      this.täyttöaste -= täyttöaste;
      return true;
    }
    else {
      return false;
    }
  }
  
  protected String getKäyttäjä() {
    return käyttäjä;
  }
  protected void setKäyttäjä(String käyttäjä) {
    this.käyttäjä = käyttäjä;
    System.out.println("Silo reserved for " + käyttäjä);
  }
  
 /* 
  * Silo-tyyppiset laitteet eivät tarvitse run-metodia.
  */
}
