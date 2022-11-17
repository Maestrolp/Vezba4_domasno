package zadaca2;

public class MainClass {
	public static void main (String[] args)
	{
		Restorant r = new Restorant();
		
		r.setirajIme("Epinal");
		r.setirajLok("Strog Centar");
		r.setirajTel("047/3826478");
		r.setirajSed(250);
		
		System.out.println("Ime na restorantot: " +r.getIme());
		System.out.println("Lokacija: " +r.getLokacija());
		System.out.println("Tel: " +r.getTel());
		System.out.println("Broj na sedista: " +r.getSedista());
		
		
	}

}
