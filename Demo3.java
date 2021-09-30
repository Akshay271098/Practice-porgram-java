//duplicate elements of an array
class Demo3
{
	public static void main(String arg[])
	{
		int a[]={1,2,3,4,4,5,6};
		for(int i=0;i<a.length;i++)
		{
			int f=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
				 f=1;
				}
			}
			if(f==1)
			System.out.println("duplicate no is="+a[i]);
		}
	}
}