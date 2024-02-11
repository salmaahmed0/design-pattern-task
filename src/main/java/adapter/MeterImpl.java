package adapter;

public class MeterImpl implements Meter{
    int length;
    MeterImpl(int length){
        this.length=length;
    }
    @Override
    public int getLength() {
        return length;
    }
}
