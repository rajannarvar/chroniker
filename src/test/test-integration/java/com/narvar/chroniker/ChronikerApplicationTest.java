package com.narvar.chroniker;


import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ChronikerApplication.class)
@Category(IntegrationTest.class)
public class ChronikerApplicationTest {

    @Test
    public void contextLoads() {
        //Tests if application starts up
    }
}