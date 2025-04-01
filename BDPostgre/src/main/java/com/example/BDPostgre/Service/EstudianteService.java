package com.example.BDPostgre.Service;

import com.example.BDPostgre.Model.Estudiante;
import com.example.BDPostgre.Repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {
    /*@Autowired
    public EstudianteRepository estudianteRepository;

    public Estudiante guardar(Estudiante estudiante){
        return estudianteRepository.save(estudiante);
    }

    public List<Estudiante> listar(){
        return estudianteRepository.findAll();
    }

    public void eliminar(long codigo){
        estudianteRepository.deleteById(codigo);
    }

    public Estudiante actualizar(long codigo, Estudiante estudiante) {
        estudiante.setCodigo(codigo);
        return estudianteRepository.save(estudiante);
    }*/
}
