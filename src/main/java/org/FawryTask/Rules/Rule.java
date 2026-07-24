package org.FawryTask.Rules;

import org.FawryTask.Vehicles.Vehicle;
import org.FawryTask.Violation;

public interface Rule {
    Violation check(Vehicle vehicle);
}
