package me.pianorang.mate.security.application.service

import me.pianorang.mate.security.domain.UserDetailsImpl
import me.pianorang.mate.user.application.port.`in`.UserDetailsPort
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service

@Service
class UserDetailsServiceImpl(@Autowired private val userDetailsPort: UserDetailsPort): UserDetailsService {
    override fun loadUserByUsername(username: String?): UserDetails{
        return userDetailsPort.loadByUserId(username?:throw IllegalArgumentException("username is required.")).run {
            UserDetailsImpl(this)
        }
    }
}