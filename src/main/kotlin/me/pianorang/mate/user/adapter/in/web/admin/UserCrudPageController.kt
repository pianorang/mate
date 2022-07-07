package me.pianorang.mate.user.adapter.`in`.web.admin

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class UserCrudPageController() {
    @GetMapping("/sys/user")
    fun userList() = "admin/user/user_list"
}