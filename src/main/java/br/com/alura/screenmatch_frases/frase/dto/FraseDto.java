package br.com.alura.screenmatch_frases.frase.dto;

import java.io.Serializable;

/** DTO for {@link br.com.alura.screenmatch_frases.frase.entity.Frase} */
public record FraseDto(String titulo, String frase, String personagem, String poster)
    implements Serializable {}
