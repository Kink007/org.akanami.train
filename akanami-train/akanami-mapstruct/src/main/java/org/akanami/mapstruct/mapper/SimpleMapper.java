package org.akanami.mapstruct.mapper;

import org.akanami.mapstruct.model.simple.Simple;
import org.akanami.mapstruct.model.simple.SimpleDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SimpleMapper {
    @Mapping(source = "name", target = "loginname") //如果Dto有name 还是会自动映射name  并且额外再映射loginname
    SimpleDto map(Simple simple);
}
