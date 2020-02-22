public class HelloPrinter{ 
	public static void printCount(int n){
		for (int x=0 ; x<10; x++){ 	
			if (x % 2 == 0){ 
				System.out.println(x/2 + n);
			}
			else if (x % 3 == 0 ) {
				System.out.println(0); 
			}
			else{  
				System.out.println(x);
			}
		} 
	} 
	



	public static void printCountWhile(int n){  
		int i=0;
  		while (i<= 9) {	
			if (i % 2 == 0){ 
				System.out.println(i/2+n);
			}
			else if (i % 3 == 0 ) {
				System.out.println(0); 
			}
			else{ 
			System.out.println(i);
			}
			i++;
		} 
	} 
	public static void main(String[] args){ 
		printCount(5);
		printCountWhile(5); 

	}
} 

/*
class Test{ 
	public static void main(String[] args){ 
		HelloPrinter test = new HelloPrinter(); 
		int val = 5; 
		test.printCount(val); 

	}
}
*/