package proxy;

public class DoctorImpl implements Doctor{
    @Override
    public void check() {
        System.out.println("Check is done.");
    }
}
