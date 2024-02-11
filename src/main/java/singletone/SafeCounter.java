package singletone;

public class SafeCounter {
    public  int count = 0;
    private static volatile SafeCounter instance;
    private SafeCounter(){}
    public static SafeCounter getInstance(){

        // Double-Checked Locking.
        if(instance == null){
            synchronized (SafeCounter.class){
                if(instance == null)
                    instance = new SafeCounter();
            }
        }

        return instance;
    }
    public  void increment(){
         count++;
    }

}
