// to search given no present in array or not

class Demo6
{
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5,6};
		int n=8;
		boolean f=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				f=true;
			}
		}
		if(f)
		{
		   System.out.println("Number  present in given array people people ");
		}
	    else
		{
				System.out.println("no not present in given array");
		}
      System.out.println("\uD83D\uDE00");	 
	}
	
}