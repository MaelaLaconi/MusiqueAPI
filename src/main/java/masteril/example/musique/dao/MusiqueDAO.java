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
        Musique m1 = new Musique();
        m1.setChanteur("Violent Femmes");
        m1.setName("Add it up");
        m1.setId(1);
        savedMusique = m1; // save a default musique
        musiques = new ArrayList<>();
        musiques.add(m1);

        m1 = new Musique();
        m1.setChanteur("Saltriver");
        m1.setName("Anonymous");
        m1.setId(2);
        musiques.add(m1);

        m1 = new Musique();
        m1.setChanteur("MPL");
        m1.setName("Cendres");
        m1.setId(3);
        musiques.add(m1);

        m1 = new Musique();
        m1.setChanteur("Kings of Leon");
        m1.setName("Crawl");
        m1.setId(4);
        musiques.add(m1);

        m1 = new Musique();
        m1.setChanteur("The Lumineers");
        m1.setName("Dead Sea");
        m1.setId(5);
        musiques.add(m1);

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
