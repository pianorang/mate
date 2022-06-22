package me.pianorang.mate.user.adapter.out.persistence

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

internal interface UserRepository: JpaRepository<UserJpaEntity, Long> {
}