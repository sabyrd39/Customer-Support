package com.uncc.ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class TicketApplication {

    public static void main(String[] args) {
        run(TicketApplication.class, args);
    }

}
