package Paket;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("****Çalışanlar Programımıza Hoşgeldiniz****");
		String işlemler="İşlemler...\n"+
		                 "1.Yazılımcı İşlemleri:\n"+
		                 "2.Yönetici İşlemleri:\n"+
		                 "Çıkış İçin q ya basın";
		System.out.println("********************************");
		System.out.println(işlemler);
		System.out.println("********************************");
		while(true) {
			System.out.println("***İşlemi Seçiniz***");
			String islem=scanner.nextLine();
			if(islem.equals("1")) {
				Yazılımcı yazılımcı=new Yazılımcı("Muhammed", "Turgut", 1234, "Pyhton,Java,C");
				String Yazılımcıişlemleri="1.Format At**\n"+
		                   "2.Bilgileri Göster**\n"+
				           "Çıkış İçin q ya basın.";
				System.out.println(Yazılımcıişlemleri);
				while(true) {
					System.out.println("İşlem Seçiniz...");
					String Yislem=scanner.nextLine();
					if(Yislem.equals("1"))
					{
						String işletimSistemi;
						System.out.println("İşletim Ssitemi: ");
						işletimSistemi=scanner.nextLine();
						yazılımcı.formatAt(işletimSistemi);
					}
					else if(Yislem.equals("2") )	
					{
						yazılımcı.BilgileriGöster();
					}
					else if(Yislem.equals("q"))
					{
						System.out.println("Yazılımcıdan Çıkılıyor...");
						break;
						
					}
					else {
						System.out.println("Hatalı İşlem...");
					}
					
	
				}
			}
			else if(islem.equals("2")) {
				Yönetici yönetici=new Yönetici("Akın", "Turgut", 12356, 50);
				String Yöneticiİşlem="1.Sorumlu Kişi**\n"+
				                     "2.Bilgileri Göster**\n"+
						            "Çıkış İçin q ya basın**";
				System.out.println(Yöneticiİşlem);
				while(true) {
					
					System.out.println("İşlem Seç: ");
					String İşlemYönetici=scanner.nextLine();
					if(İşlemYönetici.equals("1"))
					{
						System.out.println("Yöneticinin Sorumlu Olduğu Kişi Sayısı: "+yönetici.getSorumluKişiSayısı());
						
					}
					else if(İşlemYönetici.equals("2"))
					{
						yönetici.BilgileriGöster();	
					}
					
					else if(İşlemYönetici.equals("q"))
					{
						System.out.println("Yönetici işlemlerinden Çıkılıyor");
						
					}
					else
					{
						System.out.println("Hatalı İşlem Seçimi...");
					}
					
					
				}
				
			}
			
			else if(islem.equals("q")) {
				System.out.println("Sistemden Çıkış Yapılıyor...");
				break;
			}
			else {
				System.out.println("Geçersiz İşlem....");
			}
		}
		
	}

}
