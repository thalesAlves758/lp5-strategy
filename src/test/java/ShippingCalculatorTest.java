import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShippingCalculatorTest {
    @Test
    void shouldCalculateFixedShipping() {
        FixedShipping fixedShipping = new FixedShipping(20.0);

        assertEquals(20.0, fixedShipping.calculateShipping());
    }

    @Test
    void shouldCalculateShippingByWeight() {
        ShippingByWeight shippingByWeight = new ShippingByWeight(5000.0, 10.0, 1000.0);

        assertEquals(50.0, shippingByWeight.calculateShipping());
    }

    @Test
    void shouldCalculateShippingByRegion() {
        Region region = new Region("Minas Gerais", "MG", 200.0);
        ShippingByRegion shippingByRegion = new ShippingByRegion(region);

        assertEquals(200.0, shippingByRegion.calculateShipping());
    }
}
