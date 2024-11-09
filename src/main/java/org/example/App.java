package org.example;

import org.example.entities.District;
import org.example.entities.PollingStation;

public class App {
    public static void main(String[] args) {
        PollingStation pollingStation1 = new PollingStation(100);
        PollingStation pollingStation2 = new PollingStation(200);

        District district = new District();
        district.addChildren(pollingStation1);
        district.addChildren(pollingStation2);

        System.out.println("Total votes in the district: " + district.countVotes());
    }
}
