package io.project.app.resources;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 *
 * @author armena
 */
@RestController
@RequestMapping("/api/v2/money")
@Slf4j
public class MoneyResource {

    @GetMapping("/find/salary")
    @CrossOrigin
    public Mono<ResponseEntity<?>> load() {
        log.info("Try to Fetch salary ");
        return Mono.just(ResponseEntity.ok().body(System.currentTimeMillis()));
    }

}
