package com.scentedentity.olfactoryfaculty.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import com.scentedentity.olfactoryfaculty.security.filter.AuthenticationFilter;
import com.scentedentity.olfactoryfaculty.security.filter.ExceptionHandlerFilter;
import com.scentedentity.olfactoryfaculty.security.filter.JWTAuthorizationFilter;
import com.scentedentity.olfactoryfaculty.security.manager.CustomAuthenticationManager;
import lombok.AllArgsConstructor;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@AllArgsConstructor
public class SecurityConfig {
    private final CustomAuthenticationManager customAuthenticationManager;

    
    @SuppressWarnings("removal")
    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        AuthenticationFilter authenticationFilter = new AuthenticationFilter(customAuthenticationManager);
        authenticationFilter.setFilterProcessesUrl("/authenticate");
        http
    .headers(headers -> headers.frameOptions().disable())
    .csrf(csrf -> csrf.disable())
    .authorizeHttpRequests(authorize -> authorize  
        .requestMatchers("/postgresql/**").permitAll()
        .requestMatchers(HttpMethod.POST, SecurityConstants.REGISTER_PATH).permitAll()
        .anyRequest().authenticated())
    .addFilterBefore(new ExceptionHandlerFilter(), AuthenticationFilter.class)
    .addFilter(authenticationFilter)
    .addFilterAfter(new JWTAuthorizationFilter(), AuthenticationFilter.class)
    .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        return http.build();
    }
}
