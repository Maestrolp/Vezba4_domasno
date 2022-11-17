package zadaca4;

public class MainClass {
	public static void main (String[] args)
	{
		Avtomobil kola = new Avtomobil();
		
		System.out.println("Marka: " +kola.getMarka());
		System.out.println("Model: " +kola.getModel());
		System.out.println("Pominati km pred mnozenje: " +kola.getPominatiKm());
		System.out.println("Pominati kn posle mnozenje: " +kola.mnozenjeKm(5));
		System.out.println("Boja: " +kola.getBoja());
	}

}
