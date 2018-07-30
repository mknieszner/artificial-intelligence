package com.mknieszner.neuralNetworks.backPropagationNetwok;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IrisDataSetTestSuite {

    private BackPropagationNeuralNetwork backPropagationNeuralNetwork;

    @Before
    public void before() {
        backPropagationNeuralNetwork = new BackPropagationNeuralNetwork(4, 6, 3);
    }

    @Test
    public void IrisDataSetTest() {
        float[] testData = new float[]{7.1f, 3.1f, 5.8f, 1.6f};
        float[] expectedResult = new float[]{0f, 0f, 1f};

        train(getTrainingData(), getTrainingResults());

        float[] result = backPropagationNeuralNetwork.run(testData);

        for (int i = 0; i < result.length; i++) {
            assertEquals(expectedResult[i], result[i], 0.2);
        }
    }


    private void train(float[][] trainingData, float[][] trainingResults) {
        for (int iteration = 0; iteration < NeuralNetworkConstants.ITERATIONS; iteration++) {
            for (int i = 0; i < trainingResults.length; i++) {
                backPropagationNeuralNetwork.train(
                        trainingData[i],
                        trainingResults[i],
                        NeuralNetworkConstants.LEARNING_RATE,
                        NeuralNetworkConstants.MOMENTUM
                );
            }
        }
    }

    private float[][] getTrainingData() {
        return new float[][]{
                new float[]{5.1f, 3.5f, 1.4f, 0.2f},
                new float[]{4.9f, 3.0f, 1.4f, 0.2f},
                new float[]{4.7f, 3.2f, 1.3f, 0.2f},
                new float[]{4.6f, 3.1f, 1.5f, 0.2f},
                new float[]{5.0f, 3.6f, 1.4f, 0.2f},
                new float[]{5.4f, 3.9f, 1.7f, 0.4f},
                new float[]{4.6f, 3.4f, 1.4f, 0.3f},
                new float[]{5.0f, 3.4f, 1.5f, 0.2f},
                new float[]{4.4f, 2.9f, 1.4f, 0.2f},
                new float[]{4.9f, 3.1f, 1.5f, 0.1f},
                new float[]{5.4f, 3.7f, 1.5f, 0.2f},
                new float[]{4.8f, 3.4f, 1.6f, 0.2f},
                new float[]{4.8f, 3.0f, 1.4f, 0.1f},
                new float[]{4.3f, 3.0f, 1.1f, 0.1f},
                new float[]{5.8f, 4.0f, 1.2f, 0.2f},
                new float[]{5.7f, 4.4f, 1.5f, 0.4f},
                new float[]{5.4f, 3.9f, 1.3f, 0.4f},
                new float[]{5.1f, 3.5f, 1.4f, 0.3f},
                new float[]{5.7f, 3.8f, 1.7f, 0.3f},
                new float[]{5.1f, 3.8f, 1.5f, 0.3f},
                new float[]{5.4f, 3.4f, 1.7f, 0.2f},
                new float[]{5.1f, 3.7f, 1.5f, 0.4f},
                new float[]{4.6f, 3.6f, 1.0f, 0.2f},
                new float[]{5.1f, 3.3f, 1.7f, 0.5f},
                new float[]{4.8f, 3.4f, 1.9f, 0.2f},
                new float[]{5.0f, 3.0f, 1.6f, 0.2f},
                new float[]{5.0f, 3.4f, 1.6f, 0.4f},
                new float[]{5.2f, 3.5f, 1.5f, 0.2f},
                new float[]{5.2f, 3.4f, 1.4f, 0.2f},
                new float[]{4.7f, 3.2f, 1.6f, 0.2f},
                new float[]{4.8f, 3.1f, 1.6f, 0.2f},
                new float[]{5.4f, 3.4f, 1.5f, 0.4f},
                new float[]{5.2f, 4.1f, 1.5f, 0.1f},
                new float[]{5.5f, 4.2f, 1.4f, 0.2f},
                new float[]{4.9f, 3.1f, 1.5f, 0.1f},
                new float[]{5.0f, 3.2f, 1.2f, 0.2f},
                new float[]{5.5f, 3.5f, 1.3f, 0.2f},
                new float[]{4.9f, 3.1f, 1.5f, 0.1f},
                new float[]{4.4f, 3.0f, 1.3f, 0.2f},
                new float[]{5.1f, 3.4f, 1.5f, 0.2f},
                new float[]{5.0f, 3.5f, 1.3f, 0.3f},
                new float[]{4.5f, 2.3f, 1.3f, 0.3f},
                new float[]{4.4f, 3.2f, 1.3f, 0.2f},
                new float[]{5.0f, 3.5f, 1.6f, 0.6f},
                new float[]{5.1f, 3.8f, 1.9f, 0.4f},
                new float[]{4.8f, 3.0f, 1.4f, 0.3f},
                new float[]{5.1f, 3.8f, 1.6f, 0.2f},
                new float[]{4.6f, 3.2f, 1.4f, 0.2f},
                new float[]{5.3f, 3.7f, 1.5f, 0.2f},
                new float[]{5.0f, 3.3f, 1.4f, 0.2f},
                new float[]{7.0f, 3.2f, 4.7f, 1.4f},
                new float[]{6.4f, 3.2f, 4.5f, 1.5f},
                new float[]{6.9f, 3.1f, 4.9f, 1.5f},
                new float[]{5.5f, 2.3f, 4.0f, 1.3f},
                new float[]{6.5f, 2.8f, 4.6f, 1.5f},
                new float[]{5.7f, 2.8f, 4.5f, 1.3f},
                new float[]{6.3f, 3.3f, 4.7f, 1.6f},
                new float[]{4.9f, 2.4f, 3.3f, 1.0f},
                new float[]{6.6f, 2.9f, 4.6f, 1.3f},
                new float[]{5.2f, 2.7f, 3.9f, 1.4f},
                new float[]{5.0f, 2.0f, 3.5f, 1.0f},
                new float[]{5.9f, 3.0f, 4.2f, 1.5f},
                new float[]{6.0f, 2.2f, 4.0f, 1.0f},
                new float[]{6.1f, 2.9f, 4.7f, 1.4f},
                new float[]{5.6f, 2.9f, 3.6f, 1.3f},
                new float[]{6.7f, 3.1f, 4.4f, 1.4f},
                new float[]{5.6f, 3.0f, 4.5f, 1.5f},
                new float[]{5.8f, 2.7f, 4.1f, 1.0f},
                new float[]{6.2f, 2.2f, 4.5f, 1.5f},
                new float[]{5.6f, 2.5f, 3.9f, 1.1f},
                new float[]{5.9f, 3.2f, 4.8f, 1.8f},
                new float[]{6.1f, 2.8f, 4.0f, 1.3f},
                new float[]{6.3f, 2.5f, 4.9f, 1.5f},
                new float[]{6.1f, 2.8f, 4.7f, 1.2f},
                new float[]{6.4f, 2.9f, 4.3f, 1.3f},
                new float[]{6.6f, 3.0f, 4.4f, 1.4f},
                new float[]{6.8f, 2.8f, 4.8f, 1.4f},
                new float[]{6.7f, 3.0f, 5.0f, 1.7f},
                new float[]{6.0f, 2.9f, 4.5f, 1.5f},
                new float[]{5.7f, 2.6f, 3.5f, 1.0f},
                new float[]{5.5f, 2.4f, 3.8f, 1.1f},
                new float[]{5.5f, 2.4f, 3.7f, 1.0f},
                new float[]{5.8f, 2.7f, 3.9f, 1.2f},
                new float[]{6.0f, 2.7f, 5.1f, 1.6f},
                new float[]{5.4f, 3.0f, 4.5f, 1.5f},
                new float[]{6.0f, 3.4f, 4.5f, 1.6f},
                new float[]{6.7f, 3.1f, 4.7f, 1.5f},
                new float[]{6.3f, 2.3f, 4.4f, 1.3f},
                new float[]{5.6f, 3.0f, 4.1f, 1.3f},
                new float[]{5.5f, 2.5f, 4.0f, 1.3f},
                new float[]{5.5f, 2.6f, 4.4f, 1.2f},
                new float[]{6.1f, 3.0f, 4.6f, 1.4f},
                new float[]{5.8f, 2.6f, 4.0f, 1.2f},
                new float[]{5.0f, 2.3f, 3.3f, 1.0f},
                new float[]{5.6f, 2.7f, 4.2f, 1.3f},
                new float[]{5.7f, 3.0f, 4.2f, 1.2f},
                new float[]{5.7f, 2.9f, 4.2f, 1.3f},
                new float[]{6.2f, 2.9f, 4.3f, 1.3f},
                new float[]{5.1f, 2.5f, 3.0f, 1.1f},
                new float[]{5.7f, 2.8f, 4.1f, 1.3f},
                new float[]{6.3f, 3.3f, 6.0f, 2.5f},
                new float[]{5.8f, 2.7f, 5.1f, 1.9f},
                new float[]{7.1f, 3.0f, 5.9f, 2.1f},
                new float[]{6.3f, 2.9f, 5.6f, 1.8f},
                new float[]{6.5f, 3.0f, 5.8f, 2.2f},
                new float[]{7.6f, 3.0f, 6.6f, 2.1f},
                new float[]{4.9f, 2.5f, 4.5f, 1.7f},
                new float[]{7.3f, 2.9f, 6.3f, 1.8f},
                new float[]{6.7f, 2.5f, 5.8f, 1.8f},
                new float[]{7.2f, 3.6f, 6.1f, 2.5f},
                new float[]{6.5f, 3.2f, 5.1f, 2.0f},
                new float[]{6.4f, 2.7f, 5.3f, 1.9f},
                new float[]{6.8f, 3.0f, 5.5f, 2.1f},
                new float[]{5.7f, 2.5f, 5.0f, 2.0f},
                new float[]{5.8f, 2.8f, 5.1f, 2.4f},
                new float[]{6.4f, 3.2f, 5.3f, 2.3f},
                new float[]{6.5f, 3.0f, 5.5f, 1.8f},
                new float[]{7.7f, 3.8f, 6.7f, 2.2f},
                new float[]{7.7f, 2.6f, 6.9f, 2.3f},
                new float[]{6.0f, 2.2f, 5.0f, 1.5f},
                new float[]{6.9f, 3.2f, 5.7f, 2.3f},
                new float[]{5.6f, 2.8f, 4.9f, 2.0f},
                new float[]{7.7f, 2.8f, 6.7f, 2.0f},
                new float[]{6.3f, 2.7f, 4.9f, 1.8f},
                new float[]{6.7f, 3.3f, 5.7f, 2.1f},
                new float[]{7.2f, 3.2f, 6.0f, 1.8f},
                new float[]{6.2f, 2.8f, 4.8f, 1.8f},
                new float[]{6.1f, 3.0f, 4.9f, 1.8f},
                new float[]{6.4f, 2.8f, 5.6f, 2.1f},
                new float[]{7.2f, 3.0f, 5.8f, 1.6f},
                new float[]{7.4f, 2.8f, 6.1f, 1.9f},
                new float[]{7.9f, 3.8f, 6.4f, 2.0f},
                new float[]{6.4f, 2.8f, 5.6f, 2.2f},
                new float[]{6.3f, 2.8f, 5.1f, 1.5f},
                new float[]{6.1f, 2.6f, 5.6f, 1.4f},
                new float[]{7.7f, 3.0f, 6.1f, 2.3f},
                new float[]{6.3f, 3.4f, 5.6f, 2.4f},
                new float[]{6.4f, 3.1f, 5.5f, 1.8f},
                new float[]{6.0f, 3.0f, 4.8f, 1.8f},
                new float[]{6.9f, 3.1f, 5.4f, 2.1f},
                new float[]{6.7f, 3.1f, 5.6f, 2.4f},
                new float[]{6.9f, 3.1f, 5.1f, 2.3f},
                new float[]{5.8f, 2.7f, 5.1f, 1.9f},
                new float[]{6.8f, 3.2f, 5.9f, 2.3f},
                new float[]{6.7f, 3.3f, 5.7f, 2.5f},
                new float[]{6.7f, 3.0f, 5.2f, 2.3f},
                new float[]{6.3f, 2.5f, 5.0f, 1.9f},
                new float[]{6.5f, 3.0f, 5.2f, 2.0f},
                new float[]{6.2f, 3.4f, 5.4f, 2.3f},
                new float[]{5.9f, 3.0f, 5.1f, 1.8f}
        };
    }

    private float[][] getTrainingResults() {
        return new float[][]{
                new float[]{1f, 0f, 0f},// Iris-setosa
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{1f, 0f, 0f},
                new float[]{0f, 1f, 0f}, // Iris-versicolor
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 1f, 0f},
                new float[]{0f, 0f, 1f}, // Iris-virginica
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f},
                new float[]{0f, 0f, 1f}
        };
    }
}

