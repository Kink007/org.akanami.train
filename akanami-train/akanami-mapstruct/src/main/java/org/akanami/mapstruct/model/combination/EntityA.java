package org.akanami.mapstruct.model.combination;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntityA {
    private Integer id;
    private String name;
    private String password;
    private Date birth;
}
