package com.adventure.uaa.service.mapper;

import com.adventure.uaa.domain.*;
import com.adventure.uaa.service.dto.AdventureModelOptionsDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link AdventureModelOptions} and its DTO {@link AdventureModelOptionsDTO}.
 */
@Mapper(componentModel = "spring", uses = {AdventureRaceOptionsMapper.class})
public interface AdventureModelOptionsMapper extends EntityMapper<AdventureModelOptionsDTO, AdventureModelOptions> {

    @Mapping(source = "adventureRaceOptions.id", target = "adventureRaceOptionsId")
    AdventureModelOptionsDTO toDto(AdventureModelOptions adventureModelOptions);

    @Mapping(source = "adventureRaceOptionsId", target = "adventureRaceOptions")
    AdventureModelOptions toEntity(AdventureModelOptionsDTO adventureModelOptionsDTO);

    default AdventureModelOptions fromId(Long id) {
        if (id == null) {
            return null;
        }
        AdventureModelOptions adventureModelOptions = new AdventureModelOptions();
        adventureModelOptions.setId(id);
        return adventureModelOptions;
    }
}
