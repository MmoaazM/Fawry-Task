package org.FawryTask.Rules;

import org.FawryTask.Vehicles.Vehicle;
import org.FawryTask.Violation;

public class SeatBelt implements Rule{
    private double fee;
    public SeatBelt(double fee){
        this.fee=fee;
    }
    @Override
    public Violation check(Vehicle vehicle) {
       return vehicle.isSeatbeltFastened()?null:new Violation("[No Seatbelt]","The Driver Didn't Wear His Seatbelt",fee);
    }
}
