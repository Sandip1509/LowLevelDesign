package behavioral_design_pattern.TemplateDesignPattern.dataprocess;

public class CSVDataProcessor extends DataProcessor{

    @Override
    public void readData() {
        System.out.println("Reading Data from CSV file..!!");
    }

    @Override
    public void processData() {
        System.out.println("Processing Data from CSV file..!!");
    }
}
