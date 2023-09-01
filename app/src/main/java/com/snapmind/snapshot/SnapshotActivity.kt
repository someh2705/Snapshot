package com.snapmind.snapshot

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SnapshotActivity : ComponentActivity() {
    private val viewModel by viewModels<SnapshotViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                Surface {
                    val message by viewModel.state.collectAsStateWithLifecycle()
                    Greeting(message)
                }
            }
        }
    }
}

@Composable
fun Greeting(message: String = "Hello World!") {
    Text(text = message)
}

@Preview
@Composable
fun GreetingPreview() {
    Greeting()
}