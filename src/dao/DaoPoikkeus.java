package dao;

/*
 * Sami Oksanen ja Ossi Pihlaniemi
 */

public class DaoPoikkeus extends Exception{
	private static final long serialVersionUID = 1L;

	public DaoPoikkeus() {
		super("Tietokantapoikkeus");
	}

	public DaoPoikkeus(String viesti) {
		super(viesti);
	}

	public DaoPoikkeus(Throwable aiheuttaja) {
		super(aiheuttaja);
	}

	public DaoPoikkeus(String viesti, Throwable aiheuttaja) {
		super(viesti, aiheuttaja);
	}
}
