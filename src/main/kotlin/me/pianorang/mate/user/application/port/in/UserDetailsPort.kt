package me.pianorang.mate.user.application.port.`in`

import me.pianorang.mate.user.domain.User


interface UserDetailsPort {
    fun loadByUserId(userId: String):User
}