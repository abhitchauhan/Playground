import java.util.*;
class Main{
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int b=in.nextInt();
      int c=in.nextInt();
      int n=great(a,b,c);
      System.out.println(n);
	    // Type your code here
	}
  public static int great(int i,int j,int k)
  {
    if(i>j&&i>k)
    {
      return i;
    }
    else if(j>i&&j>k)
    {
      return j;
    }
    else
    {
      return k;
    }
  }
}
