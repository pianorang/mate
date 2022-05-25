package me.pianorang.mate.ui

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class AuthController {
    @GetMapping("/auth/login")
    fun login() = "auth/login"
}