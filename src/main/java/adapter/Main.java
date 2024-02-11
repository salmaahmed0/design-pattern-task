package adapter;

public class Main {
    public static void main(String[] args) {
        Meter meter = new MeterImpl(10);
        Centimeter centimeter = new CentimeterImpl(10);
        Centimeter metricAdapter = new MetricAdapter(10);
        System.out.println(meter.getLength());
        System.out.println(centimeter.getLength());
        System.out.println(metricAdapter.getLength());
    }
}
