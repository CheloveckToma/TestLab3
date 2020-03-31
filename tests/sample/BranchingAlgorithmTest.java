package sample;

import org.junit.Test;

import static org.junit.Assert.*;

public class BranchingAlgorithmTest {

    @Test
    public void cos() {
        BranchingAlgorithm branchingAlg = new BranchingAlgorithm(2, 2, 2);
        assertEquals(Math.cos(20), branchingAlg.cos(20), 1);
    }

    @Test
    public void pow() {
        BranchingAlgorithm branchingAlg = new BranchingAlgorithm(2, 2, 2);
        assertEquals(Math.pow(2, 2), branchingAlg.pow(2, 2), 1);
    }

    @Test
    public void exp() {
        BranchingAlgorithm branchingAlg = new BranchingAlgorithm(2, 2, 2);
        assertEquals(Math.exp(20), branchingAlg.exp(20), 1);
    }

    @Test
    public void log() {
        BranchingAlgorithm branchingAlg = new BranchingAlgorithm(2, 2, 2);
        assertEquals(Math.log(20), branchingAlg.log(20), 1);
    }

    @Test
    public void abs() {
        BranchingAlgorithm branchingAlg = new BranchingAlgorithm(2, 2, 2);
        assertEquals(Math.abs(20), branchingAlg.abs(20), 1);
    }

    @Test
    public void tan() {
        BranchingAlgorithm branchingAlg = new BranchingAlgorithm(2, 2, 2);
        assertEquals(Math.tan(20), branchingAlg.tan(20), 1);
    }

    @Test
    public void sqrt() {
        BranchingAlgorithm branchingAlg = new BranchingAlgorithm(2, 2, 2);
        assertEquals(Math.sqrt(25), branchingAlg.sqrt(25), 1);
    }

    @Test
    public void solveCos() {
        BranchingAlgorithm branchingAlg = new BranchingAlgorithm(2, 2, 1);
        assertEquals(0.9701475245727482, branchingAlg.solve(), 1);
    }

    @Test
    public void solveSqrt() {
        BranchingAlgorithm branchingAlg = new BranchingAlgorithm(2, 2, 2);
        assertEquals(2.8005079234929857, branchingAlg.solve(), 1);
    }

    @Test
    public void solveExp() {
        BranchingAlgorithm branchingAlg = new BranchingAlgorithm(2, 2, 3);
        assertEquals(8.775350460050541, branchingAlg.solve(), 1);
    }
}


