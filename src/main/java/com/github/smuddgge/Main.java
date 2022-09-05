package com.github.smuddgge;

import com.github.smuddgge.configuration.Config;

import java.io.IOException;

/**
 * Application pointer
 */
public class Main {

    /**
     * Starting point
     * @param args No arguments required
     */
    public static void main(String[] args) throws IOException {

        Config config = new Config();

        new Server(config.getPort());

    }
}