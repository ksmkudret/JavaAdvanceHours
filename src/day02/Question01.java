package day02;

import java.util.Scanner;

/*
Bir sayýnýn mükemmel olup olmadýðýný bulan bir program yazýnýz.
Mükemmel sayý : bir sayýnýn kendisi hariç bölenlerinin toplamý, kendisine eþitse o sayý mükemmeldir.
ORNEK:
INPUT     : 6
OUTPUT : 1,2,3
              1+2+3 = 6 = 6 (Mükemmel)
              
              mukemmel sayi kontrolu
              1. Adim kullanicidan sayi alalim
              2. bir toplam degiskeni olusturuyoruz
              3. sayinin bolenleri bul
              4. bolenleri toplamla topla
              5. sayiyla toplamin esitligini kontrol et
              
*/
public class Question01 {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Lutfen bir sayi giriniz");
			int sayi = scan.nextInt();
			
			System.out.println(checkPerfectNumber(sayi));
			boolean flag;
			flag = checkPerfectNumber(sayi);
			System.out.println(flag);
			
			String result = checkPerfectNumber(sayi)? "Sayi mukemmel sayidir" 
					: "Sayi mukemmel sayi degildir";
			System.out.println(result);
	}
	
	public static boolean checkPerfectNumber(int sayi){
		int toplam = 0;
		boolean flag = false; // durum kontrolü (açýk kapalý gibi) "flag ismi bir onem arzetmiyor"
		for(int i = 1; i<sayi; i++){
			if(sayi%i==0){
				toplam = toplam + i; // toplam += i;
			}
		}
		if(toplam == sayi){
			flag=true;
		}
		
		return flag;
		
	}

}



