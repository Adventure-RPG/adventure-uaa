package com.adventure.uaa.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.adventure.uaa.web.rest.TestUtil;

public class AdventureModelTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(AdventureModel.class);
        AdventureModel adventureModel1 = new AdventureModel();
        adventureModel1.setId(1L);
        AdventureModel adventureModel2 = new AdventureModel();
        adventureModel2.setId(adventureModel1.getId());
        assertThat(adventureModel1).isEqualTo(adventureModel2);
        adventureModel2.setId(2L);
        assertThat(adventureModel1).isNotEqualTo(adventureModel2);
        adventureModel1.setId(null);
        assertThat(adventureModel1).isNotEqualTo(adventureModel2);
    }
}
