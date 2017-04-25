package bean;

/*
 * Sami Oksanen ja Ossi Pihlaniemi
 */

public class Posti {
	private String postinro;
	private String postitmp;
	
	public Posti()
	{
		postinro=postitmp= null;
	}
	public Posti (String nro, String tmp)
	{
		postinro = postitmp=null;
		if (nro != null && nro.matches("\\d{5}"))
			postinro = nro;
		
		if (tmp != null && tmp.trim().length()>0)
		{
			tmp = tmp.trim();
			tmp = tmp.replaceAll("\\s+"," ");// posta ylim. tyhjät sanojen välistä
			postitmp = tmp.toUpperCase();
		}
	}
	public String getPostinro() {
		return postinro;
	}
	public void setPostinro(String nro) {
		this.postinro = null;
		if (nro != null && nro.matches("\\d{5}"))
			postinro = nro;
	}
	public String getPostitmp() {
		return postitmp;
	}
	public void setPostitmp(String tmp) {
		this.postitmp = null;
		tmp = tmp.trim();
		tmp = tmp.replaceAll("\\s+"," ");// posta ylim. tyhjät sanojen välistä
		postitmp = tmp.toUpperCase();
	}
	public String toString()
	{
		return postinro + " " + postitmp;
	}
	
}
