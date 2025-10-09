package flower.store;

import lombok.Getter;
import lombok.Setter;

@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;
    public Flower() {};
    public Flower(Flower other) {
    this.sepalLength = other.sepalLength;
    this.price = other.price;
    this.flowerType = other.flowerType;
    this.color = other.color;
}
    public String getColor() {
        return color.toString();
    }
}
