package SingleTon;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        System.out.println("SingleTon Design Pattern");
        //SingleTon.SingleTon s1 = SingleTon.SingleTon.INSTANCE;
        SingleTon s1 = SingleTon.getSingleTon();
        s1.test();


        System.out.println("Hello world!" +s1.hashCode());

        Constructor<SingleTon> constructor = SingleTon.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingleTon s2 = constructor.newInstance();
        System.out.println("Hello world!" +s2.hashCode());
    }
}