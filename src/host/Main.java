package host;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Palvelinpuolen k‰ynnistys ja aloitus
 */
public class Main {

	/**
	 * Luo prosessin ja liitt‰‰ sen RMIregistryyn asiakkaiden saataville.
	 * @param args komentoriviargumentit
	 */
    public static void main(String[] args) {
           try {
        	   //Luodaan et‰olio ja sille viittaus palvelimeen
               Process process = new ProcessImplementation(new ProcessServer());
               //vied‰‰n "tynk‰" asiakkaiden saataville
               Process stub =
                   (Process) UnicastRemoteObject.exportObject(process, 0);
               //luodaan rekisteri
               Registry registry = LocateRegistry.createRegistry(1099);
               //nimet‰‰n tynk‰ Processiksi
               registry.rebind("Process", stub);
               System.out.println("Process bound");
           } catch (Exception e) {
               System.err.println("Process exception:");
               e.printStackTrace();
           }
       }
}
