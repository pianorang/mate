package me.pianorang.mate.security.adapter.`in`.web.admin

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class LoginController {

    @GetMapping("/auth/login")
    fun login():String = "admin/auth/login"
}