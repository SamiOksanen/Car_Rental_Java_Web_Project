package bean;

public class InvalidWebUserPoikkeus extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidWebUserPoikkeus(String viesti) {
		super(viesti);
	}


}
