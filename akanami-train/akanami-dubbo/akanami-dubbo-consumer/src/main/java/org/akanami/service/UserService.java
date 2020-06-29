package org.akanami.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Reference
    TicketService ticketService;

    public String buy(String name) {
        return name + "购买了" + this.ticketService.getName();
    }
}
