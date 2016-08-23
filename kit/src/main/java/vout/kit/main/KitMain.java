package vout.kit.main;

import vout.kit.KitUtils;
import vout.kit.serial.KitFlower;
import vout.kit.serial.KitNode;

/**
 * Created by hughie on 16/8/22.
 */
public class KitMain {
    public static void main(String args[]) {
        System.out.println("[vout.kit.main] Hello! args=" + args);
        if(args.length >= 1) {
            if(args[0].equals("r")) {
                testSerialLoad();
            } else if(args[0].equals("w")) {
                testSerialSave();
            }
        }

    }


    private static final String abcPath = "./abc";
    public static void testSerialSave(){
        System.out.println("[>> >> >> vout.kit.main.testSerialSave] ");
        KitNode tmpNode = new KitNode("Peach", 0x01, new KitFlower(KitFlower.Color.Fuchsia));
        tmpNode.print();
        System.out.println(tmpNode +" ===> " + KitUtils.saveSerialObject(abcPath, tmpNode));

    }
    public static void testSerialLoad(){
        System.out.println("[>> >> >> vout.kit.main.testSerialLoad] ");
        KitNode tmpNode = (KitNode) KitUtils.readSerialObject(abcPath);
        if(tmpNode != null) {
            tmpNode.print();
        }
        System.out.println(tmpNode +" ===> " + KitUtils.saveSerialObject(abcPath, tmpNode));

    }
}
