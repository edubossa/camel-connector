package com.dieboldnixdorf.connector.camel.api;

import com.dieboldnixdorf.connector.camel.service.AddressService;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * http://camel.apache.org/rest-dsl.html
 * <p></p>
 * See doc swagger: http://localhost:8080/camel/api-doc
 */
@Component
public class BcgApi extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        rest("/bcg").description("Connector Legacy BCG Banestes API")
            .get("/address/{cep}").description("Find address by cep")
                .route().routeId("bcg-api")
                .log("CEP --> ${header.cep}")
                .to("direct:address-bcg")
                //.bean(AddressService.class, "findAddress(${header.cep})")
                .endRest();
    }

}
