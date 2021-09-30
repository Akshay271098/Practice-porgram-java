//find maximum to given array
import java.util.*;
class Demo8
{
	public static void main(String args[])
	{
		int a[]=new int[100];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println("enter the element");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("maximum number in array="+max);
	}
}