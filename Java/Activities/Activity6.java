package activities;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Activity6 {
    public static void main(String args[]) throws InterruptedException, ParseException {
        Plane obj = new Plane(10);
        obj.onboard("Geeta");
        obj.onboard("Ram");
        obj.onboard("Sam");
        System.out.println("Plane Takeoff Time is " + obj.takeOff());
        System.out.println("Passengers in plane are : " + obj.getPassesngers());
        Thread.sleep(5000);
        obj.land();
        System.out.println("Plane landed time is " + obj.getLastTimeLanded());
        System.out.println("People in the plane after landing: " + obj.getPassesngers());
    }
}

class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    Plane(int max){
        passengers = new ArrayList<>();
        maxPassengers = max;
    }

    void onboard(String passenger){
        passengers.add(passenger);
    }

    Date takeOff() throws ParseException {
        Date date = new Date();
        lastTimeTookOf = date;
        return lastTimeTookOf;
    }

    void land() throws ParseException {
        lastTimeLanded = new Date();
        passengers.clear();
    }

    Date getLastTimeLanded(){
        return lastTimeLanded;
    }

    List<String> getPassesngers(){
        return passengers;
    }
}
