package org.FawryTask;

import org.FawryTask.Rules.SeatBelt;
import org.FawryTask.Rules.SpeedLimit;
import org.FawryTask.Vehicles.Bus;
import org.FawryTask.Vehicles.PrivateCar;
import org.FawryTask.Vehicles.Truck;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Radar radar = new Radar();

        radar.registerRule(new SeatBelt(100));
        radar.registerRule(new SpeedLimit("Truck", 300, 60));
        radar.registerRule(new SpeedLimit("PrivateCar", 300, 80));
        radar.registerRule(new SpeedLimit("Bus", 300, 70));

        radar.observe(new PrivateCar("ABC1234", "2026-07-24", 94, false));                ///speed - belt
        radar.observe(new Truck("XYZ777", "2026-07-24", 55, true));                      /// no violation
        radar.observe(new Bus("BUS001", "2026-07-24", 85, false));                       /// speed - belt
        radar.observe(new PrivateCar("CLEAN99", "2026-07-24", 70, true));                 ///no violation

        System.out.println("=== Fines ===");
        for (Fine fine : radar.getAllFines()) {
            fine.print();
            System.out.println();
        }

        System.out.println("=== All fines: plate -> total amount ===");
        for (Map.Entry<String, Double> entry : radar.getFinesSummary().entrySet()) {
            System.out.printf("%s -> %.0f EGP%n", entry.getKey(), entry.getValue());
        }

        System.out.println();
        System.out.println("=== Violated rules: count for each ===");
        for (Map.Entry<String, Integer> entry : radar.getViolationCountsByRule().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
