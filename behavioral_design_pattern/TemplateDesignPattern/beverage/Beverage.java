package behavioral_design_pattern.TemplateDesignPattern.beverage;

public abstract class Beverage {
    abstract void brew();
    abstract void addCondiments();
    private void boilWater(){
        System.out.println("Boiling Water..!!");
    }
    private void pourInCup(){
        System.out.println("Pouring into Cup..!!");
    }

    public final void prepareBeverage(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
}
