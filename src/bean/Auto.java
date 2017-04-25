package bean;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Sami Oksanen ja Ossi Pihlaniemi
 */

public class Auto {
	private String rekno;
	private String merkki;
	private String malli;
	private double vrkhinta;
	private Date huoltopvm; // vahva koostumussuhde voi puuttua
	
	public Auto() {
		super();
		rekno=merkki=malli= null;
		vrkhinta = 0;
		huoltopvm = null;
	}

	public Auto(String rekno, String merkki, String malli, 
			double vrkhinta, Date huoltopvm) {
		super();
		this.rekno = rekno;
		this.merkki = merkki;
		this.malli = malli;
		this.vrkhinta = vrkhinta;
		setHuoltopvm (huoltopvm);
	}

	public String getRekno() {
		return rekno;
	}

	public void setRekno(String rekno) {
		this.rekno = rekno;
	}

	public String getMerkki() {
		return merkki;
	}

	public void setMerkki(String merkki) {
		this.merkki = merkki;
	}

	public String getMalli() {
		return malli;
	}

	public void setMalli(String malli) {
		this.malli = malli;
	}

	public double getVrkhinta() {
		return vrkhinta;
	}

	public void setVrkhinta(double vrkhinta) {
		this.vrkhinta = vrkhinta;
	}

	public Date getHuoltopvmB() {
		Date apu = null;
		if (huoltopvm != null)
			apu = (Date) huoltopvm.clone();
		return apu;
	}
	public String getHuoltopvm() {
		SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy");
		String pvm = null;
		if (huoltopvm != null)
			pvm = f.format(huoltopvm);
		return pvm;
	}

	public void setHuoltopvm(Date huoltopvm) {
		if (huoltopvm != null)
			this.huoltopvm = (Date) huoltopvm.clone();
		else
			this.huoltopvm = null;
	}

	@Override
	public String toString() {
		return "Auto [rekno=" + rekno + ", merkki=" + merkki + ", malli="
				+ malli + ", vrkhinta=" + vrkhinta + ", huoltopvm=" 
				+ huoltopvm + "]";
	}

	
}
