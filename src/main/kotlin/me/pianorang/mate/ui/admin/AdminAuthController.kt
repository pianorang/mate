package me.pianorang.mate.ui.admin

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class AdminAuthController {
    @GetMapping("/admin/auth/login")
    fun login():String = "admin/auth/login"
}