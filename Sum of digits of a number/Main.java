import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   int num = 0,sum = 0;
   
   while(n !=0)
   {
      num = n%10;
      sum = sum + num;
      n = n/10;
      
    }
      System.out.println(sum);
	    // Type your code here
	}
}