package com.oryanend.dicionario.filtro.dto;

import com.oryanend.dicionario.filtro.entities.Word;

public class WordDTO {
  private String word;

  private WordDTO() {}

  public WordDTO(String word) {
    this.word = word;
  }

  public WordDTO(Word entity) {
    this.word = entity.getWord();
  }

  public String getWord() {
    return word;
  }
}
