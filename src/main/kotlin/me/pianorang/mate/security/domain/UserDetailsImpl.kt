package me.pianorang.mate.security.domain

import me.pianorang.mate.user.domain.User
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

class UserDetailsImpl(val user:User) : UserDetails {

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> = mutableListOf(
        SimpleGrantedAuthority(when(user.userLevel){
            1-> "ADMIN"
            else -> "USER"
        })
    )

    override fun getPassword(): String = user.userPassword

    override fun getUsername(): String = user.userName

    override fun isAccountNonExpired(): Boolean = true

    override fun isAccountNonLocked(): Boolean = user.isDenied

    override fun isCredentialsNonExpired(): Boolean = true

    override fun isEnabled(): Boolean = true

}