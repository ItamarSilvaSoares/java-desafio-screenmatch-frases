package br.com.alura.screenmatch_frases.frase.controller;

import br.com.alura.screenmatch_frases.frase.dto.FraseDto;
import br.com.alura.screenmatch_frases.frase.service.FraseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class FraseController {
  private FraseService fraseService;

  @GetMapping("/series/frases")
  public FraseDto getRandomFrase() {
    return this.fraseService.getRandomFrase();
  }
}
