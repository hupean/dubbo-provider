package com.hupean.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author hupan
 * @description
 * @date 2022/5/16
 */
@Service
public class TestTask {

    @Scheduled(cron = "0 0/1 * * * ?")
    void doTask(){
        System.out.println("*** run provider task success ***");
    }
}
