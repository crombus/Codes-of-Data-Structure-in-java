package pandp;

import java.util.Iterator;
import java.util.LinkedList;


public class graphs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bfsgraph1 g=new bfsgraph1(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		g.bfs(2);
			}

		}
		class bfsgraph1
		{
			int v;
			LinkedList<Integer> q[];
			bfsgraph1(int v)
			{
				this.v=v;
				q=new LinkedList[v];
				for(int i=0;i<v;++i)
				{
					q[i]=new LinkedList();
				}
			}
			void addEdge(int start,int dest)
			{
				q[start].add(dest);
				//q[dest].addFirst(start);
			}
			void bfs(int v)
			{
				boolean visited[]=new boolean[this.v];
				LinkedList<Integer> q=new LinkedList();
				q.add(v);
				visited[v]=true;
				while(q.size()!=0)
				{
					int x=q.poll();
					System.out.println(x);
					Iterator<Integer> it=this.q[v].listIterator();
					while(it.hasNext())
					{
						int n=it.next();
						if(!visited[n])
						{
							visited[n]=true;
							//it.next();
							q.add(n);
						}
					}
				}
			}
		}