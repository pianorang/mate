package me.pianorang.mate.user.adapter.out.persistence

import me.pianorang.mate.common.PersistenceAdapter
import me.pianorang.mate.user.application.port.out.UserRegistrationPort
import me.pianorang.mate.user.domain.User

@PersistenceAdapter
internal class UserPersistenceAdapter(val userRepository: UserRepository, val userMapper: UserMapper) : UserRegistrationPort {
    override fun registration(user: User):User = userMapper
        .mapToDomainEntity(userRepository.save(userMapper.mapToJpaEntity(user)))
}