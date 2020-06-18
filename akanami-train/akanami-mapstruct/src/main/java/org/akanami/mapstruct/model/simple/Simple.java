package org.akanami.mapstruct.model.simple;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Simple {
    private Integer id;
    private String name;
    private String password;
    private Date birth;
}
