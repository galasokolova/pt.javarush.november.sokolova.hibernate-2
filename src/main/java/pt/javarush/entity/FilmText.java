package pt.javarush.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;

@Entity
@Table(schema = "movie", name = "film_text")
public class FilmText {
    @Id
    @Column(name = "film_id")
    private Short id;

    @OneToOne
    @JoinColumn(name = "film_id")
    private Film film;

    private String title;

    @Column(columnDefinition = "text")
    @Type(type = "text")
    private String description;

    public Short getId() {
        return id;
    }

    public FilmText setId(Short id) {
        this.id = id;
        return this;
    }

    public Film getFilm() {
        return film;
    }

    public FilmText setFilm(Film film) {
        this.film = film;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public FilmText setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public FilmText setDescription(String description) {
        this.description = description;
        return this;
    }
}
