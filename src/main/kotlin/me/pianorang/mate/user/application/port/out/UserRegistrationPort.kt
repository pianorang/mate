package me.pianorang.mate.user.application.port.out

import me.pianorang.mate.user.domain.User

interface UserRegistrationPort {
    fun registration(user: User):User
}