package me.pianorang.mate.user.adapter.out.persistence

import me.pianorang.mate.user.domain.User
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "TN_USER")
internal class UserJpaEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long,
    val userId:String,
    val userName:String,
    val userPassword:String,
    val userEmail:String,
    val userLevel:Int,
    val isAdmin: Boolean,
    val isDenied: Boolean
) {
    companion object{
        fun entityToJpaEntity(user: User){
            return UserJpaEntity()
        }
    }

}