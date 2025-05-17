import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pilih laptop
        System.out.println("Pilih laptop (toshiba/macbook): ");
        String pilih = scanner.nextLine().toLowerCase();

        Laptop laptop;

        if (pilih.equals("toshiba")) {
            laptop = new Toshiba();
        } else if (pilih.equals("macbook")) {
            laptop = new MacBook();
        } else {
            System.out.println("Pilihan tidak tersedia.");
            scanner.close();
            return;
        }

        // Input perintah
        while (true) {
            System.out.print("Masukkan perintah (ON, OFF, UP, DOWN, EXIT): ");
            String perintah = scanner.nextLine().toUpperCase();

            switch (perintah) {
                case "ON":
                    laptop.powerOn();
                    break;
                case "OFF":
                    laptop.powerOff();
                    break;
                case "UP":
                    laptop.volumeUp();
                    break;
                case "DOWN":
                    laptop.volumeDown();
                    break;
                case "EXIT":
                    System.out.println("Program selesai.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Perintah tidak dikenali.");
            }
        }
    }
}
