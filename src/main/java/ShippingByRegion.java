public class ShippingByRegion implements ShippingStrategy {
    private Region region;

    public ShippingByRegion(Region region) {
        this.region = region;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @Override
    public double calculateShipping() {
        return region.getShippingPrice();
    }
}
