package me.pianorang.mate.user.application.service

import me.pianorang.mate.common.DataTableInput
import me.pianorang.mate.common.DataTableOutput
import me.pianorang.mate.user.application.port.`in`.UserDataTableQueryPort
import me.pianorang.mate.user.application.port.out.LoadUserListPort
import org.springframework.stereotype.Service

@Service
class UserDataTableQueryService(
    private val loadUserListPort: LoadUserListPort
): UserDataTableQueryPort {
    override fun getDataTableList(dataTableInput: DataTableInput): DataTableOutput {
        val userList = loadUserListPort.loadUserList(dataTableInput.pageable)
        return DataTableOutput(dataTableInput.draw, userList.totalElements, userList.totalElements, userList.content)
    }
}