package com.github.smuddgge;

import com.github.smuddgge.configuration.YamlConfiguration;

public class Config extends YamlConfiguration {

    /**
     * Used to initialise the config
     */
    public Config() {
        super("config.yml");

        this.load();
    }

    /**
     * Used to get the port from the config
     * @return The server port
     */
    public Integer getPort() {
        return this.get().getInt("port");
    }
}
