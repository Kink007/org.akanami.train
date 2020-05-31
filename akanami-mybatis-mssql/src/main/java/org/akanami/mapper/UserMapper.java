package org.akanami.mapper;

import org.akanami.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User getById(Long id);

    int updateById(User user);
}
