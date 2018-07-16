package com.lojavirtual.api.lvbackend.resources;

import javax.validation.Valid;

import com.lojavirtual.api.lvbackend.models.Produto;
import com.lojavirtual.api.lvbackend.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping(value = "/create",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody     
    public Produto create(@RequestBody @Valid Produto produto){
        return pr.save(produto);     
    }

    @PutMapping(value = "/update",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody     
    public Produto update(@RequestBody @Valid Produto produto){
        return pr.save(produto);     
    }

    @DeleteMapping(value = "/delete",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Produto delete(@RequestBody @Valid Produto produto){
        pr.delete(produto);
        return produto;
    }
}