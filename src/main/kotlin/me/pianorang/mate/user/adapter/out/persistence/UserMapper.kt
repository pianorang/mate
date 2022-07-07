package me.pianorang.mate.user.adapter.out.persistence

import me.pianorang.mate.user.application.port.out.UserDataTableDto
import me.pianorang.mate.user.domain.User
import org.springframework.stereotype.Component

@Component
class UserMapper {

    fun mapToJpaEntity(user: User):UserJpaEntity = UserJpaEntity(0, user.userId, user.userName,
        user.userPassword,user.userEmail, user.userLevel, user.isAdmin, user.isDenied )

    fun mapToDomainEntity(user: UserJpaEntity) = User(user.id, user.userId, user.userName,
        user.userPassword,user.userEmail, user.userLevel, user.isAdmin, user.isDenied)

    fun mapToDataTableDto(user: UserJpaEntity) = UserDataTableDto(user.id, user.userId, user.userName,
        user.userEmail, user.userLevel, user.isAdmin, user.isDenied)

}