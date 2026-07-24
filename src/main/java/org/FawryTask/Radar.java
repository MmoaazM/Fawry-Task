package org.FawryTask;

import org.FawryTask.Rules.Rule;
import org.FawryTask.Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Radar {
    private List<Rule>rules;
    private List<Fine>fines;
    private Map<String, Integer> violationCountsByRule;

    public Radar(){
        rules=new ArrayList<>();
        fines=new ArrayList<>();
        violationCountsByRule=new LinkedHashMap<>();
    }

    public void registerRule(Rule rule) {
        rules.add(rule);
    }

    public void observe(Vehicle vehicle) {
        for (Rule rule : rules) {
            Violation violation = rule.check(vehicle);
            if (violation != null) {
                vehicle.addViolation(violation);
                violationCountsByRule.merge(violation.getRuleName(), 1, Integer::sum);
            }
        }
        if (!vehicle.getViolations().isEmpty()) {
            fines.add(new Fine(vehicle));
        }
    }

    public List<Fine> getAllFines() {
        return fines;
    }
    /// return the Map of (PlateNumber -> total amount of fines' money)
    public Map<String, Double> getFinesSummary() {
        Map<String, Double> summary = new LinkedHashMap<>();
        for (Fine fine : fines) {
            summary.put(fine.getPlateNumber(), fine.getTotalAmount());
        }
        return summary;
    }
    /// return the map of (Rule violation -> count of occurence)
    public Map<String, Integer> getViolationCountsByRule() {
        return violationCountsByRule;
    }
}
