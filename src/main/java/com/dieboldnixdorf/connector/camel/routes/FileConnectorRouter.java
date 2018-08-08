package com.dieboldnixdorf.connector.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.xmljson.XmlJsonDataFormat;
import org.springframework.stereotype.Component;

@Component
public class FileConnectorRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:pedidos?delay=5s&noop=true")
            .routeId("connector-file")
            .split().xpath("/pedido/itens/item")
            .marshal(new XmlJsonDataFormat())
            .log("PARSE --> ${body}")
            .setHeader("CamelFileName", simple("${file:onlyname.noext}.json")). //seta o mesmo nome do arquivo .json
            to("file:json");
    }

}
