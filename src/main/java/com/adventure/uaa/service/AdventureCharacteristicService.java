package com.adventure.uaa.service;

import com.adventure.uaa.service.dto.AdventureCharacteristicDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing {@link com.adventure.uaa.domain.AdventureCharacteristic}.
 */
public interface AdventureCharacteristicService {

    /**
     * Save a adventureCharacteristic.
     *
     * @param adventureCharacteristicDTO the entity to save.
     * @return the persisted entity.
     */
    AdventureCharacteristicDTO save(AdventureCharacteristicDTO adventureCharacteristicDTO);

    /**
     * Get all the adventureCharacteristics.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<AdventureCharacteristicDTO> findAll(Pageable pageable);


    /**
     * Get the "id" adventureCharacteristic.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<AdventureCharacteristicDTO> findOne(Long id);

    /**
     * Delete the "id" adventureCharacteristic.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);

    /**
     * Search for the adventureCharacteristic corresponding to the query.
     *
     * @param query the query of the search.
     * 
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<AdventureCharacteristicDTO> search(String query, Pageable pageable);
}
