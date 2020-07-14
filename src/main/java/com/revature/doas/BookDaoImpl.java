package com.revature.doas;

import org.springframework.stereotype.Component;

@Component
public class BookDaoImpl implements BookDao {
	
//	@Override
	public void saveBook() {
		System.out.println("Saving book in BookDao");
	}
}
