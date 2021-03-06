package com.adventure.uaa.domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.springframework.data.elasticsearch.annotations.FieldType;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A AdventureRaceOptions.
 */
@Entity
@Table(name = "adventure_race_options")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@org.springframework.data.elasticsearch.annotations.Document(indexName = "adventureraceoptions")
public class AdventureRaceOptions implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @org.springframework.data.elasticsearch.annotations.Field(type = FieldType.Keyword)
    private Long id;

    @NotNull
    @Min(value = 1)
    @Column(name = "height", nullable = false)
    private Integer height;

    @NotNull
    @Min(value = 1)
    @Column(name = "weight", nullable = false)
    private Integer weight;

    @OneToMany(mappedBy = "adventureRaceOptions")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<AdventureModelOptions> adventureModelOptions = new HashSet<>();

    @ManyToMany
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    @JoinTable(name = "adventure_race_options_adventure_model",
               joinColumns = @JoinColumn(name = "adventure_race_options_id", referencedColumnName = "id"),
               inverseJoinColumns = @JoinColumn(name = "adventure_model_id", referencedColumnName = "id"))
    private Set<AdventureModel> adventureModels = new HashSet<>();

    @ManyToOne
    @JsonIgnoreProperties("adventureRaceOptions")
    private AdventureRace adventureRace;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getHeight() {
        return height;
    }

    public AdventureRaceOptions height(Integer height) {
        this.height = height;
        return this;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public AdventureRaceOptions weight(Integer weight) {
        this.weight = weight;
        return this;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Set<AdventureModelOptions> getAdventureModelOptions() {
        return adventureModelOptions;
    }

    public AdventureRaceOptions adventureModelOptions(Set<AdventureModelOptions> adventureModelOptions) {
        this.adventureModelOptions = adventureModelOptions;
        return this;
    }

    public AdventureRaceOptions addAdventureModelOptions(AdventureModelOptions adventureModelOptions) {
        this.adventureModelOptions.add(adventureModelOptions);
        adventureModelOptions.setAdventureRaceOptions(this);
        return this;
    }

    public AdventureRaceOptions removeAdventureModelOptions(AdventureModelOptions adventureModelOptions) {
        this.adventureModelOptions.remove(adventureModelOptions);
        adventureModelOptions.setAdventureRaceOptions(null);
        return this;
    }

    public void setAdventureModelOptions(Set<AdventureModelOptions> adventureModelOptions) {
        this.adventureModelOptions = adventureModelOptions;
    }

    public Set<AdventureModel> getAdventureModels() {
        return adventureModels;
    }

    public AdventureRaceOptions adventureModels(Set<AdventureModel> adventureModels) {
        this.adventureModels = adventureModels;
        return this;
    }

    public AdventureRaceOptions addAdventureModel(AdventureModel adventureModel) {
        this.adventureModels.add(adventureModel);
        adventureModel.getAdventureRaceOptions().add(this);
        return this;
    }

    public AdventureRaceOptions removeAdventureModel(AdventureModel adventureModel) {
        this.adventureModels.remove(adventureModel);
        adventureModel.getAdventureRaceOptions().remove(this);
        return this;
    }

    public void setAdventureModels(Set<AdventureModel> adventureModels) {
        this.adventureModels = adventureModels;
    }

    public AdventureRace getAdventureRace() {
        return adventureRace;
    }

    public AdventureRaceOptions adventureRace(AdventureRace adventureRace) {
        this.adventureRace = adventureRace;
        return this;
    }

    public void setAdventureRace(AdventureRace adventureRace) {
        this.adventureRace = adventureRace;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdventureRaceOptions)) {
            return false;
        }
        return id != null && id.equals(((AdventureRaceOptions) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "AdventureRaceOptions{" +
            "id=" + getId() +
            ", height=" + getHeight() +
            ", weight=" + getWeight() +
            "}";
    }
}
