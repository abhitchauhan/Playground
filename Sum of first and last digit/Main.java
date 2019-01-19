import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   int last_num,sum;
   last_num=n%10;
   while(n >= 10)
   {
     n = n/10; 
    }
      sum = n+last_num;
      System.out.println(sum);
	    // Type your code here
	}
}