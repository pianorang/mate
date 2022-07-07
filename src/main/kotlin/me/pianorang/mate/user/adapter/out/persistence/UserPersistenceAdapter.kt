package me.pianorang.mate.user.adapter.out.persistence

import me.pianorang.mate.common.PersistenceAdapter
import me.pianorang.mate.user.application.port.out.LoadByUserIdPort
import me.pianorang.mate.user.application.port.out.LoadUserListPort
import me.pianorang.mate.user.application.port.out.UserRegistrationPort
import me.pianorang.mate.user.domain.User
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

@PersistenceAdapter
class UserPersistenceAdapter(val userRepository: UserRepository, val userMapper: UserMapper) : UserRegistrationPort,
    LoadByUserIdPort, LoadUserListPort {
    override fun registration(user: User):User = userMapper
        .mapToDomainEntity(userRepository.save(userMapper.mapToJpaEntity(user)))

    override fun loadByUserId(userId: String): User = userMapper.mapToDomainEntity(userRepository.findByUserId(userId))

    override fun loadUserList(pageable: Pageable): Page<User> = userRepository.findAll(pageable).map { userMapper.mapToDomainEntity(it) }


}