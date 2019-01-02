package com.emall.dao;

import com.emall.dataobject.SellerCommentDO;
import com.emall.dataobject.UserDO;
import com.emall.response.CommonReturnType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by kimvra on 2019/1/2
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SellerCommentDOMapperTest {

    @Autowired
    private SellerCommentDOMapper sellerCommentDOMapper;

    @Autowired
    private UserDOMapper userDOMapper;

    @Test
    public void test() {
        UserDO userDO = new UserDO();
        CommonReturnType commonReturnType = CommonReturnType.create("1545893496632827196");
        userDO.setUserId(commonReturnType.getData().toString());
        userDO.setEmail("test.email");
        userDOMapper.updateByPrimaryKeySelective(userDO);
    }
}