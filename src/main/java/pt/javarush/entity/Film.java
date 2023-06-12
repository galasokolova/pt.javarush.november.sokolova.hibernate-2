package pt.javarush.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

@Entity
@Table(schema = "movie", name = "film")
public class Film {
    @Id
    @Column(name = "film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id;

    private String title;

    @Column(columnDefinition = "text")
    @Type(type = "text")
    private String description;

    @Column(name = "release_year", columnDefinition = "year")
    @Convert(converter = YearAttributeConverter.class)
    private Year year;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language language;

    @ManyToOne
    @JoinColumn(name = "original_language_id")
    private Language originalLanguage;

    @Column(name = "rental_duration")
    private Byte rentalDuration;

    @Column(name = "rental_rate")
    private BigDecimal rentalRate;

    private Short length;

    @Column(name = "replacement_cost")
    private BigDecimal replacementCost;

    @Column(columnDefinition = "enum('G', 'PG', PG-13, 'R', 'NC-17')")
    @Convert(converter = RatingConverter.class)
    private Rating rating;

    @Column(name = "special_features", columnDefinition = "set('Trailers', 'Commentaries', 'Deleted Scenes', 'Behind the Scenes')")
    private String specialFeatures;

    @Column(name = "last_update")
    @UpdateTimestamp
    private LocalDateTime lastUpdate;

    @ManyToMany
    @JoinTable(name = "film_actor",
    joinColumns = @JoinColumn(name = "film_id", referencedColumnName = "film_id"),
    inverseJoinColumns = @JoinColumn(name = "actor_id", referencedColumnName = "actor_id"))
    private Set<Actor> actors;

    @ManyToMany
    @JoinTable(name = "film_category",
            joinColumns = @JoinColumn(name = "film_id", referencedColumnName = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id", referencedColumnName = "category_id"))
    private Set<Category> categories;

    public Short getId() {
        return id;
    }

    public Film setId(Short id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Film setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Film setDescription(String description) {
        this.description = description;
        return this;
    }

    public Year getYear() {
        return year;
    }

    public Film setYear(Year year) {
        this.year = year;
        return this;
    }

    public Language getLanguage() {
        return language;
    }

    public Film setLanguage(Language language) {
        this.language = language;
        return this;
    }

    public Language getOriginalLanguage() {
        return originalLanguage;
    }

    public Film setOriginalLanguage(Language originalLanguage) {
        this.originalLanguage = originalLanguage;
        return this;
    }

    public Byte getRentalDuration() {
        return rentalDuration;
    }

    public Film setRentalDuration(Byte rentalDuration) {
        this.rentalDuration = rentalDuration;
        return this;
    }

    public BigDecimal getRentalRate() {
        return rentalRate;
    }

    public Film setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
        return this;
    }

    public Short getLength() {
        return length;
    }

    public Film setLength(Short length) {
        this.length = length;
        return this;
    }

    public BigDecimal getReplacementCost() {
        return replacementCost;
    }

    public Film setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
        return this;
    }

    public Rating getRating() {
        return rating;
    }

    public Film setRating(Rating rating) {
        this.rating = rating;
        return this;
    }

    public Set<SpecialFeature> getSpecialFeatures() {
        if (isNull(specialFeatures) || specialFeatures.isEmpty()){
            return null;
        }

        Set<SpecialFeature> result = new HashSet<>();

        String[] features = specialFeatures.split(",");
        for (String feature : features) {
            result.add(SpecialFeature.getFeatureByValue(feature));
        }
        result.remove(null);
        return result;
    }

    public void setSpecialFeatures(Set<SpecialFeature> features) {
        if (isNull(features)){
            specialFeatures = null;
        }else {
            specialFeatures = features.stream().map(SpecialFeature::getValue).collect(Collectors.joining(","));
        }
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public Film setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }

    public Set<Actor> getActors() {
        return actors;
    }

    public Film setActors(Set<Actor> actors) {
        this.actors = actors;
        return this;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public Film setCategories(Set<Category> categories) {
        this.categories = categories;
        return this;
    }
}
