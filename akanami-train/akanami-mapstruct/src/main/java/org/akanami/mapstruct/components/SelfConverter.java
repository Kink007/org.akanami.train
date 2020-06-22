package org.akanami.mapstruct.components;

import org.springframework.stereotype.Component;

@Component
public class SelfConverter {
    public Integer change(Integer val) {
        return val ++;
    }
}
