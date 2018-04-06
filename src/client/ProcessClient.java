package client;


import host.ProcessState;
import host.Process;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * T�m� luokka toimii RMI:n edustajaoliona. Se l�hett�� k�ytt�liittym�lt� saamansa k�skyt palvelimelle.
 */
public class ProcessClient extends UnicastRemoteObject {

	private static final long serialVersionUID = 1L;
	private Process process;
	private String name;

	/**
	 * Konstruktori, joka luo edustajaolion ja hakee viittauksen et�olioon RMIregistryst�.
	 * @throws RemoteException
	 */
	protected ProcessClient() throws RemoteException {
		try {
			//haetaan viittaus rekisteriin
			Registry registry = LocateRegistry.getRegistry(null); //t�ss� null = localhost
			//etsit��n rekisterist� Process-niminen olio
			process = (Process) registry.lookup("Process");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Palauttaa edustajaolioon liittyv�n asiakkaan nimen
	 * @return asiakkaan nimi
	 */
	public String getName() {
		return name;
	}

	/**
	 * Asettaa asiakkaalle nimen kirjautumisen yhteydess�
	 * @param name asiakkaan nimi
	 */
	public void setName(String name) {
		this.name = name;
    	System.out.println("Logged in as " + name);
	}
	
	/**
	 * L�hett�� et�kutsun palvelimelle laitteen varaamiseksi
	 * @param o laitteen tyyppi
	 * @param s laitteen nimi
	 */
	public void reserve(String s){
		try {
			process.reserve(s, name);
		} catch (Exception e) {
			System.out.println("Error with RMI-call");
			e.printStackTrace();
		}
	}
	
	/**
	 * L�het�� et�kutsun palvelimelle laitteen k�ynnist�miseksi
	 * @param o laitteen tyyppi
	 * @param s laitteen nimi
	 */
	public void start(String s){
		try {
			process.start(s, name);
		} catch (Exception e) {
			System.out.println("Error with RMI-call");
			e.printStackTrace();
		}
	}
	
	/**
	 * L�het�� et�kutsun palvelimelle ruuvikuljettimen k�ynnist�miseksi
	 * @param o laitteen tyyppi
	 * @param procLoaderNo laitten nimi
	 * @param amount siirrett�v� m��r�
	 */
	public void start(String s, int amount){	
		try {
		process.start(s, name, amount);
		} catch (Exception e){
			System.out.println("Error with RMI-call");
			e.printStackTrace();		
		}
	}
	
	/**
	 * L�hett�� palvelimelle kyselyn prosessin tilasta
	 * @return prosessin tila
	 * @throws RemoteException
	 */
	public ProcessState getState(){
		try {
			return process.getState();
		} catch (RemoteException e) {
			System.out.println("Error with RMI-call");
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * L�hett�� kirjautumistiedot (pelkk� nimi) palvelimelle hyv�ksytt�v�ksi.
	 * @param name k�ytt�j�n nimi
	 * @return true jos kirjautuminen onnistuu, muuten false
	 */
	public boolean login(String name) {
		try {
			return process.login(name);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}
	
}
