/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.project.app.services;

import io.vavr.control.Try;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author armena
 */
@Service
@Slf4j
public class KillerService {

    @Autowired
    private RestTemplate restTemplate;

    private List<String> targetList = Arrays.asList("http://localhost:2020/actuator/shutdown", "http://venera:2077/actuator/shutdown",
            "http://localhost:2021/actuator/shutdown", "http://localhost:2022/actuator/shutdown", "http://mars:8585858585/actuator/shutdown");

    @Scheduled(fixedDelay = 8000)
    public void shoot() {

        log.info("Starting WEBFLUX Operation");

        String url = this.getRandomAddress();

        Try<TargetResponse> kill = Try.of(() -> this.restTemplate.postForObject(url, new TargetResponse("shoot"), TargetResponse.class));

        if (kill.isSuccess()) {
            log.info("SUCCESS: Killed microservice with following address: " + url);

        }

        if (!kill.isSuccess()) {
            log.info("FAIL: Could not kill microservice with following address: " + url);
            //log.info(kill.toString());
        }

    }

    public String getRandomAddress() {
        Random r = new Random();

        int randomitem = r.nextInt(targetList.size());
        String randomElement = targetList.get(randomitem);

        return randomElement;

    }

}
