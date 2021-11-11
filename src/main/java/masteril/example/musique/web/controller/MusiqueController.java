package masteril.example.musique.web.controller;

import masteril.example.musique.dao.IMusiqueDAO;
import masteril.example.musique.model.Musique;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MusiqueController {

    @Autowired
    private IMusiqueDAO dao;

    @GetMapping(value = "/Musiques")
    public List<Musique> getMusiques(){
        return dao.findAll();
    }

    @GetMapping(value = "/Musiques/{id}")
    public Musique getMusiqueById(@PathVariable int id){
        return dao.findById(id);
    }

    @PostMapping(value = "Musiques")
    public void addMusique(@RequestBody Musique musique){
        dao.save(musique);
    }
}
