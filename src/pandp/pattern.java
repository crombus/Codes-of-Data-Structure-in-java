package pandp;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
pat(16);
int a[]= {2,0,2};
System.out.println(fillthewater(a));
pascalstri(6);
	}
static void pat(int n)
{
	if(n==0||n<0)
	{
		System.out.println(n+" ");
		return;
	}
	System.out.println(n+" ");
	pat(n-5);
	System.out.println(n+" ");
}
static int fillthewater(int a[])//https://www.geeksforgeeks.org/trapping-rain-water/
{
	int water=0;
	int s=a.length;
	int l[]=new int[s];
	int r[]=new int[s];
	l[0]=a[0];
	for(int i=1;i<s;i++)
	{
		l[i]=Math.max(l[i-1], a[i]);
	}
	r[s-1]=a[s-1];
	for(int i=s-2;i>=0;i--)
	{
		r[i]=Math.max(r[i+1], a[i]);
	}
	for(int i=0;i<s;i++)
	{
		water+=Math.min(l[i], r[i])-a[i];
	}
	return water;
}
static void pascalstri(int n)
{
	for(int i=1;i<=n;i++)
	{
		int c=1;
		for(int j=1;j<=i;j++)
		{
			System.out.print(c+" ");
			c=c*(i-j)/j;
		}
		System.out.println();
	}
}
}
