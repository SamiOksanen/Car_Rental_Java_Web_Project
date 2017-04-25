package bean;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Sami Oksanen ja Ossi Pihlaniemi
 */

public class Vuokraus {
	private int numero;
	private Date vuokrauspvm;
	private Date paattymispvm;
	private double kokonaishinta;
	private Date maksupvm;
	private Asiakas vuokraaja;
	private Auto vuokrakohde;
	public Vuokraus() {
		super();
		numero = 0;
		vuokrauspvm = new Date();
		paattymispvm = new Date();
		kokonaishinta = 0;
		maksupvm = null;
		vuokraaja = null;
		vuokrakohde = null;
	}
	public Vuokraus(int numero, Date vuokrauspvm, Date paattymispvm,
			double kokonaishinta, Date maksupvm, Asiakas vuokraaja,
			Auto vuokrakohde) {
		this();
		this.numero = numero;
		setVuokrauspvm( vuokrauspvm);
		setPaattymispvm ( paattymispvm);
		this.kokonaishinta = kokonaishinta;
		setMaksupvm ( maksupvm);
		this.vuokraaja = vuokraaja;
		this.vuokrakohde = vuokrakohde;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getVuokrauspvmB() {
		Date apu = (Date)vuokrauspvm.clone();
		return apu;
	}
	public String getVuokrauspvm() {
		SimpleDateFormat f =new SimpleDateFormat("dd.MM.yyyy");
		String apu = f.format(vuokrauspvm);
		return apu;
	}
	public String getVuokrauspvmTK() {
		SimpleDateFormat f =new SimpleDateFormat("yyyy-MM-dd");
		String apu = f.format(vuokrauspvm);
		return apu;
	}
	public void setVuokrauspvm(Date vuokrauspvm) {
		if ( vuokrauspvm != null)
			this.vuokrauspvm = (Date)vuokrauspvm.clone();
	}
	public Date getPaattymispvmB() {
		Date apu = (Date)paattymispvm.clone();
		return apu;
	}
	public String getPaattymispvm() {
		SimpleDateFormat f =new SimpleDateFormat("dd.MM.yyyy");
		String apu = f.format(paattymispvm);
		return apu;
	}
	public String getPaattymispvmTK() {
		SimpleDateFormat f =new SimpleDateFormat("yyyy-MM-dd");
		String apu = f.format(paattymispvm);
		return apu;
	}
	public void setPaattymispvm(Date paattymispvm) {
		if (paattymispvm != null)
			this.paattymispvm = (Date)paattymispvm.clone();
	}
	public double getKokonaishinta() {
		return kokonaishinta;
	}
	public void setKokonaishinta(double kokonaishinta) {
		this.kokonaishinta = kokonaishinta;
	}
	public Date getMaksupvmB() {
		Date apu = null;
		if (maksupvm!= null)
			apu = (Date) maksupvm.clone();
		return apu;
	}
	public String getMaksupvm() {
		SimpleDateFormat f =new SimpleDateFormat("dd.MM.yyyy");
		String apu = null;
		if (maksupvm != null)
			apu= f.format(maksupvm);
		return apu;
	}
	public String getMaksupvmTK() {
		SimpleDateFormat f =new SimpleDateFormat("yyyy-MM-dd");
		String apu = null;
		if (maksupvm != null)
			apu= f.format(maksupvm);
		return apu;
	}
	public void setMaksupvm(Date maksupvm) {
		if ( maksupvm != null)
			this.maksupvm = (Date) maksupvm.clone();
		else
			this.maksupvm = null;
	}
	public Asiakas getVuokraaja() {
		return vuokraaja;
	}
	public void setVuokraaja(Asiakas vuokraaja) {
		this.vuokraaja = vuokraaja;
	}
	public Auto getVuokrakohde() {
		return vuokrakohde;
	}
	public void setVuokrakohde(Auto vuokrakohde) {
		this.vuokrakohde = vuokrakohde;
	}
	@Override
	public String toString() {
		return "Vuokraus [numero=" + numero + ", vuokrauspvm=" + vuokrauspvm
				+ ", paattymispvm=" + paattymispvm + ", kokonaishinta="
				+ kokonaishinta + ", maksupvm=" + maksupvm + ", vuokraaja="
				+ vuokraaja + ", vuokrakohde=" + vuokrakohde + "]";
	}
	
	
	
	
	
}
