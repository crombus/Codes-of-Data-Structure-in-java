package pandp;

import java.util.HashMap;
import java.util.LinkedHashMap;

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
	static int maxpowerof2(int n)//new code of max power of 2
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
	static int countsubseq(String s)//sub sequences of seq containg only abc like patternns for abbc are abc abbc abc
	{
		int acount=0,bcount=0,ccount=0;
		for(int i=0;i<s.length();i++)
		{
			
			if(s.charAt(i)=='a')
			{
				acount=1+2*acount;
			}
			if(s.charAt(i)=='b')
			{
				bcount=acount+2*bcount;
			}
			if(s.charAt(i)=='c')
			{
				ccount=bcount+2*ccount;
			}
		}
		return ccount;
	}
	static int firstnum(int a[],int k)
	{
		if(a.length==0)
		{
			return -1;
		}
		int arr[]=new int[1000];
		for(int i=0;i<a.length;i++)
		{
			arr[a[i]]++;
		}
		for(int i=0;i<a.length;i++)
		{
			if(arr[a[i]]==k)
				return a[i];
		}
		return -1;
	}
	static Boolean sub0(int arr[])
    {
        HashMap<Integer, Integer> hm =   new HashMap<Integer, Integer>();
        int sum = 0;     
        for (int i = 0; i < arr.length; i++)
        { 
            sum += arr[i];
            if (arr[i] == 0 || sum == 0 || hm.get(sum) != null) 
            {
            	System.out.println(hm.get(sum)+1+" "+i);
                return true;}
            hm.put(sum, i);
        } 
         
        return false;}
	static int firstnum1(int a[],int k)
	{
		if(a.length==0)
		{
			return -1;
		}
		HashMap arr = new LinkedHashMap();

		//int arr[]=new int[1000];
		for(int i=0;i<a.length;i++)
		{
			String val = String.valueOf(a[i]);
			if(arr.containsKey(val))
			{
				int v=(int) arr.get(val);
				arr.put(val,v+1);	
			}
			else {
				arr.put(val, 1);
			}
		}
		for (Object o : arr.keySet()) {
		      if (arr.get(o).equals(k)) {
		        return Integer.parseInt(o.toString());
		      }
		    }
		return -1;
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
System.out.println(countsubseq("abbc"));
int b[]= {11,12,13,14,1,-1};
//System.out.println("this first repeates chaacter"+firstnum(b,1));
System.out.println(sub0(b));
System.out.println(" sdcds"+firstnum1(a,1));
}

}
