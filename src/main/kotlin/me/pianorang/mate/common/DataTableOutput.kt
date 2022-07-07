package me.pianorang.mate.common

data class DataTableOutput(
    private val draw:Int,
    private val recordsTotal:Long,
    private val recordsFiltered: Long,
    private val data: List<DataTableList>
)
