package belief;

public class Belief {

    private String belief;
    private double order;

    public Belief(String belief, double order){
        this.belief = belief;
        this.order = order;
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
