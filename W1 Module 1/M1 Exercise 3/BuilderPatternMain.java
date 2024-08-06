import java.util.*;

class Computer{
    private final String CPU;
    private final String RAM;
    private final String storage;
    private final String GPU;

    private Computer(Builder builder){
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.GPU = builder.GPU;
    }

    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }
    public String getStorage() {
        return storage;
    }
    public String getGPU() {
        return GPU;
    }
    public static class Builder{
        private final String CPU;
        private final String RAM;
        private final String storage;
        private String GPU;

        public Builder(String CPU, String RAM, String storage) {
            this.CPU = CPU;
            this.RAM = RAM;
            this.storage = storage;
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
public class BuilderPatternMain {
    public static void main(String[] args) {
        Computer workstation = new Computer.Builder("Intel Xeon", "64GB", "2TB SSD")
                .setGPU("NVIDIA RTX A4000")
                .build();

        Computer budgetPC = new Computer.Builder("AMD Ryzen 5", "8GB", "256GB SSD")
                .setGPU("AMD Radeon RX 6500 XT")
                .build();

        System.out.println("Workstation Configuration:");
        System.out.println("CPU: " + workstation.getCPU());
        System.out.println("RAM: " + workstation.getRAM());
        System.out.println("Storage: " + workstation.getStorage());
        System.out.println("GPU: " + workstation.getGPU());

        System.out.println("\nBudget PC Configuration:");
        System.out.println("CPU: " + budgetPC.getCPU());
        System.out.println("RAM: " + budgetPC.getRAM());
        System.out.println("Storage: " + budgetPC.getStorage());
        System.out.println("GPU: " + budgetPC.getGPU());
    }
}
