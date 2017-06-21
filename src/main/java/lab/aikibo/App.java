package lab.aikibo;

import lab.aikibo.mq.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

//@EnableGlobalMethodSecurity // security: basic
@EnableAuthorizationServer
@EnableResourceServer
@SpringBootApplication
public class App implements CommandLineRunner
{

    @Autowired
    Sender sender;

    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        sender.send("Hi, ini pesan dari client ke messaging");
    }
}
