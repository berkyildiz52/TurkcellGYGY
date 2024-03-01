package com.turkcell.KodlamaioDevs.repositories.concretes;

import com.turkcell.KodlamaioDevs.entities.Language;
import com.turkcell.KodlamaioDevs.repositories.abstracts.LanguageRepository;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

@Repository
public class LanguageRepositoryImpl implements LanguageRepository {

    private List<Language> languageList = new ArrayList<>();

    public LanguageRepositoryImpl(List<Language> languageList) {
        this.languageList = languageList;
        languageList.add(new Language(1, "Java"));
        languageList.add(new Language(2, "Python"));
    }

    @Override
    public List<Language> getAll() {
        return languageList;
    }

    @Override
    public Language getByID(int id) {
        for (Language language : languageList) {
            if (language.getId() == id) {
                return language;
            }
        }
        return null;
    }

    @Override
    public void add(Language language) {
        languageList.add(language);
    }

    @Override
    public void update(int id, Language language) {
        int index = 0;
        for (Language language2 : languageList) {
            if (language.getId() == id) {
                index = languageList.indexOf(language2);
            }
        }
        languageList.set(index, language);
    }

    @Override
    public void delete(int id) {
        Language languageToDelete = getByID(id);
        languageList.remove(languageToDelete);
    }
}
