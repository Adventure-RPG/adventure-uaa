package com.adventure.uaa.service;

import com.adventure.uaa.service.dto.AdventureFractionDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing {@link com.adventure.uaa.domain.AdventureFraction}.
 */
public interface AdventureFractionService {

    /**
     * Save a adventureFraction.
     *
     * @param adventureFractionDTO the entity to save.
     * @return the persisted entity.
     */
    AdventureFractionDTO save(AdventureFractionDTO adventureFractionDTO);

    /**
     * Get all the adventureFractions.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<AdventureFractionDTO> findAll(Pageable pageable);


    /**
     * Get the "id" adventureFraction.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<AdventureFractionDTO> findOne(Long id);

    /**
     * Delete the "id" adventureFraction.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);

    /**
     * Search for the adventureFraction corresponding to the query.
     *
     * @param query the query of the search.
     * 
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<AdventureFractionDTO> search(String query, Pageable pageable);
}
