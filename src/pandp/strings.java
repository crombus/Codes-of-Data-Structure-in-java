package pandp;

public class strings {

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
}
}
