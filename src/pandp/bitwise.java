package pandp;

public class bitwise {

 static int setbit(int n)
	{
		int bitcount=0;
		for(int i=1;i<=n;i++)
		{
			bitcount+=setbituse(i);
		}
		return bitcount;
	}
	static int setbituse(int n)
	{
		if(n==0)
			return 0;
		return (n%2==0?0:1) + setbituse(n/2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=3;
System.out.println(setbit(n));
	}

}
