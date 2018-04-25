
package host;

import java.io.Serializable;

/**
 * Kypsytyss�ili�t� kuvaava luokka
 */
public class Tank extends Thread implements Serializable{
  /*
   * Luokan Tank parametrit:
   * reserved: Ilmaisee, onko kyseess� oleva laite reserved. (true = reserved, false = vapaa)
   * volume: Ilmaisee, kuinka paljon nestett� laitteessa on litroissa. (max. 10000 l)
   * k�ytt�j�: Ilmaisee laitteen senhetkisen k�ytt�j�n.
   */
  private boolean reserved;
  private int volume;
  private String user;
  
  /*
   * Luokan Tank konstruktori:
   * M��ritt�� laitteen aloitusarvot (oletuksena tyhj�).
   */
  public Tank() {
    reserved = false;
    volume = 0;
    user = "";

  }
  
  /*
   * Luokan Tank getterit ja setterit:
   * HUOM! volume-parametrin set-metodi ollaan korvattu lis��- ja v�henn�-metodilla.
   */
  protected boolean getReserved() {
    return reserved;
  }
  protected void setReserved(boolean reserved) {
    this.reserved = reserved;
  }
  
  protected int getVolume() {
    return volume;
  }
  
  protected boolean add(int drink) {
    if (drink <= 10000) {
      this.volume = drink;
      return true;
    }
    else {
      return false;
    }
  }
  protected boolean decrease(int drink) {
    if (this.volume - drink >= 0) {
      this.volume -= drink;
      System.out.println("Pumping from tank: " + drink);
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
    if(!user.equals("")) System.out.println("Tank reserved for " + user);
    else System.out.println("Tank freed up");
  }
  
  /* 
  * Tank-tyyppiset laitteet eiv�t tarvitse run-metodia.
  */
}
