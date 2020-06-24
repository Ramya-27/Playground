import java.util.Scanner;
class Main
{
	public static int square(int s)
    {
     return s*s;
    }
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sqrt=square(n);
    System.out.println(sqrt);
	} 
}