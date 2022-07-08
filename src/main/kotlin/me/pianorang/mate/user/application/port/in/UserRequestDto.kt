package me.pianorang.mate.user.application.port.`in`

data class UserRequestDto(
    var id:Long? = null,
    var userId:String? = null,
    var userName:String? = null,
    var userPassword:String? = null,
    var userEmail:String? = null,
    var userLevel:Int? = null,
    var isAdmin: Boolean? = null,
    var isDenied: Boolean? = null
) {
    
}