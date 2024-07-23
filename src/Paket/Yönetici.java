package Paket;

public class Yönetici extends Calisan {
	private int SorumluKişiSayısı;
	public Yönetici(String Ad,String Soyad,int İd,int SorumluKişiSayısı)
	{
	super(Ad,Soyad,İd);
	this.setSorumluKişiSayısı(SorumluKişiSayısı);
	}
	@Override
	public void BilgileriGöster() {
		super.BilgileriGöster();
		System.out.println("Sorumlu Olduğu Kişi Sayısı: "+getSorumluKişiSayısı());
	}
   public void zamYap(int zamMiktarı) {
	   
	   System.out.println(getAd()+"Çalışanlara"+zamMiktarı+"Kadar zam yapılıyor");
	   
   }
public int getSorumluKişiSayısı() {
	return SorumluKişiSayısı;
}
public void setSorumluKişiSayısı(int sorumluKişiSayısı) {
	SorumluKişiSayısı = sorumluKişiSayısı;
}
}
	

