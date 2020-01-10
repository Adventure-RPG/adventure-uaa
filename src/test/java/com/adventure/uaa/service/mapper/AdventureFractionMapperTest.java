package com.adventure.uaa.service.mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class AdventureFractionMapperTest {

    private AdventureFractionMapper adventureFractionMapper;

    @BeforeEach
    public void setUp() {
        adventureFractionMapper = new AdventureFractionMapperImpl();
    }

    @Test
    public void testEntityFromId() {
        Long id = 2L;
        assertThat(adventureFractionMapper.fromId(id).getId()).isEqualTo(id);
        assertThat(adventureFractionMapper.fromId(null)).isNull();
    }
}
