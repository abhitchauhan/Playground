import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      int c=0;
      for(int idx = 0; idx <= arr_size - 1; idx++)
      {
         arr[idx] = in.nextInt();
      }
      int search1 = in.nextInt();
      int search2 = in.nextInt();
      for(int idx = 0; idx <= arr_size - 1; idx++)
      {
        if(search1==arr[idx])
        {
         System.out.println(idx);
        c++;
        }
      }
      for(int idx = 0; idx <= arr_size - 1; idx++)
      {
        if(search2==arr[idx])
        {
         System.out.println(idx);
        c++;
        }
      }
        if(c!=2)
        {
            System.out.println("-1");
        }
    }
}