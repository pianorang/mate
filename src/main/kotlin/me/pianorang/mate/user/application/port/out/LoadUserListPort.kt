package me.pianorang.mate.user.application.port.out

import me.pianorang.mate.user.domain.User
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface LoadUserListPort {
    fun loadUserList(pageable: Pageable): Page<User>
}