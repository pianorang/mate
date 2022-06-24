package me.pianorang.mate.user.adapter.out.persistence

import me.pianorang.mate.user.domain.User
import org.junit.jupiter.api.Assertions.*

internal class UserPersistenceAdapterTest {

    @org.junit.jupiter.api.Test
    fun registration() {
        val user = User(1, "testUser1", "test", "1111", "test@test.com",
            1, true, false)

    }
}