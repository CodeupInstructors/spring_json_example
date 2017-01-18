package com.zgulde;

/*
 * This class could also be a entity that is managed with hibernate
 * that comes from the database
 */
public class Computer {
    private String manufacturer;
    private String ram;
    private String operatingSystem;

    public Computer() {}

    public Computer(String manufacturer, String ram, String operatingSystem) {
        this.manufacturer = manufacturer;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
