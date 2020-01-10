package com.adventure.uaa.service.mapper;

import com.adventure.uaa.domain.*;
import com.adventure.uaa.service.dto.AdventureInventoryCharDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link AdventureInventoryChar} and its DTO {@link AdventureInventoryCharDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface AdventureInventoryCharMapper extends EntityMapper<AdventureInventoryCharDTO, AdventureInventoryChar> {


    @Mapping(target = "adventureItems", ignore = true)
    @Mapping(target = "removeAdventureItem", ignore = true)
    AdventureInventoryChar toEntity(AdventureInventoryCharDTO adventureInventoryCharDTO);

    default AdventureInventoryChar fromId(Long id) {
        if (id == null) {
            return null;
        }
        AdventureInventoryChar adventureInventoryChar = new AdventureInventoryChar();
        adventureInventoryChar.setId(id);
        return adventureInventoryChar;
    }
}
