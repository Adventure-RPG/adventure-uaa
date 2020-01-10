package com.adventure.uaa.service.mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class AdventureModelOptionsMapperTest {

    private AdventureModelOptionsMapper adventureModelOptionsMapper;

    @BeforeEach
    public void setUp() {
        adventureModelOptionsMapper = new AdventureModelOptionsMapperImpl();
    }

    @Test
    public void testEntityFromId() {
        Long id = 2L;
        assertThat(adventureModelOptionsMapper.fromId(id).getId()).isEqualTo(id);
        assertThat(adventureModelOptionsMapper.fromId(null)).isNull();
    }
}
