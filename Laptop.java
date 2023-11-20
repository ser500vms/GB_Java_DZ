package GB_Java_DZ;

class Laptop {
    String manufacturer;
    int diskCapacity;
    int memorySize;
    double screenSize;
    String cpuManufacturer;
    String gpuManufacturer;

    Laptop(String manufacturer, int diskCapacity, int memorySize, double screenSize, String cpuManufacturer,
            String gpuManufacturer) {
        this.manufacturer = manufacturer;
        this.diskCapacity = diskCapacity;
        this.memorySize = memorySize;
        this.screenSize = screenSize;
        this.cpuManufacturer = cpuManufacturer;
        this.gpuManufacturer = gpuManufacturer;
    }

    @Override
    public String toString() {
        return "Ноутбук: " +
                "Производитель = " + manufacturer +
                ", Объем жесткого диска = " + diskCapacity +
                ", Объем памяти = " + memorySize +
                ", Размер экрана = " + screenSize +
                ", Производитель Cpu = " + cpuManufacturer +
                ", Производитель Gpu = " + gpuManufacturer;
    }
}