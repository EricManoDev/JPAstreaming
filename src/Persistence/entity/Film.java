/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author Formation
 */
@Entity
public class Film implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToMany(mappedBy = "film")
    List<Lien> liens = new ArrayList<>();

    @JoinTable(name = "GENRE_FILM")
    @ManyToMany
    List<Genre> genres = new ArrayList<>();

    @JoinTable(name = "PAYS_FILM")
    @ManyToMany
    List<Pays> pays = new ArrayList<>();

  
      @ManyToMany(mappedBy = "acteursFilms")
    private List<Personne> ActeursFilms = new ArrayList<>();
    
  @ManyToMany(mappedBy = "realisateursFilms")
    private List<Personne> RealisateursFilms = new ArrayList<>();


  
  
  
  
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Film)) {
            return false;
        }
        Film other = (Film) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persistence.entity.Film[ id=" + id + " ]";
    }

}
