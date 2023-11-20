package GB_Java_DZ;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Store store = new Store();

            
            Laptop laptop1 = new Laptop("Asus", 512, 16, 15.6, "Intel", "Nvidia");
            Laptop laptop2 = new Laptop("Lenovo", 256, 8, 14, "AMD", "AMD");
            Laptop laptop3 = new Laptop("Asus", 512, 16, 15.6, "Intel", "Nvidia");
            Laptop laptop4 = new Laptop("HP", 512, 16, 15.6, "AMD", "AMD");
            Laptop laptop5 = new Laptop("Acer", 256, 8, 13.3, "Intel", "Nvidia");
            Laptop laptop6 = new Laptop("Asus", 512, 32, 17.3, "Intel", "Nvidia");
            Laptop laptop7 = new Laptop("Dell", 256, 16, 15.6, "AMD", "AMD");
            Laptop laptop8 = new Laptop("Lenovo", 1000, 8, 13.3, "Intel", "Nvidia");
            Laptop laptop9 = new Laptop("HP", 512, 16, 14.0, "AMD", "AMD");
            Laptop laptop10 = new Laptop("Acer", 256, 32, 15.6, "Intel", "Nvidia");
            Laptop laptop11 = new Laptop("Asus", 1000, 8, 13.3, "AMD", "AMD");
            Laptop laptop12 = new Laptop("Dell", 512, 32, 15.6, "Intel", "Nvidia");
            Laptop laptop13 = new Laptop("Lenovo", 256, 16, 14.0, "AMD", "AMD");
            Laptop laptop14 = new Laptop("HP", 1000, 8, 13.3, "Intel", "Nvidia");
            Laptop laptop15 = new Laptop("Acer", 512, 32, 15.6, "AMD", "AMD");

            store.addLaptop(laptop1);
            store.addLaptop(laptop2);
            store.addLaptop(laptop3);
            store.addLaptop(laptop4);
            store.addLaptop(laptop5);
            store.addLaptop(laptop6);
            store.addLaptop(laptop7);
            store.addLaptop(laptop8);
            store.addLaptop(laptop9);
            store.addLaptop(laptop10);
            store.addLaptop(laptop11);
            store.addLaptop(laptop12);
            store.addLaptop(laptop13);
            store.addLaptop(laptop14);
            store.addLaptop(laptop15);

            System.out.println(store);

            Map<String, Object> criteria = new HashMap<>();

            System.out.println("Выберите по какому параметру хотите произвести поиск: ");
            System.out.println("1 - Производитель ноутбука");
            System.out.println("2 - Объем жесткого диска");
            System.out.println("3 - Объем памяти");
            System.out.println("4 - Размер экрана");
            System.out.println("5 - Производитель Cpu");
            System.out.println("6 - Производитель Gpu");

            int choice = readIntInput(scanner);

            switch (choice) {
                case 1:
                    System.out.println("Выбирите производителя (Asus, Lenovo, HP, Acer, Dell):");
                    criteria.put("Manufacturer", scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Выбирите минимальный объем жесткого диска:");
                    criteria.put("DiskCapacity", readPositiveIntInput(scanner));
                    break;
                case 3:
                    System.out.println("Выбирите минимальный объем памяти:");
                    criteria.put("MemorySize", readPositiveIntInput(scanner));
                    break;
                case 4:
                    System.out.println("Выбирите минимальный размер экрана:");
                    criteria.put("ScreenSize", readPositiveDoubleInput(scanner));
                    break;
                case 5:
                    System.out.println("Выбирите производителя CPU (Intel, AMD):");
                    criteria.put("CpuManufacturer", scanner.nextLine());
                    break;
                case 6:
                    System.out.println("Выбирите производителя GPU (Nvidia. AMD):");
                    criteria.put("GpuManufacturer", scanner.nextLine());
                    break;
                default:
                    System.out.println("Неверный выбор");
                    break;
            }

            store.filter(criteria);
        } finally {
            scanner.close(); 
        }
    }

    private static int readIntInput(Scanner scanner) {
        int input = -1;
        while (true) {
            try {
                input = scanner.nextInt();
                scanner.nextLine(); 
                break;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели неверное значение!");
                scanner.nextLine(); 
            }
        }
        return input;
    }

    private static int readPositiveIntInput(Scanner scanner) {
        int input = -1;
        while (true) {
            try {
                input = readIntInput(scanner);
                if (input >= 0) {
                    break;
                } else {
                    System.out.println("Вы ввели отрицательное значение!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели неверное значение!");
                scanner.nextLine(); 
            }
        }
        return input;
    }

    private static double readPositiveDoubleInput(Scanner scanner) {
        double input = -1;
        while (true) {
            try {
                input = scanner.nextDouble();
                scanner.nextLine(); 
                if (input >= 0) {
                    break;
                } else {
                    System.out.println("Вы ввели отрицательное значение!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели неверное значение!");
                scanner.nextLine(); 
            }
        }
        return input;
    }
}