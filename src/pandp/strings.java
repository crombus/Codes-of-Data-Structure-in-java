package pandp;

public class strings {

	static  int substring1(String s)//start with 1 and end with 1
	{
		int res=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='1')
				res++;
		}
		
		return res*(res-1)/2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hellloooo i am in";
		String str = new String();
        int len = s.length();
        for (int i = 0; i < len; i++) 
        {
            char c = s.charAt(i);
            if (str.indexOf(c) < 0)
            {
                str += c;
            }
        }
         System.out.println(str);
	
System.out.println("reverse");
	String input = "Prerna Great";
    char[] temparray = input.toCharArray();
    int left, right=0;
    right = temparray.length-1;

    for (left=0; left < right ; left++ ,right--)
    {
        char temp = temparray[left];
        temparray[left] = temparray[right];
        temparray[right]=temp;
    }

    for (char c : temparray)
        System.out.print(c);
    System.out.println();
    System.out.println("#################################new code#############################");
    System.out.println(substring1("0011000000000010101001010100110001010101111111111110000001011"));
}
}
