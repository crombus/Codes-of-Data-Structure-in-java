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
	 static int setbits2(int n)
	    {
	        int i = 0;
	        int ans = 0;
	        while ((1 << i) <= n) {
	 
	            boolean k = false;
	            int change = 1 << i;
	            for (int j = 0; j <= n; j++) {
	 
	                if (k == true)
	                    ans += 1;
	                else
	                    ans += 0;
	 
	                if (change == 1) {
	                    k = !k; 
	                    change = 1 << i; 
	                }
	                else {
	                    change--;
	                }
	            }
	            i++;
	        }
	 
	        return ans;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=3;
System.out.println(setbit(n));//complexity(nlogn)
System.out.println(setbits2(n));//complexity(k*n)
	}

}
