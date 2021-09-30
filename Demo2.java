//checking equality of an two array
class Demo2
{
	public static void main(String args[])
	{
		int a[]={1,2,3,4};
		int b[]={1,2,3,4};
		int f=0;
		if(a.length==b.length)
		{
			
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
					f=1;
				}
			
				
			}
			if(f==1)
			{
				System.out.println("arrays no are equal");
			}
			else 
			{
				System.out.println("arrays are equal");
			}
		}
		else
		{
			System.out.println("no equal array");
		}
	}
	
}