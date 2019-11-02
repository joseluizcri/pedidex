package br.com.joseluiz.pedidex.repositories;

import br.com.joseluiz.pedidex.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
