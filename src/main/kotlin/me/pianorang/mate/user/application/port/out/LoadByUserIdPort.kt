package me.pianorang.mate.user.application.port.out

import me.pianorang.mate.user.domain.User

interface LoadByUserIdPort {
    fun loadByUserId(userId:String):User
}