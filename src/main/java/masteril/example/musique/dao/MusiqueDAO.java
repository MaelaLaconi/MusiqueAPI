package masteril.example.musique.dao;

import masteril.example.musique.model.Musique;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MusiqueDAO implements IMusiqueDAO{
    private List<Musique> musiques;
    private Musique savedMusique;

    public MusiqueDAO() {
        savedMusique = new Musique(1, "Add it up", "Violent Femmes");
        musiques = new ArrayList<>();
        musiques.add(new Musique(1, "Add it up", "Violent Femmes"));
        musiques.add(new Musique(2, "Anonymous", "Saltriver"));
        musiques.add(new Musique(3, "Cendres", "MPL"));
        musiques.add(new Musique(4, "Crawl", "Kings of Leon"));
        musiques.add(new Musique(5, "Dead Sea", "The Lumineers"));

    }

    @Override
    public List<Musique> findAll() {
        return musiques;
    }

    @Override
    public Musique findById(int id) {
        for(Musique m : musiques){
            if (m.getId() == id){
                return m;
            }
        }
        return null;
    }

    @Override
    public void save(Musique musique) {
        savedMusique = musique;
    }
}
