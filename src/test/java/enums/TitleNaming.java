package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TitleNaming {
    PRODUCTS(),
    CARTS(),
    CHECKOUT();
    private String displayName = "";

    TitleNaming() {

        this.displayName = displayName;
    }

    public String getDisplayName() {
        return "";
    }
}
