public class ShippingByWeight implements ShippingStrategy {
    private double weight;
    private double shippingPriceByGramSlice;
    private double gramWeightSlice;

    public ShippingByWeight(double weight, double shippingPriceByGramSlice, double gramWeightSlice) {
        this.weight = weight;
        this.shippingPriceByGramSlice = shippingPriceByGramSlice;
        this.gramWeightSlice = gramWeightSlice;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getShippingPriceByGramSlice() {
        return shippingPriceByGramSlice;
    }

    public void setShippingPriceByGramSlice(double shippingPriceByGramSlice) {
        this.shippingPriceByGramSlice = shippingPriceByGramSlice;
    }

    public double getGramWeightSlice() {
        return gramWeightSlice;
    }

    public void setGramWeightSlice(double gramWeightSlice) {
        this.gramWeightSlice = gramWeightSlice;
    }

    @Override
    public double calculateShipping() {
        double numSlices = Math.ceil(weight / gramWeightSlice);
        return numSlices * shippingPriceByGramSlice;
    }
}
