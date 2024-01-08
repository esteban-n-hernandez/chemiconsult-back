package org.chemiconsult;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        String port = System.getenv("PORT");
        if (port == null || port.isEmpty()) {
            port = "8080"; // Usar un puerto por defecto si no se encuentra la variable de entorno PORT
        }

        SpringApplication app = new SpringApplication(Main.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", port));
        app.run(args);
    }
}
