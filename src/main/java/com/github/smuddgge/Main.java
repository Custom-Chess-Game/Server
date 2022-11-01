package com.github.smuddgge;

import com.github.smuddgge.server.Server;

import java.io.IOException;

/**
 * Application pointer
 */
public class Main {

    /**
     * Starting point
     *
     * @param args No arguments required
     */
    public static void main(String[] args) throws IOException {

        // Create a config instance
        Config config = new Config();

        // Start the new server
        Server server = new Server(config.getPort());
        server.setDebugMode(true);
        server.run();
    }
}