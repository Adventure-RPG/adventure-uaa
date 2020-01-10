package com.adventure.uaa.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.adventure.uaa.web.rest.TestUtil;

public class AdventureRaceTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(AdventureRace.class);
        AdventureRace adventureRace1 = new AdventureRace();
        adventureRace1.setId(1L);
        AdventureRace adventureRace2 = new AdventureRace();
        adventureRace2.setId(adventureRace1.getId());
        assertThat(adventureRace1).isEqualTo(adventureRace2);
        adventureRace2.setId(2L);
        assertThat(adventureRace1).isNotEqualTo(adventureRace2);
        adventureRace1.setId(null);
        assertThat(adventureRace1).isNotEqualTo(adventureRace2);
    }
}
