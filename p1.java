import java.util.Scanner;
class rectangular_pattern
{
	public static void main(String[] args)
	{
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE SYMBOL FOR THE PATTERN --> ");
		s=sc.nextLine();
		System.out.println("LENGTH --> ");
		int l=sc.nextInt();
		System.out.println("BREADTH --> ");
		int b=sc.nextInt();
		for (int i=0; i<b; i++)
		{
			System.out.println();
			for (int j=0; j<l; j++)
			{
				System.out.print(s + " ");
			}
		}
	}
}