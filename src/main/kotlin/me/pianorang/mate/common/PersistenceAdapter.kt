package me.pianorang.mate.common

import org.springframework.stereotype.Component


@Component
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class PersistenceAdapter()
