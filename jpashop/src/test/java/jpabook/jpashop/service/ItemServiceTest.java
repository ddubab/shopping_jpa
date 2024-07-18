package jpabook.jpashop.service;

import jpabook.jpashop.domain.Item;
import jpabook.jpashop.repository.ItemRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ItemServiceTest {

    @Autowired
    ItemService itemService;

    @Test
    void 상품저장() {

        Item item = new Item();
        item.setName("book");
        item.setPrice(10);
        item.setStockQuantity(100);

        Long savedId = itemService.saveItem(item);

        Assertions.assertEquals(item, itemService.findOne(savedId));
    }
}