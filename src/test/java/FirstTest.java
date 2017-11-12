import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstTest {
    @Test
    public void failingTest() throws Exception {
        assertThat("actual").isEqualTo("expected");
    }
}
