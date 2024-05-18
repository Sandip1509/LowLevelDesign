package behavioral_design_pattern.TemplateDesignPattern.beverage;

public class Main {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        System.out.println("Preparing Tea..!!");
        tea.prepareBeverage();

        Beverage coffee = new Coffee();
        System.out.println("Preparing Coffee..!!");
        coffee.prepareBeverage();
    }
}
