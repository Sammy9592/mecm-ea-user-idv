package com.sl.mecm.service.user.idv.configs;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "mecm.services.cache")
public class CacheConfigs {

    private String host;

    private int timeout;

    public int getTimeout() {
        return timeout;
    }

    public String getHost() {
        return host;
    }
}
