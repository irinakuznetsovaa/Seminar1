package Animals;

import java.io.Serializable;

public class Food implements Serializable {
    private String name;
    private float mass;
    public Food(String name,float mass){
        this.name=name;
        this.mass=mass;
    }

    public String getName() {
        return name;
    }

    public float getMass() {
        return mass;
    }

}
