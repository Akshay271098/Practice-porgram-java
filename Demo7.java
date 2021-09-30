//to find continus sum of array element and check sum ==input no then print
class Demo7
{
	public static void main(String args[])
	{
		int a[]={23,45,12,10,5};
		int n=27;
		int sum=a[0];
		int start=0;
		int i;
		for(i=1;i<a.length;i++)
		{
			sum=sum+a[i];
			start++;
			System.out.println(""+sum);
		
		if(sum==n||sum>n)
		{
			for(int j=start;j<=i;j++)
			{
				System.out.print("coninous array===="+a[j]);
			}
		}
		else
		{
			System.out.println("no found continuos array");
		}
	
		}
	}
}