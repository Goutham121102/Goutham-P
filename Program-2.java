import java.util.Scanner;
public class printOdd 
{
	public static void Odd(int n)
	{
		for(int i=1;i<=2*n;i++)
		{
			if(i%2==1)
			System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		Odd(n);
	}
}
