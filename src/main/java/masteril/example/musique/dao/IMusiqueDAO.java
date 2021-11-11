package masteril.example.musique.dao;

import masteril.example.musique.model.Musique;

import java.util.List;

public interface IMusiqueDAO {

    List<Musique> findAll();
    Musique findById(int id);
    void save(Musique musique);
}
