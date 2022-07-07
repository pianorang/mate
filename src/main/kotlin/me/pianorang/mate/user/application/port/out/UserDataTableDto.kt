package me.pianorang.mate.user.application.port.out

import me.pianorang.mate.common.DataTableList

data class UserDataTableDto(
    val id:Long,
    val userId:String,
    val userName:String,
    val userEmail:String,
    val userLevel:Int,
    val isAdmin: Boolean,
    val isDenied: Boolean
) : DataTableList  {
}