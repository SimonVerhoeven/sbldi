package dev.simonverhoeven.sbldi;

import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@RedisHash("greeting")
public class DieRoll implements Serializable {
    UUID id;
    int roll;
    LocalDateTime time;

    public DieRoll(UUID id, int roll, LocalDateTime time) {
        this.id = id;
        this.roll = roll;
        this.time = time;
    }

    public UUID getId() {
        return id;
    }

    public int getRoll() {
        return roll;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
