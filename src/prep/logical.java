import java.io.*;

public class logical{

    public static void main(String[] args)throws IOException{

        array_ops obj = new array_ops(10);
        int[] array = obj.create_array();
        obj.display();
    }}

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
