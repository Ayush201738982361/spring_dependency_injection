package org.example;

public class Dev {
    // Initialize constructor to print the number of objects initialized in JVM
    private Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void build(){
        computer.compiling();
    }
}
