package bit2016.goodman.data;

public class Customer {
	
	public String name;
	protected String phone;
	private String email;
	
	void setName()	{
		
		//public은 자기안에서 접근 가능 O
		name = "도우넛";
		
		//protectes는 자기안에서 접근 가능 O
		phone = "010-1234-5678";
		
		//private은 자기안에서 접근 가능 O
		email = "kjhglove0@naver.com";
	}
	
}
