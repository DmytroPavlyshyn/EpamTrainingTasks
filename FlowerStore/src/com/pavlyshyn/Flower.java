package com.pavlyshyn;

import java.util.Objects;

public class Flower {
    FlowerType flowerType;
    Double length;

    public Flower(FlowerType flowerType, double length) {
        this.flowerType = flowerType;
        this.length = length;
    }

    public FlowerType getFlowerType() {
        return flowerType;
    }

    public void setFlowerType(FlowerType flowerType) {
        this.flowerType = flowerType;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flower)) return false;
        Flower flower = (Flower) o;
        return getFlowerType() == flower.getFlowerType() &&
                getLength().equals(flower.getLength());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlowerType(), getLength());
    }

    @Override
    public String toString() {
        return "\nFlower{" +
                "flowerType=" + flowerType +
                ", length=" + length +
                "}\n";
    }
}
