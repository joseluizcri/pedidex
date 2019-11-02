package br.com.joseluiz.pedidex.services;

import br.com.joseluiz.pedidex.models.Categoria;
import br.com.joseluiz.pedidex.repositories.CategoriaRepository;
import br.com.joseluiz.pedidex.services.exeptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public List<Categoria> findAll() {
        return repository.findAll();
    }

    public Categoria findOne(Long id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado. Id: " + id + ", tipo: " + Categoria.class.getName()
        ));
    }
}
