package com.taimei.gos.portal.service;

import io.swagger.models.auth.In;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldServiceTest {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private HelloWorldService helloWorldService;

    @Test
    public void testTransactional() {
//        helloWorldService.testTransactional();
//        logger.trace("trace——————-");￿￿
//        logger.debug("debug-------");
//        logger.info("info-----");
//        logger.warn("warn------");
//        logger.error("error");
//        int A[][] = { { 1, 2, 0 }, { 3, 4, 0 }, { 5, 6, 0 } };
//        System.out.println(A[0]);
        int a = 1001;
        boolean b = this.IsPalindrome(a);
        System.out.println(b);
    }

    public boolean IsPalindrome(int x) {
        // 特殊情况：
        // 如上所述，当 x < 0 时，x 不是回文数。
        // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
        // 则其第一位数字也应该是 0
        // 只有 0 满足这一属性
        String s = String.valueOf(x);
        char[] chars = s.toCharArray();
        for(int i = 0 ; i < chars.length; i++ ) {
            System.out.println(i);
            if(i> chars.length/2 -1) {
                return true;
            }
            int a = chars.length - (i+1);
            System.out.println(i);
            if(chars[i] !=  chars[a]) {
                System.out.println("-------");
                System.out.println(chars[i]);
                System.out.println(chars[a]);
                return false;
            }
        }
        return true;
    }

    public void test() {
        System.out.println("merge");
        System.out.println("merge dev 2");
    }
}
