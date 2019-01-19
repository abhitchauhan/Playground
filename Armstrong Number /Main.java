import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a=n,c=n;
      int i,z=0;
      double sum=0;
      while(c>0)
      {
       z++;
       c=c/10 ; 
      }
      while(n>0)
      {
        
        i=n%10;
        sum=sum+(Math.pow(i, z));
        n=n/10;
      }
        if(a==sum)
        {
          System.out.println("Armstrong Number");
        }
       else
       {
         System.out.println("Not a Armstrong Number");
       }


	   // Type your code here
	}
}