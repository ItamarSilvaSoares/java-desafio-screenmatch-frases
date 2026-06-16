package br.com.alura.screenmatch_frases.frase.service;

import br.com.alura.screenmatch_frases.frase.dto.FraseDto;
import br.com.alura.screenmatch_frases.frase.entity.Frase;
import br.com.alura.screenmatch_frases.frase.repository.FraseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FraseService {
  private FraseRepository fraseRepository;

  public FraseDto getRandomFrase() {
    Frase frase = this.fraseRepository.buscaFraseAleatoria();
    return new FraseDto(frase.getTitulo(), frase.getFrase(),frase.getPersonagem(), frase.getPoster());
  }
}
