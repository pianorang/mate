package me.pianorang.mate.user.adapter.out.persistence

import me.pianorang.mate.common.PersistenceAdapter
import me.pianorang.mate.user.application.port.out.UserRegistrationPort
import me.pianorang.mate.user.domain.User

@PersistenceAdapter
internal class UserPersistenceAdapter(val userRepository: UserRepository) : UserRegistrationPort {
    override fun registration(user: User) {
        userRepository.save()
    }
}