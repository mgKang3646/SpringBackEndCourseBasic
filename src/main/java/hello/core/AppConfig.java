package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixCountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.management.MXBean;


@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        System.out.println("Call AppConfig.memberService ");
        return new MemberServiceImpl(memberRepository()); // 생성자 주입
    }

    @Bean
    public OrderService orderService(){
        System.out.println("Call AppConfig.orderService ");
        return new OrderServiceImpl(memberRepository(), getDiscountPolicy());
    }

    @Bean
    public DiscountPolicy getDiscountPolicy() {
        //return new FixCountPolicy();
        return new RateDiscountPolicy();
    }

    @Bean
    public MemoryMemberRepository memberRepository() {
        System.out.println("Call AppConfig.memberRepository ");
        return new MemoryMemberRepository();
    }








}
