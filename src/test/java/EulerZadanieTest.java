import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.ConcurrentMap;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class EulerZadanieTest {


    @Test
    public void shouldReturnZeroWhenGiveZero() {
        EulerZadanie ez = new EulerZadanie();
        int n = 0;
        int wynik = ez.fiboEvenSum(n);
        assertThat(wynik, is(0));
    }

    @Test
    public void shouldReturnTwoWhenGiveFour() {
        EulerZadanie ez = new EulerZadanie();
        int n = 4;
        int wynik = ez.fiboEvenSum(n);
        assertThat(wynik, is(2));
    }

    @Test
    public void shouldReturnTenWhenGiveNine() {
        EulerZadanie ez = new EulerZadanie();
        int n = 9;
        int wynik = ez.fiboEvenSum(n);
        assertThat(wynik, is(10));
    }

    //4613732
    @Test
    public void shouldReturnFourtyFourWhenGiveFourtyFour() {
        EulerZadanie ez = new EulerZadanie();
        int n = 44;
        int wynik = ez.fiboEvenSum(n);
        assertThat(wynik, is(44));
    }

    @Test
    public void shouldReturn3900000WhenGive4613732() {
        EulerZadanie ez = new EulerZadanie();
        int n = 3900000;
        int wynik = ez.fiboEvenSum(n);
        assertThat(wynik, is(4613732));
    }
}
