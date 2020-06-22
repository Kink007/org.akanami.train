package org.akanami.mapstruct.mapper;

import org.akanami.mapstruct.model.combination.EntityA;
import org.akanami.mapstruct.model.combination.EntityB;
import org.akanami.mapstruct.model.combination.EntityCombination;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CombinationMapper {
    @Mappings({
        @Mapping(source = "entityA.id", target = "id"),
        @Mapping(source = "entityA.name", target = "name"),
        @Mapping(source = "entityA.birth", target = "birth"),
        @Mapping(source = "entityB.id", target = "deptId"),
        @Mapping(source = "entityB.name", target = "deptName")
    })
    EntityCombination map(EntityA entityA, EntityB entityB);
}
