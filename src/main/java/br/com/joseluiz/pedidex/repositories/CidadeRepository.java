package br.com.joseluiz.pedidex.repositories;

import br.com.joseluiz.pedidex.models.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}
