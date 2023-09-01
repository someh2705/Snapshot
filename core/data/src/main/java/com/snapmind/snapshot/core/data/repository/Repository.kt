package com.snapmind.snapshot.core.data.repository

import kotlinx.coroutines.flow.Flow

interface Repository {

    fun fetchMessage(): Flow<String>
}