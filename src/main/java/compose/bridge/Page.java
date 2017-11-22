package compose.bridge;

import jdk.nashorn.internal.objects.annotations.Getter;

public interface Page {

    String getContent();

    String getAddress();

    Theme getTheme();

}
