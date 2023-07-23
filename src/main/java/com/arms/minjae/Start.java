package com.arms.minjae;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Start {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public Start() {
        System.out.println("생성자 실행");
    }

    public void start() {
        logger.info("hello");
    }

    public static void main(String[] args) {

        Start start = new Start();

        start.start();
    }
}
