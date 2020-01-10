package com.adventure.uaa.service.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.adventure.uaa.web.rest.TestUtil;

public class AdventureModelOptionsDTOTest {

    @Test
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(AdventureModelOptionsDTO.class);
        AdventureModelOptionsDTO adventureModelOptionsDTO1 = new AdventureModelOptionsDTO();
        adventureModelOptionsDTO1.setId(1L);
        AdventureModelOptionsDTO adventureModelOptionsDTO2 = new AdventureModelOptionsDTO();
        assertThat(adventureModelOptionsDTO1).isNotEqualTo(adventureModelOptionsDTO2);
        adventureModelOptionsDTO2.setId(adventureModelOptionsDTO1.getId());
        assertThat(adventureModelOptionsDTO1).isEqualTo(adventureModelOptionsDTO2);
        adventureModelOptionsDTO2.setId(2L);
        assertThat(adventureModelOptionsDTO1).isNotEqualTo(adventureModelOptionsDTO2);
        adventureModelOptionsDTO1.setId(null);
        assertThat(adventureModelOptionsDTO1).isNotEqualTo(adventureModelOptionsDTO2);
    }
}
