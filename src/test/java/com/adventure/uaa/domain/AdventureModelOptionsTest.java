package com.adventure.uaa.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.adventure.uaa.web.rest.TestUtil;

public class AdventureModelOptionsTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(AdventureModelOptions.class);
        AdventureModelOptions adventureModelOptions1 = new AdventureModelOptions();
        adventureModelOptions1.setId(1L);
        AdventureModelOptions adventureModelOptions2 = new AdventureModelOptions();
        adventureModelOptions2.setId(adventureModelOptions1.getId());
        assertThat(adventureModelOptions1).isEqualTo(adventureModelOptions2);
        adventureModelOptions2.setId(2L);
        assertThat(adventureModelOptions1).isNotEqualTo(adventureModelOptions2);
        adventureModelOptions1.setId(null);
        assertThat(adventureModelOptions1).isNotEqualTo(adventureModelOptions2);
    }
}
