package com.turkcell.KodlamaioDevs.repositories.abstracts;


import com.turkcell.KodlamaioDevs.entities.Language;

import java.util.List;

public interface LanguageRepository {

    List<Language> getAll();

    Language getByID(int id);

    void add(Language language);

    void update(int id, Language language);

    void delete(int id);
}
