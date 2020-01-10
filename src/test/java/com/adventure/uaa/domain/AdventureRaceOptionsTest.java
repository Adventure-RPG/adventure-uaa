package com.adventure.uaa.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.adventure.uaa.web.rest.TestUtil;

public class AdventureRaceOptionsTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(AdventureRaceOptions.class);
        AdventureRaceOptions adventureRaceOptions1 = new AdventureRaceOptions();
        adventureRaceOptions1.setId(1L);
        AdventureRaceOptions adventureRaceOptions2 = new AdventureRaceOptions();
        adventureRaceOptions2.setId(adventureRaceOptions1.getId());
        assertThat(adventureRaceOptions1).isEqualTo(adventureRaceOptions2);
        adventureRaceOptions2.setId(2L);
        assertThat(adventureRaceOptions1).isNotEqualTo(adventureRaceOptions2);
        adventureRaceOptions1.setId(null);
        assertThat(adventureRaceOptions1).isNotEqualTo(adventureRaceOptions2);
    }
}
