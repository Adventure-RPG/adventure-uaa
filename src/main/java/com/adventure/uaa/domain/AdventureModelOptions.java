package com.adventure.uaa.domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import org.springframework.data.elasticsearch.annotations.FieldType;
import java.io.Serializable;

/**
 * A AdventureModelOptions.
 */
@Entity
@Table(name = "adventure_model_options")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@org.springframework.data.elasticsearch.annotations.Document(indexName = "adventuremodeloptions")
public class AdventureModelOptions implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @org.springframework.data.elasticsearch.annotations.Field(type = FieldType.Keyword)
    private Long id;

    @Column(name = "color")
    private String color;

    @ManyToOne
    @JsonIgnoreProperties("adventureModelOptions")
    private AdventureRaceOptions adventureRaceOptions;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public AdventureModelOptions color(String color) {
        this.color = color;
        return this;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public AdventureRaceOptions getAdventureRaceOptions() {
        return adventureRaceOptions;
    }

    public AdventureModelOptions adventureRaceOptions(AdventureRaceOptions adventureRaceOptions) {
        this.adventureRaceOptions = adventureRaceOptions;
        return this;
    }

    public void setAdventureRaceOptions(AdventureRaceOptions adventureRaceOptions) {
        this.adventureRaceOptions = adventureRaceOptions;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdventureModelOptions)) {
            return false;
        }
        return id != null && id.equals(((AdventureModelOptions) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "AdventureModelOptions{" +
            "id=" + getId() +
            ", color='" + getColor() + "'" +
            "}";
    }
}
