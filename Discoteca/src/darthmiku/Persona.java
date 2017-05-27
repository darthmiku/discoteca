package darthmiku;

public class Persona {
	private String nom;
	private int edat;
	private String sexe;
	private String calsat;
	private int diners;
	
	public Persona(String nom, int edat, String sexe, String calsat, int diners) {
		super();
		this.nom = nom;
		this.edat = edat;
		this.sexe = sexe;
		this.calsat = calsat;
		this.diners = diners;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getEdat() {
		return edat;
	}
	public void setEdat(int edat) {
		this.edat = edat;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getCalsat() {
		return calsat;
	}
	public void setCalsat(String calsat) {
		this.calsat = calsat;
	}
	public int getDiners() {
		return diners;
	}
	public void setDiners(int diners) {
		this.diners = diners;
	}
	
	
	@Override
	public String toString() {
		return nom ;
	}

	
	
	

}
