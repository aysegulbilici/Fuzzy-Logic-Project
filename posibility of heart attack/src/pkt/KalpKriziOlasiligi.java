package pkt;

import java.io.File;
import java.net.URISyntaxException;

import net.sourceforge.jFuzzyLogic.FIS;

public class KalpKriziOlasiligi {
	private FIS fis;
	private double uykusuresi;
	private double yagtuketimi;
	
	public KalpKriziOlasiligi (double uykusuresi, double yagtuketimi) throws URISyntaxException {
		this.uykusuresi = uykusuresi;
		this.yagtuketimi = yagtuketimi;
		
		File dosya = new File(getClass().getResource("KalpKriziOlasiligiModel.fcl").toURI());
	    fis = FIS.load(dosya.getPath());
	    fis.setVariable("uykusuresi", uykusuresi);
	    fis.setVariable("yagtuketimi", yagtuketimi);
	    fis.evaluate();
	}
	public FIS getModel() {
		return fis;
	}
	public String toString() {
		String cikti;
		cikti = "Kalp Krizi Olasılığı: "+Math.round(fis.getVariable("kalpkriziolasiligi").getValue())+" %";
		return cikti;
	}
	
	
}