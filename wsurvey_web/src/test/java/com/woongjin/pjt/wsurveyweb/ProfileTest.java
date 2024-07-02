package com.woongjin.pjt.wsurveyweb;

import org.springframework.beans.factory.annotation.Value;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles({"common","common-local","local"})
public class ProfileTest {
    @Value("${common.common.key}")
    private String commonCommonKey;

    @Value("${common.key}")
    private String commonKey;

    @Value("${local.local.key}")
    private String localLocalKey;

    @Value("${local.key}")
    private String localKey;

    @Test
    void profileCallTest() {
        System.out.println("commonCommonKey = " + commonCommonKey);
        System.out.println("commonKey = " + commonKey);
        System.out.println("localLocalKey = " + localLocalKey);
        System.out.println("localKey = " + localKey);
    }
}
