package org.akanami.mapstruct.model.mapper;

import org.akanami.mapstruct.model.simple.Simple;
import org.akanami.mapstruct.model.simple.SimpleDto;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleMapperTest {
    @Autowired
    SimpleMapper mapper;

    @Test
    public void getSimpleMapper() {
        Assert.assertNotNull(this.mapper);
    }

    @Test
    public void mapSimpleDto() {
        Simple entity = new Simple();
        entity.setId(1);
        entity.setName("admin");
        entity.setBirth(new Date());
        entity.setPassword("password");

        SimpleDto dto = this.mapper.map(entity);

        Assert.assertEquals(entity.getId(), dto.getId());
        Assert.assertEquals(entity.getName(), dto.getName());
        Assert.assertEquals(entity.getBirth(), dto.getBirth());
    }
}