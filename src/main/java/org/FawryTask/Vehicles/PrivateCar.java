package org.FawryTask.Vehicles;

public class PrivateCar extends Vehicle{
    public PrivateCar(String plateNumber, String date, double speed, boolean seatbeltFastened){
        super( plateNumber,  date,  speed,  seatbeltFastened);
    }
    @Override
    public String getTypeName() {
        return "PrivateCar";
    }
}
