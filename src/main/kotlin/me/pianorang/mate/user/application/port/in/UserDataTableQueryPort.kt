package me.pianorang.mate.user.application.port.`in`

import me.pianorang.mate.common.DataTableInput
import me.pianorang.mate.common.DataTableOutput

interface UserDataTableQueryPort {
    fun getDataTableList(dataTableInput: DataTableInput): DataTableOutput
}