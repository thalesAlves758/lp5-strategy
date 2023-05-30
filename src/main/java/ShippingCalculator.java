public class ShippingCalculator {
    public double calculateShipping(ShippingStrategy strategy) {
        return strategy.calculateShipping();
    }
}
