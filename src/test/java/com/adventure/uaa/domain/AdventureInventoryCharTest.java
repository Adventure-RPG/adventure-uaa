package com.adventure.uaa.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.adventure.uaa.web.rest.TestUtil;

public class AdventureInventoryCharTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(AdventureInventoryChar.class);
        AdventureInventoryChar adventureInventoryChar1 = new AdventureInventoryChar();
        adventureInventoryChar1.setId(1L);
        AdventureInventoryChar adventureInventoryChar2 = new AdventureInventoryChar();
        adventureInventoryChar2.setId(adventureInventoryChar1.getId());
        assertThat(adventureInventoryChar1).isEqualTo(adventureInventoryChar2);
        adventureInventoryChar2.setId(2L);
        assertThat(adventureInventoryChar1).isNotEqualTo(adventureInventoryChar2);
        adventureInventoryChar1.setId(null);
        assertThat(adventureInventoryChar1).isNotEqualTo(adventureInventoryChar2);
    }
}
