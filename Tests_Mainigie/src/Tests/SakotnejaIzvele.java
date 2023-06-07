package Tests;

import java.util.Scanner;

public class SakotnejaIzvele {

	public static void main(String[] args) {
		 String izvele;
		 Scanner scan = new Scanner(System.in);
		 System.out.println("1-Sakt | 2-Aizvert");
		 izvele = scan.next();
		 do {
		 switch(izvele) {
		 case "1":
			 
			 break;
		 case "2":
			 System.out.println("Programma aizverta!");
			 break;
		 }
	}while(izvele=="2");
	}

}
