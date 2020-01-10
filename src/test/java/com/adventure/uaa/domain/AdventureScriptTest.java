package com.adventure.uaa.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.adventure.uaa.web.rest.TestUtil;

public class AdventureScriptTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(AdventureScript.class);
        AdventureScript adventureScript1 = new AdventureScript();
        adventureScript1.setId(1L);
        AdventureScript adventureScript2 = new AdventureScript();
        adventureScript2.setId(adventureScript1.getId());
        assertThat(adventureScript1).isEqualTo(adventureScript2);
        adventureScript2.setId(2L);
        assertThat(adventureScript1).isNotEqualTo(adventureScript2);
        adventureScript1.setId(null);
        assertThat(adventureScript1).isNotEqualTo(adventureScript2);
    }
}
