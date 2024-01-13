package org.chemiconsult.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
@Profile("heroku")
public class HerokuDatabaseConfig {

    @Value("${spring.datasource.url}")
    private String databaseUrl;

    @Value("${spring.datasource.username}")
    private String username;

//    @Value("${spring.datasource.password}")
    private String password;


    @Bean
    public DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(databaseUrl);
        config.setUsername(username); // Reemplaza con tu nombre de usuario de JawsDB
        config.setPassword(password); // Reemplaza con tu contraseña de JawsDB

        return new HikariDataSource(config);
    }
}
