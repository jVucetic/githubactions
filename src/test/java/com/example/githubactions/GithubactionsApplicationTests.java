package com.example.githubactions;

import com.example.githubactions.controllers.DataController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@AutoConfigureMockMvc
@SpringBootTest
class GithubactionsApplicationTests {
	@Autowired
	public MockMvc mockMvc;
	@Autowired
	DataController dataController;

	@Test
	void health() {
		assertEquals( "HEALTH CHECK OK!", dataController.healthCheck());
	}

	@Test
	void version() {
		assertEquals( "The actual version is 1.0.0", dataController.version());
	}

	@Test
	void nationsLength() {
		Integer nationsLength = dataController.getRandomNations().size();
		assertEquals(10, nationsLength);
	}

	@Test
	void currenciesLength() {
		Integer currenciesLength = dataController.getRandomCurrencies().size();
		assertEquals(20, currenciesLength);
	}

	@Test
	void integrationTest() throws Exception {
		mockMvc.perform(get("/"));
	}

}
