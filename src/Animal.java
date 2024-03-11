import java.util.ArrayList;

public abstract class Animal {

    protected String type;
    protected String name;
    protected Size size;
    protected String specialCare;

    ArrayList<Animal> farmhouse = new ArrayList<>();

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", specialCare='" + specialCare + '\'' +
                '}';
    }
}
