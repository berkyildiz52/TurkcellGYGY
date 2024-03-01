package com.turkcell.KodlamaioDevs.controllers;

import com.turkcell.KodlamaioDevs.entities.Language;
import com.turkcell.KodlamaioDevs.services.abstracts.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {

    private LanguageService languageService;


    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping
    public List<Language> get() {
        return languageService.getAll();
    }

    @GetMapping("/{id}")
    public Language getByID(@PathVariable int id) {
        return languageService.getByID(id);
    }

    @PostMapping
    public void add(@RequestBody Language language) {
        languageService.add(language);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody Language language) {
        languageService.update(id,language);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        languageService.delete(id);
    }

}
