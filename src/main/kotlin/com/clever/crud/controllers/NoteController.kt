package com.clever.crud.controllers
import com.clever.crud.models.Note
import com.clever.crud.repository.NoteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class NoteController {
    @Autowired
    lateinit var noteRepository: NoteRepository


    @GetMapping("list")
    fun list(): List <Note> {
        return noteRepository.findAll().toList();
        }

    @PostMapping("post")
    fun save(@RequestBody note:Note): Note {
        return noteRepository.save(note);
    }

    @PutMapping("{id}")
    fun alter (@PathVariable id: Long, @RequestBody note:Note) {
        if(noteRepository.existsById(id)) {
            noteRepository.save(note);
        }
    }
}