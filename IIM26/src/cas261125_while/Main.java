package cas261125_while;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Racuna broj cifara prirodnog broja
		 */
		
		int x, br_cif;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unijeti jedan prirodan broj");
		x = sc.nextInt();
		br_cif = 0;
		while(x>0) {
			br_cif++;
			x/=10;
		}
		
		System.out.println("broj cifara unesenog broja je "+br_cif);
		
		
		/*
		 * Stampa sumu cifara unijetog broja
		 * npr. za 324 stampa 9
		 */
		
		
		
		

	}

}
