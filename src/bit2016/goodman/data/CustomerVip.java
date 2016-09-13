package bit2016.goodman.data;

public class CustomerVip extends Customer {
	void setName()	{
		
		//public은 자식 패키지에서 접근 가능 O
		name = "둘리";
		
		//protected는 자식 클래스에서 접근 가능 O
		phone = "010-1234-5678";
		
		//private은 자기안에서 접근 불가
		//email = "kjhglove0@naver.com";
	}
}
