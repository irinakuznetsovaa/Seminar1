package Animals;

import java.io.*;

public class ReadRecord implements Serializable {
    public static void Record(Animals animals){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("animals.dat")))
        {
            oos.writeObject(animals);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public static void Read(){
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("animals.dat"))) {
            Animals animals = (Animals)ois.readObject();
            System.out.printf("");

        }
        catch (Exception ex){

        }
    }


}
