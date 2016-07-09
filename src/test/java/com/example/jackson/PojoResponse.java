package com.example.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.UUID;

public final class PojoResponse {

    private final String        string;
    private final UUID          uuid;
    private final LocalDateTime localDateTime;
    private final boolean       aBoolean;
    private final Boolean       aBooleanT;

    @JsonCreator
    public PojoResponse(@JsonProperty("string") final String string,
                        @JsonProperty("uuid") final UUID uuid,
                        @JsonProperty("localDateTime") final LocalDateTime localDateTime,
                        @JsonProperty("aBoolean") final boolean aBoolean,
                        @JsonProperty("aBooleanT") final Boolean aBooleanT) {
        this.string = string;
        this.uuid = uuid;
        this.localDateTime = localDateTime;
        this.aBoolean = aBoolean;
        this.aBooleanT = aBooleanT;
    }

    public String getString() {
        return this.string;
    }

    public UUID getUuid() {
        return this.uuid;
    }

    public LocalDateTime getLocalDateTime() {
        return this.localDateTime;
    }

    public boolean isaBoolean() {
        return this.aBoolean;
    }

    public Boolean getaBooleanT() {
        return this.aBooleanT;
    }
}
