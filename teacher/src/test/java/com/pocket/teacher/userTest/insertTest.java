package com.pocket.teacher.userTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pocket.teacher.Service.UserService;
import com.pocket.teacher.dto.UserDTO;

@SpringBootTest
class insertTest {

	@Autowired
	UserService service;

	@Test
	void contextLoads() {
		UserDTO user = new UserDTO("admin", "1234", "관리자", "010-1234-5678");

		try {
			int result = service.add(user);
			if (result > 0) {
				System.out.println("성공");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("실패...");
		}
	}

}
