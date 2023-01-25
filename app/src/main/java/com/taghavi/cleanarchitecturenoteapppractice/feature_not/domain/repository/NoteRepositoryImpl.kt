package com.taghavi.cleanarchitecturenoteapppractice.feature_not.domain.repository

import com.taghavi.cleanarchitecturenoteapppractice.feature_not.data.data_source.NoteDao
import com.taghavi.cleanarchitecturenoteapppractice.feature_not.domain.model.Note
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(private val dao: NoteDao) : NoteRepository {

    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteByID(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }
}