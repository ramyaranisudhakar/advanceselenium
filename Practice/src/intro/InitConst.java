package intro;

public class InitConst {
	String Student_name;
	int mock_rating;
	InitConst(String a,int b)
	
	{
		Student_name=a;
		mock_rating=b;
	}

	public static void main(String[] args)
	{
		InitConst i1= new InitConst("sam",1);
		System.out.println(i1.Student_name+" "+i1.mock_rating);
		

	}

}
