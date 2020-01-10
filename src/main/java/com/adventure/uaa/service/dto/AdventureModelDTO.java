package com.adventure.uaa.service.dto;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Lob;

/**
 * A DTO for the {@link com.adventure.uaa.domain.AdventureModel} entity.
 */
public class AdventureModelDTO implements Serializable {

    private Long id;

    private String name;

    @Lob
    private byte[] file;

    private String fileContentType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public String getFileContentType() {
        return fileContentType;
    }

    public void setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AdventureModelDTO adventureModelDTO = (AdventureModelDTO) o;
        if (adventureModelDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), adventureModelDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "AdventureModelDTO{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", file='" + getFile() + "'" +
            "}";
    }
}
