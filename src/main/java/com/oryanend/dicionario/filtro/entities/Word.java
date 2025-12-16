package com.oryanend.dicionario.filtro.entities;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "words", indexes = @Index(name = "idx_word_word", columnList = "word", unique = true))
public class Word {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(length = 100)
  private String word;

  public Word() {}

  public Word(Long id, String word) {
    this.id = id;
    this.word = word;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Word word = (Word) o;
    return Objects.equals(id, word.id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }
}
