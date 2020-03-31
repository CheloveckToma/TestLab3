package sample;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinearAlgorithmTest {

    @Test
    public void cos() {
        LinearAlgorithm linearAlg = new LinearAlgorithm(4, 4, 4);
        assertEquals(0.40808206181339196, linearAlg.cos(20), 1);
    }

    @Test
    public void pow() {
        LinearAlgorithm linearAlg = new LinearAlgorithm(4, 4, 4);
        assertEquals(4, linearAlg.pow(2,2), 1);
    }

    @Test
    public void solve() {
        LinearAlgorithm linearAlg = new LinearAlgorithm(4, 4, 4);
        assertEquals(139.1067515514044, linearAlg.solve(), 1);
    }

}