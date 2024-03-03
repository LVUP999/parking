package tddproject.parking.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TestControllerTest {

	@Autowired
	private TestController testController;

	@DisplayName("default test, 무조건 성공한다.")
	@Test
	void test() {
		// given
		// when
		String answer = testController.hello();

		// then
		assertThat(answer).isEqualTo("hello!");
	}
}