package me.pianorang.mate.user.adapter.out.persistence

import io.kotest.core.spec.style.DescribeSpec
import io.mockk.*
import me.pianorang.mate.user.domain.User
import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import java.util.*


internal class UserPersistenceAdapterTest: DescribeSpec({
    val userRepository = mockk<UserRepository>()
    val userMapper = UserMapper()
    val userPersistenceAdapter = UserPersistenceAdapter(userRepository, userMapper)

    describe("UserPersistenceAdapter"){
        context("User가 주어지면 "){

            it("User를 저장한다"){
                val user = User(1, "testUser1", "test", "1111", "test@test.com",
                    1, true, false)
                val userJpaEntity = userMapper.mapToJpaEntity(user)
                every { userRepository.save(any()) } answers {userJpaEntity}
                val saveUser = userPersistenceAdapter.registration(user)

                assertEquals(user.userId, saveUser.userId)

            }
        }
    }


}) {

}