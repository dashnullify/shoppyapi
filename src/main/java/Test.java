import me.unknown.shoppyapi.ShoppyAPI;
import me.unknown.shoppyapi.objects.Feedback;
import me.unknown.shoppyapi.objects.Order;
import me.unknown.shoppyapi.objects.Product;
import me.unknown.shoppyapi.objects.Query;

/**
 * made for ShoppyAPI
 *
 * @author Unknown
 * @since 4/10/2020
 **/
public class Test {

    public static void main(String[] args) throws Exception {
        ShoppyAPI shoppyAPI = new ShoppyAPI("6AX9cPuUZN5PzUjG0caUkdv3yYrd0GCScrBcwzgjQTOGAkAQqx");
        Order order = shoppyAPI.getOrder("1b104d40-1a03-11e8-b66e-e1ab622befc5");
        System.out.println(order.getId());
        System.out.println(order.getEmail());
        for(Order order1 : shoppyAPI.getAllOrders()) {
            System.out.println(order1.getEmail());
            System.out.println(order1.getId());
            System.out.println();
        }

        Product productToCreate = new Product("Testing Product", "The product", "File", "USD", "BTC",
                "", "", false, 1, 0, 1, 0);
        shoppyAPI.createProduct(productToCreate);

        Product product = shoppyAPI.getProduct(productToCreate.getId());
        product.setTitle("Test Product");
        shoppyAPI.updateProduct(product);

        for(Product product1 : shoppyAPI.getAllProducts()) {
            System.out.println(product1.getTitle());
            System.out.println(product1.getId());
            System.out.println();
        }

        for(Feedback feedback : shoppyAPI.getAllFeedbacks()) {
            System.out.println(feedback.getId());
            System.out.println(feedback.getComment());
        }

        for(Query query : shoppyAPI.getAllQueries()) {
            System.out.println(query.getId());
            System.out.println(query.getEmail());
        }
    }

}
