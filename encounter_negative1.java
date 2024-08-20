import java.util.Scanner;
class encounter_negative1
{
	public static void main(String[] args)
	{
		float nn=1, np=1, sn=0, sp=0, s;/  
		float avgn, avgp;
		System.out.println("ENTER -1 TO EXIT");
		Scanner sc=new Scanner(System.in);
		while (nn>0)
		{
			System.out.println("ENTER THE NUMBER --> ");
			s=sc.nextInt();
			if (s>0)
			{
				sp+=s;
				np++;
			}
			else
			{
				sn+=s;
				nn++;
			}
			if (s==-1)
			{
				break;
			}
		}
		avgn=sn/nn;
		avgp=sp/np;
		System.out.println("AVERAGE OF POSITIVE NUMBERS --> " + avgp);
		System.out.println("AVERAGE OF NEGATIVE NUMBERS --> " + avgn);
	}
}
