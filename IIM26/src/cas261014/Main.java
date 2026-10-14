package cas261014;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Za slučajan trocifren broj provjerava da 
		 * li je armstrongov
		 */
		
		int x;
		
		x = (int)(Math.random()*900+100);
		//x = 153;
		System.out.println("Dobili smo broj "+x);
		
		int c1 = x/100;
		int c2 = (x/10)%10;
		int c3 = x%10; 
		
		int s = (int)(Math.pow(c1, 3)+Math.pow(c2, 3)+Math.pow(c3, 3));
		
		System.out.println(s);
		
		boolean jeArmstrongov;
		jeArmstrongov = x==s;   // ==, !=, <, <=, >, >= operatori poredjenja
								// = operator dodjeljivanja
		System.out.println("Broj "+x+" je armstrongov: "+jeArmstrongov);
		

	}

}
