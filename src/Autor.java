
public class Autor {
	private String nume;
	
	public Autor (String nume) {
		this.nume = nume;
		
	}

	public String getAutor(){
		return this.nume;
	}
	public void setAutorNume(String nume){
		this.nume= nume;
	}
	
	public void printAutor(){
		System.out.println("Numele autorului este " + nume);
	}
}
	

