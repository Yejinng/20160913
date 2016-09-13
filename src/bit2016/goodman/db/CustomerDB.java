package bit2016.goodman.db;

import bit2016.goodman.data.Customer;

public class CustomerDB {
	void insert()	{
		Customer c = new Customer();
		
		//public은 다른패키지에서 접근 가능 O
		c.name = "예진";
		
		//protected는 다른패키지에서 접근 불가
		//c.phone = "010-1234-5677";
		
		//private은 다른패키지에서 접근 불가
		//c.email = "kjhglove0@naver.com";
		
	}
}
