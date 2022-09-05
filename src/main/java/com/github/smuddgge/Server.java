package com.github.smuddgge;

import com.github.smuddgge.console.Console;
import com.github.smuddgge.console.ConsoleColour;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Represents a server
 */
public class Server {

    /**
     * Used to initialise the server
     * @param port The socket port
     */
    public Server(int port) throws IOException {
        // Create a server socket
        ServerSocket serverSocket = new ServerSocket(port);

        Console.print(ConsoleColour.GREEN + "Listening for connections on: " + ConsoleColour.WHITE + port);

        while(true) {
            // Wait for new client connection
            Socket client = serverSocket.accept();

            Console.print(ConsoleColour.WHITE + "Client connecting...");

            // Thread the client
            new Thread(new ServerThread(client));
        }
    }
}
