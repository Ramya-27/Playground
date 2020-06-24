import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      int i,j;
       for(j=1,i=1;j<=n;i=i+2,j++)
       {
         //if(i%2!=0)
           System.out.println(i+" ");
       }
      //System.out.println(n);
	}
}