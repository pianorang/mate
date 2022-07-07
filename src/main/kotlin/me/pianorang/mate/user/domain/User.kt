package me.pianorang.mate.user.domain

import me.pianorang.mate.common.DataTableList

class User(
    val id:Long,
    val userId:String,
    val userName:String,
    val userPassword:String,
    val userEmail:String,
    val userLevel:Int,
    val isAdmin: Boolean,
    val isDenied: Boolean
): DataTableList {
}