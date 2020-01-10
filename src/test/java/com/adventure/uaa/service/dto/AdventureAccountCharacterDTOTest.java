package com.adventure.uaa.service.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.adventure.uaa.web.rest.TestUtil;

public class AdventureAccountCharacterDTOTest {

    @Test
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(AdventureAccountCharacterDTO.class);
        AdventureAccountCharacterDTO adventureAccountCharacterDTO1 = new AdventureAccountCharacterDTO();
        adventureAccountCharacterDTO1.setId(1L);
        AdventureAccountCharacterDTO adventureAccountCharacterDTO2 = new AdventureAccountCharacterDTO();
        assertThat(adventureAccountCharacterDTO1).isNotEqualTo(adventureAccountCharacterDTO2);
        adventureAccountCharacterDTO2.setId(adventureAccountCharacterDTO1.getId());
        assertThat(adventureAccountCharacterDTO1).isEqualTo(adventureAccountCharacterDTO2);
        adventureAccountCharacterDTO2.setId(2L);
        assertThat(adventureAccountCharacterDTO1).isNotEqualTo(adventureAccountCharacterDTO2);
        adventureAccountCharacterDTO1.setId(null);
        assertThat(adventureAccountCharacterDTO1).isNotEqualTo(adventureAccountCharacterDTO2);
    }
}
