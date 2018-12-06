package com.thiago.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.cursomc.domain.Categoria;

//CategoriaRepository é um uma interface que extende o JpaRepository
//Esse JpaRepository contém vários métodos prontos para realizar operações de CRUD
//Sintaxe JpaRepository<O que retorna, Tipo da chave primária>
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
