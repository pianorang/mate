package me.pianorang.mate.user.application.service

import me.pianorang.mate.user.application.port.`in`.UserDetailsPort
import me.pianorang.mate.user.application.port.out.LoadByUserIdPort
import me.pianorang.mate.user.domain.User
import org.springframework.stereotype.Service

@Service
class UserDetailsService(private val loadByUserIdPort: LoadByUserIdPort): UserDetailsPort {
    override fun loadByUserId(userId: String) = loadByUserIdPort.loadByUserId(userId)


}