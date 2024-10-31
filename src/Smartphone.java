package src;

import java.util.Objects;

public class Smartphone implements Cloneable {

    private String brandName;
    private String modelName;
    private int batteryCapacitymAh;
    private SmartphonePrice producerPrice;
    private SmartphonePrice retailPrice;

    // Constructor
    public Smartphone(String brandName, String modelName, int batteryCapacitymAh,
                      SmartphonePrice producerPrice, SmartphonePrice retailPrice) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.batteryCapacitymAh = batteryCapacitymAh;
        this.producerPrice = producerPrice;
        this.retailPrice = retailPrice;
    }

    // Override clone method
    @Override
    public Smartphone clone() {
        try {
            Smartphone clonedSmartphone = (Smartphone) super.clone();
            clonedSmartphone.producerPrice = this.producerPrice.clone();
            clonedSmartphone.retailPrice = this.retailPrice.clone();
            return clonedSmartphone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error cloning Smartphone", e);
        }
    }

    // Override toString method
    @Override
    public String toString() {
        return "Smartphone{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", batteryCapacitymAh=" + batteryCapacitymAh +
                ", producerPrice=" + producerPrice +
                ", retailPrice=" + retailPrice +
                '}';
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Smartphone that = (Smartphone) obj;
        return batteryCapacitymAh == that.batteryCapacitymAh &&
                Objects.equals(brandName, that.brandName) &&
                Objects.equals(modelName, that.modelName) &&
                Objects.equals(producerPrice, that.producerPrice) &&
                Objects.equals(retailPrice, that.retailPrice);
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batteryCapacitymAh, producerPrice, retailPrice);
    }
}
