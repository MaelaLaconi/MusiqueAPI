package masteril.example.musique.dao;

import masteril.example.musique.model.Musique;

import java.util.List;

public interface IMusiqueDAO {

    /**
     * get all the music in the db
     * @return list of music
     */
    List<Musique> findAll();

    /**
     * get a music by its id
     * @param id of the music
     * @return a single music
     */
    Musique findById(int id);

    /**
     * add a music to the db
     * @param musique to save
     */
    void save(Musique musique);

    /**
     * update a music if it exists or add it to the db if not
     * @param musique to update
     * @return the updated music
     */
    Musique saveOrUpdateMusique(Musique musique);

    /**
     * delete a music by id
     * @param id of the music
     */
    void deleteMusique(int id);
}
