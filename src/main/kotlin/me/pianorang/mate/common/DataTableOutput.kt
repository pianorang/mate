package me.pianorang.mate.common

data class DataTableOutput(
    val draw:Int,
    val recordsTotal:Long,
    val recordsFiltered: Long,
    val data: List<DataTableList>
)
