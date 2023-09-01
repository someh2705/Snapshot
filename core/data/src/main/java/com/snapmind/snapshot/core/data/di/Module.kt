package com.snapmind.snapshot.core.data.di

import com.snapmind.snapshot.core.data.repository.Repository
import com.snapmind.snapshot.core.data.repository.SampleRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal interface Module {

    @Binds
    fun providesRepository(
        sampleRepository: SampleRepository
    ): Repository
}