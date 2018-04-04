package host;

import java.io.Serializable;

/**
 * Tämä luokka kuvaa prosessin tilaa. Sisältää metodit varaustilanteen, käynnissäolon ja käyttäjän tarkasteluun. 
 */
public class ProcessState implements Serializable {

	private static final long serialVersionUID = 1L;
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

	
	public ProcessState(Conveyor siloLoader, Silo silo1, Silo silo2, Silo silo3, Silo silo4,
						Conveyor procLoader1, Conveyor procLoader2, Processor proc1, Processor proc2,
						Processor proc3, Pump pump1, Pump pump2, Tank tank1, Tank tank2, Tank tank3,
						Tank tank4, Tank tank5, Tank tank6, Tank tank7, Tank tank8, Tank tank9,
						Tank tank10, Pump bottlePump1, Pump bottlePump2) {
	
		this.siloLoader = siloLoader; 
		this.silo1 = silo1;
		this.silo2 = silo2;
		this.silo3 = silo3;
		this.silo4 = silo4;
		this.procLoader1 = procLoader1;
		this.procLoader2 = procLoader2;
		this.proc1 = proc1;
		this.proc2 = proc2;
		this.proc3 = proc3;
		this.pump1 = pump1;
		this.pump2 = pump2;
		this.tank1 = tank1;
		this.tank2 = tank2;
		this.tank3 = tank3;
		this.tank4 = tank4;
		this.tank5 = tank5;
		this.tank6 = tank6;
		this.tank7 = tank7;
		this.tank8 = tank8;
		this.tank9 = tank9;
		this.tank10 = tank10;
		this.bottlePump1 = bottlePump1;
		this.bottlePump2 = bottlePump2;
	}
	
	
	 
	public boolean isSiloLoader() {
		return siloLoader.getVarattu();
	}
	public boolean isSilo1() {
		return silo1.getVarattu();
	}
	public boolean isSilo2() {
		return silo2.getVarattu();
	}
	public boolean isSilo3() {
		return silo3.getVarattu();
	}
	public boolean isSilo4() {
		return silo4.getVarattu();
	}
	public boolean isSilo1Empty() {
		if (silo1.getTäyttöaste() == 0) return true;
		return false;
	}
	public boolean isSilo2Empty() {
		if (silo2.getTäyttöaste() == 0) return true;
		return false;
	}
	public boolean isSilo3Empty() {
		if (silo3.getTäyttöaste() == 0) return true;
		return false;
	}
	public boolean isSilo24Empty() {
		if (silo4.getTäyttöaste() == 0) return true;
		return false;
	}

	
	public boolean isProcLoader1() {
		return procLoader1.getVarattu();
	}
	public boolean isProcLoader2() {
		return procLoader2.getVarattu();
	}
	
	
	public boolean isProc1Reserved() {
		return proc1.getVarattu();
	}
	public boolean isProc2Reserved() {
		return proc2.getVarattu();
	}
	public boolean isProc3Reserved() {
		return proc3.getVarattu();
	}
	public boolean isProc1Running(){
		return proc1.getRunning();
	}
	public boolean isProc2Running(){
		return proc2.getRunning();
	}
	public boolean isProc3Running(){
		return proc3.getRunning();
	}
	public boolean isProc1Empty(){
		if (proc1.getJuoma() == 0 && proc1.getKiinteä() == 0) return true;
		return false;
	}
	public boolean isProc2Empty(){
		if (proc2.getJuoma() == 0 && proc2.getKiinteä() == 0) return true;
		return false;
	}
	public boolean isProc3Empty(){
		if (proc3.getJuoma() == 0 && proc3.getKiinteä() == 0) return true;
		return false;
	}
	
	
	public boolean isPump1() {
		return pump1.getVarattu();
	}
	public boolean isPump2() {
		return pump2.getVarattu();
	}
	
	
	public boolean isTank1() {
		return tank1.getVarattu();
	}
	public boolean isTank2() {
		return tank2.getVarattu();
	}
	public boolean isTank3() {
		return tank3.getVarattu();
	}
	public boolean isTank4() {
		return tank4.getVarattu();
	}
	public boolean isTank5() {
		return tank5.getVarattu();
	}
	public boolean isTank6() {
		return tank6.getVarattu();
	}
	public boolean isTank7() {
		return tank7.getVarattu();
	}
	public boolean isTank8() {
		return tank8.getVarattu();
	}
	public boolean isTank9() {
		return tank9.getVarattu();
	}
	public boolean isTank10() {
		return tank10.getVarattu();
	}
	public int getTank1Amount(){
		return tank1.getTilavuus();
	}
	public int getTank2Amount(){
		return tank2.getTilavuus();
	}
	public int getTank3Amount(){
		return tank3.getTilavuus();
	}
	public int getTank4Amount(){
		return tank4.getTilavuus();
	}
	public int getTank5Amount(){
		return tank5.getTilavuus();
	}
	public int getTank6Amount(){
		return tank6.getTilavuus();
	}
	public int getTank7Amount(){
		return tank7.getTilavuus();
	}
	public int getTank8Amount(){
		return tank8.getTilavuus();
	}
	public int getTank9Amount(){
		return tank9.getTilavuus();
	}
	public int getTank10Amount(){
		return tank10.getTilavuus();
	}

	
	public boolean isBottlePump1() {
		return bottlePump1.getVarattu();
	}
	public boolean isBottlePump2() {
		return bottlePump2.getVarattu();
	}

	
	public String getProc1User(){
		return proc1.getKäyttäjä();
	}
	public String getProc2User(){
		return proc2.getKäyttäjä();
	}
	public String getProc3User(){
		return proc3.getKäyttäjä();
	}
	
	
	public int getSilo1Amount(){
		return silo1.getTäyttöaste();
	}
	public int getSilo2Amount(){
		return silo2.getTäyttöaste();
	}
	public int getSilo3Amount(){
		return silo3.getTäyttöaste();
	}
	public int getSilo4Amount(){
		return silo4.getTäyttöaste();
	}		

}
