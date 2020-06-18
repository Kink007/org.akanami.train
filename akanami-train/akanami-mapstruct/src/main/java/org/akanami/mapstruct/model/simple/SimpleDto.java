package org.akanami.mapstruct.model.simple;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SimpleDto {
    private Integer id;
    private String name;
    private Date birth;
    private String loginname;
}
