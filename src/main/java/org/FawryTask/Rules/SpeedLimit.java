package org.FawryTask.Rules;

import org.FawryTask.Vehicles.Vehicle;
import org.FawryTask.Violation;

public class SpeedLimit implements Rule{
    private String vehicleType;
    private int maxSpeed;
    private double fee;

    public SpeedLimit(String vehicleType, double fee, int maxSpeed) {
        this.vehicleType = vehicleType;
        this.fee = fee;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public Violation check(Vehicle vehicle) {
        if(vehicleType.equals(vehicle.getTypeName())){
            if(vehicle.getSpeed()>maxSpeed){
                return new Violation("[Speed Limit Exceed]","The Car Speed"+vehicle.getSpeed()+"Exceeded the max speed"+maxSpeed,fee);
            }
        }
        return null;
    }
}
