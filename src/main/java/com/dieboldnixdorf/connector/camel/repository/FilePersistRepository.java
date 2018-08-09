package com.dieboldnixdorf.connector.camel.repository;

import com.dieboldnixdorf.connector.camel.model.Item;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.*;
import java.util.stream.Collectors;

@Repository
public class FilePersistRepository {

    Map<String, Item> items;

    @PostConstruct
    public void setup() {
        this.items = new HashMap<>();
    }

    public List<Item> findAll() {
        return items.values().stream().collect(Collectors.toList());
    }

    public void addItem(Item item) {
        System.out.println(item);
        item.setUuid(UUID.randomUUID().toString());
        items.put(item.getUuid(), item);
        System.out.println("Size --> " + items.size());
    }

    public Item findItem(String uuid) {
        return items.containsKey(uuid) ? this.items.get(uuid) : new Item();
    }

}
