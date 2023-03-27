package com.taghavi.cleanarchitecturenoteapppractice.feature_note.domain.use_case

import com.taghavi.cleanarchitecturenoteapppractice.feature_note.domain.model.Note
import com.taghavi.cleanarchitecturenoteapppractice.feature_note.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteByID(id)
    }
}