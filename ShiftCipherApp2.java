# Data-Structure
import java.util.Scanner;

class ShiftCipherApp2{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int shifter = 0;
        String message;
        System.out.println("Shift Cipher Algorithm Quiz");
        System.out.println("===========================");
        System.out.print("How many shifts would you want to use? ");
        try {
            shifter = sc.nextInt();
            sc.nextLine();
            // Consume the next line
        } catch (Exception e) {
            System.out.println("That is not an integer.");
            System.exit(0);
            return;
        }
        System.out.println("Please enter a message to hit enter to encrypt it.");
        message = sc.nextLine();
        ShiftCipher2 app = new ShiftCipher2(message, shifter);
        app.cipher();
        System.out.println ("Encrypted Message: " + app.getCiphered());
        app.decipher();
        System.out.println ("Decrypted Message: " + app.getDeciphered());

}
}
