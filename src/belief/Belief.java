package belief;

import java.util.ArrayList;

public class Belief {

    private String belief;
    private double order;

    public Belief(){
    }

    public String getBelief() {
        return belief;
    }

    public void setBelief(String belief) {
        this.belief = belief;
    }

    public double getOrder() {
        return order;
    }

    public void setOrder(double order) {
        this.order = order;
    }
}
