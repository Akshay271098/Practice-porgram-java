//sorting array
import java.util.*;
class Demo9
{
	public static void main(String args[])
	{
		int a[]=new int[100];
		int temp;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no ");
		int n=sc.nextInt();
		System.out.println("enter the array element");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Sortted array=");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
			if(a[i]>a[j])
			{
				temp=a[i];									
				a[i]=a[j];
				a[j]=temp;
			
			}
			}
			System.out.print(+a[i]+"  ");
		}
		
	}
}