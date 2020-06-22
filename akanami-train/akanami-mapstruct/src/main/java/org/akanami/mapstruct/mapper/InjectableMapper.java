package org.akanami.mapstruct.mapper;

import org.akanami.mapstruct.components.SelfConverter;
import org.akanami.mapstruct.model.simple.Simple;
import org.akanami.mapstruct.model.simple.SimpleDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class InjectableMapper {

    @Autowired
    SelfConverter converter;

    @Mappings({
            @Mapping(target = "id", expression = "java(converter.change(simple.getId()))")
    })
    public abstract SimpleDto map(Simple simple);
}
