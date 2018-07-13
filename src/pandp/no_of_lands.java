package pandp;

public class no_of_lands {
static int R=5,C=5;
boolean issafe(int M[][],int row,int col,boolean visited[][])
{
	return (row>=0)&&(col>=0)&&(row<R)&&(col<C)&& (M[row][col]==1 && !visited[row][col]);
}
void DFS(int M[][], int row, int col, boolean visited[][])
{
    int rowNbr[] = new int[] {-1, -1, -1,  0, 0,  1, 1, 1};
    int colNbr[] = new int[] {-1,  0,  1, -1, 1, -1, 0, 1};
    visited[row][col] = true;
    for (int k = 0; k < 8; ++k)
        if (issafe(M, row + rowNbr[k], col + colNbr[k], visited) )
            DFS(M, row + rowNbr[k], col + colNbr[k], visited);
}
int countislands(int M[][])
{
    boolean visited[][] = new boolean[R][C];
    int count = 0;
    for (int i = 0; i < R; ++i)
        for (int j = 0; j < C; ++j)
            if (M[i][j]==1 && !visited[i][j]) 
            {                                 
                DFS(M, i, j, visited);
                ++count;
            }

    return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M[][]=  new int[][] {{1, 1, 0, 0, 0},
            {0, 1, 0, 0, 1},
            {1, 0, 0, 1, 1},
            {0, 0, 0, 0, 0},
            {1, 0, 1, 0, 1}
           };
no_of_lands I = new no_of_lands();
System.out.println("islands"+ I.countislands(M));

	}

}
