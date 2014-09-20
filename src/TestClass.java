

public class TestClass {
	
	
	
	public static void main (String args[]) throws Exception {
		
				
		A a = new A("s");
		
		char c = 5;
		System.out.println("C is" + c);
		
		new C();
		
		int i = 1234567890;
		float f = i;
		
		System.out.println(i - (int) f);
				
		
		test(10, 20, 30);
		test2(10, 20, 30);
		
		/*
		int k = 0;
		int m = 0;
		
		for (int i = 0; i <= 3; i++) {
			k++;
			System.out.println("Loop " + i + " before If: " + k + ", " + m);
			
			if (i == 2){
				continue;
			}
			
			m++;
			
			System.out.println("Loop " + i + " after If: " + k + ", " + m);
		}
		
		System.out.println(k + ", " + m);
	*/
	}
	
	public static void test(int i, int... j){}
	
	public static void test2(int... i) {}
	
	public static int doIt() throws Exception {
		
		System.out.println("");
		
		throw new Exception ("Forget It"); 
		
	}
}


