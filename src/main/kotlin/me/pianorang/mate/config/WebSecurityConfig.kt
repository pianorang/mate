package me.pianorang.mate.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.annotation.Order
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.provisioning.InMemoryUserDetailsManager
import org.springframework.security.web.SecurityFilterChain

@EnableWebSecurity
class WebSecurityConfig {
    @Bean
    fun filterChain(http:HttpSecurity): SecurityFilterChain{
        return http.run {
            authorizeHttpRequests(){authz-> authz.antMatchers("/sys/**").authenticated()}
            formLogin().run {
                loginPage("/auth/login")
                loginProcessingUrl("/auth/login")
            }
            build()
        }
    }
    //@Bean
    public fun userDetailsService(): UserDetailsService {
        val users: User.UserBuilder = User.withDefaultPasswordEncoder()
        val manager = InMemoryUserDetailsManager()
        manager.createUser(users.username("user").password("password").roles("USER").build())
        manager.createUser(users.username("admin").password("password").roles("USER","ADMIN").build())
        return manager
    }



    //@Bean
    fun passwordEncoder():PasswordEncoder = BCryptPasswordEncoder()

}