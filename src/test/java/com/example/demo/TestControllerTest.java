package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest(TestController.class)
class TestControllerTest {

    /*
     * output:
     * 2019-03-24 10:58:30.634  INFO 7968 --- [           main] com.example.demo.TestControllerTest      : Started TestControllerTest in 3.276 seconds (JVM running for 4.691)
     *
     * output in our real-world application (contains ~ 200 classes):
     * 11:01:51.268 [main] INFO  package.TestControllerTest - Started TestControllerTest in 4.993 seconds (JVM running for 6.709)
     * Application class has only @SpringBootApplication annotation
     */

    @Test
    public void foo() {

    }

}