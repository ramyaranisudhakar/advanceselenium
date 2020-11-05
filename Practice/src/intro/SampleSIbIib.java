package intro;

public class SampleSIbIib {
	
	SampleSIbIib()
	{
		System.out.println("I am constructor");
	}
	
	static{
		System.out.println(" i am SIB");
	}
	
	{
		System.out.println("I am IIB");
	}

	public static void main(String[] args)
	{

     System.out.println(".............mS.......");
     new SampleSIbIib();

     System.out.println(".............me.......");
	}

}
