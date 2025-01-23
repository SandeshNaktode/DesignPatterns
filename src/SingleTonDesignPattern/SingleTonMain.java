package SingleTonDesignPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingleTonMain {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        System.out.println("SingleTon Design Pattern");
        SingleTon s1 = SingleTon.getSingleTon();
        s1.test();


        System.out.println("Original Instance ---> " +s1.hashCode());

        Constructor<SingleTon> constructor = SingleTon.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingleTon s2 = constructor.newInstance();
        System.out.println("Using getDeclairedConstructor Instance it will break singleTon design Pattern ---> " +s2.hashCode());

        System.out.println("Using getSingleTon() Instance ---> " +SingleTon.getSingleTon().hashCode());
    }
}