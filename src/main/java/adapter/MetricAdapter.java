package adapter;

public class MetricAdapter extends MeterImpl implements Centimeter {


    MetricAdapter(int length) {
        super(length);
    }

    @Override
    public int getLength() {
        return super.getLength()*100;
    }
}
