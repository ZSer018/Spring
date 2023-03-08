package com.zinovies.sergey.spring.security.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import javax.sql.DataSource;


@Configuration
@EnableWebSecurity
public class MySecurityConfig {

/*
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
*/

/*
    @Bean
    public PasswordEncoder passwordEncoder() {
     //   return new BCryptPasswordEncoder();
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
*/

    @Bean
    public UserDetailsService userDetailsService(@Autowired DataSource dataSource) {
        return new JdbcUserDetailsManager(dataSource);
    }



/*
    @Bean
    public UserDetailsService userDetailsService(BCryptPasswordEncoder passwordEncoder) {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();

        manager.createUser(User.withUsername("sergey")
                .password(passwordEncoder.encode("sergey"))
                .roles("it")
                .build());

        manager.createUser(User.withUsername("maria")
                .password(passwordEncoder.encode("art"))
                .roles("art")
                .build());

        manager.createUser(User.withUsername("denis")
                .password(passwordEncoder.encode("manager"))
                .roles("it", "art")
                .build());

        return manager;
    }
*/


/*
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .requestMatchers("/it_info/**").hasRole("it")
                .requestMatchers("/art_info/**").hasRole("art")
                .requestMatchers("/**").hasAnyRole("it", "art", "manager")
                .and().formLogin().permitAll();

        return http.build();
    }
*/

}


