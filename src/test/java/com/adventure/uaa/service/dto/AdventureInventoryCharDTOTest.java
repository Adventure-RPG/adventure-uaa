package com.adventure.uaa.service.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.adventure.uaa.web.rest.TestUtil;

public class AdventureInventoryCharDTOTest {

    @Test
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(AdventureInventoryCharDTO.class);
        AdventureInventoryCharDTO adventureInventoryCharDTO1 = new AdventureInventoryCharDTO();
        adventureInventoryCharDTO1.setId(1L);
        AdventureInventoryCharDTO adventureInventoryCharDTO2 = new AdventureInventoryCharDTO();
        assertThat(adventureInventoryCharDTO1).isNotEqualTo(adventureInventoryCharDTO2);
        adventureInventoryCharDTO2.setId(adventureInventoryCharDTO1.getId());
        assertThat(adventureInventoryCharDTO1).isEqualTo(adventureInventoryCharDTO2);
        adventureInventoryCharDTO2.setId(2L);
        assertThat(adventureInventoryCharDTO1).isNotEqualTo(adventureInventoryCharDTO2);
        adventureInventoryCharDTO1.setId(null);
        assertThat(adventureInventoryCharDTO1).isNotEqualTo(adventureInventoryCharDTO2);
    }
}
