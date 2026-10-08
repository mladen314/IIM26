package cas261007;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner unos = new Scanner(System.in);
		/*
		 * unijet dva cijela broja i stampati zbir
		 */
		int x, y, z;
		
		System.out.println("Unijeti prvi cijeli broj");
		x = unos.nextInt();
		
		System.out.println("Unijeti drugi cijeli broj");
		y = unos.nextInt();
		
		z = x+y;
		
		System.out.println("Zbri brojeva "+x+" i "+y+" je "+z);
		
		
		/* 
		 * unijeti trocifren broj i stampati svaku cifru posebno
		 */
		
		System.out.println("Unijeti trocifren broj: ");
		int br = unos.nextInt();
		
		int c1 = br/100;
		int c2 = (br/10)%10;
		int c3 = br%10;
		
		System.out.println("Cifre broja "+br+" su "+c1+", "+c2+" i "+c3);


		int a = (int)Math.pow(5, 10);
		System.out.println("pow(5,10)="+a);
		
		unos.close();
	}

}
