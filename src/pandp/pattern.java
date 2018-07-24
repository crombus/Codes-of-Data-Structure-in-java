package pandp;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
pat(16);
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
}
