package com.adventure.uaa.service.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.adventure.uaa.web.rest.TestUtil;

public class AdventureScriptDTOTest {

    @Test
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(AdventureScriptDTO.class);
        AdventureScriptDTO adventureScriptDTO1 = new AdventureScriptDTO();
        adventureScriptDTO1.setId(1L);
        AdventureScriptDTO adventureScriptDTO2 = new AdventureScriptDTO();
        assertThat(adventureScriptDTO1).isNotEqualTo(adventureScriptDTO2);
        adventureScriptDTO2.setId(adventureScriptDTO1.getId());
        assertThat(adventureScriptDTO1).isEqualTo(adventureScriptDTO2);
        adventureScriptDTO2.setId(2L);
        assertThat(adventureScriptDTO1).isNotEqualTo(adventureScriptDTO2);
        adventureScriptDTO1.setId(null);
        assertThat(adventureScriptDTO1).isNotEqualTo(adventureScriptDTO2);
    }
}
