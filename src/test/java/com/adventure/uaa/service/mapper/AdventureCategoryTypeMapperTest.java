package com.adventure.uaa.service.mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class AdventureCategoryTypeMapperTest {

    private AdventureCategoryTypeMapper adventureCategoryTypeMapper;

    @BeforeEach
    public void setUp() {
        adventureCategoryTypeMapper = new AdventureCategoryTypeMapperImpl();
    }

    @Test
    public void testEntityFromId() {
        Long id = 2L;
        assertThat(adventureCategoryTypeMapper.fromId(id).getId()).isEqualTo(id);
        assertThat(adventureCategoryTypeMapper.fromId(null)).isNull();
    }
}
