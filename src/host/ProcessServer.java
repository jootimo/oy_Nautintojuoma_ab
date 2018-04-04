package host;

import java.util.ArrayList;

/**
 * Prosessin ydin, pit‰‰ yll‰ prosessin tilaa. V‰litt‰‰ k‰ynnistys- ja varauskutsut laitteille. Pit‰‰ kirjaa asiakkaista.
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
  * Kirjaa k‰ytt‰j‰n palvelimelle.
  * @param name k‰ytt‰j‰n nimi
  * @return aina true
  */
 public boolean login(String name) {
		users.add(name); //Kaiken nimiset k‰ytt‰j‰t tervetulleita
		System.out.println(name + " logged in");
		return true;
	 }

 
 /**
  * Tehtaan komponenttien (Silo, Conveyor, Processor, Pump, Tank) varaamismetodi.
  * @param laitteenNimi varattava laite
  * @param asiakas varauspyynnˆn l‰hett‰j‰
 * @throws AlreadyReservedException 
  */
 public void reserve(String laitteenNimi, String asiakas) throws AlreadyReservedException {
   if (laitteenNimi.equals("silo1")) {
     if (!silo1.getVarattu()) {
       silo1.setVarattu(true);
       silo1.setK‰ytt‰j‰(asiakas);
     }
     else {
    	 throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("silo2")) {
     if (!silo2.getVarattu()) {
       silo2.setVarattu(true);
       silo2.setK‰ytt‰j‰(asiakas);
     }
     else {
    	 throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("silo3")) {
     if (!silo3.getVarattu()) {
       silo3.setVarattu(true);
       silo3.setK‰ytt‰j‰(asiakas);
     }
     else {
    	 throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("silo4")) {
     if (!silo4.getVarattu()) {
       silo4.setVarattu(true);
       silo4.setK‰ytt‰j‰(asiakas);
     }
     else {
    	 throw new AlreadyReservedException("Laite jo varattu"); 
     }
   }
   else if (laitteenNimi.equals("siloLoader")) {
     if (!siloLoader.getVarattu()) {
       siloLoader.setVarattu(true);
       siloLoader.setK‰ytt‰j‰(asiakas);
     }
     else {
    	 throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("procLoader1")) {
     if (!procLoader1.getVarattu()) {
       procLoader1.setVarattu(true);
       procLoader1.setK‰ytt‰j‰(asiakas);
     }
     else {
    	 throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("procLoader2")) {
     if (!procLoader2.getVarattu()) {
       procLoader2.setVarattu(true);
       procLoader2.setK‰ytt‰j‰(asiakas);
     }
     else {
    	 throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("proc1")) {
       proc1.setVarattu(true);
       proc1.setK‰ytt‰j‰(asiakas);
        }
   else if (laitteenNimi.equals("proc2")) {
	   proc2.setVarattu(true);
       proc2.setK‰ytt‰j‰(asiakas);
     }
   else if (laitteenNimi.equals("proc3")) {
	   proc3.setVarattu(true);
       proc3.setK‰ytt‰j‰(asiakas);
     }
   
   else if (laitteenNimi.equals("pump1")) {
     if (!pump1.getVarattu()) {
       pump1.setVarattu(true);
       pump1.setK‰ytt‰j‰(asiakas);
     }
     else {
    	 throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("pump2")) {
     if (!pump2.getVarattu()) {
       pump2.setVarattu(true);
       pump2.setK‰ytt‰j‰(asiakas);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("bottlePump1")) {
     if (!bottlePump1.getVarattu()) {
       bottlePump1.setVarattu(true);
       bottlePump1.setK‰ytt‰j‰(asiakas);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("bottlePump2")) {
     if (!bottlePump2.getVarattu()) {
       bottlePump2.setVarattu(true);
       bottlePump2.setK‰ytt‰j‰(asiakas);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("tank1")) {
     if (!tank1.getVarattu()) {
       tank1.setVarattu(true);
       tank1.setK‰ytt‰j‰(asiakas);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("tank2")) {
     if (!tank2.getVarattu()) {
       tank2.setVarattu(true);
       tank2.setK‰ytt‰j‰(asiakas);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("tank3")) {
     if (!tank3.getVarattu()) {
       tank3.setVarattu(true);
       tank3.setK‰ytt‰j‰(asiakas);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("tank4")) {
     if (!tank4.getVarattu()) {
       tank4.setVarattu(true);
       tank4.setK‰ytt‰j‰(asiakas);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("tank5")) {
     if (!tank5.getVarattu()) {
       tank5.setVarattu(true);
       tank5.setK‰ytt‰j‰(asiakas);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("tank6")) {
     if (!tank6.getVarattu()) {
       tank6.setVarattu(true);
       tank6.setK‰ytt‰j‰(asiakas);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("tank7")) {
     if (!tank7.getVarattu()) {
       tank7.setVarattu(true);
       tank7.setK‰ytt‰j‰(asiakas);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("tank8")) {
     if (!tank8.getVarattu()) {
       tank8.setVarattu(true);
       tank8.setK‰ytt‰j‰(asiakas);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("tank9")) {
     if (!tank9.getVarattu()) {
       tank9.setVarattu(true);
       tank9.setK‰ytt‰j‰(asiakas);
     }
     else {
       throw new AlreadyReservedException("Laite jo varattu");
     }
   }
   else if (laitteenNimi.equals("tank10")) {
     if (!tank10.getVarattu()) {
       tank10.setVarattu(true);
       tank10.setK‰ytt‰j‰(asiakas);
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
     silo1.setK‰ytt‰j‰("");
   }
   else if (laitteenNimi.equals("silo2")) {
     silo2.setVarattu(false);
     silo2.setK‰ytt‰j‰("");
   }
   else if (laitteenNimi.equals("silo3")) {
     silo3.setVarattu(false);
     silo3.setK‰ytt‰j‰("");
   }
   else if (laitteenNimi.equals("silo4")) {
     silo4.setVarattu(false);
     silo4.setK‰ytt‰j‰("");
   }
   else if (laitteenNimi.equals("siloLoader")) {
     siloLoader.setVarattu(false);
     siloLoader.setK‰ytt‰j‰("");
   }
   else if (laitteenNimi.equals("procLoader1")) {
     procLoader1.setVarattu(false);
     procLoader1.setK‰ytt‰j‰("");
   }
   else if (laitteenNimi.equals("procLoader2")) {
     procLoader2.setVarattu(false);
     procLoader2.setK‰ytt‰j‰("");
   }
   else if (laitteenNimi.equals("proc1")) {
     proc1.setVarattu(false);
     proc1.setRunning(false);
     proc1.setK‰ytt‰j‰("");
   }
   else if (laitteenNimi.equals("proc2")) {
     proc2.setVarattu(false);
     proc2.setRunning(false);
     proc2.setK‰ytt‰j‰("");
   }
   else if (laitteenNimi.equals("proc3")) {
     proc3.setVarattu(false);
     proc3.setRunning(false);
     proc3.setK‰ytt‰j‰("");
   }
   else if (laitteenNimi.equals("pump1")) {
     pump1.setVarattu(false);
     pump1.setK‰ytt‰j‰("");
   }
   else if (laitteenNimi.equals("pump2")) {
     pump2.setVarattu(false);
     pump2.setK‰ytt‰j‰("");
   }
   else if (laitteenNimi.equals("bottlePump1")) {
     bottlePump1.setVarattu(false);
     bottlePump1.setK‰ytt‰j‰("");
   }
   else if (laitteenNimi.equals("bottlePump2")) {
     bottlePump2.setVarattu(false);
     bottlePump2.setK‰ytt‰j‰("");
   }
   else if (laitteenNimi.equals("tank1")) {
     tank1.setVarattu(false);
     tank1.setK‰ytt‰j‰("");
   }
   else if (laitteenNimi.equals("tank2")) {
     tank2.setVarattu(false);
     tank2.setK‰ytt‰j‰("");
   }
   else if (laitteenNimi.equals("tank3")) {
     tank3.setVarattu(false);
     tank3.setK‰ytt‰j‰("");
   }
   else if (laitteenNimi.equals("tank4")) {
     tank4.setVarattu(false);
     tank4.setK‰ytt‰j‰("");
   }
   else if (laitteenNimi.equals("tank5")) {
     tank5.setVarattu(false);
     tank5.setK‰ytt‰j‰("");
   }
   else if (laitteenNimi.equals("tank6")) {
     tank6.setVarattu(false);
     tank6.setK‰ytt‰j‰("");
   }
   else if (laitteenNimi.equals("tank7")) {
     tank7.setVarattu(false);
     tank7.setK‰ytt‰j‰("");
   }
   else if (laitteenNimi.equals("tank8")) {
     tank8.setVarattu(false);
     tank8.setK‰ytt‰j‰("");
   }
   else if (laitteenNimi.equals("tank9")) {
     tank9.setVarattu(false);
     tank9.setK‰ytt‰j‰("");
   }
   else if (laitteenNimi.equals("tank10")) {
     tank10.setVarattu(false);
     tank10.setK‰ytt‰j‰("");
   } 
 }
 
 
 /**
  * S‰ie, jossa laitteen k‰ynnistysmetodia kutsutaan. N‰in Server ei j‰‰ jumiin laitetta k‰ynnistett‰ess‰.
  * @param laitteenNimi k‰ynnistett‰v‰ laite
  * @param asiakas k‰ynnistyspyynnˆn l‰hett‰j‰
  * @param m‰‰r‰ raaka-aineen/juoman m‰‰r‰
  */
 public void start(String laitteenNimi, String asiakas, int m‰‰r‰) {
	 Thread t = new Thread(){
		 public void run(){
			 try {
				startDevice(laitteenNimi, asiakas, m‰‰r‰);
			} catch (AlreadyReservedException e) {
				e.printStackTrace();
			}
		 }
	 };
	 t.start();
 }
 
 
 /**
  * Tehtaan komponenttien (Silo, Conveyor, Processor, Pump, Tank) k‰ynnistysmetodit.
  * @param laitteenNimi k‰ynnistett‰v‰ laite
  * @param asiakas k‰ynnistyspyynnˆn l‰hett‰j‰
  * @param m‰‰r‰ raaka-aineen/juoman m‰‰r‰
 * @throws Exception 
  */
 public void startDevice(String laitteenNimi, String asiakas, int m‰‰r‰) throws AlreadyReservedException {
   
   switch(laitteenNimi){
     
     case "siloLoader":
       
     if ((!siloLoader.getVarattu())) {
    	reserve("siloLoader", asiakas);
       if ((siloLoader.getK‰ytt‰j‰()).equals(asiakas)) {
         if ((silo1.getK‰ytt‰j‰()).equals(asiakas)) {
           siloLoader.run(m‰‰r‰);
           silo1.lis‰‰T‰yttˆaste(m‰‰r‰);
         }
         else if ((silo2.getK‰ytt‰j‰()).equals(asiakas)) {
           siloLoader.run(m‰‰r‰);
           silo2.lis‰‰T‰yttˆaste(m‰‰r‰);
         } 
         else if ((silo3.getK‰ytt‰j‰()).equals(asiakas)) {
           siloLoader.run(m‰‰r‰);
           silo3.lis‰‰T‰yttˆaste(m‰‰r‰);
         }
         else if ((silo4.getK‰ytt‰j‰()).equals(asiakas)) {
           siloLoader.run(m‰‰r‰);
           silo4.lis‰‰T‰yttˆaste(m‰‰r‰);
         }
         freeUp("siloLoader");
       }
       else {
         System.out.println("V‰‰r‰ k‰ytt‰j‰!");
       }
     }
       else {
       System.out.println("Laitetta ei varattu!");
     }
     break;
     
     case "procLoader1":
         
         reserve("procLoader1", asiakas);

         if ((silo1.getK‰ytt‰j‰()).equals(asiakas)) {
           if ((silo1.getT‰yttˆaste() - m‰‰r‰) < 0) {  // Varmistetaan, ettei siilosta yritet‰ ottaa enemp‰‰ kuin mit‰ siell‰ on.
             System.out.println("ERROR: Not enough material in the silo!");
             freeUp("procLoader1");
             break;
           }
           if ((proc1.getK‰ytt‰j‰()).equals(asiakas)) {
             procLoader1.run(m‰‰r‰);
             silo1.v‰henn‰T‰yttˆaste(m‰‰r‰);
             proc1.lis‰‰Kiinte‰(m‰‰r‰);
             proc1.lis‰‰Vesi(m‰‰r‰ * 5);
           }
           else if ((proc2.getK‰ytt‰j‰()).equals(asiakas)) {
             procLoader1.run(m‰‰r‰);
             silo1.v‰henn‰T‰yttˆaste(m‰‰r‰);
             proc2.lis‰‰Kiinte‰(m‰‰r‰);
             proc2.lis‰‰Vesi(m‰‰r‰ * 5);
           }
           else if ((proc3.getK‰ytt‰j‰()).equals(asiakas)) {
             procLoader1.run(m‰‰r‰);
             silo1.v‰henn‰T‰yttˆaste(m‰‰r‰);
             proc3.lis‰‰Kiinte‰(m‰‰r‰);
             proc3.lis‰‰Vesi(m‰‰r‰ * 5);
           }
           if (silo1.getT‰yttˆaste() == 0) { // Vapautetaan siilo k‰ytt‰j‰lt‰, jos se tyhjenee.
             freeUp("silo1");
           }
         }
         
         else if ((silo2.getK‰ytt‰j‰()).equals(asiakas)) {
           if ((silo2.getT‰yttˆaste() - m‰‰r‰) < 0) {  // Varmistetaan, ettei siilosta yritet‰ ottaa enemp‰‰ kuin mit‰ siell‰ on.
             System.out.println("ERROR: Not enough material in the silo!");
             freeUp("procLoader1");
             break;
           }
           if ((proc1.getK‰ytt‰j‰()).equals(asiakas)) {
             procLoader1.run(m‰‰r‰);
             silo2.v‰henn‰T‰yttˆaste(m‰‰r‰);
             proc1.lis‰‰Kiinte‰(m‰‰r‰);
             proc1.lis‰‰Vesi(m‰‰r‰ * 5);
           }
           else if ((proc2.getK‰ytt‰j‰()).equals(asiakas)) {
             procLoader1.run(m‰‰r‰);
             silo2.v‰henn‰T‰yttˆaste(m‰‰r‰);
             proc2.lis‰‰Kiinte‰(m‰‰r‰);
             proc2.lis‰‰Vesi(m‰‰r‰ * 5);
           }
           else if ((proc3.getK‰ytt‰j‰()).equals(asiakas)) {
             procLoader1.run(m‰‰r‰);
             silo2.v‰henn‰T‰yttˆaste(m‰‰r‰);
             proc3.lis‰‰Kiinte‰(m‰‰r‰);
             proc3.lis‰‰Vesi(m‰‰r‰ * 5);
           }
           if (silo2.getT‰yttˆaste() == 0) { // Vapautetaan siilo k‰ytt‰j‰lt‰, jos se tyhjenee.
             freeUp("silo2");
           }
         }
         
         else if ((silo3.getK‰ytt‰j‰()).equals(asiakas)) {
            if ((silo3.getT‰yttˆaste() - m‰‰r‰) < 0) {  // Varmistetaan, ettei siilosta yritet‰ ottaa enemp‰‰ kuin mit‰ siell‰ on.
             System.out.println("ERROR: Not enough material in the silo!");
             freeUp("procLoader1");
             break;
            }
            if ((proc1.getK‰ytt‰j‰()).equals(asiakas)) {
              procLoader1.run(m‰‰r‰);
              silo3.v‰henn‰T‰yttˆaste(m‰‰r‰);
              proc1.lis‰‰Kiinte‰(m‰‰r‰);
              proc1.lis‰‰Vesi(m‰‰r‰ * 5);
            }
            else if ((proc2.getK‰ytt‰j‰()).equals(asiakas)) {
              procLoader1.run(m‰‰r‰);
              silo3.v‰henn‰T‰yttˆaste(m‰‰r‰);
              proc2.lis‰‰Kiinte‰(m‰‰r‰);
              proc2.lis‰‰Vesi(m‰‰r‰ * 5);
            }
            else if ((proc3.getK‰ytt‰j‰()).equals(asiakas)) {
              procLoader1.run(m‰‰r‰);
              silo3.v‰henn‰T‰yttˆaste(m‰‰r‰);
              proc3.lis‰‰Kiinte‰(m‰‰r‰);
              proc3.lis‰‰Vesi(m‰‰r‰ * 5);
            }
            if (silo3.getT‰yttˆaste() == 0) { // Vapautetaan siilo k‰ytt‰j‰lt‰, jos se tyhjenee.
              freeUp("silo3");
            }
         }
         
           else if ((silo4.getK‰ytt‰j‰()).equals(asiakas)) {
             if ((silo4.getT‰yttˆaste() - m‰‰r‰) < 0) {  // Varmistetaan, ettei siilosta yritet‰ ottaa enemp‰‰ kuin mit‰ siell‰ on.
             System.out.println("ERROR: Not enough material in the silo!");
             freeUp("procLoader1");
             break;
             }
             if ((proc1.getK‰ytt‰j‰()).equals(asiakas)) {
               procLoader1.run(m‰‰r‰);
               silo4.v‰henn‰T‰yttˆaste(m‰‰r‰);
               proc1.lis‰‰Kiinte‰(m‰‰r‰);
               proc1.lis‰‰Vesi(m‰‰r‰ * 5);
             }
             else if ((proc2.getK‰ytt‰j‰()).equals(asiakas)) {
               procLoader1.run(m‰‰r‰);
               silo4.v‰henn‰T‰yttˆaste(m‰‰r‰);
               proc2.lis‰‰Kiinte‰(m‰‰r‰);
               proc2.lis‰‰Vesi(m‰‰r‰ * 5);
             }
             else if ((proc3.getK‰ytt‰j‰()).equals(asiakas)) {
               procLoader1.run(m‰‰r‰);
               silo4.v‰henn‰T‰yttˆaste(m‰‰r‰);
               proc3.lis‰‰Kiinte‰(m‰‰r‰);
               proc3.lis‰‰Vesi(m‰‰r‰ * 5);
             }
             if (silo4.getT‰yttˆaste() == 0) { // Vapautetaan siilo k‰ytt‰j‰lt‰, jos se tyhjenee.
               freeUp("silo4");
             }
           }
           freeUp("procLoader1");
         
       break;
         
     	case "procLoader2":
         
        
        reserve("procLoader2", asiakas);
           
           if ((silo1.getK‰ytt‰j‰()).equals(asiakas)) {
             if ((silo1.getT‰yttˆaste() - m‰‰r‰) < 0) {  // Varmistetaan, ettei siilosta yritet‰ ottaa enemp‰‰ kuin mit‰ siell‰ on.
             System.out.println("ERROR: Not enough material in the silo!");
             freeUp("procLoader2");
             break;
             }
             if ((proc1.getK‰ytt‰j‰()).equals(asiakas)) {
               procLoader2.run(m‰‰r‰);
               silo1.v‰henn‰T‰yttˆaste(m‰‰r‰);
               proc1.lis‰‰Kiinte‰(m‰‰r‰);
               proc1.lis‰‰Vesi(m‰‰r‰ * 5);
             }
             else if ((proc2.getK‰ytt‰j‰()).equals(asiakas)) {
               procLoader2.run(m‰‰r‰);
               silo1.v‰henn‰T‰yttˆaste(m‰‰r‰);
               proc2.lis‰‰Kiinte‰(m‰‰r‰);
               proc2.lis‰‰Vesi(m‰‰r‰ * 5);
             }
             else if ((proc3.getK‰ytt‰j‰()).equals(asiakas)) {
               procLoader2.run(m‰‰r‰);
               silo1.v‰henn‰T‰yttˆaste(m‰‰r‰);
               proc3.lis‰‰Kiinte‰(m‰‰r‰);
               proc3.lis‰‰Vesi(m‰‰r‰ * 5);
             }
             if (silo1.getT‰yttˆaste() == 0) { // Vapautetaan siilo k‰ytt‰j‰lt‰, jos se tyhjenee.
               freeUp("silo1");
             }
           }
           
           else if ((silo2.getK‰ytt‰j‰()).equals(asiakas)) {
             if ((silo2.getT‰yttˆaste() - m‰‰r‰) < 0) {  // Varmistetaan, ettei siilosta yritet‰ ottaa enemp‰‰ kuin mit‰ siell‰ on.
             System.out.println("ERROR: Not enough material in the silo!");
             freeUp("procLoader2");
             break;
             }
             if ((proc1.getK‰ytt‰j‰()).equals(asiakas)) {
               procLoader2.run(m‰‰r‰);
               silo2.v‰henn‰T‰yttˆaste(m‰‰r‰);
               proc1.lis‰‰Kiinte‰(m‰‰r‰);
               proc1.lis‰‰Vesi(m‰‰r‰ * 5);
             }
             else if ((proc2.getK‰ytt‰j‰()).equals(asiakas)) {
               procLoader2.run(m‰‰r‰);
               silo2.v‰henn‰T‰yttˆaste(m‰‰r‰);
               proc2.lis‰‰Kiinte‰(m‰‰r‰);
               proc2.lis‰‰Vesi(m‰‰r‰ * 5);
             }
             else if ((proc3.getK‰ytt‰j‰()).equals(asiakas)) {
               procLoader2.run(m‰‰r‰);
               silo2.v‰henn‰T‰yttˆaste(m‰‰r‰);
               proc3.lis‰‰Kiinte‰(m‰‰r‰);
               proc3.lis‰‰Vesi(m‰‰r‰ * 5);
             }
             if (silo2.getT‰yttˆaste() == 0) { // Vapautetaan siilo k‰ytt‰j‰lt‰, jos se tyhjenee.
               freeUp("silo2");
             }
           }
           
           else if ((silo3.getK‰ytt‰j‰()).equals(asiakas)) {
             if ((silo3.getT‰yttˆaste() - m‰‰r‰) < 0) {  // Varmistetaan, ettei siilosta yritet‰ ottaa enemp‰‰ kuin mit‰ siell‰ on.
             System.out.println("ERROR: Not enough material in the silo!");
             freeUp("procLoader2");
             break;
             }
             if ((proc1.getK‰ytt‰j‰()).equals(asiakas)) {
               procLoader2.run(m‰‰r‰);
               silo3.v‰henn‰T‰yttˆaste(m‰‰r‰);
               proc1.lis‰‰Kiinte‰(m‰‰r‰);
               proc1.lis‰‰Vesi(m‰‰r‰ * 5);
             }
             else if ((proc2.getK‰ytt‰j‰()).equals(asiakas)) {
               procLoader2.run(m‰‰r‰);
               silo3.v‰henn‰T‰yttˆaste(m‰‰r‰);
               proc2.lis‰‰Kiinte‰(m‰‰r‰);
               proc2.lis‰‰Vesi(m‰‰r‰ * 5);
             }
             else if ((proc3.getK‰ytt‰j‰()).equals(asiakas)) {
               procLoader2.run(m‰‰r‰);
               silo3.v‰henn‰T‰yttˆaste(m‰‰r‰);
               proc3.lis‰‰Kiinte‰(m‰‰r‰);
               proc3.lis‰‰Vesi(m‰‰r‰ * 5);
             }
             if (silo3.getT‰yttˆaste() == 0) { // Vapautetaan siilo k‰ytt‰j‰lt‰, jos se tyhjenee.
               freeUp("silo3");
             }
           }
           
           else if ((silo4.getK‰ytt‰j‰()).equals(asiakas)) {
             if ((silo4.getT‰yttˆaste() - m‰‰r‰) < 0) {  // Varmistetaan, ettei siilosta yritet‰ ottaa enemp‰‰ kuin mit‰ siell‰ on.
             System.out.println("ERROR: Not enough material in the silo!");
             freeUp("procLoader2");
             break;
             }
             if ((proc1.getK‰ytt‰j‰()).equals(asiakas)) {
               procLoader2.run(m‰‰r‰);
               silo4.v‰henn‰T‰yttˆaste(m‰‰r‰);
               proc1.lis‰‰Kiinte‰(m‰‰r‰);
               proc1.lis‰‰Vesi(m‰‰r‰ * 5);
             }
             else if ((proc2.getK‰ytt‰j‰()).equals(asiakas)) {
               procLoader2.run(m‰‰r‰);
               silo4.v‰henn‰T‰yttˆaste(m‰‰r‰);
               proc2.lis‰‰Kiinte‰(m‰‰r‰);
               proc2.lis‰‰Vesi(m‰‰r‰ * 5);
             }
             else if ((proc3.getK‰ytt‰j‰()).equals(asiakas)) {
               procLoader2.run(m‰‰r‰);
               silo4.v‰henn‰T‰yttˆaste(m‰‰r‰);
               proc3.lis‰‰Kiinte‰(m‰‰r‰);
               proc3.lis‰‰Vesi(m‰‰r‰ * 5);
             }
             if (silo4.getT‰yttˆaste() == 0) { // Vapautetaan siilo k‰ytt‰j‰lt‰, jos se tyhjenee.
               freeUp("silo4");
             }
           }
           freeUp("procLoader2");
         
       break;     
     
       /*
      * HUOM!
      * Pump-laitteet pumppaavat automaattisesti kaiken keittimest‰ kypsytyss‰iliˆˆn, 
      * joten m‰‰r‰-parametria ei tarvita!
      */     
       case "pump1":
           
   	      reserve("pump1", asiakas);
   	         if ((proc1.getK‰ytt‰j‰()).equals(asiakas)) {
   	           int temp = proc1.getJuoma();
   	           if (temp == 0) {  // varmistetaan, ett‰ ei l‰hdet‰ pumppaamaan tyhj‰‰ juomakeittimen juomas‰iliˆt‰!
   	             System.out.println("ERROR: No beverage to pump!");
   	             freeUp("pump1");
   	             break;
   	           }
   	           if ((tank1.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank1.lis‰‰(temp);
   	           }
   	           else if ((tank2.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank2.lis‰‰(temp);
   	           }
   	           else if ((tank3.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank3.lis‰‰(temp);
   	           }
   	           else if ((tank4.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank4.lis‰‰(temp);
   	           }
   	           else if ((tank5.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank5.lis‰‰(temp);
   	           }
   	           else if ((tank6.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank6.lis‰‰(temp);
   	           }
   	           else if ((tank7.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank7.lis‰‰(temp);
   	           }
   	           else if ((tank8.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank8.lis‰‰(temp);
   	           }
   	           else if ((tank9.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank9.lis‰‰(temp);
   	           }
   	           else if ((tank10.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank10.lis‰‰(temp);
   	           }
   	           else {
   	             System.out.println("ERROR: No tank reserved for the beverage!");
   	           }
   	         }
   	         
   	         else if ((proc2.getK‰ytt‰j‰()).equals(asiakas)) {
   	           int temp = proc2.getJuoma();
   	           if (temp == 0) {  // varmistetaan, ett‰ ei l‰hdet‰ pumppaamaan tyhj‰‰ juomakeittimen juomas‰iliˆt‰!
   	             System.out.println("ERROR: No beverage to pump!");
   	             freeUp("pump1");
   	             break;
   	           } 
   	           if ((tank1.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank1.lis‰‰(temp);
   	           }
   	           else if ((tank2.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank2.lis‰‰(temp);
   	           }
   	           else if ((tank3.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank3.lis‰‰(temp);
   	           }
   	           else if ((tank4.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank4.lis‰‰(temp);
   	           }
   	           else if ((tank5.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank5.lis‰‰(temp);
   	           }
   	           else if ((tank6.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank6.lis‰‰(temp);
   	           }
   	           else if ((tank7.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank7.lis‰‰(temp);
   	           }
   	           else if ((tank8.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank8.lis‰‰(temp);
   	           }
   	           else if ((tank9.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank9.lis‰‰(temp);
   	           }
   	           else if ((tank10.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank10.lis‰‰(temp);
   	           }
   	           else {
   	             System.out.println("ERROR: No tank reserved for the beverage!");
   	           }
   	         }
   	         
   	         else if ((proc3.getK‰ytt‰j‰()).equals(asiakas)) {
   	           int temp = proc3.getJuoma();
   	           if (temp == 0) {  // varmistetaan, ett‰ ei l‰hdet‰ pumppaamaan tyhj‰‰ juomakeittimen juomas‰iliˆt‰!
   	             System.out.println("ERROR: No beverage to pump!");
   	             freeUp("pump1");
   	             break;
   	           }
   	           if ((tank1.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank1.lis‰‰(temp);
   	           }
   	           else if ((tank2.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank2.lis‰‰(temp);
   	           }
   	           else if ((tank3.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank3.lis‰‰(temp);
   	           }
   	           else if ((tank4.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank4.lis‰‰(temp);
   	           }
   	           else if ((tank5.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank5.lis‰‰(temp);
   	           }
   	           else if ((tank6.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank6.lis‰‰(temp);
   	           }
   	           else if ((tank7.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank7.lis‰‰(temp);
   	           }
   	           else if ((tank8.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank8.lis‰‰(temp);
   	           }
    	           else if ((tank9.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank9.lis‰‰(temp);
   	           }
   	           else if ((tank10.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump1.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank10.lis‰‰(temp);
              }
   	           else {
   	             System.out.println("ERROR: No tank reserved for the beverage!");
   	           }
    	         }
   	         freeUp("pump1");
        
    	     break;
   	     
   	     case "pump2":
          
    	       
   	    	 reserve("pump2", asiakas);
   	         if ((proc1.getK‰ytt‰j‰()).equals(asiakas)) {
   	           int temp = proc1.getJuoma();
   	           if (temp == 0) {  // varmistetaan, ett‰ ei l‰hdet‰ pumppaamaan tyhj‰‰ juomakeittimen juomas‰iliˆt‰!
   	             System.out.println("ERROR: No beverage to pump!");
   	             freeUp("pump2");
   	             break;
   	           }
   	           if ((tank1.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank1.lis‰‰(temp);
   	           }
   	           else if ((tank2.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank2.lis‰‰(temp);
   	           }
              else if ((tank3.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank3.lis‰‰(temp);
   	           }
   	           else if ((tank4.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank4.lis‰‰(temp);
   	           }
   	           else if ((tank5.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank5.lis‰‰(temp);
   	           }
   	           else if ((tank6.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank6.lis‰‰(temp);
   	           }
   	           else if ((tank7.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank7.lis‰‰(temp);
   	           }
   	           else if ((tank8.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank8.lis‰‰(temp);
   	           }
   	           else if ((tank9.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank9.lis‰‰(temp);
   	           }
   	           else if ((tank10.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc1.setJuoma(0);
   	             freeUp("proc1");
   	             tank10.lis‰‰(temp);
   	           }
   	           else {
   	             System.out.println("ERROR: No tank reserved for the beverage!");
   	           }
   	         }
   	         
   	         else if ((proc2.getK‰ytt‰j‰()).equals(asiakas)) {
   	           int temp = proc2.getJuoma();
   	           if (temp == 0) {  // varmistetaan, ett‰ ei l‰hdet‰ pumppaamaan tyhj‰‰ juomakeittimen juomas‰iliˆt‰!
   	             System.out.println("ERROR: No beverage to pump!");
   	             freeUp("pump2");
   	             break;
   	           }
   	           if ((tank1.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank1.lis‰‰(temp);
   	           }
   	           else if ((tank2.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank2.lis‰‰(temp);
   	           }
   	           else if ((tank3.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank3.lis‰‰(temp);
   	           }
   	           else if ((tank4.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank4.lis‰‰(temp);
   	           }
   	           else if ((tank5.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank5.lis‰‰(temp);
   	           }
   	           else if ((tank6.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank6.lis‰‰(temp);
   	           }
   	           else if ((tank7.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank7.lis‰‰(temp);
   	           }
   	           else if ((tank8.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank8.lis‰‰(temp);
   	           }
   	           else if ((tank9.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank9.lis‰‰(temp);
   	           }
   	           else if ((tank10.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc2.setJuoma(0);
   	             freeUp("proc2");
   	             tank10.lis‰‰(temp);
   	           }
   	           else {
   	             System.out.println("ERROR: No tank reserved for the beverage!");
   	           }
   	         }
   	         
   	         else if ((proc3.getK‰ytt‰j‰()).equals(asiakas)) {
   	           int temp = proc3.getJuoma();
   	           if (temp == 0) {  // varmistetaan, ett‰ ei l‰hdet‰ pumppaamaan tyhj‰‰ juomakeittimen juomas‰iliˆt‰!
   	             System.out.println("ERROR: No beverage to pump!");
   	             freeUp("pump2");
   	             break;
   	           }
   	           if ((tank1.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank1.lis‰‰(temp);
   	           }
   	           else if ((tank2.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank2.lis‰‰(temp);
   	           }
   	           else if ((tank3.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank3.lis‰‰(temp);
   	           }
   	           else if ((tank4.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank4.lis‰‰(temp);
   	           }
   	           else if ((tank5.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank5.lis‰‰(temp);
   	           }
   	           else if ((tank6.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank6.lis‰‰(temp);
   	           }
   	           else if ((tank7.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank7.lis‰‰(temp);
   	           }
   	           else if ((tank8.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank8.lis‰‰(temp);
   	           }
   	           else if ((tank9.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank9.lis‰‰(temp);
   	           }
   	           else if ((tank10.getK‰ytt‰j‰()).equals(asiakas)) {
   	             pump2.run(temp);
   	             proc3.setJuoma(0);
   	             freeUp("proc3");
   	             tank10.lis‰‰(temp);
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
         if ((tank1.getK‰ytt‰j‰()).equals(asiakas)) {
        	 m‰‰r‰ = tank1.getTilavuus();
        	 bottlePump1.run(m‰‰r‰);
        	 tank1.v‰henn‰(m‰‰r‰);
        	 freeUp("tank1");
         }
         else if ((tank2.getK‰ytt‰j‰()).equals(asiakas)) {
        	 m‰‰r‰ = tank2.getTilavuus();
        	 bottlePump1.run(m‰‰r‰);
        	 tank2.v‰henn‰(m‰‰r‰);
        	 freeUp("tank2");
         } 
         else if ((tank3.getK‰ytt‰j‰()).equals(asiakas)) {
        	 m‰‰r‰ = tank3.getTilavuus();
        	 bottlePump1.run(m‰‰r‰);
        	 tank3.v‰henn‰(m‰‰r‰);
        	 freeUp("tank3");
         }
         else if ((tank4.getK‰ytt‰j‰()).equals(asiakas)) {
        	 m‰‰r‰ = tank4.getTilavuus();
        	 bottlePump1.run(m‰‰r‰);
        	 tank4.v‰henn‰(m‰‰r‰);
        	 freeUp("tank4");
         } 
         else if ((tank5.getK‰ytt‰j‰()).equals(asiakas)) {
        	 m‰‰r‰ = tank5.getTilavuus();
        	 bottlePump1.run(m‰‰r‰);
        	 tank5.v‰henn‰(m‰‰r‰);
        	 freeUp("tank5");
         } 
         else if ((tank6.getK‰ytt‰j‰()).equals(asiakas)) {
        	 m‰‰r‰ = tank6.getTilavuus();
        	 bottlePump1.run(m‰‰r‰);
        	 tank6.v‰henn‰(m‰‰r‰);
        	 freeUp("tank6");
         } 
         else if ((tank7.getK‰ytt‰j‰()).equals(asiakas)) {
        	 m‰‰r‰ = tank7.getTilavuus();
        	 bottlePump1.run(m‰‰r‰);
        	 tank7.v‰henn‰(m‰‰r‰);
        	 freeUp("tank7");
         } 
         else if ((tank8.getK‰ytt‰j‰()).equals(asiakas)) {
        	 m‰‰r‰ = tank8.getTilavuus();
        	 bottlePump1.run(m‰‰r‰);
        	 tank8.v‰henn‰(m‰‰r‰);
        	 freeUp("tank8");
         } 
         else if ((tank9.getK‰ytt‰j‰()).equals(asiakas)) {
        	 m‰‰r‰ = tank9.getTilavuus();
        	 bottlePump1.run(m‰‰r‰);
        	 tank9.v‰henn‰(m‰‰r‰);
        	 freeUp("tank9");
         } 
         else if ((tank10.getK‰ytt‰j‰()).equals(asiakas)) {
        	 m‰‰r‰ = tank10.getTilavuus();
        	 bottlePump1.run(m‰‰r‰);
        	 tank10.v‰henn‰(m‰‰r‰);
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
         if ((tank1.getK‰ytt‰j‰()).equals(asiakas)) {
        	 m‰‰r‰ = tank1.getTilavuus();
        	 bottlePump2.run(m‰‰r‰);
        	 tank1.v‰henn‰(m‰‰r‰);
        	 freeUp("tank1");
         }
         else if ((tank2.getK‰ytt‰j‰()).equals(asiakas)) {
        	 m‰‰r‰ = tank2.getTilavuus();
        	 bottlePump2.run(m‰‰r‰);
        	 tank2.v‰henn‰(m‰‰r‰);
        	 freeUp("tank2");
         } 
         else if ((tank3.getK‰ytt‰j‰()).equals(asiakas)) {
        	 m‰‰r‰ = tank3.getTilavuus();
        	 bottlePump2.run(m‰‰r‰);
        	 tank3.v‰henn‰(m‰‰r‰);
        	 freeUp("tank3");
         }
         else if ((tank4.getK‰ytt‰j‰()).equals(asiakas)) {
        	 m‰‰r‰ = tank4.getTilavuus();
        	 bottlePump2.run(m‰‰r‰);
        	 tank4.v‰henn‰(m‰‰r‰);
        	 freeUp("tank4");
         } 
         else if ((tank5.getK‰ytt‰j‰()).equals(asiakas)) {
        	 m‰‰r‰ = tank5.getTilavuus();
        	 bottlePump2.run(m‰‰r‰);
        	 tank5.v‰henn‰(m‰‰r‰);
        	 freeUp("tank5");
         } 
         else if ((tank6.getK‰ytt‰j‰()).equals(asiakas)) {
        	 m‰‰r‰ = tank6.getTilavuus();
        	 bottlePump2.run(m‰‰r‰);
        	 tank6.v‰henn‰(m‰‰r‰);
        	 freeUp("tank6");
         } 
         else if ((tank7.getK‰ytt‰j‰()).equals(asiakas)) {
        	 m‰‰r‰ = tank7.getTilavuus();
        	 bottlePump2.run(m‰‰r‰);
        	 tank7.v‰henn‰(m‰‰r‰);
        	 freeUp("tank7");
         } 
         else if ((tank8.getK‰ytt‰j‰()).equals(asiakas)) {
        	 m‰‰r‰ = tank8.getTilavuus();
        	 bottlePump2.run(m‰‰r‰);
        	 tank8.v‰henn‰(m‰‰r‰);
        	 freeUp("tank8");
         } 
         else if ((tank9.getK‰ytt‰j‰()).equals(asiakas)) {
        	 m‰‰r‰ = tank9.getTilavuus();
        	 bottlePump2.run(m‰‰r‰);
        	 tank9.v‰henn‰(m‰‰r‰);
        	 freeUp("tank9");
         } 
         else if ((tank10.getK‰ytt‰j‰()).equals(asiakas)) {
        	 m‰‰r‰ = tank10.getTilavuus();
        	 bottlePump2.run(m‰‰r‰);
        	 tank10.v‰henn‰(m‰‰r‰);
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
    	 if ((proc1.getK‰ytt‰j‰()).equals(asiakas)) {
    		 proc1.run();
    		}
     else {
    	System.out.println("V‰‰r‰ k‰ytt‰j‰!");
       }
     }
     else {
       System.out.println("Laitetta ei varattu!");
     }
     break;
     
     case "proc2":
       
    if ((!proc2.getRunning())) {
    	proc2.setRunning(true);
    	if ((proc2.getK‰ytt‰j‰()).equals(asiakas)) {
         proc2.run();
       }
       else {
         System.out.println("V‰‰r‰ k‰ytt‰j‰!");
       }
     }
     else {
       System.out.println("Laitetta ei varattu!");
     }
     break;
     
     case "proc3":
       
     if ((!proc3.getRunning())) {
    	proc3.setRunning(true);
       if ((proc3.getK‰ytt‰j‰()).equals(asiakas)) {
         proc3.run();
       }
       else {
         System.out.println("V‰‰r‰ k‰ytt‰j‰!");
       }
     }
     else {
       System.out.println("Laitetta ei varattu!");
     }
     break;
     
     
     // Tank -tyyppisi‰ laitteita ei tarvitse "k‰ynnist‰‰"?
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