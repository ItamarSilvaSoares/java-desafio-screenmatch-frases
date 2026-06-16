package br.com.alura.screenmatch_frases.frase.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "frases")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Frase {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false)
  private Long id;
  private String titulo;
  private String frase;
  private String personagem;
  private String poster;

}
