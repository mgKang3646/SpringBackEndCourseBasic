package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "hello.core.member",
        basePackageClasses = AutoAppConfig.class,
        excludeFilters =  @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class ) //@Configuration 설정클래스는 필터링 하겠다., 실무에서는 그냥 전부 스캔한다.
)
public class AutoAppConfig {

//    @Bean(name = "memoryMemberRepository")
//    public MemberRepository memberRepository(){
//        return new MemoryMemberRepository();
//    }
}

