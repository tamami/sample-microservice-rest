package lab.aikibo.etc;

import lombok.Data;

/**
 * Created by tamami on 15/06/17.
 */
@Data
public class Greet {

    private String message;

    public Greet(String message) {
        this.message = message;
    }

    public Greet() {}

}
