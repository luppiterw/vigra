package vout.kit.serial;

import java.io.Serializable;

/**
 * Created by hughie on 16/8/23.
 */
public class KitFlower implements Serializable{

    private static final long serialVersionUID = 9076983788818280088L;

    public enum Color {
        Red,
        Green,
        Blue,
        Black,
        White,
        Fuchsia,
        Pink
    }
    public KitFlower(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }
    private Color color;

}
