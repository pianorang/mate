package me.pianorang.mate.user.application.service

import me.pianorang.mate.user.application.port.`in`.UserDetailsPort
import me.pianorang.mate.user.domain.User
import org.springframework.stereotype.Service

@Service
class UserDetailsService(private val userDetailsPort:UserDetailsPort) {
    fun loadByUserId(userId: String): User = userDetailsPort.loadByUserId(userId)
}