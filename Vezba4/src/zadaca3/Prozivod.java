package zadaca3;

public class Prozivod {
	private String imeProizvod;
	private double cena;
	private String proizvoditel;
	private double tezina;
	
	public Prozivod ()
	{
		this.imeProizvod ="Krem Banana";
		this.cena = 5;
		this.proizvoditel ="AgroBlok";
		this.tezina = 0.5;
	}
	
	public String getIme () {return imeProizvod;}
	public double getCena () {return cena;}
	public String getProizvoditel() {return proizvoditel;}
	public double getTezina() {return tezina;}
	
	public void setIme (String ime) {this.imeProizvod=ime;}
	public void setCena (double cena) {this.cena=cena;}
	public void setProivoditel(String proizvoditel) {this.proizvoditel=proizvoditel;}
	public void setTezina(double tezina) {this.tezina=tezina;}


}
