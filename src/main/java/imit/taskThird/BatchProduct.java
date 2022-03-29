package imit.taskThird;

import java.util.Arrays;
import java.util.Objects;

public class BatchProduct {
    private final String description;
    private  PackedProduct[] products;

    public BatchProduct(String description, PackedProduct... products) {
        if (description == null) throw new IllegalArgumentException();
        this.description = description;
        this.products = products;
    }

    public String getDescription() {
        return description;
    }

    public PackedProduct[] getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BatchProduct)) return false;
        BatchProduct that = (BatchProduct) o;
        return Objects.equals(getDescription(), that.getDescription()) && Arrays.equals(getProducts(), that.getProducts());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getDescription());
        result = 31 * result + Arrays.hashCode(getProducts());
        return result;
    }

    @Override
    public String toString() {
        return String.format("Партия товаров: %s %nТовары: %s", description, Arrays.toString(products));
    }

    public double getWeight() {
        double sumWeight = 0.0;
        for (PackedProduct p: products) {
            sumWeight += p.getGrossWeight();
        }
        return sumWeight;
        //return Arrays.stream(products).mapToDouble(PackedProduct::getGrossWeight).sum();
    }
}
