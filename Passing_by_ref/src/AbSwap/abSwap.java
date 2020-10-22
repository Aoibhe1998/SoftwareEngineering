package AbSwap;

public class abSwap {
	 public static void main(String[] args) {

		 int c = 10;
		 int d = 20;
		 int tempNoFunct;
		 //swap c with d
		 swap(10, 20);
		 System.out.println("c and d swapped using swap() function: "+ c + " " + d);
		 
		 tempNoFunct = c;
		 c = d;
		 d = tempNoFunct;   
		 System.out.println("After swapping : c, d = "+c+", "+ d);
	 }
	 public static void swap(int a, int b) {
		 int temp = a;
		 a = b;
		 b = temp;
	 }
}

