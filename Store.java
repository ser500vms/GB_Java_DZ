
package GB_Java_DZ;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Store {
    Set<Laptop> laptops = new HashSet<>();

    void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    void filter(Map<String, Object> criteria) {
        for (Laptop laptop : laptops) {
            boolean matches = true;

            for (Map.Entry<String, Object> entry : criteria.entrySet()) {
                String criterion = entry.getKey();

                switch (criterion) {
                    case "Manufacturer":
                        matches &= laptop.manufacturer.equals(entry.getValue());
                        break;
                    case "DiskCapacity":
                        matches &= laptop.diskCapacity >= (int) entry.getValue();
                        break;
                    case "MemorySize":
                        matches &= laptop.memorySize >= (int) entry.getValue();
                        break;
                    case "ScreenSize":
                        matches &= laptop.screenSize >= (double) entry.getValue();
                        break;
                    case "CpuManufacturer":
                        matches &= laptop.cpuManufacturer.equals(entry.getValue());
                        break;
                    case "GpuManufacturer":
                        matches &= laptop.gpuManufacturer.equals(entry.getValue());
                        break;
                    default:
                        System.out.println("Unknown criterion: " + criterion);
                        break;
                }
            }

            if (matches) {
                System.out.println(laptop);
            }
        }
    }
}