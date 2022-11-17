package zadaca4;

public class Avtomobil {
	private String marka;
	private String model;
	private double pominatiKm;
	private String boja;
	
	public Avtomobil ()
	{
		this.marka = "Hyndai";
		this.model = "Accent";
		this.pominatiKm = 154;
		this.boja = "Red";
	}
	
	public double mnozenjeKm (double pominatiKM)
	{
		double vkupnoKm = pominatiKm * this.pominatiKm;
		return vkupnoKm;
	}
	public String getMarka() {return marka;}
	public String getModel() {return model;}
	public double getPominatiKm() {return pominatiKm;}
	public String getBoja() {return boja;}
	

}
