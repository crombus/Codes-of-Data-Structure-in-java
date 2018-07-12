package pandp;
public class linked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
practice l=new practice();
l.dab();
l.dal();
l.aab("10");
l.aap("2", "100");
l.aab("20");
l.aab("30");
l.aab("40");
l.dap("0");
l.aap("5", "50");
l.display();
	}

}
class ll{
	String val;
	ll next;
}
class practice extends ll{
	ll head;
	
	practice()
	{
		head=null;
	}
	
	void aab(String value)
	{
		ll nn = new ll();
		nn.val=value;
		nn.next=head;
		head=nn;
		
		
	}
	void aal(String value)
	{
		ll nn = new ll();
		nn.val=value;
		if(head==null)
		{
			aab(value);
		}
		else
		{
			ll curr=head;
			while(curr.next!=null)
				curr=curr.next;
			curr.next=nn;
			nn.next=null;
		}
	}
	void aap(String pos,String value)
	{
		int x;
		try{
		ll curr = head;
		ll nn = new ll();
		nn.val=value;
		x=Integer.parseInt(pos);
		if(x<1)
		{
			System.out.println("not a valid poistion");
			return;
		}
		if(x==1)
		{
			aab(value);
		}
		else
		{ int i=0;
			while(curr!=null&&i<x-2)
				{
				curr=curr.next;
				i++;
				}
			if(curr==null)
			{
				System.out.println("not a valid position");
				return;
			}
			nn.next=curr.next;
			curr.next=nn;
		}
		}
		catch(Exception e)
		{
			System.out.println("not a valid position");
		}
	}
	void display()
	{
		ll curr=head;
		while(curr!=null)
		{
			System.out.println(curr.val);
			curr=curr.next;
		}
	}
	void dab() {
		try {
		ll curr=head;
		head=head.next;
		curr.next=null;}
		catch(Exception e)
		{
			System.out.println("error empty linked list");
		}
	}
	void dal(){
		try {
		ll curr=head;
		if(head.next==null)
		{
			dab();
			return;
		}
		while(curr.next.next!=null)
			curr=curr.next;
		curr.next=null;}
		catch(Exception e)
		{
			System.out.println("empty linked list");
		}
	}
	void dap(String pos)
	{
		try{
			int x=Integer.parseInt(pos);
			ll curr=head;
			if(x<1)
			{
				System.out.println("not a valid poistion");
				return;
			}
			if(x==1)
			{
				dab();
				return;
			}
			int i=0;
			while(curr.next!=null&&i<x-2)
				{
				curr=curr.next;
				i++;
				}
			if(curr.next==null)
			{
				System.out.println("not a valid position");
				return;
			}
			curr.next=curr.next.next;
			
		}
		catch(Exception e){
			System.out.println("not a valid position");
		}
	}
	
}