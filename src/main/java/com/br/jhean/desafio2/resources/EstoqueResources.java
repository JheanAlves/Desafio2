package com.br.jhean.desafio2.resources;

import com.br.jhean.desafio2.entities.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.br.jhean.desafio2.service.EstoqueService;

import java.util.List;
@RestController
@RequestMapping("/Desafio2")
public class EstoqueResources {
    @Autowired
    private EstoqueService service;

        @GetMapping("/findAll")
        public List<Produto> findAll() {

            return service.findAll();
        }

        @PostMapping("/adicionarProduto")
        public Produto adicionarProduto(@RequestBody Produto product){
            return service.addProduct(product);
        }

        @DeleteMapping("/removeProduct/{code}")
        @ResponseStatus(HttpStatus.NO_CONTENT)
        public void removerProduto (@PathVariable("code") Long code){
            service.removeProduct(code);
        }

        @PatchMapping ("/editarProduto/{code}")
        public Produto editarProduto (@PathVariable("code") Long code, @RequestBody Produto product){
            return service.editProduct(code, product);
        }

}