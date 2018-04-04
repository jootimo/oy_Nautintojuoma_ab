package host;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Etäolion rajapinta
 */
public interface Process extends Remote{
	
	/**
	 * Varaa palvelimelta laitteen asiakkaan käyttöön.
	 * @param laitteenNimi varattava laite
	 * @param asiakas varauspyynnön lähettäjä
	 * @throws RemoteException virhe RMI-kutsussa
	 */
	public void reserve(String laitteenNimi, String asiakas) throws RemoteException;  
	
	/**
	 * Pyytää palvelinta käynnistämään laitteen
	 * @param laitteenNimi käynnistettävä laite
	 * @param asiakas käynnistyspyynnön lähettäjä
	 * @throws RemoteException virhe RMI-kutsussa
	 */
	public void start(String laitteenNimi, String asiakas) throws RemoteException;
	
	/**
	 * Pyytää palvelinta käynnistämään ruuvikuljettimen asiakkaan määrittämällä määrällä
	 * @param laitteenNimi käynnistettävä laite
	 * @param asiakas käynnistyspyynnön lähettäjä
	 * @param amount siirrettävä määrä
	 * @throws RemoteException virhe RMI-kutsussa
	 */
	public void start(String laitteenNimi, String asiakas, int amount) throws RemoteException;
	
	/**
	 * Palauttaa asiakkaalle prosessin tilaa kuvaavan olion.
	 * @return tilaolio
	 * @throws RemoteException virhe RMI-kutsussa
	 */
	public ProcessState getState() throws RemoteException;
	
	/**
	 * Kirjaa käyttäjän palvelimelle
	 * @param name käyttäjän nimi
	 * @return yksinkertaisuuden vuoksi aina true
	 * @throws RemoteException virhe RMI-kutsussa
	 */
	public boolean login(String name) throws RemoteException;
	
}
