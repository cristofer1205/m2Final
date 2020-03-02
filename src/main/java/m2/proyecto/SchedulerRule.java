package m2.proyecto;

import m2.proyecto.expression.Expression;

import java.util.List;

public class SchedulerRule {
    private Expression what;
    private SchedulerWhenCondition when;
    private List<Subscriber> who;

    public SchedulerRule(Expression what, SchedulerWhenCondition when) {
        this.what = what;
        this.when = when;
    }

    public void AddUser(Subscriber user){
        if (!who.contains(user)) {
            who.add(user);
        }
    }

    public Expression getWhat() {
        return what;
    }

    public SchedulerWhenCondition getWhen() {
        return when;
    }

    public List<Subscriber> getWho() {
        return who;
    }
}
