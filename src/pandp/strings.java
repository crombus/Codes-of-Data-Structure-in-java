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
	}

}
