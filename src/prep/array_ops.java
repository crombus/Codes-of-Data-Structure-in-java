import java.io.*;

class array_ops{                                                                
                                                                                
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
    int size;                                                                   
    int[] array;                                                                
    array_ops(int size){                                                        
                                                                                
        this.size = size;                                                       
        this.array = new int[size];}                                            
                                                                                
    int[] create_array()throws IOException{                                     
                                                                                
        for(int i = 0;i < size;i++){                                            
            array[i] = Integer.parseInt(br.readLine());}                        
        return array;}                                                          
                                                                                
    void display(){                                                             
                                                                                
        for(int i = 0;i < size;i++){                                            
            System.out.print(array[i] + " ");}}                                 
}
