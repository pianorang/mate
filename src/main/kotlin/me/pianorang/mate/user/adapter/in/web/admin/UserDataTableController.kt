package me.pianorang.mate.user.adapter.`in`.web.admin

import me.pianorang.mate.common.DataTableInput
import me.pianorang.mate.common.DataTableOutput
import me.pianorang.mate.user.application.port.`in`.UserDataTableQueryPort
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class UserDataTableController(val userDataTableQueryPort: UserDataTableQueryPort) {
    @GetMapping("/sys/user/getDataTableList")
    fun getList(@RequestParam page:Int, @RequestParam length:Int, @RequestParam draw:Int): DataTableOutput {

        val pageable = PageRequest.of(page, length, Sort.Direction.DESC, "id");
        val dataTableInput = DataTableInput(pageable, draw);

        return userDataTableQueryPort.getDataTableList(dataTableInput);
    }
}