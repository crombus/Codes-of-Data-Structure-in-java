package pandp;
import java.io.*;
public class spiralviewofmatrix {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int r=Integer.parseInt(br.readLine());
int c=Integer.parseInt(br.readLine());
//int a[][]=new int[r*c];
int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
/*for(int i=0;i<r;i++)
{
	for(int j=0;j<c;j++)
	{
		a[i][j]=Integer.parseInt(br.readLine());
	}
}*/

int l=0,m=0;
while(l<r&&m<c)
{
	for(int i=m;i<c;i++)
	{
		System.out.println(a[m][i]);
	}
	l++;
	for(int i=l;i<r;i++)
	{
		System.out.println(a[i][c-1]);
	}
	c--;
	if(l<r) {
		for(int i=c-1;i>0;i--)
		{
			System.out.println(a[r-1][i]);
		}
		r--;
	}
	if(m<c) {
		for(int i=r-1;i>=l;i--)
		{
			System.out.println(a[i][m]);
		}
		m++;
	}
}
	}

}
