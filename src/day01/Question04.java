package day01;

import java.util.Scanner;


public class Question04 {
	/*
	 * Ask user Name, Surname and credit card numbers than convert it to special
	 * form
	 * 
	 * (Check credit card number, if there aren’t 16 digit print “Invalid credit
	 * card number”
	 * 
	 * Input : John White 1234234534561478 Output : Name : J*** W**** CCN : ****
	 * **** **** 1478 (Initials for name and surname should be uppercase)
	 * 
	 * 
	 * Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar
		  	 \\D    ==> tum rakam disi character ler
		 2) \\w   ==> A->Z		a->z			0->9    _
		 	 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey	
	 */

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Lutfen bir isim giriniz");
			String isim = scan.next();
			System.out.println("Lutfen bir soyisim giriniz");
			String soyIsim = scan.next();
			System.out.println("Lutfen bir kart numarasi giriniz");
			String kart = scan.next();
			
			if(kart.length()==16){
				isim = isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
				soyIsim = soyIsim.substring(0,1).toUpperCase() + soyIsim.substring(1).replaceAll("\\w", "*");
				kart = "**** **** **** " + kart.substring(kart.length()-4);
				
				
				
			}else{
				System.out.println("16 haneli bir kart numarasi giriniz");
			}
			System.out.println(isim + " " +  soyIsim + " " + kart);
	}

}
