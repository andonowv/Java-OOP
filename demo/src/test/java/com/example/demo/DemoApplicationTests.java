package com.example.demo;

import com.example.demo.controllers.HomeController;
import com.example.demo.models.Ticket;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void TestTicketReservation() {
		HomeController homeController = new HomeController();
		for (int i = 0; i < 50; i++) {
			Assert.assertTrue(homeController.bookTicket().isSuccess());
		}
		Assert.assertFalse(homeController.bookTicket().isSuccess());
	}
}
