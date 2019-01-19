import java.util.Scanner;
class Main
{
	
	 public static int square(int m)
   {
      int sum = m*m;
      
      return sum;
   }
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int sod = square(n);
     System.out.println(sod); //result printed here
   }
}