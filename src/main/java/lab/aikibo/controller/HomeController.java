package lab.aikibo.controller;

import lab.aikibo.etc.Greet;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tamami on 15/06/17.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public Greet hi() {
        return new Greet("Hi, selamat datang");
    }

}
