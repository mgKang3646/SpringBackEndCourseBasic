package hello.core;

import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CoreApplicationTests {

	MemberService memberService = new MemberServiceImpl();

	@Test
	void contextLoads() {
	}

}
