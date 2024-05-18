package behavioral_design_pattern.TemplateDesignPattern.dataprocess;

public class TemplateDesignPatternClient {
    public static void main(String[] args) {
        DataProcessor csvProcessor = new CSVDataProcessor();
        csvProcessor.process();

        DataProcessor jsonProcessor = new JSONDataProcessor();
        jsonProcessor.process();
    }
}
