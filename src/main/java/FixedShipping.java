public class FixedShipping implements ShippingStrategy {
    private double shippingPrice;

    public FixedShipping(double shippingPrice) {
        this.shippingPrice = shippingPrice;
    }

    public void setShippingPrice(double shippingPrice) {
        this.shippingPrice = shippingPrice;
    }

    public double getShippingPrice() {
        return shippingPrice;
    }

    @Override
    public double calculateShipping() {
        return shippingPrice;
    }
}
