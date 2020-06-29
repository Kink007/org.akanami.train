package org.akanami.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.akanami.service.TicketService;
import org.springframework.stereotype.Component;

@Component
@Service
public class TickServiceImpl implements TicketService {

    public String getName() {
        return "《Hello world!》";
    }
}
