package behavioral_design_pattern.TemplateDesignPattern.beverage;

public class Tea extends Beverage{
    @Override
    void brew() {
        System.out.println("Steeping the Tea..!!");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon..!!");
    }
}
