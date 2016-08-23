package vout.kit;

import java.io.*;

/**
 * Created by hughie on 16/8/23.
 */
public class KitUtils {

    public static Object readSerialObject(String filePath) {

        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(filePath);
            ois = new ObjectInputStream(fis);
            return ois.readObject();
        } catch (Exception e) {
            System.out.print("[KitUtils.readSerialObject] " + filePath + " e=" + e);
        } finally {
            try {
                if(fis != null ) {
                    fis.close();
                }
                if(ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static boolean saveSerialObject(String filePath, Object obj) {

        File file = new File(filePath);
        if(file.isDirectory()) {
            System.out.println("[KitUtils.saveSerialObject] "+ filePath + " is a directory!");
            return false;
        }

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
        } catch (Exception e) {
            System.out.print("[KitUtils.saveSerialObject] " + filePath + " e=" + e);
        } finally {
            try {
                if(fos != null) {
                    fos.close();
                }
                if(oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return true;
    }
}
