package masteril.example.musique.model;

import org.springframework.context.annotation.Bean;

public class Musique {

    private String name;
    private int id;
    private String chanteur;

    public Musique() {
        this.name = "";
        this.id = 0;
        this.chanteur = "";
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
