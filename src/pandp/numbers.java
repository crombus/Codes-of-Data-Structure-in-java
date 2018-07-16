package pandp;

public class numbers {

	static int conv0To5(int num)
	{
	    if (num == 0)
	        return 0;
	    int digit = num % 10;
	    if (digit == 0)
	        digit = 5;
	    return conv0To5(num/10) * 10 + digit;
	}
	static int convert0to5(int num)
	{
	    if (num == 0)
	       return 5;
	    else return  conv0To5(num);
	}
	static int path(int m,int n)
	{
		if(m==1||n==1)
		{
			return 1;
		}
		return path(m-1,n)+path(m,n-1);
	}
	static void nge(int a[])//replace element with next greater element 
	{
		int s=a.length;
		int max=a[s-1];
		a[s-1]=-1;
		for(int i=s-2;i>=0;i--)
		{
			int temp=a[i];
			a[i]=max;
			if(max<temp)
			{
				max=temp;
			}
		}
	}
	static int maxpowerof2(int n)
	{
		int res=0;
		for(int i=n;i>=1;i--)
		{
			if((i&(i-1))==0)
			{
				res=i;
				break;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(convert0to5(Integer.parseInt(("1032000706"))));
System.out.println(path(3,3));
int a[]={16,17,4,3,5,2,1};
nge(a);
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
	}
System.out.println(maxpowerof2(30));
}

}
