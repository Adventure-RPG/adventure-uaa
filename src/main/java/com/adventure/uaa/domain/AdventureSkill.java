package com.adventure.uaa.domain;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.springframework.data.elasticsearch.annotations.FieldType;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A AdventureSkill.
 */
@Entity
@Table(name = "adventure_skill")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@org.springframework.data.elasticsearch.annotations.Document(indexName = "adventureskill")
public class AdventureSkill implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @org.springframework.data.elasticsearch.annotations.Field(type = FieldType.Keyword)
    private Long id;

    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "position")
    private Boolean position;

    @OneToMany(mappedBy = "adventureSkill")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<AdventureScript> adventureScripts = new HashSet<>();

    @ManyToMany(mappedBy = "adventureSkills")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    @JsonIgnore
    private Set<AdventureAccountCharacter> adventureAccountCharacters = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public AdventureSkill name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isPosition() {
        return position;
    }

    public AdventureSkill position(Boolean position) {
        this.position = position;
        return this;
    }

    public void setPosition(Boolean position) {
        this.position = position;
    }

    public Set<AdventureScript> getAdventureScripts() {
        return adventureScripts;
    }

    public AdventureSkill adventureScripts(Set<AdventureScript> adventureScripts) {
        this.adventureScripts = adventureScripts;
        return this;
    }

    public AdventureSkill addAdventureScript(AdventureScript adventureScript) {
        this.adventureScripts.add(adventureScript);
        adventureScript.setAdventureSkill(this);
        return this;
    }

    public AdventureSkill removeAdventureScript(AdventureScript adventureScript) {
        this.adventureScripts.remove(adventureScript);
        adventureScript.setAdventureSkill(null);
        return this;
    }

    public void setAdventureScripts(Set<AdventureScript> adventureScripts) {
        this.adventureScripts = adventureScripts;
    }

    public Set<AdventureAccountCharacter> getAdventureAccountCharacters() {
        return adventureAccountCharacters;
    }

    public AdventureSkill adventureAccountCharacters(Set<AdventureAccountCharacter> adventureAccountCharacters) {
        this.adventureAccountCharacters = adventureAccountCharacters;
        return this;
    }

    public AdventureSkill addAdventureAccountCharacter(AdventureAccountCharacter adventureAccountCharacter) {
        this.adventureAccountCharacters.add(adventureAccountCharacter);
        adventureAccountCharacter.getAdventureSkills().add(this);
        return this;
    }

    public AdventureSkill removeAdventureAccountCharacter(AdventureAccountCharacter adventureAccountCharacter) {
        this.adventureAccountCharacters.remove(adventureAccountCharacter);
        adventureAccountCharacter.getAdventureSkills().remove(this);
        return this;
    }

    public void setAdventureAccountCharacters(Set<AdventureAccountCharacter> adventureAccountCharacters) {
        this.adventureAccountCharacters = adventureAccountCharacters;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdventureSkill)) {
            return false;
        }
        return id != null && id.equals(((AdventureSkill) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "AdventureSkill{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", position='" + isPosition() + "'" +
            "}";
    }
}
