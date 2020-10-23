package patterns.singleton;

public class Singleton {
    public static void runSingletonPattern() {
        Single single = Single.getSingle();
        Single single1 = Single.getSingle();
        System.out.println(single.hashCode());
        System.out.println(single1.hashCode());
        System.out.println((single==single1));
    }
}

class Single {
    private static Single single = new Single();
    private Single() {
    }
    static Single getSingle(){
        return single;
    }
}
