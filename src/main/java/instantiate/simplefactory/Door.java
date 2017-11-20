package instantiate.simplefactory;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
@EqualsAndHashCode
public class Door {

    private final int width;
    private final int height;
    private final Material material;

}
