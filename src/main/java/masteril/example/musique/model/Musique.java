package masteril.example.musique.model;

import org.springframework.context.annotation.Bean;

public class Musique {

    private String name;
    private int id;
    private String chanteur;

    public Musique(int id, String name, String chanteur) {
        this.name = name;
        this.id = id;
        this.chanteur = chanteur;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChanteur() {
        return chanteur;
    }

    public void setChanteur(String chanteur) {
        this.chanteur = chanteur;
    }
}
