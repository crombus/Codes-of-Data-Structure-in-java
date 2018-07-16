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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(convert0to5(1032000706));
	}

}
