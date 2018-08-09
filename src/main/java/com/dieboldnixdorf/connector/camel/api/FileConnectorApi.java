package com.dieboldnixdorf.connector.camel.api;

import com.dieboldnixdorf.connector.camel.model.Item;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import static org.apache.camel.model.rest.RestParamType.path;

@Component
public class FileConnectorApi extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        rest("/files").description("Connector simulated file")
            .consumes("application/json")
            .produces("application/json")

            .get("/").description("Return all files").outType(Item[].class)
                    .responseMessage().code(200)
                    .message("All itens successfully returned").endResponseMessage()
                .to("bean:filePersistRepository?method=findAll")


            .get("/{uuid}").description("Find item connector file by uuid")
                .outType(Item.class)
                .param().name("uuid").type(path).description("Key to find").dataType("String").endParam()
                .responseMessage().code(200).message("Item successfully returned").endResponseMessage()
            .to("bean:filePersistRepository?method=findItem(${header.uuid})");



    }
}
