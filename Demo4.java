//the given array finding the pairs sum of givenarray

class Demo4
{
	public void pair(int a[],int n)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
			if(a[i]+a[j]==n)
			{
				System.out.println("pairs ="+a[i]+"+"+a[j]+"="+n);
			}
			}
		}
	}
	
	
	public static void main(String arg[])
	{
		Demo4 ob=new Demo4();
       ob.pair(new int []{10,90,2,67,4,6},10);
		 ob.pair(new int []{10,90,2,4,6},100);
	}
}