package compose.bridge;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class HomePage implements Page {

    private final Theme theme;
    private final String address;

    @Override
    public String getContent() {
        return "Homepage Content in " + theme.name();
    }
}
