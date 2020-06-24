import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum_of_num(n));
	}
  public static int sum_of_num(int num)
  {
    int sum=0;
    for(int i=1;i<=num;i++)
        {
          sum=sum+i;
        }
        return sum;
}
        }