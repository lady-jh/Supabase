package com.example.BDPostgre.Service;

import com.example.BDPostgre.Model.Profesor;
import com.example.BDPostgre.Repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProfesorService {
    /*@Autowired
    public ProfesorRepository profesorRepository;

    public Profesor guardar(Profesor profesor){
        return profesorRepository.save(profesor);
    }

    public List<Profesor> listar(){
        return profesorRepository.findAll();
    }

    public void eliminar(long codigo){
        profesorRepository.deleteById(codigo);
    }

    public Profesor actualizar(long codigo, Profesor profesor) {
        profesor.setCodigo(codigo);
        return profesorRepository.save(profesor);
    }*/
}
