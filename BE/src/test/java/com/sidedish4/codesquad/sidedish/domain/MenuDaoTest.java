package com.sidedish4.codesquad.sidedish.domain;

import com.sidedish4.codesquad.sidedish.service.SideDishService;
import com.sidedish4.codesquad.sidedish.web.dto.ItemResponseDto;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MenuDaoTest {

    @LocalServerPort
    private int port;

    @Autowired
    private SideDishService sideDishService;

    private Logger logger = LoggerFactory.getLogger(MenuDaoTest.class);

    @Before
    public void setUp() {
        sideDishService.saveItem("main","HBDEF" , "든든한 반찬");
    }

    @Test
    public void findItemByIdTest() {

        // given

        // when
        ItemResponseDto itemResponseDto = sideDishService.findItemById(1L);

        // then
        assertThat(itemResponseDto.getDetail_hash()).isEqualTo("1");
    }
}
