package instantiate.abstractfactory;

import instantiate.simplefactory.Material;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@EqualsAndHashCode
@Getter
public class DoorMaster {

    private final Material doorType;

}
