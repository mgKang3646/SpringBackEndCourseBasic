package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance(){
        return instance;
    }

    private SingletonService() {  // new 키워드로 객체 생성을 못하도록 막기
    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출 ");
    }
}
