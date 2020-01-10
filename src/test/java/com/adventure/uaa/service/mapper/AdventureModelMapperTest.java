package com.adventure.uaa.service.mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class AdventureModelMapperTest {

    private AdventureModelMapper adventureModelMapper;

    @BeforeEach
    public void setUp() {
        adventureModelMapper = new AdventureModelMapperImpl();
    }

    @Test
    public void testEntityFromId() {
        Long id = 2L;
        assertThat(adventureModelMapper.fromId(id).getId()).isEqualTo(id);
        assertThat(adventureModelMapper.fromId(null)).isNull();
    }
}
