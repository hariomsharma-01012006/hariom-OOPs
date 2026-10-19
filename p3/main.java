
interface Printable {
    void print(String document);
}

interface Scannable {
    void scan();
}

class AllInOnePrinter implements Printable, Scannable {
    
    @Override
    public void print(String document) {
        System.out.println("Printing document: " + document);
    }

    @Override
    public void scan() {
        System.out.println("Scanning document... Digital copy created.");
    }
}
// Hybrid Structure Implementation

class Device {
    String modelName;

    public Device(String modelName) {
        this.modelName = modelName;
    }

    public void powerOn() {
        System.out.println(modelName + " is powering on...");
    }
}

interface Faxable {
    void fax(String number);
}

class SmartOfficeMachine extends Device implements Printable, Scannable, Faxable {
    
    public SmartOfficeMachine(String modelName) {
        super(modelName);
    }

    @Override
    public void print(String document) {
        System.out.println("[" + modelName + "] Printing: " + document);
    }

    @Override
    public void scan() {
        System.out.println("[" + modelName + "] Scanning paper to PDF.");
    }

    @Override
    public void fax(String number) {
        System.out.println("[" + modelName + "] Faxing document to " + number);
    }
}
// Execution & Demonstration
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Part 1: AllInOnePrinter Demo ===");
        AllInOnePrinter basicPrinter = new AllInOnePrinter();
        basicPrinter.print("Quarterly_Report.pdf");
        basicPrinter.scan();

        System.out.println("\n=== Part 2: Hybrid Structure Demo ===");
        SmartOfficeMachine smartMachine = new SmartOfficeMachine("HP-LaserJet-3000");
        
        // Behaviors inherited from the base class
        smartMachine.powerOn();
        
        // Behaviors implemented from interfaces
        smartMachine.print("Confidential_Draft.docx");
        smartMachine.scan();
        smartMachine.fax("+1-555-0199");
    }
}

