package src;

public class Tester {

    public static void main(String[] args) {

        SmartphonePrice prodPrice1 = new SmartphonePrice("Producer", 300.00);
        SmartphonePrice retailPrice1 = new SmartphonePrice("Retail", 500.00);
        SmartphonePrice prodPrice2 = new SmartphonePrice("Producer", 350.00);
        SmartphonePrice retailPrice2 = new SmartphonePrice("Retail", 550.00);


        Smartphone phone1 = new Smartphone("Apple", "iPhone 14", 3000, prodPrice1, retailPrice1);
        Smartphone phone2 = new Smartphone("Samsung", "Galaxy S22", 4000, prodPrice2, retailPrice2);

        // Print the details of the smartphones
        System.out.println("Phone 1: " + phone1);
        System.out.println("Phone 2: " + phone2);

        // Check if the first smartphone is equal to the second
        if (phone1.equals(phone2)) {
            System.out.println("The two smartphones are equal.");
        } else {
            System.out.println("The two smartphones are not equal.");
        }

        // Try to clone the second smartphone
        try {
            Smartphone clonedPhone = phone2.clone();
            System.out.println("Cloned Phone: " + clonedPhone);

            // Check if the cloned phone is equal to the second phone
            if (phone2.equals(clonedPhone)) {
                System.out.println("The cloned phone is equal to the second phone.");
            } else {
                System.out.println("The cloned phone is not equal to the second phone.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error while cloning the smartphone.");
        }
    }
}