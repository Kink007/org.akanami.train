package org.akanami.conf;

import org.akanami.service.Impl.StarterServiceImpl;
import org.akanami.service.StarterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableConfigurationProperties(StarterConfig.class)
@ConditionalOnProperty(prefix = "akanami.starter", name = "use", havingValue = "true")
public class StarterConfiguration {
    @Autowired
    StarterConfig startConfig;

    @Bean(name = "demo")
    public StarterService getStarterService() {
        return new StarterServiceImpl(this.startConfig);
    }
}
