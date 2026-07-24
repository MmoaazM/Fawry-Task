package org.FawryTask;

public class Violation {
    private final String ruleName; // make it constant after assigned
    private final String message;
    private final double fee;

    public Violation(String ruleName, String message, double fee) {
        this.ruleName = ruleName;
        this.message = message;
        this.fee = fee;
    }

    public String getRuleName() { return ruleName; }
    public String getMessage() { return message; }
    public double getFee() { return fee; }
}
