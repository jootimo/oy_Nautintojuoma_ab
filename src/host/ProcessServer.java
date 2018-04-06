package host;

import java.util.ArrayList;

/**
 * Prosessin ydin, pitaa ylla prosessin tilaa. Valittaa kaynnistys- ja varauskutsut laitteille. Pitaa kirjaa asiakkaista.
 */
public class ProcessServer {

 private ArrayList<String> users;
 private ProcessState state;
 private Conveyor siloLoader;
 private Silo silo1;
 private Silo silo2;
 private Silo silo3;
 private Silo silo4;
 private Conveyor procLoader1;
 private Conveyor procLoader2;
 private Processor proc1;
 private Processor proc2;
 private Processor proc3;
 private Pump pump1;
 private Pump pump2;
 private Tank tank1;
 private Tank tank2;
 private Tank tank3;
 private Tank tank4;
 private Tank tank5;
 private Tank tank6;
 private Tank tank7;
 private Tank tank8;
 private Tank tank9;
 private Tank tank10;
 private Pump bottlePump1;
 private Pump bottlePump2;
 
 /**
  * Palvelinolion alustava konstruktori
  */
 public ProcessServer() {
  super();
  users = new ArrayList<String>();
  this.siloLoader = new Conveyor();
  this.silo1 = new Silo();
  this.silo2 = new Silo();
  this.silo3 = new Silo();
  this.silo4 = new Silo();
  this.procLoader1 = new Conveyor();
  this.procLoader2 = new Conveyor();
  this.proc1 = new Processor();
  this.proc2 = new Processor();
  this.proc3 = new Processor();
  this.pump1 = new Pump();
  this.pump2 = new Pump();
  this.tank1 = new Tank();
  this.tank2 = new Tank();
  this.tank3 = new Tank();
  this.tank4 = new Tank();
  this.tank5 = new Tank();
  this.tank6 = new Tank();
  this.tank7 = new Tank();
  this.tank8 = new Tank();
  this.tank9 = new Tank();
  this.tank10 = new Tank();
  this.bottlePump1 = new Pump();
  this.bottlePump2 = new Pump();
  this.state = new ProcessState(siloLoader, silo1, silo2, silo3, silo4, procLoader1, procLoader2, proc1, proc2,
        proc3, pump1, pump2, tank1, tank2, tank3, tank4, tank5, tank6, tank7, tank8, tank9,
        tank10, bottlePump1, bottlePump2);

  System.out.println("Server started");
 }
 
 
 /**
  * Palauttaa palvelimen tilaa kuvaavan olion.
  * @return tilaolio
  */
 public ProcessState getState(){
  return state;
 }
 
 
 /**
  * Kirjaa kayttajan palvelimelle.
  * @param name kayttajan nimi
  * @return aina true
  */
 public boolean login(String name) {
		users.add(name); //Kaiken nimiset kayttajat tervetulleita
		System.out.println(name + " logged in");
		return true;
	 }

 
 /**
  * Tehtaan komponenttien (Silo, Conveyor, Processor, Pump, Tank) varaamismetodi.
  * @param laitteenNimi varattava laite
  * @param asiakas varauspyynnon lahettaja
 * @throws AlreadyReservedException 
  */
 public void reserve(String laitteenNimi, String asiakas) throws AlreadyReservedException {
   if (laitteenNimi.equals("silo1")) {
     if (!silo1.getVarattu()) {
       silo1.setVarattu(true);
       silo1.setKayttaja(asiakas);
     }
     else {
    	 throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("silo2")) {
     if (!silo2.getVarattu()) {
       silo2.setVarattu(true);
       silo2.setKayttaja(asiakas);
     }
     else {
    	 throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("silo3")) {
     if (!silo3.getVarattu()) {
       silo3.setVarattu(true);
       silo3.setKayttaja(asiakas);
     }
     else {
    	 throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("silo4")) {
     if (!silo4.getVarattu()) {
       silo4.setVarattu(true);
       silo4.setKayttaja(asiakas);
     }
     else {
    	 throw new AlreadyReservedException("Laite jo varattu"); 
     }
   }
   else if (laitteenNimi.equals("siloLoader")) {
     if (!siloLoader.getVarattu()) {
       siloLoader.setVarattu(true);
       siloLoader.setKayttaja(asiakas);
     }
     else {
    	 throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("procLoader1")) {
     if (!procLoader1.getVarattu()) {
       procLoader1.setVarattu(true);
       procLoader1.setKayttaja(asiakas);
     }
     else {
    	 throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("procLoader2")) {
     if (!procLoader2.getVarattu()) {
       procLoader2.setVarattu(true);
       procLoader2.setKayttaja(asiakas);
     }
     else {
    	 throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("proc1")) {
       proc1.setVarattu(true);
       proc1.setKayttaja(asiakas);
        }
   else if (laitteenNimi.equals("proc2")) {
	   proc2.setVarattu(true);
       proc2.setKayttaja(asiakas);
     }
   else if (laitteenNimi.equals("proc3")) {
	   proc3.setVarattu(true);
       proc3.setKayttaja(asiakas);
     }
   
   else if (laitteenNimi.equals("pump1")) {
     if (!pump1.getVarattu()) {
       pump1.setVarattu(true);
       pump1.setKayttaja(asiakas);
     }
     else {
    	 throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("pump2")) {
     if (!pump2.getVarattu()) {
       pump2.setVarattu(true);
       pump2.setKayttaja(asiakas);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("bottlePump1")) {
     if (!bottlePump1.getVarattu()) {
       bottlePump1.setVarattu(true);
       bottlePump1.setKayttaja(asiakas);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("bottlePump2")) {
     if (!bottlePump2.getVarattu()) {
       bottlePump2.setVarattu(true);
       bottlePump2.setKayttaja(asiakas);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("tank1")) {
     if (!tank1.getVarattu()) {
       tank1.setVarattu(true);
       tank1.setKayttaja(asiakas);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("tank2")) {
     if (!tank2.getVarattu()) {
       tank2.setVarattu(true);
       tank2.setKayttaja(asiakas);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("tank3")) {
     if (!tank3.getVarattu()) {
       tank3.setVarattu(true);
       tank3.setKayttaja(asiakas);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("tank4")) {
     if (!tank4.getVarattu()) {
       tank4.setVarattu(true);
       tank4.setKayttaja(asiakas);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("tank5")) {
     if (!tank5.getVarattu()) {
       tank5.setVarattu(true);
       tank5.setKayttaja(asiakas);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("tank6")) {
     if (!tank6.getVarattu()) {
       tank6.setVarattu(true);
       tank6.setKayttaja(asiakas);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("tank7")) {
     if (!tank7.getVarattu()) {
       tank7.setVarattu(true);
       tank7.setKayttaja(asiakas);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("tank8")) {
     if (!tank8.getVarattu()) {
       tank8.setVarattu(true);
       tank8.setKayttaja(asiakas);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("tank9")) {
     if (!tank9.getVarattu()) {
       tank9.setVarattu(true);
       tank9.setKayttaja(asiakas);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("tank10")) {
     if (!tank10.getVarattu()) {
       tank10.setVarattu(true);
       tank10.setKayttaja(asiakas);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   } 
 }
 
 
 /**
  * Tehtaan komponenttien (Silo, Conveyor, Processor, Pump, Tank) vapauttamismetodit.
  * @param laitteenNimi vapautettava laite
  */
 public void freeUp(String laitteenNimi) {
   if (laitteenNimi.equals("silo1")) {
     silo1.setVarattu(false);
     silo1.setKayttaja("");
   }
   else if (laitteenNimi.equals("silo2")) {
     silo2.setVarattu(false);
     silo2.setKayttaja("");
   }
   else if (laitteenNimi.equals("silo3")) {
     silo3.setVarattu(false);
     silo3.setKayttaja("");
   }
   else if (laitteenNimi.equals("silo4")) {
     silo4.setVarattu(false);
     silo4.setKayttaja("");
   }
   else if (laitteenNimi.equals("siloLoader")) {
     siloLoader.setVarattu(false);
     siloLoader.setKayttaja("");
   }
   else if (laitteenNimi.equals("procLoader1")) {
     procLoader1.setVarattu(false);
     procLoader1.setKayttaja("");
   }
   else if (laitteenNimi.equals("procLoader2")) {
     procLoader2.setVarattu(false);
     procLoader2.setKayttaja("");
   }
   else if (laitteenNimi.equals("proc1")) {
     proc1.setVarattu(false);
     proc1.setRunning(false);
     proc1.setKayttaja("");
   }
   else if (laitteenNimi.equals("proc2")) {
     proc2.setVarattu(false);
     proc2.setRunning(false);
     proc2.setKayttaja("");
   }
   else if (laitteenNimi.equals("proc3")) {
     proc3.setVarattu(false);
     proc3.setRunning(false);
     proc3.setKayttaja("");
   }
   else if (laitteenNimi.equals("pump1")) {
     pump1.setVarattu(false);
     pump1.setKayttaja("");
   }
   else if (laitteenNimi.equals("pump2")) {
     pump2.setVarattu(false);
     pump2.setKayttaja("");
   }
   else if (laitteenNimi.equals("bottlePump1")) {
     bottlePump1.setVarattu(false);
     bottlePump1.setKayttaja("");
   }
   else if (laitteenNimi.equals("bottlePump2")) {
     bottlePump2.setVarattu(false);
     bottlePump2.setKayttaja("");
   }
   else if (laitteenNimi.equals("tank1")) {
     tank1.setVarattu(false);
     tank1.setKayttaja("");
   }
   else if (laitteenNimi.equals("tank2")) {
     tank2.setVarattu(false);
     tank2.setKayttaja("");
   }
   else if (laitteenNimi.equals("tank3")) {
     tank3.setVarattu(false);
     tank3.setKayttaja("");
   }
   else if (laitteenNimi.equals("tank4")) {
     tank4.setVarattu(false);
     tank4.setKayttaja("");
   }
   else if (laitteenNimi.equals("tank5")) {
     tank5.setVarattu(false);
     tank5.setKayttaja("");
   }
   else if (laitteenNimi.equals("tank6")) {
     tank6.setVarattu(false);
     tank6.setKayttaja("");
   }
   else if (laitteenNimi.equals("tank7")) {
     tank7.setVarattu(false);
     tank7.setKayttaja("");
   }
   else if (laitteenNimi.equals("tank8")) {
     tank8.setVarattu(false);
     tank8.setKayttaja("");
   }
   else if (laitteenNimi.equals("tank9")) {
     tank9.setVarattu(false);
     tank9.setKayttaja("");
   }
   else if (laitteenNimi.equals("tank10")) {
     tank10.setVarattu(false);
     tank10.setKayttaja("");
   } 
 }
 
 
 /**
  * Saie, jossa laitteen kaynnistysmetodia kutsutaan. Nain Server ei jaa jumiin laitetta kaynnistettaessa.
  * @param laitteenNimi kaynnistettava laite
  * @param asiakas kaynnistyspyynnon lahettaja
  * @param maara raaka-aineen/juoman maara
  */
 public void start(String laitteenNimi, String asiakas, int maara) {
	 Thread t = new Thread(){
		 public void run(){
			 try {
				startDevice(laitteenNimi, asiakas, maara);
			} catch (AlreadyReservedException e) {
				e.printStackTrace();
			}
		 }
	 };
	 t.start();
 }
 
 
 /**
  * Tehtaan komponenttien (Silo, Conveyor, Processor, Pump, Tank) kaynnistysmetodit.
  * @param laitteenNimi kaynnistettava laite
  * @param asiakas kaynnistyspyynnon lahettaja
  * @param maara raaka-aineen/juoman maara
 * @throws Exception 
  */
 public void startDevice(String laitteenNimi, String asiakas, int maara) throws AlreadyReservedException {
   
   switch(laitteenNimi){
     
     case "siloLoader":
       
     if ((!siloLoader.getVarattu())) {
    	reserve("siloLoader", asiakas);
       if ((siloLoader.getKayttaja()).equals(asiakas)) {
         if ((silo1.getKayttaja()).equals(asiakas)) {
           siloLoader.run(maara);
           silo1.lisaaTayttoaste(maara);
         }
         else if ((silo2.getKayttaja()).equals(asiakas)) {
           siloLoader.run(maara);
           silo2.lisaaTayttoaste(maara);
         } 
         else if ((silo3.getKayttaja()).equals(asiakas)) {
           siloLoader.run(maara);
           silo3.lisaaTayttoaste(maara);
         }
         else if ((silo4.getKayttaja()).equals(asiakas)) {
           siloLoader.run(maara);
           silo4.lisaaTayttoaste(maara);
         }
         freeUp("siloLoader");
       }
       else {
         System.out.println("Vaara kayttaja!");
       }
     }
       else {
       System.out.println("Laitetta ei varattu!");
     }
     break;
     
     case "procLoader1":
         
         reserve("procLoader1", asiakas);

         if ((silo1.getKayttaja()).equals(asiakas)) {
           if ((silo1.getTayttoaste() - maara) < 0) {  // Varmistetaan, ettei siilosta yriteta ottaa enempaa kuin mita siella on.
             System.out.println("ERROR: Not enough material in the silo!");
             freeUp("procLoader1");
             break;
           }
           if ((proc1.getKayttaja()).equals(asiakas)) {
             procLoader1.run(maara);
             silo1.vahennaTayttoaste(maara);
             proc1.lisaaKiintea(maara);
             proc1.lisaaVesi(maara * 5);
           }
           else if ((proc2.getKayttaja()).equals(asiakas)) {
             procLoader1.run(maara);
             silo1.vahennaTayttoaste(maara);
             proc2.lisaaKiintea(maara);
             proc2.lisaaVesi(maara * 5);
           }
           else if ((proc3.getKayttaja()).equals(asiakas)) {
             procLoader1.run(maara);
             silo1.vahennaTayttoaste(maara);
             proc3.lisaaKiintea(maara);
             proc3.lisaaVesi(maara * 5);
           }
           if (silo1.getTayttoaste() == 0) { // Vapautetaan siilo kayttajalta, jos se tyhjenee.
             freeUp("silo1");
           }
         }
         
         else if ((silo2.getKayttaja()).equals(asiakas)) {
           if ((silo2.getTayttoaste() - maara) < 0) {  // Varmistetaan, ettei siilosta yriteta ottaa enempaa kuin mita siella on.
             System.out.println("ERROR: Not enough material in the silo!");
             freeUp("procLoader1");
             break;
           }
           if ((proc1.getKayttaja()).equals(asiakas)) {
             procLoader1.run(maara);
             silo2.vahennaTayttoaste(maara);
             proc1.lisaaKiintea(maara);
             proc1.lisaaVesi(maara * 5);
           }
           else if ((proc2.getKayttaja()).equals(asiakas)) {
             procLoader1.run(maara);
             silo2.vahennaTayttoaste(maara);
             proc2.lisaaKiintea(maara);
             proc2.lisaaVesi(maara * 5);
           }
           else if ((proc3.getKayttaja()).equals(asiakas)) {
             procLoader1.run(maara);
             silo2.vahennaTayttoaste(maara);
             proc3.lisaaKiintea(maara);
             proc3.lisaaVesi(maara * 5);
           }
           if (silo2.getTayttoaste() == 0) { // Vapautetaan siilo kayttajalta, jos se tyhjenee.
             freeUp("silo2");
           }
         }
         
         else if ((silo3.getKayttaja()).equals(asiakas)) {
            if ((silo3.getTayttoaste() - maara) < 0) {  // Varmistetaan, ettei siilosta yriteta ottaa enempaa kuin mita siella on.
             System.out.println("ERROR: Not enough material in the silo!");
             freeUp("procLoader1");
             break;
            }
            if ((proc1.getKayttaja()).equals(asiakas)) {
              procLoader1.run(maara);
              silo3.vahennaTayttoaste(maara);
              proc1.lisaaKiintea(maara);
              proc1.lisaaVesi(maara * 5);
            }
            else if ((proc2.getKayttaja()).equals(asiakas)) {
              procLoader1.run(maara);
              silo3.vahennaTayttoaste(maara);
              proc2.lisaaKiintea(maara);
              proc2.lisaaVesi(maara * 5);
            }
            else if ((proc3.getKayttaja()).equals(asiakas)) {
              procLoader1.run(maara);
              silo3.vahennaTayttoaste(maara);
              proc3.lisaaKiintea(maara);
              proc3.lisaaVesi(maara * 5);
            }
            if (silo3.getTayttoaste() == 0) { // Vapautetaan siilo kayttajalta, jos se tyhjenee.
              freeUp("silo3");
            }
         }
         
           else if ((silo4.getKayttaja()).equals(asiakas)) {
             if ((silo4.getTayttoaste() - maara) < 0) {  // Varmistetaan, ettei siilosta yriteta ottaa enempaa kuin mita siella on.
             System.out.println("ERROR: Not enough material in the silo!");
             freeUp("procLoader1");
             break;
             }
             if ((proc1.getKayttaja()).equals(asiakas)) {
               procLoader1.run(maara);
               silo4.vahennaTayttoaste(maara);
               proc1.lisaaKiintea(maara);
               proc1.lisaaVesi(maara * 5);
             }
             else if ((proc2.getKayttaja()).equals(asiakas)) {
               procLoader1.run(maara);
               silo4.vahennaTayttoaste(maara);
               proc2.lisaaKiintea(maara);
               proc2.lisaaVesi(maara * 5);
             }
             else if ((proc3.getKayttaja()).equals(asiakas)) {
               procLoader1.run(maara);
               silo4.vahennaTayttoaste(maara);
               proc3.lisaaKiintea(maara);
               proc3.lisaaVesi(maara * 5);
             }
             if (silo4.getTayttoaste() == 0) { // Vapautetaan siilo kayttajalta, jos se tyhjenee.
               freeUp("silo4");
             }
           }
           freeUp("procLoader1");
         
       break;
         
     	case "procLoader2":
         
        
        reserve("procLoader2", asiakas);
           
           if ((silo1.getKayttaja()).equals(asiakas)) {
             if ((silo1.getTayttoaste() - maara) < 0) {  // Varmistetaan, ettei siilosta yriteta ottaa enempaa kuin mita siella on.
             System.out.println("ERROR: Not enough material in the silo!");
             freeUp("procLoader2");
             break;
             }
             if ((proc1.getKayttaja()).equals(asiakas)) {
               procLoader2.run(maara);
               silo1.vahennaTayttoaste(maara);
               proc1.lisaaKiintea(maara);
               proc1.lisaaVesi(maara * 5);
             }
             else if ((proc2.getKayttaja()).equals(asiakas)) {
               procLoader2.run(maara);
               silo1.vahennaTayttoaste(maara);
               proc2.lisaaKiintea(maara);
               proc2.lisaaVesi(maara * 5);
             }
             else if ((proc3.getKayttaja()).equals(asiakas)) {
               procLoader2.run(maara);
               silo1.vahennaTayttoaste(maara);
               proc3.lisaaKiintea(maara);
               proc3.lisaaVesi(maara * 5);
             }
             if (silo1.getTayttoaste() == 0) { // Vapautetaan siilo kayttajalta, jos se tyhjenee.
               freeUp("silo1");
             }
           }
           
           else if ((silo2.getKayttaja()).equals(asiakas)) {
             if ((silo2.getTayttoaste() - maara) < 0) {  // Varmistetaan, ettei siilosta yriteta ottaa enempaa kuin mita siella on.
             System.out.println("ERROR: Not enough material in the silo!");
             freeUp("procLoader2");
             break;
             }
             if ((proc1.getKayttaja()).equals(asiakas)) {
               procLoader2.run(maara);
               silo2.vahennaTayttoaste(maara);
               proc1.lisaaKiintea(maara);
               proc1.lisaaVesi(maara * 5);
             }
             else if ((proc2.getKayttaja()).equals(asiakas)) {
               procLoader2.run(maara);
               silo2.vahennaTayttoaste(maara);
               proc2.lisaaKiintea(maara);
               proc2.lisaaVesi(maara * 5);
             }
             else if ((proc3.getKayttaja()).equals(asiakas)) {
               procLoader2.run(maara);
               silo2.vahennaTayttoaste(maara);
               proc3.lisaaKiintea(maara);
               proc3.lisaaVesi(maara * 5);
             }
             if (silo2.getTayttoaste() == 0) { // Vapautetaan siilo kayttajalta, jos se tyhjenee.
               freeUp("silo2");
             }
           }
           
           else if ((silo3.getKayttaja()).equals(asiakas)) {
             if ((silo3.getTayttoaste() - maara) < 0) {  // Varmistetaan, ettei siilosta yriteta ottaa enempaa kuin mita siella on.
             System.out.println("ERROR: Not enough material in the silo!");
             freeUp("procLoader2");
             break;
             }
             if ((proc1.getKayttaja()).equals(asiakas)) {
               procLoader2.run(maara);
               silo3.vahennaTayttoaste(maara);
               proc1.lisaaKiintea(maara);
               proc1.lisaaVesi(maara * 5);
             }
             else if ((proc2.getKayttaja()).equals(asiakas)) {
               procLoader2.run(maara);
               silo3.vahennaTayttoaste(maara);
               proc2.lisaaKiintea(maara);
               proc2.lisaaVesi(maara * 5);
             }
             else if ((proc3.getKayttaja()).equals(asiakas)) {
               procLoader2.run(maara);
               silo3.vahennaTayttoaste(maara);
               proc3.lisaaKiintea(maara);
               proc3.lisaaVesi(maara * 5);
             }
             if (silo3.getTayttoaste() == 0) { // Vapautetaan siilo kayttajalta, jos se tyhjenee.
               freeUp("silo3");
             }
           }
           
           else if ((silo4.getKayttaja()).equals(asiakas)) {
             if ((silo4.getTayttoaste() - maara) < 0) {  // Varmistetaan, ettei siilosta yriteta ottaa enempaa kuin mita siella on.
             System.out.println("ERROR: Not enough material in the silo!");
             freeUp("procLoader2");
             break;
             }
             if ((proc1.getKayttaja()).equals(asiakas)) {
               procLoader2.run(maara);
               silo4.vahennaTayttoaste(maara);
               proc1.lisaaKiintea(maara);
               proc1.lisaaVesi(maara * 5);
             }
             else if ((proc2.getKayttaja()).equals(asiakas)) {
               procLoader2.run(maara);
               silo4.vahennaTayttoaste(maara);
               proc2.lisaaKiintea(maara);
               proc2.lisaaVesi(maara * 5);
             }
             else if ((proc3.getKayttaja()).equals(asiakas)) {
               procLoader2.run(maara);
               silo4.vahennaTayttoaste(maara);
               proc3.lisaaKiintea(maara);
               proc3.lisaaVesi(maara * 5);
             }
             if (silo4.getTayttoaste() == 0) { // Vapautetaan siilo kayttajalta, jos se tyhjenee.
               freeUp("silo4");
             }
           }
           freeUp("procLoader2");
         
       break;     
     
       /*
      * HUOM!
      * Pump-laitteet pumppaavat automaattisesti kaiken keittimesta kypsytyssailioon, 
      * joten maara-parametria ei tarvita!
      */     
       case "pump1":
           
   	      reserve("pump1", asiakas);
   	         if ((proc1.getKayttaja()).equals(asiakas)) {
   	           int temp = proc1.getJuoma();
   	           if (temp == 0) {  // varmistetaan, etta ei lahdeta pumppaamaan tyhjaa juomakeittimen juomasailiota!
   	             System.out.println("ERROR: No beverage to pump!");
   	             freeUp("pump1");
   	             break;
   	           }
   	           if ((tank1.getKayttaja()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank1.lisaa(temp);
   	           }
   	           else if ((tank2.getKayttaja()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank2.lisaa(temp);
   	           }
   	           else if ((tank3.getKayttaja()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank3.lisaa(temp);
   	           }
   	           else if ((tank4.getKayttaja()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank4.lisaa(temp);
   	           }
   	           else if ((tank5.getKayttaja()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank5.lisaa(temp);
   	           }
   	           else if ((tank6.getKayttaja()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank6.lisaa(temp);
   	           }
   	           else if ((tank7.getKayttaja()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank7.lisaa(temp);
   	           }
   	           else if ((tank8.getKayttaja()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank8.lisaa(temp);
   	           }
   	           else if ((tank9.getKayttaja()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank9.lisaa(temp);
   	           }
   	           else if ((tank10.getKayttaja()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank10.lisaa(temp);
   	           }
   	           else {
   	             System.out.println("ERROR: No tank reserved for the beverage!");
   	           }
   	         }
   	         
   	         else if ((proc2.getKayttaja()).equals(asiakas)) {
   	           int temp = proc2.getJuoma();
   	           if (temp == 0) {  // varmistetaan, etta ei lahdeta pumppaamaan tyhjaa juomakeittimen juomasailiota!
   	             System.out.println("ERROR: No beverage to pump!");
   	             freeUp("pump1");
   	             break;
   	           } 
   	           if ((tank1.getKayttaja()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank1.lisaa(temp);
   	           }
   	           else if ((tank2.getKayttaja()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank2.lisaa(temp);
   	           }
   	           else if ((tank3.getKayttaja()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank3.lisaa(temp);
   	           }
   	           else if ((tank4.getKayttaja()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank4.lisaa(temp);
   	           }
   	           else if ((tank5.getKayttaja()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank5.lisaa(temp);
   	           }
   	           else if ((tank6.getKayttaja()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank6.lisaa(temp);
   	           }
   	           else if ((tank7.getKayttaja()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank7.lisaa(temp);
   	           }
   	           else if ((tank8.getKayttaja()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank8.lisaa(temp);
   	           }
   	           else if ((tank9.getKayttaja()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank9.lisaa(temp);
   	           }
   	           else if ((tank10.getKayttaja()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank10.lisaa(temp);
   	           }
   	           else {
   	             System.out.println("ERROR: No tank reserved for the beverage!");
   	           }
   	         }
   	         
   	         else if ((proc3.getKayttaja()).equals(asiakas)) {
   	           int temp = proc3.getJuoma();
   	           if (temp == 0) {  // varmistetaan, etta ei lahdeta pumppaamaan tyhjaa juomakeittimen juomasailiota!
   	             System.out.println("ERROR: No beverage to pump!");
   	             freeUp("pump1");
   	             break;
   	           }
   	           if ((tank1.getKayttaja()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank1.lisaa(temp);
   	           }
   	           else if ((tank2.getKayttaja()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank2.lisaa(temp);
   	           }
   	           else if ((tank3.getKayttaja()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank3.lisaa(temp);
   	           }
   	           else if ((tank4.getKayttaja()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank4.lisaa(temp);
   	           }
   	           else if ((tank5.getKayttaja()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank5.lisaa(temp);
   	           }
   	           else if ((tank6.getKayttaja()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank6.lisaa(temp);
   	           }
   	           else if ((tank7.getKayttaja()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank7.lisaa(temp);
   	           }
   	           else if ((tank8.getKayttaja()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank8.lisaa(temp);
   	           }
    	           else if ((tank9.getKayttaja()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank9.lisaa(temp);
   	           }
   	           else if ((tank10.getKayttaja()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank10.lisaa(temp);
              }
   	           else {
   	             System.out.println("ERROR: No tank reserved for the beverage!");
   	           }
    	         }
   	         freeUp("pump1");
        
    	     break;
   	     
   	     case "pump2":
          
    	       
   	    	 reserve("pump2", asiakas);
   	         if ((proc1.getKayttaja()).equals(asiakas)) {
   	           int temp = proc1.getJuoma();
   	           if (temp == 0) {  // varmistetaan, etta ei lahdeta pumppaamaan tyhjaa juomakeittimen juomasailiota!
   	             System.out.println("ERROR: No beverage to pump!");
   	             freeUp("pump2");
   	             break;
   	           }
   	           if ((tank1.getKayttaja()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank1.lisaa(temp);
   	           }
   	           else if ((tank2.getKayttaja()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank2.lisaa(temp);
   	           }
              else if ((tank3.getKayttaja()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank3.lisaa(temp);
   	           }
   	           else if ((tank4.getKayttaja()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank4.lisaa(temp);
   	           }
   	           else if ((tank5.getKayttaja()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank5.lisaa(temp);
   	           }
   	           else if ((tank6.getKayttaja()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank6.lisaa(temp);
   	           }
   	           else if ((tank7.getKayttaja()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank7.lisaa(temp);
   	           }
   	           else if ((tank8.getKayttaja()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank8.lisaa(temp);
   	           }
   	           else if ((tank9.getKayttaja()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank9.lisaa(temp);
   	           }
   	           else if ((tank10.getKayttaja()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank10.lisaa(temp);
   	           }
   	           else {
   	             System.out.println("ERROR: No tank reserved for the beverage!");
   	           }
   	         }
   	         
   	         else if ((proc2.getKayttaja()).equals(asiakas)) {
   	           int temp = proc2.getJuoma();
   	           if (temp == 0) {  // varmistetaan, etta ei lahdeta pumppaamaan tyhjaa juomakeittimen juomasailiota!
   	             System.out.println("ERROR: No beverage to pump!");
   	             freeUp("pump2");
   	             break;
   	           }
   	           if ((tank1.getKayttaja()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank1.lisaa(temp);
   	           }
   	           else if ((tank2.getKayttaja()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank2.lisaa(temp);
   	           }
   	           else if ((tank3.getKayttaja()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank3.lisaa(temp);
   	           }
   	           else if ((tank4.getKayttaja()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank4.lisaa(temp);
   	           }
   	           else if ((tank5.getKayttaja()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank5.lisaa(temp);
   	           }
   	           else if ((tank6.getKayttaja()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank6.lisaa(temp);
   	           }
   	           else if ((tank7.getKayttaja()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank7.lisaa(temp);
   	           }
   	           else if ((tank8.getKayttaja()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank8.lisaa(temp);
   	           }
   	           else if ((tank9.getKayttaja()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank9.lisaa(temp);
   	           }
   	           else if ((tank10.getKayttaja()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank10.lisaa(temp);
   	           }
   	           else {
   	             System.out.println("ERROR: No tank reserved for the beverage!");
   	           }
   	         }
   	         
   	         else if ((proc3.getKayttaja()).equals(asiakas)) {
   	           int temp = proc3.getJuoma();
   	           if (temp == 0) {  // varmistetaan, etta ei lahdeta pumppaamaan tyhjaa juomakeittimen juomasailiota!
   	             System.out.println("ERROR: No beverage to pump!");
   	             freeUp("pump2");
   	             break;
   	           }
   	           if ((tank1.getKayttaja()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank1.lisaa(temp);
   	           }
   	           else if ((tank2.getKayttaja()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank2.lisaa(temp);
   	           }
   	           else if ((tank3.getKayttaja()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank3.lisaa(temp);
   	           }
   	           else if ((tank4.getKayttaja()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank4.lisaa(temp);
   	           }
   	           else if ((tank5.getKayttaja()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank5.lisaa(temp);
   	           }
   	           else if ((tank6.getKayttaja()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank6.lisaa(temp);
   	           }
   	           else if ((tank7.getKayttaja()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank7.lisaa(temp);
   	           }
   	           else if ((tank8.getKayttaja()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank8.lisaa(temp);
   	           }
   	           else if ((tank9.getKayttaja()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank9.lisaa(temp);
   	           }
   	           else if ((tank10.getKayttaja()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank10.lisaa(temp);
   	           }
   	           else {
   	             System.out.println("ERROR: No tank reserved for the beverage!");
   	           }
   	         }
   	         freeUp("pump2");
 	     
     break;
     
     case "bottlePump1":
       
     if (!bottlePump1.getVarattu()) {
    	 reserve("bottlePump1", asiakas);
         if ((tank1.getKayttaja()).equals(asiakas)) {
        	 maara = tank1.getTilavuus();
        	 bottlePump1.run(maara);
        	 tank1.vahenna(maara);
        	 freeUp("tank1");
         }
         else if ((tank2.getKayttaja()).equals(asiakas)) {
        	 maara = tank2.getTilavuus();
        	 bottlePump1.run(maara);
        	 tank2.vahenna(maara);
        	 freeUp("tank2");
         } 
         else if ((tank3.getKayttaja()).equals(asiakas)) {
        	 maara = tank3.getTilavuus();
        	 bottlePump1.run(maara);
        	 tank3.vahenna(maara);
        	 freeUp("tank3");
         }
         else if ((tank4.getKayttaja()).equals(asiakas)) {
        	 maara = tank4.getTilavuus();
        	 bottlePump1.run(maara);
        	 tank4.vahenna(maara);
        	 freeUp("tank4");
         } 
         else if ((tank5.getKayttaja()).equals(asiakas)) {
        	 maara = tank5.getTilavuus();
        	 bottlePump1.run(maara);
        	 tank5.vahenna(maara);
        	 freeUp("tank5");
         } 
         else if ((tank6.getKayttaja()).equals(asiakas)) {
        	 maara = tank6.getTilavuus();
        	 bottlePump1.run(maara);
        	 tank6.vahenna(maara);
        	 freeUp("tank6");
         } 
         else if ((tank7.getKayttaja()).equals(asiakas)) {
        	 maara = tank7.getTilavuus();
        	 bottlePump1.run(maara);
        	 tank7.vahenna(maara);
        	 freeUp("tank7");
         } 
         else if ((tank8.getKayttaja()).equals(asiakas)) {
        	 maara = tank8.getTilavuus();
        	 bottlePump1.run(maara);
        	 tank8.vahenna(maara);
        	 freeUp("tank8");
         } 
         else if ((tank9.getKayttaja()).equals(asiakas)) {
        	 maara = tank9.getTilavuus();
        	 bottlePump1.run(maara);
        	 tank9.vahenna(maara);
        	 freeUp("tank9");
         } 
         else if ((tank10.getKayttaja()).equals(asiakas)) {
        	 maara = tank10.getTilavuus();
        	 bottlePump1.run(maara);
        	 tank10.vahenna(maara);
        	 freeUp("tank10");
         } 
         freeUp("bottlePump1");
     }
       else {
       System.out.println("Laitetta ei varattu!");
     }
     break;
     
     case "bottlePump2":
         
     if (!bottlePump2.getVarattu()) {
    	 reserve("bottlePump2", asiakas);
         if ((tank1.getKayttaja()).equals(asiakas)) {
        	 maara = tank1.getTilavuus();
        	 bottlePump2.run(maara);
        	 tank1.vahenna(maara);
        	 freeUp("tank1");
         }
         else if ((tank2.getKayttaja()).equals(asiakas)) {
        	 maara = tank2.getTilavuus();
        	 bottlePump2.run(maara);
        	 tank2.vahenna(maara);
        	 freeUp("tank2");
         } 
         else if ((tank3.getKayttaja()).equals(asiakas)) {
        	 maara = tank3.getTilavuus();
        	 bottlePump2.run(maara);
        	 tank3.vahenna(maara);
        	 freeUp("tank3");
         }
         else if ((tank4.getKayttaja()).equals(asiakas)) {
        	 maara = tank4.getTilavuus();
        	 bottlePump2.run(maara);
        	 tank4.vahenna(maara);
        	 freeUp("tank4");
         } 
         else if ((tank5.getKayttaja()).equals(asiakas)) {
        	 maara = tank5.getTilavuus();
        	 bottlePump2.run(maara);
        	 tank5.vahenna(maara);
        	 freeUp("tank5");
         } 
         else if ((tank6.getKayttaja()).equals(asiakas)) {
        	 maara = tank6.getTilavuus();
        	 bottlePump2.run(maara);
        	 tank6.vahenna(maara);
        	 freeUp("tank6");
         } 
         else if ((tank7.getKayttaja()).equals(asiakas)) {
        	 maara = tank7.getTilavuus();
        	 bottlePump2.run(maara);
        	 tank7.vahenna(maara);
        	 freeUp("tank7");
         } 
         else if ((tank8.getKayttaja()).equals(asiakas)) {
        	 maara = tank8.getTilavuus();
        	 bottlePump2.run(maara);
        	 tank8.vahenna(maara);
        	 freeUp("tank8");
         } 
         else if ((tank9.getKayttaja()).equals(asiakas)) {
        	 maara = tank9.getTilavuus();
        	 bottlePump2.run(maara);
        	 tank9.vahenna(maara);
        	 freeUp("tank9");
         } 
         else if ((tank10.getKayttaja()).equals(asiakas)) {
        	 maara = tank10.getTilavuus();
        	 bottlePump2.run(maara);
        	 tank10.vahenna(maara);
        	 freeUp("tank10");
         } 
         freeUp("bottlePump2");
     } else {
       System.out.println("Laitetta ei varattu!");
         }
     break;
     
     case "proc1":
       
     if ((!proc1.getRunning())) {
    	 proc1.setRunning(true);
    	 if ((proc1.getKayttaja()).equals(asiakas)) {
    		 proc1.run();
    		}
     else {
    	System.out.println("Vaara kayttaja!");
       }
     }
     else {
       System.out.println("Laitetta ei varattu!");
     }
     break;
     
     case "proc2":
       
    if ((!proc2.getRunning())) {
    	proc2.setRunning(true);
    	if ((proc2.getKayttaja()).equals(asiakas)) {
         proc2.run();
       }
       else {
         System.out.println("Vaara kayttaja!");
       }
     }
     else {
       System.out.println("Laitetta ei varattu!");
     }
     break;
     
     case "proc3":
       
     if ((!proc3.getRunning())) {
    	proc3.setRunning(true);
       if ((proc3.getKayttaja()).equals(asiakas)) {
         proc3.run();
       }
       else {
         System.out.println("Vaara kayttaja!");
       }
     }
     else {
       System.out.println("Laitetta ei varattu!");
     }
     break;
     
     
     // Tank -tyyppisia laitteita ei tarvitse "kaynnistaa"?
     case "tank1":
     break;
     
     case "tank2":
     break;
     
     case "tank3":
     break;
     
     case "tank4":
     break;
     
     case "tank5":
     break;
     
     case "tank6":
     break;
     
     case "tank7":
     break;
     
     case "tank8":
     break;
     
     case "tank9":
     break;
     
     case "tank10":
     break;
   }
    
 }
 
}