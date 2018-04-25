
package host;

import java.io.Serializable;

/**
 * Raaka-ainesiiloa kuvaava luokka
 */
public class Silo extends Thread implements Serializable{
  /*
   * Luokan Silo parametrit:
   * reserved: Ilmaisee, onko kyseess� oleva laite reserved. (true = reserved, false = vapaa)
   * t�ytt�aste: Ilmaisee, kuinka paljon raaka-ainetta laitteessa on kilogrammoissa. (max. 10000 kg)
   * k�ytt�j�: Ilmaisee laitteen senhetkisen k�ytt�j�n.
   */
  private boolean reserved;
  private int fill;
  private String user;
  
  /*
   * Luokan Silo konstruktori:
   * M��ritt�� laitteen aloitusarvot (oletuksena tyhj�).
   */
  public Silo() {
    fill = 0;
    reserved = false;
    user = "";
  }
  
  /*
   * Luokan Pump getterit ja setterit:
   * HUOM! t�ytt�asteen set-metodi ollaan korvattu lis��- ja v�henn�-metodilla.
   */
  protected boolean getReserved() {
    return reserved;
  }
  protected void setReserved(boolean reserved) {
    this.reserved = reserved;
  }
  
  protected int getFill() {
    return fill;
  }
  protected boolean addFill(int fill) {
    if (this.fill + fill <= 10000) {
      this.fill += fill;
      return true;
    }
    else {
      return false;
    }
  }
  protected boolean decreaseFill(int fill) {
    if (this.fill - fill >= 0) {
      this.fill -= fill;
      return true;
    }
    else {
      return false;
    }
  }
  
  protected String getUser() {
    return user;
  }
  protected void setUser(String user) {
    this.user = user;
    System.out.println("Silo reserved for " + user);
  }
  
 /* 
  * Silo-tyyppiset laitteet eiv�t tarvitse run-metodia.
  */
}
