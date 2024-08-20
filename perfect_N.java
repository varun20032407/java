import java.util.Scanner;
class perfect_N
{
	public static void main(String[] args)
{
	int N, i=0, sum=0, a=2;
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER THE VALUE OF N --> ");
	N=sc.nextInt();
	if (N>0)
	{
		System.out.println("THE FIRST " + N + " PERFECT NUMBERS ARE ");
		while (i!=N)
		{
			for (int j=1; j<a; j++)
			{
				if (a%j==0)
				{
					sum+=j;
				}
			}
			if (sum==a)
			{
				System.out.print(a + "  ");
				i++;
			}
			sum=0;
			a++;
		}
	}
	else
	{
		System.out.println("INVALID INPUT!");
	}
}
}
	