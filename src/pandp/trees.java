package pandp;

import java.util.LinkedList;
import java.util.Queue;


public class trees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
work b=new work();
tree root=null;
root=b.insert(10, root);
b.insert(120, root);
b.insert(101, root);
b.insert(110, root);
b.insert(103, root);
b.insert(104, root);
b.insert(2, root);
b.insert(3, root);
b.insert(4, root);
b.insert(5, root);
b.insert(6, root);
b.insert(7, root);
//b.printqt(root);
tree head=b.cons(root);

b.print(head);
	}

}
class tree{
	int val;
	tree right,left;
	tree(int v){
		this.val=v;
		this.left=this.right=null;
	}}
class work{
	 tree insert(int v,tree root)
		{
			if(root==null)
			{
				root=new tree(v);
				return root;
			}
			if(root.val>v)
			{
				root.left=insert(v,root.left);
				
			}
			else
			{
				root.right=insert(v,root.right);}
			return root;
		}
		tree convert(tree node)
		{
		//	System.out.println("tera jaan");
			if(node==null)
			{
				return node;}
			
			if(node.left!=null)
			{
				tree left=convert(node.left);
				for(;left.right!=null;left=left.right);
				{
					left.right=node;
					node.left=left;
				}}
			if(node.right!=null) {
				tree right=convert(node.right);
			for(;right.left!=null;right=right.left);
			{
				right.left=node;
				node.right=right;
			}}
			return node;
		}
		tree cons(tree node)
		{
			if(node==null)
			{
				return node;
			}
			node =convert(node);
					while(node.left!=null)
					{
						node=node.left;
					}
		return node;
		}
		void printqt(tree root)
		{
			System.out.println("queue");
			Queue<tree> q=new LinkedList<tree>();
			q.add(root);
			while(!q.isEmpty())
			{
				tree tm=q.poll();
				System.out.println(tm.val);
				if(tm.left!=null)
				{
					q.add(tm.left);
				}
				if(tm.right!=null)
				{
					q.add(tm.right);
				}
			}
		}
	void print(tree node) 
    {
		System.out.println("doubly linked list");
        while (node != null) 
        {
            System.out.print(node.val + " ");
            node = node.right;
        }
    }}

