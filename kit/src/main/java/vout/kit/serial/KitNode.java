package vout.kit.serial;

import java.io.Serializable;

/**
 * Created by hughie on 16/8/23.
 */
public class KitNode implements Serializable{

    private static final long serialVersionUID = -2514656974976973562L;

    private String kName;
    private transient int kNumber;
    private KitFlower kFlower;

    public void print() {
        System.out.println("[KitNode.print] " + kName + " " + kNumber + " " + kFlower.getColor() );
    }

    public KitNode(String name, int number, KitFlower flower) {
        this.kName = name;
        this.kNumber = number;
        this.kFlower = flower;
    }

    private KitNode() {

    }
}
