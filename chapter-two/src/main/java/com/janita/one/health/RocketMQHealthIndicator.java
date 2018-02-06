package com.janita.one.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * Created by Janita on 2018/2/6- 21:59
 * 该类是:
 */
@Component
public class RocketMQHealthIndicator implements HealthIndicator{
    @Override
    public Health health() {
        int errorCode = check();
        if (errorCode == 1) {
            return Health.down().withDetail("Error Code", errorCode).build();
        }
        return Health.up().build();
    }

    private int check() {
        return 1;
    }
}
