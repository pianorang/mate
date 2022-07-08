package me.pianorang.mate.user.adapter.`in`.web.admin

import me.pianorang.mate.user.application.port.`in`.UserRequestDto
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set

import org.springframework.web.bind.annotation.GetMapping

@Controller
class UserCrudPageController() {
    @GetMapping("/sys/user")
    fun userList() = "admin/user/user_list"

    @GetMapping("/sys/user/create")
    fun userCreate(model: Model):String{
        model["user"] = UserRequestDto();
        return "admin/user/user_create"
    }

}