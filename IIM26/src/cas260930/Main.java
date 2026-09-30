package cas260930;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* PROMJENLJIVE*/
		
		// cjelobrojne
		byte x3=50; // cijeli broj od 8b
		short x1=10; // cijeli broj od 16b
		int x=10, y, z;  // cijeli broj od 32b
		long x2; // cijeli broj od 64b
		
		y=15;
		z=x+y;
		
		System.out.println("z="+z);
		
		// realne promjenljive
		float a=12.3f; // realan broj od 32b
		double a1=12.3; // realan broj od 64b
		
		x = y%7;
		y = y/7;
		
		a=y/7;
		System.out.println(a);
		a=y/7.0f;
		System.out.println(a);
		
		x=(int)a;
		System.out.println(x);
	}

}
