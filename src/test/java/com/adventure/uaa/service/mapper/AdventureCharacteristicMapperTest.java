package com.adventure.uaa.service.mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class AdventureCharacteristicMapperTest {

    private AdventureCharacteristicMapper adventureCharacteristicMapper;

    @BeforeEach
    public void setUp() {
        adventureCharacteristicMapper = new AdventureCharacteristicMapperImpl();
    }

    @Test
    public void testEntityFromId() {
        Long id = 2L;
        assertThat(adventureCharacteristicMapper.fromId(id).getId()).isEqualTo(id);
        assertThat(adventureCharacteristicMapper.fromId(null)).isNull();
    }
}
