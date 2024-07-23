package Paket;

public class Yazılımcı extends Calisan {
	private String diller;
	
	
	public Yazılımcı(String ad,String soyAd,int id,String diller) {
		super(ad,soyAd,id);
		this.diller=diller;
		
		
	}
	public void formatAt(String işletimSistemi) {
		System.out.println(getAd()+" "+işletimSistemi+"ni yüklüyor...");
		
	}
	@Override 
	public void BilgileriGöster() {
		super.BilgileriGöster();
		System.out.println("Yazılımcının Bildiği Diller: "+diller);
	}

}
