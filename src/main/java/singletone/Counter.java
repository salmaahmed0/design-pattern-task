package singletone;

public class Counter {

    public int count = 0;
    private static Counter instance;
    private Counter(){}
    public static Counter getInstance(){

        if(instance == null)
            instance = new Counter();
        return instance;
    }
    public int increment(){
        return count++;
    }
}
