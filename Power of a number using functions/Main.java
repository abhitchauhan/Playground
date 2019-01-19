import java.util.Scanner;
 class Main{
	public static void main (String[] args){
       Scanner in = new Scanner(System.in);
	    int base = in.nextInt();
      int exp= in.nextInt();
      double n=square(base,exp);
      System.out.println(n);
    }
   public static double square(int a,int b)
   {
     double sum=Math.pow(a,b);
     return sum;
   }
 }