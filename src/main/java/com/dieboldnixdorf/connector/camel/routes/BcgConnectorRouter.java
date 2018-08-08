package com.dieboldnixdorf.connector.camel.routes;

import com.dieboldnixdorf.connector.camel.message.EnderecoMessage;
import com.dieboldnixdorf.connector.camel.model.Endereco;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
//import org.apache.camel.component.gson.GsonDataFormat;
import org.apache.camel.component.http4.HttpMethods;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.springframework.stereotype.Component;

@Component
public class BcgConnectorRouter extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("direct:address-bcg")
            .routeId("route-address-bcg")
                .setHeader(Exchange.HTTP_METHOD, constant(HttpMethods.POST))
                .to("http4://www.mocky.io/v2/5b69a01c320000231baf5d67?bridgeEndpoint=true")
                    .unmarshal(new JacksonDataFormat(Endereco.class)) //parse using jackson
                    //.to("mock:http4");
                .bean(EnderecoMessage.class, "onMessage");
                //.log("${routeId} - CHEGOU AQUI - ADDRESS BCG -  ${body}")
                //.to("mock:direct");
    }
}
