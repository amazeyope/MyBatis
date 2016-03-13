package com.amazeyope.base;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by ningyp on 16/03/13.
 */
@ContextConfiguration(locations = { "/spring.xml","/spring-mybatis.xml" })
public class BaseTest extends AbstractJUnit4SpringContextTests {

    @Before
    public void before()
    {
        System.out.println("before");
    }

    @After
    public void after()
    {
        System.out.println("after");
    }

    @Test
    public void test()
    {
        System.out.println("testing");
    }
}
