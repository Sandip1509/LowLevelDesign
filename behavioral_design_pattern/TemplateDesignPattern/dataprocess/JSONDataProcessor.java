package behavioral_design_pattern.TemplateDesignPattern.dataprocess;

public class JSONDataProcessor extends DataProcessor{
    @Override
    public void readData() {
        System.out.println("Reading Data from Json File..!!");
    }

    @Override
    public void processData() {
        System.out.println("Processing Data from Json File..!!");
    }
}
