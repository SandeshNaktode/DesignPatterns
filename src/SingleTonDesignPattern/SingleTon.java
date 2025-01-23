package SingleTonDesignPattern;

public class SingleTon{

    private static SingleTon singleTon;

    private SingleTon(){
//        if (singleTon != null){
//            throw new RuntimeException("Your trying to break Singleton");
//        }
    }

    public static SingleTon getSingleTon(){
        if (singleTon == null){
            singleTon = new SingleTon();
        }
        return singleTon;
    }
    public void test(){
        System.out.println("test Method");
    }
}
