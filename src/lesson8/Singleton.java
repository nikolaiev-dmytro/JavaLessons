package lesson8;

public class Singleton {
    private static Singleton ourInstance = new Singleton();
    private static int count;
    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }
    public static void add(int x){
        count+=x;
    }
    public static int getAll(){
        return count;
    }
}
