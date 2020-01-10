package com.adventure.uaa.domain;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import org.springframework.data.elasticsearch.annotations.FieldType;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A AdventureModel.
 */
@Entity
@Table(name = "adventure_model")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@org.springframework.data.elasticsearch.annotations.Document(indexName = "adventuremodel")
public class AdventureModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @org.springframework.data.elasticsearch.annotations.Field(type = FieldType.Keyword)
    private Long id;

    @Column(name = "name")
    private String name;

    @Lob
    @Column(name = "file")
    private byte[] file;

    @Column(name = "file_content_type")
    private String fileContentType;

    @OneToMany(mappedBy = "adventureModel")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<AdventureCategoryType> adventureCategoryTypes = new HashSet<>();

    @ManyToMany(mappedBy = "adventureModels")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    @JsonIgnore
    private Set<AdventureRaceOptions> adventureRaceOptions = new HashSet<>();

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

    public AdventureModel name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getFile() {
        return file;
    }

    public AdventureModel file(byte[] file) {
        this.file = file;
        return this;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public String getFileContentType() {
        return fileContentType;
    }

    public AdventureModel fileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
        return this;
    }

    public void setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
    }

    public Set<AdventureCategoryType> getAdventureCategoryTypes() {
        return adventureCategoryTypes;
    }

    public AdventureModel adventureCategoryTypes(Set<AdventureCategoryType> adventureCategoryTypes) {
        this.adventureCategoryTypes = adventureCategoryTypes;
        return this;
    }

    public AdventureModel addAdventureCategoryType(AdventureCategoryType adventureCategoryType) {
        this.adventureCategoryTypes.add(adventureCategoryType);
        adventureCategoryType.setAdventureModel(this);
        return this;
    }

    public AdventureModel removeAdventureCategoryType(AdventureCategoryType adventureCategoryType) {
        this.adventureCategoryTypes.remove(adventureCategoryType);
        adventureCategoryType.setAdventureModel(null);
        return this;
    }

    public void setAdventureCategoryTypes(Set<AdventureCategoryType> adventureCategoryTypes) {
        this.adventureCategoryTypes = adventureCategoryTypes;
    }

    public Set<AdventureRaceOptions> getAdventureRaceOptions() {
        return adventureRaceOptions;
    }

    public AdventureModel adventureRaceOptions(Set<AdventureRaceOptions> adventureRaceOptions) {
        this.adventureRaceOptions = adventureRaceOptions;
        return this;
    }

    public AdventureModel addAdventureRaceOptions(AdventureRaceOptions adventureRaceOptions) {
        this.adventureRaceOptions.add(adventureRaceOptions);
        adventureRaceOptions.getAdventureModels().add(this);
        return this;
    }

    public AdventureModel removeAdventureRaceOptions(AdventureRaceOptions adventureRaceOptions) {
        this.adventureRaceOptions.remove(adventureRaceOptions);
        adventureRaceOptions.getAdventureModels().remove(this);
        return this;
    }

    public void setAdventureRaceOptions(Set<AdventureRaceOptions> adventureRaceOptions) {
        this.adventureRaceOptions = adventureRaceOptions;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdventureModel)) {
            return false;
        }
        return id != null && id.equals(((AdventureModel) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "AdventureModel{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", file='" + getFile() + "'" +
            ", fileContentType='" + getFileContentType() + "'" +
            "}";
    }
}
