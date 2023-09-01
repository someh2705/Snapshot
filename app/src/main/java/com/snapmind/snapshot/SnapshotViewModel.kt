package com.snapmind.snapshot

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.snapmind.snapshot.core.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class SnapshotViewModel @Inject constructor(repository: Repository) : ViewModel() {

    val state =
        repository
            .fetchMessage()
            .stateIn(
                viewModelScope,
                SharingStarted.Lazily,
                ""
            )
}