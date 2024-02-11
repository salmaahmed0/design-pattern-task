package adapter;

public class CentimeterImpl implements Centimeter{
    int length;
    CentimeterImpl(int length){
        this.length=length;
    }
    @Override
    public int getLength() {
        return length*100;
    }
}
