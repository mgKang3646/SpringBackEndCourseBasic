package hello.core.singleton;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    @DisplayName("스프링 없는 순수한 테스트")
    void pureContainer(){
        AppConfig appConfig = new AppConfig();
        // 조회 : 호출할 때마다 객체 생성
        MemberService memberService1 = appConfig.memberService();
        
        // 조회 : 호출할때마다 객체 새엉
        MemberService memberService2 = appConfig.memberService();

        System.out.println("memberService1 = " + memberService1);
        System.out.println("memberService2  = " + memberService2);
    }


    @Test
    @DisplayName("싱글톤 패턴 적용한 객체 사용")
    void singletonTest(){
        SingletonService singletonService1 = SingletonService.getInstance();
        SingletonService singletonService2 = SingletonService.getInstance();

        System.out.println("singletonService1 = " + singletonService1);
        System.out.println("singletonService2 = " + singletonService2);

    }
}
