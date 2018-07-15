package com.lojavirtual.api.lvbackend.resources;

import javax.validation.Valid;

import com.lojavirtual.api.lvbackend.models.Produto;
import com.lojavirtual.api.lvbackend.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoResource{

    @Autowired
    private ProdutoRepository pr;

    @GetMapping(produces="application/json")
    public @ResponseBody Iterable<Produto> list(){
        Iterable<Produto> list = pr.findAll();
        return list;
    }

    @PostMapping()
    @ResponseBody
    public Produto add(@Valid Produto produto){
        return pr.save(produto);
    }

    @DeleteMapping()
    @ResponseBody
    public Produto delete(Produto produto){
        pr.delete(produto);
        return produto;
    }
}