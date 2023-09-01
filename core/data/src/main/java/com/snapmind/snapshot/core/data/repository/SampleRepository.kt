package com.snapmind.snapshot.core.data.repository

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import kotlin.time.Duration.Companion.seconds

class SampleRepository @Inject constructor() : Repository {
    override fun fetchMessage(): Flow<String> =
        flow {
            repeat(10) {
                emit("Hello World! #$it")
                delay(1.seconds)
            }
        }
}