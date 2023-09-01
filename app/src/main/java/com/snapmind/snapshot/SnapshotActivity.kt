package com.snapmind.snapshot

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class SnapshotActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                Surface {
                    Greeting()
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