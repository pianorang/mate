package me.pianorang.mate.user.application.port.`in`

data class UserRequestDto(
    var id:Long,
    var userId:String,
    var userName:String,
    var userPassword:String,
    var userEmail:String,
    var userLevel:Int,
    var isAdmin: Boolean,
    var isDenied: Boolean
) {
    
}