package hello.core.beanfind;

import hello.core.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextInfoTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("모든 빈 출력하기")
    void findAllBean(){
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();

        for(String beanDefiniotionName : beanDefinitionNames){
            Object bean = ac.getBean(beanDefiniotionName);
            System.out.println("name = " + beanDefiniotionName + " object = " + bean   );
        }
    }

    @Test
    @DisplayName("어플리케이션 빈 출력하기")
    void findApplicationBean(){
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();

        for(String beanDefiniotionName : beanDefinitionNames){

            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefiniotionName);

            if(beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION ) {
                Object bean = ac.getBean(beanDefiniotionName);
                System.out.println("name = " + beanDefiniotionName + " object = " + bean);
            }
        }
    }

}
