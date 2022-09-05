package com.github.smuddgge;

import java.net.Socket;

/**
 * Represents a server thread
 */
public class ServerThread extends Thread {

    /**
     * The client socket
     */
    private final Socket client;

    /**
     * Used to initialise a thread
     * @param client The client socket
     */
    public ServerThread(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        System.out.println("test");
    }
}
