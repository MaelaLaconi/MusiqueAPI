package masteril.example.musique.dao;

import masteril.example.musique.model.Musique;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MusiqueDAO implements IMusiqueDAO{
    private List<Musique> musiques;

    public MusiqueDAO() {
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
        musiques.add(musique);
    }

    @Override
    public Musique saveOrUpdateMusique(Musique musique) {
        int id = musique.getId();
        Musique m = findById(id);

        // if the music exists
        if(m != null){
            m.setName(musique.getName());
            m.setChanteur(musique.getChanteur());

            // save the changes
            musiques.set(musiques.indexOf(findById(id)) , m);

            return m;
        }
        else {
            // if the music doesn't exists we add it
            musiques.add(musique);
            return musique;
        }
    }

    @Override
    public void deleteMusique(int id) {
        musiques.removeIf(m -> m.getId() == (id));
    }
}
