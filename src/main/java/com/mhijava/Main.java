package com.mhijava;

public class Main {
    public static void main(String[] args) {

        Boolean spamMode = true;

        AirCon aircon = new AirCon();

        aircon.sethostname("192.168.0.12");
        aircon.setport("51443");
        aircon.setDeviceID("e8165615c7d6");
        aircon.setOperatorID("openhab");

        try {
            aircon.getAirconStats(false);
            aircon.updateAccountInfo("Europe/London");
            aircon.printDeviceData();
            System.out.println(aircon.getconnectedAccounts());
        } catch (Exception e) {
            System.err.println("Error processing aircon: " + e.getMessage());
        }

    }
}