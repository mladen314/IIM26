package cas261118;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Unijeti prirodan broj: ");
		int n = sc.nextInt();
		
		/*
		 * Racuna sumu orvih n prirodnih brojeva
		 */
		
		for(int i=1; i<=n; i++) {
			s+=i; // s=s+i
			/*
			 * s=s-i  ->  s-=i
			 * s=s*i  ->  s*=i
			 * s=s/i  ->  s/=i
			 */
		}
		System.out.println("Suma prvih "+n+" prirodnih brojeva je "+s);
		
		/*
		 * Racuna proizvod prvih n parnih brojeva 
		 * (iskoristiti n iz prethodnog zadatka  )
		 */
		long p=1;
		for(int i=2; i<=2*n; i+=2) {
			p*=i;
		}
		System.out.println("Proizvod prvih "+n+" parnih brojeva je "+p);
		
		
		/*
		 * Suma brojeva manjih od n koji nisu djeljivi sa 3
		 */
		s=0;
		for(int i=1; i<n; i++) {
			if(i%3!=0) {
				s+=i;
			}
		}
		System.out.println("Suma brojeva manjih od "+n+
				" koji nisu djeljivi sa 3 je "+s);

	}

}
