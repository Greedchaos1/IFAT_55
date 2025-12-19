package user;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User {
    private String email = "";
    private String password = "";

    public User(String lockedOutUser, String secretSauce) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return "";
    }

    public CharSequence getPassword() {
        return null;
    }
}
