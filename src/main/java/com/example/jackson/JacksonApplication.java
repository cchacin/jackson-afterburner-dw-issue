package com.example.jackson;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class JacksonApplication extends Application<JacksonConfiguration> {

    public static void main(final String[] args) throws Exception {
        new JacksonApplication().run(args);
    }

    @Override
    public String getName() {
        return "Jackson + DW issue";
    }

    @Override
    public void initialize(final Bootstrap<JacksonConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final JacksonConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
