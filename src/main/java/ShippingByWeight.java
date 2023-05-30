public class ShippingByWeight implements ShippingStrategy {
    private double weight;
    private double shippingPriceByWeight;
    private double weightSlice;

    public ShippingByWeight(double weight, double shippingPriceByWeight, double weightSlice) {
        this.weight = weight;
        this.shippingPriceByWeight = shippingPriceByWeight;
        this.weightSlice = weightSlice;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getShippingPriceByWeight() {
        return shippingPriceByWeight;
    }

    public void setShippingPriceByWeight(double shippingPriceByWeight) {
        this.shippingPriceByWeight = shippingPriceByWeight;
    }

    public double getWeightSlice() {
        return weightSlice;
    }

    public void setWeightSlice(double weightSlice) {
        this.weightSlice = weightSlice;
    }

    @Override
    public double calculateShipping() {
        double numSlices = Math.ceil(weight / weightSlice);
        return numSlices * shippingPriceByWeight;
    }
}
