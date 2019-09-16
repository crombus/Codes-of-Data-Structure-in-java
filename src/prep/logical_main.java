import java.io.*;

public class logical_main{
//logical_main class has only main function 
    public static void main(String[] args)throws IOException{
      // main function
        array_ops obj = new array_ops(10);//creating obj for array operations 
        int[] array = obj.create_array();
        remove_duplicates rd = new remove_duplicates();
        rd._remove_duplicate(array);
        obj.display();
        
    }}
