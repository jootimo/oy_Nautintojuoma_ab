package host;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Et�olion rajapinta
 */
public interface Process extends Remote{
	
	/**
	 * Varaa palvelimelta laitteen asiakkaan k�ytt��n.
	 * @param laitteenNimi varattava laite
	 * @param asiakas varauspyynn�n l�hett�j�
	 * @throws RemoteException virhe RMI-kutsussa
	 */
	public void reserve(String laitteenNimi, String asiakas) throws RemoteException;  
	
	/**
	 * Pyyt�� palvelinta k�ynnist�m��n laitteen
	 * @param laitteenNimi k�ynnistett�v� laite
	 * @param asiakas k�ynnistyspyynn�n l�hett�j�
	 * @throws RemoteException virhe RMI-kutsussa
	 */
	public void start(String laitteenNimi, String asiakas) throws RemoteException;
	
	/**
	 * Pyyt�� palvelinta k�ynnist�m��n ruuvikuljettimen asiakkaan m��ritt�m�ll� m��r�ll�
	 * @param laitteenNimi k�ynnistett�v� laite
	 * @param asiakas k�ynnistyspyynn�n l�hett�j�
	 * @param amount siirrett�v� m��r�
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
	 * Kirjaa k�ytt�j�n palvelimelle
	 * @param name k�ytt�j�n nimi
	 * @return yksinkertaisuuden vuoksi aina true
	 * @throws RemoteException virhe RMI-kutsussa
	 */
	public boolean login(String name) throws RemoteException;
	
}
