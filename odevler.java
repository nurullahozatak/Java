package odevler;

import java.util.Scanner;

public class odevler {

	public static void main(String[] args) {
		/*
		System.out.println("Hello World!");
		
		int i = 4;
		String a = "Verdigim Sayi : ";
		System.out.println("Verdigim Sayi: "+i);
		System.out.println(a+i);
		
		double b = 12.3;
		System.out.println(b);
		
		int c = 30;
		if(c<20) {
			System.out.println("Sayi 20'den kücüktür");
		}
		else if(c==20) {
			System.out.println("Sayi 20'ye esittir");
		}
		else {
			System.out.println("Sayi 20'den büyüktür");
		}
		
		
		
		int d = 20;
		int e = 25;
		int f = 2;
		if(d>e && d>f) {
			System.out.println("En büyük sayi d");
		}
		else if(e>d && e>f) {
			System.out.println("En büyük sayi e");
		}
		else {
			System.out.println("En büyük sayi f");
		}
		
		
		
		int sayi = '3';
		switch(sayi) {
		case '1':
			System.out.println("bir");
			break;
		case'2':
			System.out.println("iki");
			break;
		case'3':
			System.out.println("üç");
			break;
			default:
				System.out.println("Geçersiz sayi");
		} 
		
		
		for(int i=1;i<10;i+=2) {
				System.out.println(i);
		} 
		
		int i=1;
		while(i<10) {
			System.out.println(i);
			i+=2;
			
		} 
		
		int i=1;
		do {
			System.out.println(i);
			i+=2;
		}
		while(i<10); 
		
		
		double [] mylist = {1.2,2.3,50.3,7.5};
		double total = 0;
		double max = mylist[0];
	
		
		for(double number : mylist){
			
			if(max<number) {
				max=number;
			}
			
			
			total=total+number;
			System.out.println(number);
		}
		System.out.println("Toplam: "+total);
		System.out.println("En Büyük: "+max); 
		
		
		String [][] sehirler = new String[3][3]; 
		
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Kocaeli";
		sehirler[1][0] = "Eskişehir";
		sehirler[1][1] = "Antalya";
		sehirler[1][2] = "Denizli";
		sehirler[2][0] = "Tekirdağ";
		sehirler[2][1] = "Kütahya";
		sehirler[2][2] = "İzmir";
		
		for(int i=0;i<=2;i++) {
			System.out.println("--------");
			for(int j=0;j<=2;j++) {
				System.out.println(sehirler[i][j]);
			}
		}   
		
		
		
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman sayisi: "+mesaj.length());
		System.out.println("5.eleman: "+mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın"));
		System.out.println(mesaj.startsWith("b"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("a")); 
		
		
		String mesaj = "      Bugün hava çok güzel.        ";
		String yeniMesaj = mesaj.replace(" ", "-");
		System.out.println(mesaj);
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5));
		
		for(String kelime:mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());   
		
		int sayi;
		int sayac=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Sayi girin: ");
		sayi=s.nextInt();	
		
		if(sayi>2) {
		for(int i=2;i<sayi;i++) {
			if(sayi%i==0) {
				sayac++;
			}
			
		}
		if(sayac==0) {
			System.out.println("Sayi asal");
		}else {
			System.out.println("Sayi asal degil");
		}
		}else {
			System.out.println("2den buyuk sayi yazin");
		}    
		
		
		String harf;
		System.out.println("Harf girin: ");
		Scanner scan = new Scanner(System.in);
		harf=scan.next();
		harf=harf.toLowerCase();
		
		switch (harf) {
		case "a":
		case "ı":
		case "o":
		case "u":
			System.out.println("Kalin sesli harf");
			break;
		case "e":
		case "i":
		case "ö":
		case "ü":
			System.out.println("Ince sesli harf");
			break;

		default:
			System.out.println("Ne kalin ne ince harf");
			break;
		}   
		
		
		int sayi;
		int toplam=0;
		System.out.println("Sayi girin: ");
		Scanner klavye = new Scanner(System.in);
		sayi=klavye.nextInt();
		
		for(int i=1;i<sayi;i++) {
			if(sayi%i==0) {
				toplam=toplam+i;
				}
			}
		if(sayi==toplam) {
			System.out.println(sayi+" mukemmel sayidir");
		}else {
			System.out.println(sayi+" mukemmel sayi degildir");
		}    
		
		
		int sayi1,sayi2;
		int toplam1=0;
		int toplam2=0;
		System.out.println("İlk sayıyı girin: ");
		Scanner s=new Scanner(System.in);
		sayi1=s.nextInt();
		System.out.println("İkinci sayıyı girin");
		Scanner b=new Scanner(System.in);
		sayi2=b.nextInt();
		
		for(int i=1;i<sayi1;i++) {
			if(sayi1%i==0) {
				toplam1=toplam1+i;
			}
		}
		for(int i=1;i<sayi2;i++) {
			if(sayi2%i==0) {
				toplam2=toplam2+i;
			}
		}
		
		if(toplam1==sayi2 && toplam2==sayi1) {
			System.out.println("Arkadaş sayılardır");
		}else {
			System.out.println("Arkadaş sayı değildir");
		}  */
		
		
		
		
		
		int [] sayilar = new int [] {1,2,5,7,9,0};
		int aranacak = 10;
		boolean varMi=false;
		
		for(int sayi:sayilar) {
			if(aranacak==sayi) {
				varMi=true;
				}
			
			}
		if(varMi) {
			System.out.println("Sayi var");
		}else{
			System.out.println("Sayi yok");
		}
		
		
		}
		
		
	}

