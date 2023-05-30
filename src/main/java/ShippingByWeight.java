public class ShippingByWeight implements ShippingStrategy {
    private double weight;
    private double shippingPriceByGram;
    private double gramWeightSlice;

    public ShippingByWeight(double weight, double shippingPriceByGram, double gramWeightSlice) {
        this.weight = weight;
        this.shippingPriceByGram = shippingPriceByGram;
        this.gramWeightSlice = gramWeightSlice;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getShippingPriceByGram() {
        return shippingPriceByGram;
    }

    public void setShippingPriceByGram(double shippingPriceByGram) {
        this.shippingPriceByGram = shippingPriceByGram;
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
        return numSlices * shippingPriceByGram;
    }
}
