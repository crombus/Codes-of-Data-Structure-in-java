package pandp;

public class sorting {
	
	static void mergesort(int a[],int s,int m,int l)
	{
		 int ar[]=new int[l-s+1];
		int p=s,q=m+1,k=0;
		for(int i=s;i<=l;i++)
		{
			if(p>m)
			{
				ar[k++]=a[q++];
			}
			else if(q>l)
			{
				ar[k++]=a[p++];
			}
			else if(a[q]>a[p])
			{
				ar[k++]=a[q++];
			}
			else
			{
				ar[k++]=a[p++];
			}
		}
		for(int i=0;i<k;i++)
		{
			a[s++]=ar[i];
		}
		
	}
	static void merge(int a[],int s,int l)
	{
		if(l>s)
		{
		int mid=(s+l)/2;
		merge(a,s,mid);
		merge(a,mid+1,l);
		mergesort(a,s,mid,l);}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int a[]= {4,3,9,15,99,88,45,11,5,1,0};
		merge(a,0,a.length-1);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
