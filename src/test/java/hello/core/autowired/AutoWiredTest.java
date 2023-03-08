package hello.core.autowired;

import hello.core.member.Member;
import hello.core.member.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

import java.util.Optional;

public class AutoWiredTest {


    @Test
    public void AutoWiredOption(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(TestBean.class);

    }
    static class TestBean{
        
        @Autowired(required = false)
        public void setNoBean1(Member noBean1){
            System.out.println("noBean1 = " + noBean1);
        }

        @Autowired
        public void setNobean2(@Nullable MemberRepository nobean2){
            System.out.println("nobean2 = " + nobean2);
        }
        
        @Autowired
        public void setNobean3(Optional<Member> nobean3){
            System.out.println("nobean3 = " + nobean3);
        }
    }
}
