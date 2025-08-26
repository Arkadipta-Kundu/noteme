package org.arkadipta.noteme.controller;

import org.arkadipta.noteme.entity.Note;
import org.arkadipta.noteme.repository.NoteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
@CrossOrigin(origins = "*")
public class NoteController {

    private final NoteRepository noteRepository;

    public NoteController(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @GetMapping
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    @PostMapping
    public Note createNote(@RequestBody Note note) {
        return noteRepository.save(note);
    }

    @GetMapping("/{id}")
    public Note getNoteById(@PathVariable String id) {
        return noteRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteNote(@PathVariable String id) {
        noteRepository.deleteById(id);
    }
}
