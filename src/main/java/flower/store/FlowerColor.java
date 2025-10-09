package flower.store;
import lombok.Getter;
@Getter
public enum FlowerColor {RED("#FF0000"),
    BLUE("#0000FF"),
    YELLOW("#FFDE21"), 
    WHITE("#FFFFFF");
    private final String code;
    FlowerColor(String code) {
        this.code = code;
    }
    public String getColor() {
        return code;
    }
}