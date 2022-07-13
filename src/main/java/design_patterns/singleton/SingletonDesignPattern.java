package design_patterns.singleton;

public class SingletonDesignPattern {

    private static SingletonDesignPattern singletonDesignPattern;

    static {
        singletonDesignPattern = new SingletonDesignPattern();
    }

    private SingletonDesignPattern() {
		System.out.println("SingletonDesignPattern initalized due to static section");
    }

    public static SingletonDesignPattern getInstance() {
        return singletonDesignPattern;
    }

    public void method() {
        System.out.println("Hey.... it is working!!!");
    }

    public static void main(String a[]) {
        SingletonDesignPattern instance = getInstance();
        instance.method();
    }
}