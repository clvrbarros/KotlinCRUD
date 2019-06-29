package com.clever.crud.repository

import org.springframework.data.repository.CrudRepository
import com.clever.crud.models.Note

interface NoteRepository : CrudRepository<Note, Long>
