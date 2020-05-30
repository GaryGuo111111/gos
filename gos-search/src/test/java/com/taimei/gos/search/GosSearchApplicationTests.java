package com.taimei.gos.search;

import com.taimei.gos.search.dao.EsProductDao;
import com.taimei.gos.search.domain.EsProduct;
import com.taimei.gos.search.repository.EsProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GosSearchApplicationTests {

    @Autowired
    private EsProductDao productDao;

    @Autowired
    private EsProductRepository productRepository;

    @Test
    void contextLoads() {
        List<EsProduct> allEsProductList = productDao.getAllEsProductList(null);
        Iterable<EsProduct> esProductIterable = productRepository.saveAll(allEsProductList);
    }

}
