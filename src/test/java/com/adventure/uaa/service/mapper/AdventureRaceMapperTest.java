package com.adventure.uaa.service.mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class AdventureRaceMapperTest {

    private AdventureRaceMapper adventureRaceMapper;

    @BeforeEach
    public void setUp() {
        adventureRaceMapper = new AdventureRaceMapperImpl();
    }

    @Test
    public void testEntityFromId() {
        Long id = 2L;
        assertThat(adventureRaceMapper.fromId(id).getId()).isEqualTo(id);
        assertThat(adventureRaceMapper.fromId(null)).isNull();
    }
}
