package host;

import java.rmi.RemoteException;

/**
 * Et‰olion toteutus
 */
public class ProcessImplementation implements Process {

	private static final long serialVersionUID = 1L;
	private ProcessServer server;

	/**
	 * Luo uuden et‰olion ja sitoo sen palvelimeen
	 * @param server Prosessia yll‰pit‰v‰ palvelin
	 */
	public ProcessImplementation(ProcessServer server) {
		super();
		this.server = server;
	}
 
	/**
	 * Varaa ko. laitteen ko. asiakkaalle
	 */
	public void reserve(String laitteenNimi, String asiakas) throws RemoteException { 
		try {
			server.reserve(laitteenNimi, asiakas);
		} catch (AlreadyReservedException e) {
			e.printStackTrace();
		}

	}
 
	/**
	 * K‰ynnist‰‰ ko. laitteen ko. asiakkaalle
	 */
	public void start(String laitteenNimi, String asiakas) throws RemoteException {
		//Laitetaan testausta varten siiloihin vain 1000. Muuten kest‰‰ kauhean kauan.
		server.start(laitteenNimi, asiakas, 1000);
	}
 
	/**
	 * K‰ynnist‰‰ ko. laitteen ko. asiakkaalle
	 */	
	public void start(String laitteenNimi, String asiakas, int amount) throws RemoteException {
		server.start(laitteenNimi, asiakas, amount);
	}
 
	/**
	 * Palauttaa asiakkaalle tilaolion
	 */
	public ProcessState getState() throws RemoteException {
		return server.getState();
	}
 
	/**
	 * Kirjaa k‰ytt‰j‰n sis‰‰n
	 */
	public boolean login(String name) throws RemoteException{
		return server.login(name);
	}
}
