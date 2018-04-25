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
  * @param deviceName varattava laite
  * @param user varauspyynnon lahettaja
 * @throws AlreadyReservedException 
  */
 public void reserve(String deviceName, String user) throws AlreadyReservedException {
   if (deviceName.equals("silo1")) {
     if (!silo1.getReserved()) {
       silo1.setReserved(true);
       silo1.setUser(user);
     }
     else {
    	 throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (deviceName.equals("silo2")) {
     if (!silo2.getReserved()) {
       silo2.setReserved(true);
       silo2.setUser(user);
     }
     else {
    	 throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (deviceName.equals("silo3")) {
     if (!silo3.getReserved()) {
       silo3.setReserved(true);
       silo3.setUser(user);
     }
     else {
    	 throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (deviceName.equals("silo4")) {
     if (!silo4.getReserved()) {
       silo4.setReserved(true);
       silo4.setUser(user);
     }
     else {
    	 throw new AlreadyReservedException("Laite jo varattu"); 
     }
   }
   else if (deviceName.equals("siloLoader")) {
     if (!siloLoader.getReserved()) {
       siloLoader.setReserved(true);
       siloLoader.setUser(user);
     }
     else {
    	 throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (deviceName.equals("procLoader1")) {
     if (!procLoader1.getReserved()) {
       procLoader1.setReserved(true);
       procLoader1.setUser(user);
     }
     else {
    	 throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (deviceName.equals("procLoader2")) {
     if (!procLoader2.getReserved()) {
       procLoader2.setReserved(true);
       procLoader2.setUser(user);
     }
     else {
    	 throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (deviceName.equals("proc1")) {
       proc1.setReserved(true);
       proc1.setUser(user);
        }
   else if (deviceName.equals("proc2")) {
	   proc2.setReserved(true);
       proc2.setUser(user);
     }
   else if (deviceName.equals("proc3")) {
	   proc3.setReserved(true);
       proc3.setUser(user);
     }
   
   else if (deviceName.equals("pump1")) {
     if (!pump1.getReserved()) {
       pump1.setReserved(true);
       pump1.setUser(user);
     }
     else {
    	 throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (deviceName.equals("pump2")) {
     if (!pump2.getReserved()) {
       pump2.setReserved(true);
       pump2.setUser(user);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (deviceName.equals("bottlePump1")) {
     if (!bottlePump1.getReserved()) {
       bottlePump1.setReserved(true);
       bottlePump1.setUser(user);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (deviceName.equals("bottlePump2")) {
     if (!bottlePump2.getReserved()) {
       bottlePump2.setReserved(true);
       bottlePump2.setUser(user);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (deviceName.equals("tank1")) {
     if (!tank1.getReserved()) {
       tank1.setReserved(true);
       tank1.setUser(user);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (deviceName.equals("tank2")) {
     if (!tank2.getReserved()) {
       tank2.setReserved(true);
       tank2.setUser(user);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (deviceName.equals("tank3")) {
     if (!tank3.getReserved()) {
       tank3.setReserved(true);
       tank3.setUser(user);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (deviceName.equals("tank4")) {
     if (!tank4.getReserved()) {
       tank4.setReserved(true);
       tank4.setUser(user);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (deviceName.equals("tank5")) {
     if (!tank5.getReserved()) {
       tank5.setReserved(true);
       tank5.setUser(user);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (deviceName.equals("tank6")) {
     if (!tank6.getReserved()) {
       tank6.setReserved(true);
       tank6.setUser(user);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (deviceName.equals("tank7")) {
     if (!tank7.getReserved()) {
       tank7.setReserved(true);
       tank7.setUser(user);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (deviceName.equals("tank8")) {
     if (!tank8.getReserved()) {
       tank8.setReserved(true);
       tank8.setUser(user);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (deviceName.equals("tank9")) {
     if (!tank9.getReserved()) {
       tank9.setReserved(true);
       tank9.setUser(user);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (deviceName.equals("tank10")) {
     if (!tank10.getReserved()) {
       tank10.setReserved(true);
       tank10.setUser(user);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   } 
 }
 
 
 /**
  * Tehtaan komponenttien (Silo, Conveyor, Processor, Pump, Tank) vapauttamismetodit.
  * @param deviceName vapautettava laite
  */
 public void freeUp(String deviceName) {
   if (deviceName.equals("silo1")) {
     silo1.setReserved(false);
     silo1.setUser("");
   }
   else if (deviceName.equals("silo2")) {
     silo2.setReserved(false);
     silo2.setUser("");
   }
   else if (deviceName.equals("silo3")) {
     silo3.setReserved(false);
     silo3.setUser("");
   }
   else if (deviceName.equals("silo4")) {
     silo4.setReserved(false);
     silo4.setUser("");
   }
   else if (deviceName.equals("siloLoader")) {
     siloLoader.setReserved(false);
     siloLoader.setUser("");
   }
   else if (deviceName.equals("procLoader1")) {
     procLoader1.setReserved(false);
     procLoader1.setUser("");
   }
   else if (deviceName.equals("procLoader2")) {
     procLoader2.setReserved(false);
     procLoader2.setUser("");
   }
   else if (deviceName.equals("proc1")) {
     proc1.setReserved(false);
     proc1.setRunning(false);
     proc1.setUser("");
   }
   else if (deviceName.equals("proc2")) {
     proc2.setReserved(false);
     proc2.setRunning(false);
     proc2.setUser("");
   }
   else if (deviceName.equals("proc3")) {
     proc3.setReserved(false);
     proc3.setRunning(false);
     proc3.setUser("");
   }
   else if (deviceName.equals("pump1")) {
     pump1.setReserved(false);
     pump1.setUser("");
   }
   else if (deviceName.equals("pump2")) {
     pump2.setReserved(false);
     pump2.setUser("");
   }
   else if (deviceName.equals("bottlePump1")) {
     bottlePump1.setReserved(false);
     bottlePump1.setUser("");
   }
   else if (deviceName.equals("bottlePump2")) {
     bottlePump2.setReserved(false);
     bottlePump2.setUser("");
   }
   else if (deviceName.equals("tank1")) {
     tank1.setReserved(false);
     tank1.setUser("");
   }
   else if (deviceName.equals("tank2")) {
     tank2.setReserved(false);
     tank2.setUser("");
   }
   else if (deviceName.equals("tank3")) {
     tank3.setReserved(false);
     tank3.setUser("");
   }
   else if (deviceName.equals("tank4")) {
     tank4.setReserved(false);
     tank4.setUser("");
   }
   else if (deviceName.equals("tank5")) {
     tank5.setReserved(false);
     tank5.setUser("");
   }
   else if (deviceName.equals("tank6")) {
     tank6.setReserved(false);
     tank6.setUser("");
   }
   else if (deviceName.equals("tank7")) {
     tank7.setReserved(false);
     tank7.setUser("");
   }
   else if (deviceName.equals("tank8")) {
     tank8.setReserved(false);
     tank8.setUser("");
   }
   else if (deviceName.equals("tank9")) {
     tank9.setReserved(false);
     tank9.setUser("");
   }
   else if (deviceName.equals("tank10")) {
     tank10.setReserved(false);
     tank10.setUser("");
   } 
 }
 
 
 /**
  * Saie, jossa laitteen kaynnistysmetodia kutsutaan. Nain Server ei jaa jumiin laitetta kaynnistettaessa.
  * @param deviceName kaynnistettava laite
  * @param asiakas kaynnistyspyynnon lahettaja
  * @param amount raaka-aineen/juoman amount
  */
 public void start(String deviceName, String asiakas, int amount) {
	 Thread t = new Thread(){
		 public void run(){
			 try {
				startDevice(deviceName, asiakas, amount);
			} catch (AlreadyReservedException e) {
				e.printStackTrace();
			}
		 }
	 };
	 t.start();
 }
 
 
 /**
  * Tehtaan komponenttien (Silo, Conveyor, Processor, Pump, Tank) kaynnistysmetodit.
  * @param deviceName kaynnistettava laite
  * @param user kaynnistyspyynnon lahettaja
  * @param amount raaka-aineen/juoman maara
 * @throws Exception 
  */
 public void startDevice(String deviceName, String user, int amount) throws AlreadyReservedException {
   
   switch(deviceName){
     
     case "siloLoader":
       
     if ((!siloLoader.getReserved())) {
    	reserve("siloLoader", user);
       if ((siloLoader.getUser()).equals(user)) {
         if ((silo1.getUser()).equals(user)) {
           siloLoader.run(amount);
           silo1.addFill(amount);
         }
         else if ((silo2.getUser()).equals(user)) {
           siloLoader.run(amount);
           silo2.addFill(amount);
         } 
         else if ((silo3.getUser()).equals(user)) {
           siloLoader.run(amount);
           silo3.addFill(amount);
         }
         else if ((silo4.getUser()).equals(user)) {
           siloLoader.run(amount);
           silo4.addFill(amount);
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
         
         reserve("procLoader1", user);

         if ((silo1.getUser()).equals(user)) {
           if ((silo1.getFill() - amount) < 0) {  // Varmistetaan, ettei siilosta yriteta ottaa enempaa kuin mita siella on.
             System.out.println("ERROR: Not enough material in the silo!");
             freeUp("procLoader1");
             break;
           }
           if ((proc1.getUser()).equals(user)) {
             procLoader1.run(amount);
             silo1.decreaseFill(amount);
             proc1.addSolid(amount);
             proc1.addWater(amount * 5);
           }
           else if ((proc2.getUser()).equals(user)) {
             procLoader1.run(amount);
             silo1.decreaseFill(amount);
             proc2.addSolid(amount);
             proc2.addWater(amount * 5);
           }
           else if ((proc3.getUser()).equals(user)) {
             procLoader1.run(amount);
             silo1.decreaseFill(amount);
             proc3.addSolid(amount);
             proc3.addWater(amount * 5);
           }
           if (silo1.getFill() == 0) { // Vapautetaan siilo kayttajalta, jos se tyhjenee.
             freeUp("silo1");
           }
         }
         
         else if ((silo2.getUser()).equals(user)) {
           if ((silo2.getFill() - amount) < 0) {  // Varmistetaan, ettei siilosta yriteta ottaa enempaa kuin mita siella on.
             System.out.println("ERROR: Not enough material in the silo!");
             freeUp("procLoader1");
             break;
           }
           if ((proc1.getUser()).equals(user)) {
             procLoader1.run(amount);
             silo2.decreaseFill(amount);
             proc1.addSolid(amount);
             proc1.addWater(amount * 5);
           }
           else if ((proc2.getUser()).equals(user)) {
             procLoader1.run(amount);
             silo2.decreaseFill(amount);
             proc2.addSolid(amount);
             proc2.addWater(amount * 5);
           }
           else if ((proc3.getUser()).equals(user)) {
             procLoader1.run(amount);
             silo2.decreaseFill(amount);
             proc3.addSolid(amount);
             proc3.addWater(amount * 5);
           }
           if (silo2.getFill() == 0) { // Vapautetaan siilo kayttajalta, jos se tyhjenee.
             freeUp("silo2");
           }
         }
         
         else if ((silo3.getUser()).equals(user)) {
            if ((silo3.getFill() - amount) < 0) {  // Varmistetaan, ettei siilosta yriteta ottaa enempaa kuin mita siella on.
             System.out.println("ERROR: Not enough material in the silo!");
             freeUp("procLoader1");
             break;
            }
            if ((proc1.getUser()).equals(user)) {
              procLoader1.run(amount);
              silo3.decreaseFill(amount);
              proc1.addSolid(amount);
              proc1.addWater(amount * 5);
            }
            else if ((proc2.getUser()).equals(user)) {
              procLoader1.run(amount);
              silo3.decreaseFill(amount);
              proc2.addSolid(amount);
              proc2.addWater(amount * 5);
            }
            else if ((proc3.getUser()).equals(user)) {
              procLoader1.run(amount);
              silo3.decreaseFill(amount);
              proc3.addSolid(amount);
              proc3.addWater(amount * 5);
            }
            if (silo3.getFill() == 0) { // Vapautetaan siilo kayttajalta, jos se tyhjenee.
              freeUp("silo3");
            }
         }
         
           else if ((silo4.getUser()).equals(user)) {
             if ((silo4.getFill() - amount) < 0) {  // Varmistetaan, ettei siilosta yriteta ottaa enempaa kuin mita siella on.
             System.out.println("ERROR: Not enough material in the silo!");
             freeUp("procLoader1");
             break;
             }
             if ((proc1.getUser()).equals(user)) {
               procLoader1.run(amount);
               silo4.decreaseFill(amount);
               proc1.addSolid(amount);
               proc1.addWater(amount * 5);
             }
             else if ((proc2.getUser()).equals(user)) {
               procLoader1.run(amount);
               silo4.decreaseFill(amount);
               proc2.addSolid(amount);
               proc2.addWater(amount * 5);
             }
             else if ((proc3.getUser()).equals(user)) {
               procLoader1.run(amount);
               silo4.decreaseFill(amount);
               proc3.addSolid(amount);
               proc3.addWater(amount * 5);
             }
             if (silo4.getFill() == 0) { // Vapautetaan siilo kayttajalta, jos se tyhjenee.
               freeUp("silo4");
             }
           }
           freeUp("procLoader1");
         
       break;
         
     	case "procLoader2":
         
        
        reserve("procLoader2", user);
           
           if ((silo1.getUser()).equals(user)) {
             if ((silo1.getFill() - amount) < 0) {  // Varmistetaan, ettei siilosta yriteta ottaa enempaa kuin mita siella on.
             System.out.println("ERROR: Not enough material in the silo!");
             freeUp("procLoader2");
             break;
             }
             if ((proc1.getUser()).equals(user)) {
               procLoader2.run(amount);
               silo1.decreaseFill(amount);
               proc1.addSolid(amount);
               proc1.addWater(amount * 5);
             }
             else if ((proc2.getUser()).equals(user)) {
               procLoader2.run(amount);
               silo1.decreaseFill(amount);
               proc2.addSolid(amount);
               proc2.addWater(amount * 5);
             }
             else if ((proc3.getUser()).equals(user)) {
               procLoader2.run(amount);
               silo1.decreaseFill(amount);
               proc3.addSolid(amount);
               proc3.addWater(amount * 5);
             }
             if (silo1.getFill() == 0) { // Vapautetaan siilo kayttajalta, jos se tyhjenee.
               freeUp("silo1");
             }
           }
           
           else if ((silo2.getUser()).equals(user)) {
             if ((silo2.getFill() - amount) < 0) {  // Varmistetaan, ettei siilosta yriteta ottaa enempaa kuin mita siella on.
             System.out.println("ERROR: Not enough material in the silo!");
             freeUp("procLoader2");
             break;
             }
             if ((proc1.getUser()).equals(user)) {
               procLoader2.run(amount);
               silo2.decreaseFill(amount);
               proc1.addSolid(amount);
               proc1.addWater(amount * 5);
             }
             else if ((proc2.getUser()).equals(user)) {
               procLoader2.run(amount);
               silo2.decreaseFill(amount);
               proc2.addSolid(amount);
               proc2.addWater(amount * 5);
             }
             else if ((proc3.getUser()).equals(user)) {
               procLoader2.run(amount);
               silo2.decreaseFill(amount);
               proc3.addSolid(amount);
               proc3.addWater(amount * 5);
             }
             if (silo2.getFill() == 0) { // Vapautetaan siilo kayttajalta, jos se tyhjenee.
               freeUp("silo2");
             }
           }
           
           else if ((silo3.getUser()).equals(user)) {
             if ((silo3.getFill() - amount) < 0) {  // Varmistetaan, ettei siilosta yriteta ottaa enempaa kuin mita siella on.
             System.out.println("ERROR: Not enough material in the silo!");
             freeUp("procLoader2");
             break;
             }
             if ((proc1.getUser()).equals(user)) {
               procLoader2.run(amount);
               silo3.decreaseFill(amount);
               proc1.addSolid(amount);
               proc1.addWater(amount * 5);
             }
             else if ((proc2.getUser()).equals(user)) {
               procLoader2.run(amount);
               silo3.decreaseFill(amount);
               proc2.addSolid(amount);
               proc2.addWater(amount * 5);
             }
             else if ((proc3.getUser()).equals(user)) {
               procLoader2.run(amount);
               silo3.decreaseFill(amount);
               proc3.addSolid(amount);
               proc3.addWater(amount * 5);
             }
             if (silo3.getFill() == 0) { // Vapautetaan siilo kayttajalta, jos se tyhjenee.
               freeUp("silo3");
             }
           }
           
           else if ((silo4.getUser()).equals(user)) {
             if ((silo4.getFill() - amount) < 0) {  // Varmistetaan, ettei siilosta yriteta ottaa enempaa kuin mita siella on.
             System.out.println("ERROR: Not enough material in the silo!");
             freeUp("procLoader2");
             break;
             }
             if ((proc1.getUser()).equals(user)) {
               procLoader2.run(amount);
               silo4.decreaseFill(amount);
               proc1.addSolid(amount);
               proc1.addWater(amount * 5);
             }
             else if ((proc2.getUser()).equals(user)) {
               procLoader2.run(amount);
               silo4.decreaseFill(amount);
               proc2.addSolid(amount);
               proc2.addWater(amount * 5);
             }
             else if ((proc3.getUser()).equals(user)) {
               procLoader2.run(amount);
               silo4.decreaseFill(amount);
               proc3.addSolid(amount);
               proc3.addWater(amount * 5);
             }
             if (silo4.getFill() == 0) { // Vapautetaan siilo kayttajalta, jos se tyhjenee.
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
           
   	      reserve("pump1", user);
   	         if ((proc1.getUser()).equals(user)) {
   	           int temp = proc1.getDrink();
   	           if (temp == 0) {  // varmistetaan, etta ei lahdeta pumppaamaan tyhjaa juomakeittimen juomasailiota!
   	             System.out.println("ERROR: No beverage to pump!");
   	             freeUp("pump1");
   	             break;
   	           }
   	           if ((tank1.getUser()).equals(user)) {
   	             pump1.run(temp);
   	             proc1.setDrink(0);
   	             freeUp("proc1");
   	             tank1.add(temp);
   	           }
   	           else if ((tank2.getUser()).equals(user)) {
   	             pump1.run(temp);
   	             proc1.setDrink(0);
   	             freeUp("proc1");
   	             tank2.add(temp);
   	           }
   	           else if ((tank3.getUser()).equals(user)) {
   	             pump1.run(temp);
   	             proc1.setDrink(0);
   	             freeUp("proc1");
   	             tank3.add(temp);
   	           }
   	           else if ((tank4.getUser()).equals(user)) {
   	             pump1.run(temp);
   	             proc1.setDrink(0);
   	             freeUp("proc1");
   	             tank4.add(temp);
   	           }
   	           else if ((tank5.getUser()).equals(user)) {
   	             pump1.run(temp);
   	             proc1.setDrink(0);
   	             freeUp("proc1");
   	             tank5.add(temp);
   	           }
   	           else if ((tank6.getUser()).equals(user)) {
   	             pump1.run(temp);
   	             proc1.setDrink(0);
   	             freeUp("proc1");
   	             tank6.add(temp);
   	           }
   	           else if ((tank7.getUser()).equals(user)) {
   	             pump1.run(temp);
   	             proc1.setDrink(0);
   	             freeUp("proc1");
   	             tank7.add(temp);
   	           }
   	           else if ((tank8.getUser()).equals(user)) {
   	             pump1.run(temp);
   	             proc1.setDrink(0);
   	             freeUp("proc1");
   	             tank8.add(temp);
   	           }
   	           else if ((tank9.getUser()).equals(user)) {
   	             pump1.run(temp);
   	             proc1.setDrink(0);
   	             freeUp("proc1");
   	             tank9.add(temp);
   	           }
   	           else if ((tank10.getUser()).equals(user)) {
   	             pump1.run(temp);
   	             proc1.setDrink(0);
   	             freeUp("proc1");
   	             tank10.add(temp);
   	           }
   	           else {
   	             System.out.println("ERROR: No tank reserved for the beverage!");
   	           }
   	         }
   	         
   	         else if ((proc2.getUser()).equals(user)) {
   	           int temp = proc2.getDrink();
   	           if (temp == 0) {  // varmistetaan, etta ei lahdeta pumppaamaan tyhjaa juomakeittimen juomasailiota!
   	             System.out.println("ERROR: No beverage to pump!");
   	             freeUp("pump1");
   	             break;
   	           } 
   	           if ((tank1.getUser()).equals(user)) {
   	             pump1.run(temp);
   	             proc2.setDrink(0);
   	             freeUp("proc2");
   	             tank1.add(temp);
   	           }
   	           else if ((tank2.getUser()).equals(user)) {
   	             pump1.run(temp);
   	             proc2.setDrink(0);
   	             freeUp("proc2");
   	             tank2.add(temp);
   	           }
   	           else if ((tank3.getUser()).equals(user)) {
   	             pump1.run(temp);
   	             proc2.setDrink(0);
   	             freeUp("proc2");
   	             tank3.add(temp);
   	           }
   	           else if ((tank4.getUser()).equals(user)) {
   	             pump1.run(temp);
   	             proc2.setDrink(0);
   	             freeUp("proc2");
   	             tank4.add(temp);
   	           }
   	           else if ((tank5.getUser()).equals(user)) {
   	             pump1.run(temp);
   	             proc2.setDrink(0);
   	             freeUp("proc2");
   	             tank5.add(temp);
   	           }
   	           else if ((tank6.getUser()).equals(user)) {
   	             pump1.run(temp);
   	             proc2.setDrink(0);
   	             freeUp("proc2");
   	             tank6.add(temp);
   	           }
   	           else if ((tank7.getUser()).equals(user)) {
   	             pump1.run(temp);
   	             proc2.setDrink(0);
   	             freeUp("proc2");
   	             tank7.add(temp);
   	           }
   	           else if ((tank8.getUser()).equals(user)) {
   	             pump1.run(temp);
   	             proc2.setDrink(0);
   	             freeUp("proc2");
   	             tank8.add(temp);
   	           }
   	           else if ((tank9.getUser()).equals(user)) {
   	             pump1.run(temp);
   	             proc2.setDrink(0);
   	             freeUp("proc2");
   	             tank9.add(temp);
   	           }
   	           else if ((tank10.getUser()).equals(user)) {
   	             pump1.run(temp);
   	             proc2.setDrink(0);
   	             freeUp("proc2");
   	             tank10.add(temp);
   	           }
   	           else {
   	             System.out.println("ERROR: No tank reserved for the beverage!");
   	           }
   	         }
   	         
   	         else if ((proc3.getUser()).equals(user)) {
   	           int temp = proc3.getDrink();
   	           if (temp == 0) {  // varmistetaan, etta ei lahdeta pumppaamaan tyhjaa juomakeittimen juomasailiota!
   	             System.out.println("ERROR: No beverage to pump!");
   	             freeUp("pump1");
   	             break;
   	           }
   	           if ((tank1.getUser()).equals(user)) {
   	             pump1.run(temp);
   	             proc3.setDrink(0);
   	             freeUp("proc3");
   	             tank1.add(temp);
   	           }
   	           else if ((tank2.getUser()).equals(user)) {
   	             pump1.run(temp);
   	             proc3.setDrink(0);
   	             freeUp("proc3");
   	             tank2.add(temp);
   	           }
   	           else if ((tank3.getUser()).equals(user)) {
   	             pump1.run(temp);
   	             proc3.setDrink(0);
   	             freeUp("proc3");
   	             tank3.add(temp);
   	           }
   	           else if ((tank4.getUser()).equals(user)) {
   	             pump1.run(temp);
   	             proc3.setDrink(0);
   	             freeUp("proc3");
   	             tank4.add(temp);
   	           }
   	           else if ((tank5.getUser()).equals(user)) {
   	             pump1.run(temp);
   	             proc3.setDrink(0);
   	             freeUp("proc3");
   	             tank5.add(temp);
   	           }
   	           else if ((tank6.getUser()).equals(user)) {
   	             pump1.run(temp);
   	             proc3.setDrink(0);
   	             freeUp("proc3");
   	             tank6.add(temp);
   	           }
   	           else if ((tank7.getUser()).equals(user)) {
   	             pump1.run(temp);
   	             proc3.setDrink(0);
   	             freeUp("proc3");
   	             tank7.add(temp);
   	           }
   	           else if ((tank8.getUser()).equals(user)) {
   	             pump1.run(temp);
   	             proc3.setDrink(0);
   	             freeUp("proc3");
   	             tank8.add(temp);
   	           }
    	           else if ((tank9.getUser()).equals(user)) {
   	             pump1.run(temp);
   	             proc3.setDrink(0);
   	             freeUp("proc3");
   	             tank9.add(temp);
   	           }
   	           else if ((tank10.getUser()).equals(user)) {
   	             pump1.run(temp);
   	             proc3.setDrink(0);
   	             freeUp("proc3");
   	             tank10.add(temp);
              }
   	           else {
   	             System.out.println("ERROR: No tank reserved for the beverage!");
   	           }
    	         }
   	         freeUp("pump1");
        
    	     break;
   	     
   	     case "pump2":
          
    	       
   	    	 reserve("pump2", user);
   	         if ((proc1.getUser()).equals(user)) {
   	           int temp = proc1.getDrink();
   	           if (temp == 0) {  // varmistetaan, etta ei lahdeta pumppaamaan tyhjaa juomakeittimen juomasailiota!
   	             System.out.println("ERROR: No beverage to pump!");
   	             freeUp("pump2");
   	             break;
   	           }
   	           if ((tank1.getUser()).equals(user)) {
   	             pump2.run(temp);
   	             proc1.setDrink(0);
   	             freeUp("proc1");
   	             tank1.add(temp);
   	           }
   	           else if ((tank2.getUser()).equals(user)) {
   	             pump2.run(temp);
   	             proc1.setDrink(0);
   	             freeUp("proc1");
   	             tank2.add(temp);
   	           }
              else if ((tank3.getUser()).equals(user)) {
   	             pump2.run(temp);
   	             proc1.setDrink(0);
   	             freeUp("proc1");
   	             tank3.add(temp);
   	           }
   	           else if ((tank4.getUser()).equals(user)) {
   	             pump2.run(temp);
   	             proc1.setDrink(0);
   	             freeUp("proc1");
   	             tank4.add(temp);
   	           }
   	           else if ((tank5.getUser()).equals(user)) {
   	             pump2.run(temp);
   	             proc1.setDrink(0);
   	             freeUp("proc1");
   	             tank5.add(temp);
   	           }
   	           else if ((tank6.getUser()).equals(user)) {
   	             pump2.run(temp);
   	             proc1.setDrink(0);
   	             freeUp("proc1");
   	             tank6.add(temp);
   	           }
   	           else if ((tank7.getUser()).equals(user)) {
   	             pump2.run(temp);
   	             proc1.setDrink(0);
   	             freeUp("proc1");
   	             tank7.add(temp);
   	           }
   	           else if ((tank8.getUser()).equals(user)) {
   	             pump2.run(temp);
   	             proc1.setDrink(0);
   	             freeUp("proc1");
   	             tank8.add(temp);
   	           }
   	           else if ((tank9.getUser()).equals(user)) {
   	             pump2.run(temp);
   	             proc1.setDrink(0);
   	             freeUp("proc1");
   	             tank9.add(temp);
   	           }
   	           else if ((tank10.getUser()).equals(user)) {
   	             pump2.run(temp);
   	             proc1.setDrink(0);
   	             freeUp("proc1");
   	             tank10.add(temp);
   	           }
   	           else {
   	             System.out.println("ERROR: No tank reserved for the beverage!");
   	           }
   	         }
   	         
   	         else if ((proc2.getUser()).equals(user)) {
   	           int temp = proc2.getDrink();
   	           if (temp == 0) {  // varmistetaan, etta ei lahdeta pumppaamaan tyhjaa juomakeittimen juomasailiota!
   	             System.out.println("ERROR: No beverage to pump!");
   	             freeUp("pump2");
   	             break;
   	           }
   	           if ((tank1.getUser()).equals(user)) {
   	             pump2.run(temp);
   	             proc2.setDrink(0);
   	             freeUp("proc2");
   	             tank1.add(temp);
   	           }
   	           else if ((tank2.getUser()).equals(user)) {
   	             pump2.run(temp);
   	             proc2.setDrink(0);
   	             freeUp("proc2");
   	             tank2.add(temp);
   	           }
   	           else if ((tank3.getUser()).equals(user)) {
   	             pump2.run(temp);
   	             proc2.setDrink(0);
   	             freeUp("proc2");
   	             tank3.add(temp);
   	           }
   	           else if ((tank4.getUser()).equals(user)) {
   	             pump2.run(temp);
   	             proc2.setDrink(0);
   	             freeUp("proc2");
   	             tank4.add(temp);
   	           }
   	           else if ((tank5.getUser()).equals(user)) {
   	             pump2.run(temp);
   	             proc2.setDrink(0);
   	             freeUp("proc2");
   	             tank5.add(temp);
   	           }
   	           else if ((tank6.getUser()).equals(user)) {
   	             pump2.run(temp);
   	             proc2.setDrink(0);
   	             freeUp("proc2");
   	             tank6.add(temp);
   	           }
   	           else if ((tank7.getUser()).equals(user)) {
   	             pump2.run(temp);
   	             proc2.setDrink(0);
   	             freeUp("proc2");
   	             tank7.add(temp);
   	           }
   	           else if ((tank8.getUser()).equals(user)) {
   	             pump2.run(temp);
   	             proc2.setDrink(0);
   	             freeUp("proc2");
   	             tank8.add(temp);
   	           }
   	           else if ((tank9.getUser()).equals(user)) {
   	             pump2.run(temp);
   	             proc2.setDrink(0);
   	             freeUp("proc2");
   	             tank9.add(temp);
   	           }
   	           else if ((tank10.getUser()).equals(user)) {
   	             pump2.run(temp);
   	             proc2.setDrink(0);
   	             freeUp("proc2");
   	             tank10.add(temp);
   	           }
   	           else {
   	             System.out.println("ERROR: No tank reserved for the beverage!");
   	           }
   	         }
   	         
   	         else if ((proc3.getUser()).equals(user)) {
   	           int temp = proc3.getDrink();
   	           if (temp == 0) {  // varmistetaan, etta ei lahdeta pumppaamaan tyhjaa juomakeittimen juomasailiota!
   	             System.out.println("ERROR: No beverage to pump!");
   	             freeUp("pump2");
   	             break;
   	           }
   	           if ((tank1.getUser()).equals(user)) {
   	             pump2.run(temp);
   	             proc3.setDrink(0);
   	             freeUp("proc3");
   	             tank1.add(temp);
   	           }
   	           else if ((tank2.getUser()).equals(user)) {
   	             pump2.run(temp);
   	             proc3.setDrink(0);
   	             freeUp("proc3");
   	             tank2.add(temp);
   	           }
   	           else if ((tank3.getUser()).equals(user)) {
   	             pump2.run(temp);
   	             proc3.setDrink(0);
   	             freeUp("proc3");
   	             tank3.add(temp);
   	           }
   	           else if ((tank4.getUser()).equals(user)) {
   	             pump2.run(temp);
   	             proc3.setDrink(0);
   	             freeUp("proc3");
   	             tank4.add(temp);
   	           }
   	           else if ((tank5.getUser()).equals(user)) {
   	             pump2.run(temp);
   	             proc3.setDrink(0);
   	             freeUp("proc3");
   	             tank5.add(temp);
   	           }
   	           else if ((tank6.getUser()).equals(user)) {
   	             pump2.run(temp);
   	             proc3.setDrink(0);
   	             freeUp("proc3");
   	             tank6.add(temp);
   	           }
   	           else if ((tank7.getUser()).equals(user)) {
   	             pump2.run(temp);
   	             proc3.setDrink(0);
   	             freeUp("proc3");
   	             tank7.add(temp);
   	           }
   	           else if ((tank8.getUser()).equals(user)) {
   	             pump2.run(temp);
   	             proc3.setDrink(0);
   	             freeUp("proc3");
   	             tank8.add(temp);
   	           }
   	           else if ((tank9.getUser()).equals(user)) {
   	             pump2.run(temp);
   	             proc3.setDrink(0);
   	             freeUp("proc3");
   	             tank9.add(temp);
   	           }
   	           else if ((tank10.getUser()).equals(user)) {
   	             pump2.run(temp);
   	             proc3.setDrink(0);
   	             freeUp("proc3");
   	             tank10.add(temp);
   	           }
   	           else {
   	             System.out.println("ERROR: No tank reserved for the beverage!");
   	           }
   	         }
   	         freeUp("pump2");
 	     
     break;
     
     case "bottlePump1":
       
     if (!bottlePump1.getReserved()) {
    	 reserve("bottlePump1", user);
         if ((tank1.getUser()).equals(user)) {
        	 amount = tank1.getVolume();
        	 bottlePump1.run(amount);
        	 tank1.decrease(amount);
        	 freeUp("tank1");
         }
         else if ((tank2.getUser()).equals(user)) {
        	 amount = tank2.getVolume();
        	 bottlePump1.run(amount);
        	 tank2.decrease(amount);
        	 freeUp("tank2");
         } 
         else if ((tank3.getUser()).equals(user)) {
        	 amount = tank3.getVolume();
        	 bottlePump1.run(amount);
        	 tank3.decrease(amount);
        	 freeUp("tank3");
         }
         else if ((tank4.getUser()).equals(user)) {
        	 amount = tank4.getVolume();
        	 bottlePump1.run(amount);
        	 tank4.decrease(amount);
        	 freeUp("tank4");
         } 
         else if ((tank5.getUser()).equals(user)) {
        	 amount = tank5.getVolume();
        	 bottlePump1.run(amount);
        	 tank5.decrease(amount);
        	 freeUp("tank5");
         } 
         else if ((tank6.getUser()).equals(user)) {
        	 amount = tank6.getVolume();
        	 bottlePump1.run(amount);
        	 tank6.decrease(amount);
        	 freeUp("tank6");
         } 
         else if ((tank7.getUser()).equals(user)) {
        	 amount = tank7.getVolume();
        	 bottlePump1.run(amount);
        	 tank7.decrease(amount);
        	 freeUp("tank7");
         } 
         else if ((tank8.getUser()).equals(user)) {
        	 amount = tank8.getVolume();
        	 bottlePump1.run(amount);
        	 tank8.decrease(amount);
        	 freeUp("tank8");
         } 
         else if ((tank9.getUser()).equals(user)) {
        	 amount = tank9.getVolume();
        	 bottlePump1.run(amount);
        	 tank9.decrease(amount);
        	 freeUp("tank9");
         } 
         else if ((tank10.getUser()).equals(user)) {
        	 amount = tank10.getVolume();
        	 bottlePump1.run(amount);
        	 tank10.decrease(amount);
        	 freeUp("tank10");
         } 
         freeUp("bottlePump1");
     }
       else {
       System.out.println("Laitetta ei varattu!");
     }
     break;
     
     case "bottlePump2":
         
     if (!bottlePump2.getReserved()) {
    	 reserve("bottlePump2", user);
         if ((tank1.getUser()).equals(user)) {
        	 amount = tank1.getVolume();
        	 bottlePump2.run(amount);
        	 tank1.decrease(amount);
        	 freeUp("tank1");
         }
         else if ((tank2.getUser()).equals(user)) {
        	 amount = tank2.getVolume();
        	 bottlePump2.run(amount);
        	 tank2.decrease(amount);
        	 freeUp("tank2");
         } 
         else if ((tank3.getUser()).equals(user)) {
        	 amount = tank3.getVolume();
        	 bottlePump2.run(amount);
        	 tank3.decrease(amount);
        	 freeUp("tank3");
         }
         else if ((tank4.getUser()).equals(user)) {
        	 amount = tank4.getVolume();
        	 bottlePump2.run(amount);
        	 tank4.decrease(amount);
        	 freeUp("tank4");
         } 
         else if ((tank5.getUser()).equals(user)) {
        	 amount = tank5.getVolume();
        	 bottlePump2.run(amount);
        	 tank5.decrease(amount);
        	 freeUp("tank5");
         } 
         else if ((tank6.getUser()).equals(user)) {
        	 amount = tank6.getVolume();
        	 bottlePump2.run(amount);
        	 tank6.decrease(amount);
        	 freeUp("tank6");
         } 
         else if ((tank7.getUser()).equals(user)) {
        	 amount = tank7.getVolume();
        	 bottlePump2.run(amount);
        	 tank7.decrease(amount);
        	 freeUp("tank7");
         } 
         else if ((tank8.getUser()).equals(user)) {
        	 amount = tank8.getVolume();
        	 bottlePump2.run(amount);
        	 tank8.decrease(amount);
        	 freeUp("tank8");
         } 
         else if ((tank9.getUser()).equals(user)) {
        	 amount = tank9.getVolume();
        	 bottlePump2.run(amount);
        	 tank9.decrease(amount);
        	 freeUp("tank9");
         } 
         else if ((tank10.getUser()).equals(user)) {
        	 amount = tank10.getVolume();
        	 bottlePump2.run(amount);
        	 tank10.decrease(amount);
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
    	 if ((proc1.getUser()).equals(user)) {
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
    	if ((proc2.getUser()).equals(user)) {
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
       if ((proc3.getUser()).equals(user)) {
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