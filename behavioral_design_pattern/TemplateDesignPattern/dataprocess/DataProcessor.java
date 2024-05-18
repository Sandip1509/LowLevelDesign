package behavioral_design_pattern.TemplateDesignPattern.dataprocess;

public abstract class DataProcessor {
    public abstract void readData();
    public abstract void processData();
    public void saveData(){
        System.out.println("Saving Data to Database..!!");
    }
    public void process(){
        readData();
        processData();
        saveData();
    }
}
