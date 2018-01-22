package com.marketbot;

import com.marketbot.health.AppHealthCheck;
import com.marketbot.resources.ChatResource;
import com.marketbot.resources.TwilioChatResource;
import com.marketbot.resources.AIChatResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class MarketingChatBotApplication extends Application<MarketingChatBotConfiguration> {

    public static void main(final String[] args) throws Exception {
        new MarketingChatBotApplication().run(args);
    }

    @Override
    public String getName() {
        return "MarketingChatBotApplication";
    }

    @Override
    public void initialize(final Bootstrap<MarketingChatBotConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final MarketingChatBotConfiguration configuration,
                    final Environment environment) {
        ChatResource resource = new AIChatResource();
        environment.jersey().register(resource);
        resource = new TwilioChatResource();
        environment.jersey().register(resource);
        environment.healthChecks().register("MarketingChatBotApplication", new AppHealthCheck());
    }

}
