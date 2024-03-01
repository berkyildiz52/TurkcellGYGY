package com.turkcell.KodlamaioDevs.services.concretes;

import com.turkcell.KodlamaioDevs.entities.Language;
import com.turkcell.KodlamaioDevs.repositories.abstracts.LanguageRepository;
import com.turkcell.KodlamaioDevs.services.abstracts.LanguageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService {

    private LanguageRepository languageRepository;

    public LanguageServiceImpl(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public Language getByID(int id) {
        return languageRepository.getByID(id);
    }

    @Override
    public void add(Language language) {
        if (isExist(language)) {
            throw new IllegalArgumentException("Names cannot be repeated.");
        }

        if (language.getName().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be left blank.");
        }
        languageRepository.add(language);
    }

    @Override
    public void update(int id, Language language) {
        if (isExist(language)) {
            throw new IllegalArgumentException("Names cannot be repeated.");
        }

        if (language.getName().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be left blank.");
        }
        languageRepository.update(id, language);
    }

    @Override
    public void delete(int id) {
        languageRepository.delete(id);
    }

    public boolean isExist(Language language) {
        List<Language> existingLanguages = languageRepository.getAll();
        for (Language language2 : existingLanguages) {
            if (language2.getName().equals(language.getName())) {
                return true;
            }
        }
        return false;
    }
}
