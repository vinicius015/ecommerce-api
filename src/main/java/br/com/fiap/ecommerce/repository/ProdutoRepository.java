package br.com.fiap.ecommerce.repository;

import br.com.fiap.ecommerce.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
