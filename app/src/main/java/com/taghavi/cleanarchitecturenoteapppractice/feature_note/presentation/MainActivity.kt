package com.taghavi.cleanarchitecturenoteapppractice.feature_note.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.taghavi.cleanarchitecturenoteapppractice.ui.theme.CleanArchitectureNoteAppPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CleanArchitectureNoteAppPracticeTheme {

            }
        }
    }
}