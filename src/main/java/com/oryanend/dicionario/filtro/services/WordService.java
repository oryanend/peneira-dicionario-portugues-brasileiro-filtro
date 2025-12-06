package com.oryanend.dicionario.filtro.services;

import com.oryanend.dicionario.filtro.entities.Word;
import com.oryanend.dicionario.filtro.repositories.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WordService {

  @Autowired private WordRepository wordRepository;

  @Transactional(readOnly = true)
  public Word getRandomWord() {
    return wordRepository.findRandomWord();
  }

  @Transactional(readOnly = true)
  public Word getRandomWordByMaxCharSize(int wordSize) {
    return wordRepository.findRandomWordByMaxCharSize(wordSize);
  }
}
