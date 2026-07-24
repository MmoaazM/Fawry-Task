package org.FawryTask.Vehicles;

public class Bus extends Vehicle{
    public Bus(String plateNumber, String date, double speed, boolean seatbeltFastened) {
        super(plateNumber, date, speed, seatbeltFastened);
    }
    @Override
    public String getTypeName() {
        return "Bus";
    }
}
