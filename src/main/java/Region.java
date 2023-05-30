public class Region {
    private String name;
    private String abbreviation;
    private double shippingPrice;

    public Region(String name, String abbreviation, double shippingPrice) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.shippingPrice = shippingPrice;
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public double getShippingPrice() {
        return shippingPrice;
    }
}
