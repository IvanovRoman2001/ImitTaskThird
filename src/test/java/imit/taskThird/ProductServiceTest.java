package imit.taskThird;

import static org.junit.Assert.*;

public class ProductServiceTest {

    private BatchProduct batch;

    @org.junit.Before
    public void setUp() {
        ProductPackaging productPackaging = new ProductPackaging("коробка", 10.0);
        PieceProduct book = new PieceProduct("Белые ночи", "Художественная литература", 100.0);
        PackedPieceProduct bookBox = new PackedPieceProduct(productPackaging, 10, book);
        WeightProduct weightProduct = new WeightProduct("Научная фантастика", "Погрузитесь в новый для вас мир");
        PackedWeightProduct fantasyBooksBox = new PackedWeightProduct(weightProduct, 100.0, productPackaging);
        batch = new BatchProduct("Партия товаров", bookBox, fantasyBooksBox);
    }

    @org.junit.Test
    public void testCounter() {
        assertEquals(1, ProductService.countByFilter(batch, new BeginStringFilter("Белые")));
        assertEquals(1, ProductService.countByFilter(batch, new ContainStringFilter("фантастика")));
        assertEquals(0, ProductService.countByFilter(batch, new EndStringFilter("фильмы")));
    }
}
