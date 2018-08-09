package com.dieboldnixdorf.connector.camel.routes;

import com.dieboldnixdorf.connector.camel.model.Item;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
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
                .unmarshal(new JacksonDataFormat(Item.class))
            .to("bean:filePersistRepository?method=addItem");

            //.setHeader("CamelFileName", simple("${file:onlyname.noext}.json")). //seta o mesmo nome do arquivo .json
            //to("file:json");
    }

}
