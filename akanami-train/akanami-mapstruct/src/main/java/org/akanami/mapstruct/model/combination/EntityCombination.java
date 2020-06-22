package org.akanami.mapstruct.model.combination;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntityCombination {
    private Integer id;
    private String name;
    private Date birth;

    private Integer deptId;
    private String deptName;
}
