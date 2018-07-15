package com.lojavirtual.api.lvbackend.repository;

import com.lojavirtual.api.lvbackend.models.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String>{
    
}