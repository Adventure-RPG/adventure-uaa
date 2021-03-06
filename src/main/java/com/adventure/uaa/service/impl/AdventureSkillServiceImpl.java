package com.adventure.uaa.service.impl;

import com.adventure.uaa.service.AdventureSkillService;
import com.adventure.uaa.domain.AdventureSkill;
import com.adventure.uaa.repository.AdventureSkillRepository;
import com.adventure.uaa.repository.search.AdventureSkillSearchRepository;
import com.adventure.uaa.service.dto.AdventureSkillDTO;
import com.adventure.uaa.service.mapper.AdventureSkillMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.elasticsearch.index.query.QueryBuilders.*;

/**
 * Service Implementation for managing {@link AdventureSkill}.
 */
@Service
@Transactional
public class AdventureSkillServiceImpl implements AdventureSkillService {

    private final Logger log = LoggerFactory.getLogger(AdventureSkillServiceImpl.class);

    private final AdventureSkillRepository adventureSkillRepository;

    private final AdventureSkillMapper adventureSkillMapper;

    private final AdventureSkillSearchRepository adventureSkillSearchRepository;

    public AdventureSkillServiceImpl(AdventureSkillRepository adventureSkillRepository, AdventureSkillMapper adventureSkillMapper, AdventureSkillSearchRepository adventureSkillSearchRepository) {
        this.adventureSkillRepository = adventureSkillRepository;
        this.adventureSkillMapper = adventureSkillMapper;
        this.adventureSkillSearchRepository = adventureSkillSearchRepository;
    }

    /**
     * Save a adventureSkill.
     *
     * @param adventureSkillDTO the entity to save.
     * @return the persisted entity.
     */
    @Override
    public AdventureSkillDTO save(AdventureSkillDTO adventureSkillDTO) {
        log.debug("Request to save AdventureSkill : {}", adventureSkillDTO);
        AdventureSkill adventureSkill = adventureSkillMapper.toEntity(adventureSkillDTO);
        adventureSkill = adventureSkillRepository.save(adventureSkill);
        AdventureSkillDTO result = adventureSkillMapper.toDto(adventureSkill);
        adventureSkillSearchRepository.save(adventureSkill);
        return result;
    }

    /**
     * Get all the adventureSkills.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    @Override
    @Transactional(readOnly = true)
    public Page<AdventureSkillDTO> findAll(Pageable pageable) {
        log.debug("Request to get all AdventureSkills");
        return adventureSkillRepository.findAll(pageable)
            .map(adventureSkillMapper::toDto);
    }


    /**
     * Get one adventureSkill by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<AdventureSkillDTO> findOne(Long id) {
        log.debug("Request to get AdventureSkill : {}", id);
        return adventureSkillRepository.findById(id)
            .map(adventureSkillMapper::toDto);
    }

    /**
     * Delete the adventureSkill by id.
     *
     * @param id the id of the entity.
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete AdventureSkill : {}", id);
        adventureSkillRepository.deleteById(id);
        adventureSkillSearchRepository.deleteById(id);
    }

    /**
     * Search for the adventureSkill corresponding to the query.
     *
     * @param query the query of the search.
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    @Override
    @Transactional(readOnly = true)
    public Page<AdventureSkillDTO> search(String query, Pageable pageable) {
        log.debug("Request to search for a page of AdventureSkills for query {}", query);
        return adventureSkillSearchRepository.search(queryStringQuery(query), pageable)
            .map(adventureSkillMapper::toDto);
    }
}
