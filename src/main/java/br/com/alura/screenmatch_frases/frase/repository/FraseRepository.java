package br.com.alura.screenmatch_frases.frase.repository;

import br.com.alura.screenmatch_frases.frase.entity.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FraseRepository extends JpaRepository<Frase, Long> {
  @Query("SELECT f FROM Frase f order by function('RANDOM') LIMIT 1")
  Frase buscaFraseAleatoria();
}
