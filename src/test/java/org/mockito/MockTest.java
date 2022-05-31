package org.mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(value = Parameterized.class)
public class MockTest {

    public org.mockito.quality.Strictness strictness;

    public MockTest(org.mockito.quality.Strictness strictness) {
        this.strictness = strictness;
    }

    @Test
    public void shouldHaveMatchingEnumInMockStrictnessEnum() {
        final Mock.Strictness mockStrictness = Mock.Strictness.valueOf(this.strictness.name());
        assertThat(mockStrictness.outer()).isEqualTo(strictness);
    }

    @Parameterized.Parameters
    public static  org.mockito.quality.Strictness[] data() {
        return org.mockito.quality.Strictness.values();
    }
}
