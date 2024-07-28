package project;

public class trigger {
    private String condition;
    private String action;

    public trigger(String condition, String action) {
        this.condition = condition;
        this.action = action;
    }

    public String getCondition() {
        return condition;
    }

    public String getAction() {
        return action;
    }
}
