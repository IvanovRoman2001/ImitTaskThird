package imit.taskThird;

import java.util.Objects;

public class ProductPackaging {
    private String name;
    private double weight;

    // TODO: 17.03.2022 check name  != null,  weight != 0.0
    public ProductPackaging(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean equals(ProductPackaging prodPackaging) {
        if (this == prodPackaging) return true;
        if (prodPackaging == null) return false;
        if (getClass() != prodPackaging.getClass()) return false;

        ProductPackaging that = (ProductPackaging) prodPackaging;
        return Double.compare(that.getWeight(), getWeight()) == 0 && getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getWeight());
    }

    @Override
    public String toString() {
        return String.format("Упаковка %s с весом %f", name, weight);
    }
}