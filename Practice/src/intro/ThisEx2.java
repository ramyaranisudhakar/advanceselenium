package intro;

public class ThisEx2 
{
	String Student_name;
	int mock_rating;
	ThisEx2(String Student_name,int mock_rating)
	
	{
		this.Student_name=Student_name;
		this.mock_rating=mock_rating;
	}

	public static void main(String[] args)
	{
		ThisEx2 i1= new ThisEx2("jaya",1);
		System.out.println(i1.Student_name+" "+i1.mock_rating);
		

	}

}
