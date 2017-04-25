package bean;

/*
 * Sami Oksanen ja Ossi Pihlaniemi
 */

public class Asiakas {
	private int id;
	private String etunimi;
	private String sukunimi;
	private String osoite;
	private String puhelin;
	private Posti posti;
	
	public Asiakas() {
		id = 0;
		etunimi = sukunimi = osoite=puhelin = null;
		posti = null;
	}

	public Asiakas(int id, String etunimi, String sukunimi, String osoite,
			String puhelin, Posti posti) {
		super();
		this.id = id;
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		this.osoite = osoite;
		this.puhelin = puhelin;
		this.posti = posti;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEtunimi() {
		return etunimi;
	}

	public void setEtunimi(String etunimi) {
		this.etunimi = etunimi;
	}

	public String getSukunimi() {
		return sukunimi;
	}

	public void setSukunimi(String sukunimi) {
		this.sukunimi = sukunimi;
	}

	public String getOsoite() {
		return osoite;
	}

	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}

	public String getPuhelin() {
		return puhelin;
	}

	public void setPuhelin(String puhelin) {
		this.puhelin = puhelin;
	}

	public Posti getPosti() {
		return posti;
	}

	public void setPosti(Posti posti) {
		this.posti = posti;
	}

	@Override
	public String toString() {
		return "Asiakas [id=" + id + ", etunimi=" + etunimi + ", sukunimi="
				+ sukunimi + ", osoite=" + osoite + ", puhelin=" + puhelin
				+ ", posti=" + posti + "]";
	}

}
