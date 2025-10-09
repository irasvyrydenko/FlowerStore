package flower.store;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
@Data
public class FlowerBucket {
    private List<FlowerPack> flowerPacks;

    public FlowerBucket() {
        this.flowerPacks = new ArrayList<>();
    }

    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        return flowerPacks.stream()
            .mapToDouble(pack -> pack.getPrice()).sum();
    }
}
