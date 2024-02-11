package proxy;

import java.util.ArrayList;
import java.util.List;

public class Proxy {
    private List<String> blockedPatients = new ArrayList<>();
    private Doctor doctor;

    public Proxy(){
        blockedPatients.add("Salma");
        blockedPatients.add("Ahmed");
    }
    public void check(String patient){
        if(doctor == null){
            doctor = new DoctorImpl();
        }
        if(!blockedPatients.contains(patient)){
            doctor.check();
        }else {
            System.out.println("Blocked patient.");
        }
    }

}
