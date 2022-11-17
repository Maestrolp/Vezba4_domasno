package zadaca2;

public class Restorant {
	private String imeRestorant;
	private String lokacija;
	private String tel;
	private int sedista;
	
	public Restorant ()
	{
		
	}
	
	public void setirajIme (String ime) {this.imeRestorant=ime;}
	public void setirajLok (String lok) {this.lokacija = lok;}
	public void setirajTel (String tel) {this.tel = tel;}
	public void setirajSed (int sedista) {this.sedista = sedista;}
	
	public String getIme () { return imeRestorant;}
	public String getLokacija () {return lokacija;}
	public String getTel () {return tel;}
	public int getSedista() {return sedista;}

}
