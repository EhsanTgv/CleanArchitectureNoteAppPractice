package com.taghavi.cleanarchitecturenoteapppractice.feature_not.domain.repository

import com.taghavi.cleanarchitecturenoteapppractice.feature_not.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteByID(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}