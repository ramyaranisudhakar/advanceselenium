package intro;

public class ExThis
{
	int x=10;
	void disp()
	{
		int x=20;
		System.out.println(this.x);
		System.out.println(x);
	}

	public static void main(String[] args)
	{
		ExThis e=new ExThis();
		e.disp();

	}

}
