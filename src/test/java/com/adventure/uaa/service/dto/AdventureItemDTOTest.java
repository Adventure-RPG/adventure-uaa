package com.adventure.uaa.service.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.adventure.uaa.web.rest.TestUtil;

public class AdventureItemDTOTest {

    @Test
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(AdventureItemDTO.class);
        AdventureItemDTO adventureItemDTO1 = new AdventureItemDTO();
        adventureItemDTO1.setId(1L);
        AdventureItemDTO adventureItemDTO2 = new AdventureItemDTO();
        assertThat(adventureItemDTO1).isNotEqualTo(adventureItemDTO2);
        adventureItemDTO2.setId(adventureItemDTO1.getId());
        assertThat(adventureItemDTO1).isEqualTo(adventureItemDTO2);
        adventureItemDTO2.setId(2L);
        assertThat(adventureItemDTO1).isNotEqualTo(adventureItemDTO2);
        adventureItemDTO1.setId(null);
        assertThat(adventureItemDTO1).isNotEqualTo(adventureItemDTO2);
    }
}
