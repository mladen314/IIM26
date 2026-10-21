package cas261021;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Ispitati da li neka radnja radi ako je radno vrijeme 
		 * od 7 do 20h za unijeto vrijeme (0-24h)
		 * 
		 * 
		 */
		
		Scanner unos = new Scanner(System.in);
		System.out.println("Unijeti pravilno vrijeme");
		int t;
		t = unos.nextInt();
		
		boolean radi = t>=7 && t<20; // logicko i je &&
									// logicko ili je ||
		System.out.println("Radnja radi (bez pauze): "+ radi);
		
		/*
		 * Provjeriti da nije pauza koja traje od 12 do 16h
		 */
		radi = (t>=7 && t<12)||(t>=16 && t<20); 
		System.out.println("Radnja radi (sa pauzom): "+ radi);

	}

}
