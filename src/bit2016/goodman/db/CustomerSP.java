package bit2016.goodman.db;

import bit2016.goodman.data.Customer;

public class CustomerSP extends Customer {

	void set()	{
		
		//public은 외부패키지 자식클래스에서 접근 가능 O
		name = "둘리";
		
		//protected는외부패키지 자식클래스에서 접근 가능 O
		phone = "010-1234-5678";
		
		//private은 자기안에서 접근 불가
		//email = "kjhglove0@naver.com";
	
	}
}
