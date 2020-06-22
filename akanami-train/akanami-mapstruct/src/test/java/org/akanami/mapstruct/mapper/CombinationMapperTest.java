package org.akanami.mapstruct.mapper;

import org.akanami.mapstruct.model.combination.EntityA;
import org.akanami.mapstruct.model.combination.EntityB;
import org.akanami.mapstruct.model.combination.EntityCombination;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CombinationMapperTest {
    @Autowired
    CombinationMapper mapper;

    @Test
    public void getCombination() {
        EntityA a = new EntityA();
        a.setId(1);
        a.setName("admin");
        a.setBirth(new Date());

        EntityB b = new EntityB();
        b.setId(2);
        b.setName("dept");

        EntityCombination dto = this.mapper.map(a, b);

        Assert.assertEquals(a.getId(), dto.getId());
        Assert.assertEquals(a.getName(), dto.getName());
        Assert.assertEquals(a.getBirth(), dto.getBirth());

        Assert.assertEquals(b.getId(), dto.getDeptId());
        Assert.assertEquals(b.getName(), dto.getDeptName());
    }
}