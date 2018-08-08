package com.dieboldnixdorf.connector.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class TestTimerRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:bcg?period={{timer.period}}")
            .routeId("route-timer")
            .log("${routeId} - ${body}")
            .to("mock:timer");
            //.to("direct:address-bcg");
    }

}
