package Day14;

public class SmartphonePrice implements Cloneable {

    private String priceType;
    private double priceInEuros;


    public SmartphonePrice(String priceType, double priceInEuros) {
        this.priceType = priceType;
        this.priceInEuros = priceInEuros;
    }


    public String getPriceType() {
        return priceType;
    }

    public double getPriceInEuros() {
        return priceInEuros;
    }


    @Override
    public SmartphonePrice clone() {
        try {
            return (SmartphonePrice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error cloning SmartphonePrice", e);
        }
    }


    @Override
    public String toString() {
        return "SmartphonePrice{" +
                "priceType='" + priceType + '\'' +
                ", priceInEuros=" + priceInEuros +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) obj;
        return Double.compare(that.priceInEuros, priceInEuros) == 0 &&
                priceType.equals(that.priceType);
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }
}
