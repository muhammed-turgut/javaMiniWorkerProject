package Paket;

public class Calisan {
	private String Ad;
	private String SoyAd;
	private int id;
	
	
	
	public Calisan(String Ad,String SoyAd,int id) {
		
		this.Ad=Ad;
		this.SoyAd=SoyAd;
		this.id=id;
	}



	public String getAd() {
		return Ad;
	}



	public void setAd(String ad) {
		Ad = ad;
	}



	public String getSoyAd() {
		return SoyAd;
	}



	public void setSoyAd(String soyAd) {
		SoyAd = soyAd;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}
	
	public void BilgileriGöster() {
		System.out.println("Çalışan Bilgileri...");
		System.out.println("Çalışan Adı: "+Ad);
		System.out.println("Soyad: "+SoyAd);
		System.out.println("İd"+id);
		
	}

}
