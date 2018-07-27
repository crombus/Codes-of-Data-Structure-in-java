package pandp;

public class games {

	public static void main(String[] args) {
	char c='z';
	c='d';
	System.out.println(c);
	int s[][]= {{1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 0, 0},
            {1, 0, 0, 1, 1, 0, 1, 1},
            {1, 2, 2, 2, 2, 0, 1, 0},
            {1, 1, 1, 2, 2, 0, 1, 0},
            {1, 1, 1, 2, 2, 2, 2, 0},
            {1, 1, 1, 1, 1, 2, 1, 1},
            {1, 1, 1, 1, 1, 2, 2, 1},
           };
	floodfill(s,2,3,5);
	for(int i=0;i<s.length;i++)
	{
		for(int j=0;j<s[0].length;j++)
		{
			System.out.println(s[i][j]);
		}
	}
		// TODO Auto-generated method stub
	}
	boolean solvesudoku(int grid[][])
	{
		int row,col;
		return false;
	}
	static void floodfill(int s[][],int x,int y,int nc)
	{
		int prevc=s[x][y];
		floodfillcolor(s,x,y,prevc,nc);
	}
	static void floodfillcolor(int s[][],int x,int y,int prevc,int nc)
	{
		int m=s.length;
		int n=s[0].length;
		if(x<0||x>=m||y<0||y>=n)
			return;
		if(s[x][y]!=prevc)
			return;
		s[x][y]=nc;
		floodfillcolor(s,x+1,y,prevc,nc);
		floodfillcolor(s,x-1,y,prevc,nc);
		floodfillcolor(s,x,y+1,prevc,nc);
		floodfillcolor(s,x,y-1,prevc,nc);
	}
}
