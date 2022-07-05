package me.pianorang.mate.security.adapter.`in`.web.admin

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class DashboardController {
    @GetMapping("/sys/dashboard") fun index() = "admin/dashboard/dashboard"
}