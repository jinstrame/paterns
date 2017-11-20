package instantiate.prototype;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Sheep implements Cloneable {

    private String name;
    private String area;

    @Override
    public Sheep clone() throws CloneNotSupportedException {
        return (Sheep)super.clone();
    }
}
