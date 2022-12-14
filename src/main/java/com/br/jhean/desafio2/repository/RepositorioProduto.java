package com.br.jhean.desafio2.repository;

import com.br.jhean.desafio2.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioProduto extends JpaRepository<Produto, Long> {


}
