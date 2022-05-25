package me.pianorang.mate.ui.admin

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class AdminMainController {
    @GetMapping("/admin")
    fun main():String{
        return "admin/main/index"
    }
}