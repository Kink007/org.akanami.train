package org.akanami.mapstruct.model.mapper;

import org.akanami.mapstruct.model.simple.Simple;
import org.akanami.mapstruct.model.simple.SimpleDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SimpleMapper {
    SimpleDto map(Simple simple);
}
