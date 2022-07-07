package me.pianorang.mate.common

import org.springframework.data.domain.Pageable

data class DataTableInput(
    val pageable: Pageable,
    val draw: Int
)