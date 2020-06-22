package org.akanami.service.Impl;

import org.akanami.conf.StarterConfig;
import org.akanami.service.StarterService;
import org.springframework.stereotype.Service;

@Service
public class StarterServiceImpl implements StarterService {
    StarterConfig starterConfig;

    public StarterServiceImpl(StarterConfig starterConfig) {
        this.starterConfig = starterConfig;
    }

    public String getName() {
        return this.starterConfig.getName();
    }

    public String getCode() {
        return this.starterConfig.getCode();
    }
}
