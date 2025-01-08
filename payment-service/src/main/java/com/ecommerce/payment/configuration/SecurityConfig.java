package com.ecommerce.payment.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                // Allow access to H2 console and payment API endpoints without authentication
                .requestMatchers("/h2-console/**", "/api/payments/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .csrf().disable() // Disable CSRF protection (necessary for H2 console, POST requests, and testing)
                .headers().frameOptions().disable() // Allow embedding of H2 console in iframe
                .and()
                .formLogin() // Optional: enables form login if required
                .and()
                .httpBasic(); // Optional: enables basic HTTP authentication if required for testing

        return http.build();
    }
}
