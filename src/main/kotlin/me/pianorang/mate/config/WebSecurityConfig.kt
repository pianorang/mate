package me.pianorang.mate.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.web.SecurityFilterChain

@Configuration
class WebSecurityConfig {
    @Bean
    fun filterChain(http:HttpSecurity): SecurityFilterChain{
        return http.run {
            authorizeHttpRequests(){authz-> authz.antMatchers("/admin/**").authenticated()}
            formLogin().run {
                loginPage("/auth/login")
                loginProcessingUrl("/auth/login")
            }
            build()
        }
    }

    @Bean
    fun passwordEncoder():PasswordEncoder = BCryptPasswordEncoder()

}