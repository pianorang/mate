package me.pianorang.mate.user.adapter.out.persistence

import me.pianorang.mate.user.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

interface UserRepository: JpaRepository<UserJpaEntity, Long> {
    @Query("select a from UserJpaEntity a" +
            "where a.userId = :userId ")
    fun findByUserId(userId:String): UserJpaEntity
}