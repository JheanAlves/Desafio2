package com.br.jhean.desafio2.service;


import com.br.jhean.desafio2.entities.Produto;
import com.br.jhean.desafio2.repository.RepositorioProduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstoqueService {

    @Autowired
    private RepositorioProduto repository;


    public Produto addProduct(Produto product){
        return repository.save(product);
    }

    public void removeProduct (Long codigo){
        repository.deleteById(codigo);
    }

    public Produto editProduct (Long codigo, Produto product) {
        repository.deleteById(codigo);
        product.setCode(codigo);
        repository.save(product);

        return product;
    }

    public List<Produto> findAll() {
        List<Produto> result = repository.findAll();
        return result;
    }

}
