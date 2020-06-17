package org.akanami.modelmapper.User;

import org.akanami.modelmapper.configuration.ModelMapperConfiguration;
import org.akanami.modelmapper.model.simple.Simple;
import org.akanami.modelmapper.model.simple.SimpleDto;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Date;

public class UserMapperTests {

    private ModelMapper modelMapper;

    @Before
    public void init() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ModelMapperConfiguration.class);
        this.modelMapper = context.getBean(ModelMapper.class);
    }

    @Test
    public void mapSimpleDto() {
        Simple entity = new Simple();
        entity.setId(1);
        entity.setName("admin");
        entity.setBirth(new Date());
        entity.setPassword("admin123");

        SimpleDto dto = this.modelMapper.map(entity, SimpleDto.class);

        Assert.assertEquals(entity.getId(), dto.getId());
        Assert.assertEquals(entity.getName(), dto.getName());
        Assert.assertEquals(entity.getBirth(), dto.getBirth());
    }

    @Test
    public void mapSimpleDtoCollection() {
        ArrayList<Simple> entityList = new ArrayList<>();
        entityList.add(new Simple(1, "admin1", "password1", new Date()));
        entityList.add(new Simple(2, "admin2", "password2", new Date()));
        entityList.add(new Simple(3, "admin3", "password3", new Date()));
        entityList.add(new Simple(4, "admin4", "password4", new Date()));

        ArrayList<SimpleDto> dtoList = this.modelMapper.map(entityList, new TypeToken<ArrayList<SimpleDto>>() {}.getType());

        Assert.assertNotNull(dtoList);
        Assert.assertEquals(4, dtoList.size());

        for(int i = 0; i < entityList.size(); i++) {
            Simple source = entityList.get(i);
            SimpleDto target = dtoList.get(i);

            Assert.assertEquals(source.getId(), target.getId());
            Assert.assertEquals(source.getName(), target.getName());
            Assert.assertEquals(source.getBirth(), target.getBirth());
        }
    }
}
