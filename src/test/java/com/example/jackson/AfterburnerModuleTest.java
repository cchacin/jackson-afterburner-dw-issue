package com.example.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AfterburnerModuleTest {
    private final ObjectMapper mapper = new ObjectMapper();
    private final PojoResponse pojo   = new PojoResponse(null, null, null, true, false);
    private final String       json   = "{\"string\":null,\"uuid\":null,\"localDateTime\":null,\"aBoolean\":true,\"aBooleanT\":false}";

    @Test
    public void testWithAfterburnerModule() throws Exception {
        this.mapper.registerModule(new AfterburnerModule());
        assertThat(this.mapper.writeValueAsString(this.pojo)).isEqualTo(this.json);
    }

    @Test
    public void testWithoutAfterburnerModule() throws Exception {
        assertThat(this.mapper.writeValueAsString(this.pojo)).isEqualTo(this.json);
    }
}
