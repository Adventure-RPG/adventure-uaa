package com.adventure.uaa.service.mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class AdventureAccountCharacterMapperTest {

    private AdventureAccountCharacterMapper adventureAccountCharacterMapper;

    @BeforeEach
    public void setUp() {
        adventureAccountCharacterMapper = new AdventureAccountCharacterMapperImpl();
    }

    @Test
    public void testEntityFromId() {
        Long id = 2L;
        assertThat(adventureAccountCharacterMapper.fromId(id).getId()).isEqualTo(id);
        assertThat(adventureAccountCharacterMapper.fromId(null)).isNull();
    }
}
