/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kimbe
 */
public class TestScores {

    private double[] scores = { 95.0, 93.7, 94.9, 100.0, 84.4 };
    double total = 0;

    public TestScores(double array[]) throws Exception {
        for (int i = 0; i < array.length; i++) {
            scores = new double[array.length];

            if (array[i] < 0 || array[i] > 100) {
                throw new InvalidTestScore("Test score must be between 0 and 100");

            } else {
                scores[i] = array[i];
                total += array[i];
            }
        }
    }

    public double getAverage() {
        return total / scores.length;
    }
}
