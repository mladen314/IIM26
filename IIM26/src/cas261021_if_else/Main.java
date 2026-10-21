package cas261021_if_else;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Za uneseni cijeli broj stampa da li je 
		 * negativan ili pozitivan
		 * 
		 */
		
		Scanner unos = new Scanner(System.in);
		int x;
		System.out.println("Unijeti cijeli broj razlicit od nule");
		x = unos.nextInt();
		
		/*
		if(x>0) {
			System.out.println(x+" je pozitivan broj");
		}else {
			System.out.println(x+" je negativan broj");
		}*/
		
		if(x>0) {
			System.out.println(x+" je pozitivan broj");
		}else if(x<0) {
			System.out.println(x+" je negativan broj");
		}else {
			System.out.println(x+" je jednako nula");
		}
	}

}
