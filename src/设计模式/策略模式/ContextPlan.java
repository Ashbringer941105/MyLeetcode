package 设计模式.策略模式;

public class ContextPlan {
    private StrategyForPlan plan;

    public StrategyForPlan getPlan() {
        return plan;
    }

    public void setPlan(StrategyForPlan plan) {
        this.plan = plan;
    }

    public void action(){
        this.plan.plan();
    }
    public static void main(String[] args){
        StrategyForPlan planA = new PlanA();
        StrategyForPlan planB = new PlanB();

        ContextPlan contextPlan = new ContextPlan();
        contextPlan.setPlan(planA);
        contextPlan.action();
        contextPlan.setPlan(planB);
        contextPlan.action();
    }
}
