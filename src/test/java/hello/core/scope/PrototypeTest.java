package hello.core.scope;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PrototypeTest {


    @Test
    void protoTypeTest(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(PrototypeBean.class);
        System.out.println("find ProtoTypeBean1");
        PrototypeBean PrototypeBean1 = ac.getBean(PrototypeBean.class);
        System.out.println("find ProtoTypeBean2");
        PrototypeBean PrototypeBean2 = ac.getBean(PrototypeBean.class);

        System.out.println("PrototypeBean1 = " + PrototypeBean1);
        System.out.println("PrototypeBean2 = " + PrototypeBean2);

        assertThat(PrototypeBean1).isNotSameAs(PrototypeBean2);
        ac.close();
    }

    @Scope("prototype")
    static class PrototypeBean{
        @PostConstruct
        public void init(){
            System.out.println("PrototypeBean.init");
        }

        @PreDestroy
        public void destroy(){
            System.out.println("PrototypeBean.destroy");
        }
    }
}
