package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService 
{
    //Se declara un método para obtener un arraylist de Objetos categoria
    //Los objetos vienen de la tabla categoria, traer todos los registros   
    
    public List<Categoria> getCategorias(boolean activos);
    
    //Abajo se colocará los metodos pra realizar el CRUD de categorias
}
