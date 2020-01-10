package com.adventure.uaa.service.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.adventure.uaa.web.rest.TestUtil;

public class AdventureCategoryTypeDTOTest {

    @Test
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(AdventureCategoryTypeDTO.class);
        AdventureCategoryTypeDTO adventureCategoryTypeDTO1 = new AdventureCategoryTypeDTO();
        adventureCategoryTypeDTO1.setId(1L);
        AdventureCategoryTypeDTO adventureCategoryTypeDTO2 = new AdventureCategoryTypeDTO();
        assertThat(adventureCategoryTypeDTO1).isNotEqualTo(adventureCategoryTypeDTO2);
        adventureCategoryTypeDTO2.setId(adventureCategoryTypeDTO1.getId());
        assertThat(adventureCategoryTypeDTO1).isEqualTo(adventureCategoryTypeDTO2);
        adventureCategoryTypeDTO2.setId(2L);
        assertThat(adventureCategoryTypeDTO1).isNotEqualTo(adventureCategoryTypeDTO2);
        adventureCategoryTypeDTO1.setId(null);
        assertThat(adventureCategoryTypeDTO1).isNotEqualTo(adventureCategoryTypeDTO2);
    }
}
