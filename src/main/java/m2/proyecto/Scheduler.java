package m2.proyecto;

public class Scheduler {
    public void Schedule(SchedulerRule rule){
        if (RuleEvaluator.EvaluateRule(rule)){
            "llamar al mail generator";
            "add lo observadores tomandolos de las rule";
            "subcriber.update(mail)";
        }
    }
}
