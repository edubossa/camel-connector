package com.dieboldnixdorf.connector.camel.api;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileConnectorApi extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        rest("/files").description("Connector simulated file")
            .get("/").description("Return all files")
            .route().routeId("files-api")
            //.to("direct:connector-file")
            .transform().simple("FILE CONNECTOR OK!")
            .endRest();

    }
}
