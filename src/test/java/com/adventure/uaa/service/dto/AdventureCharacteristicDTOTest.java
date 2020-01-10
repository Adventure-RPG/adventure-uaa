package com.adventure.uaa.service.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.adventure.uaa.web.rest.TestUtil;

public class AdventureCharacteristicDTOTest {

    @Test
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(AdventureCharacteristicDTO.class);
        AdventureCharacteristicDTO adventureCharacteristicDTO1 = new AdventureCharacteristicDTO();
        adventureCharacteristicDTO1.setId(1L);
        AdventureCharacteristicDTO adventureCharacteristicDTO2 = new AdventureCharacteristicDTO();
        assertThat(adventureCharacteristicDTO1).isNotEqualTo(adventureCharacteristicDTO2);
        adventureCharacteristicDTO2.setId(adventureCharacteristicDTO1.getId());
        assertThat(adventureCharacteristicDTO1).isEqualTo(adventureCharacteristicDTO2);
        adventureCharacteristicDTO2.setId(2L);
        assertThat(adventureCharacteristicDTO1).isNotEqualTo(adventureCharacteristicDTO2);
        adventureCharacteristicDTO1.setId(null);
        assertThat(adventureCharacteristicDTO1).isNotEqualTo(adventureCharacteristicDTO2);
    }
}
