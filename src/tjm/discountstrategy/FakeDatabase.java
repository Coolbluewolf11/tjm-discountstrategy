package tjm.discountstrategy;

/**
 * An implementation of the DatabaseStrategy contract. This fakes database 
 * access by using arrays of hard-code products and customers. There 
 * currently is no way of modifying these.
 * 
 * @author Tim
 */
public class FakeDatabase implements DatabaseStrategy {
    private Customer[] customers = {
        new Customer("100", "Bob James"),
        new Customer("200", "Sally Smith"),
        new Customer("300", "Peter Piper")
    };
    
    private Product[] products = {
        new Product("11", "Brewer's Hat", 29.95, new PercentOffDiscount(.10)),
        new Product("22", "Women's Blouse", 49.95, new FlatAmtDiscount(5.00)),
        new Product("33", "Men's Black Belt", 39.95, new NoDiscount())
    };
    
    /**
     * Finds a product by its unique id.
     * @param prodId
     * @return a Product object or null if not found
     */
    @Override
    public final Product findProductById(String prodId) {
        // needs validation
        Product product = null;
        if(prodId == null || prodId.isEmpty()){
            throw new IllegalArgumentException("The Product ID cannot be null or empty.");
        }
        for(Product p : products) {
            if(p.getProdId().equals(prodId)) {
                product = p;
                break;
            }
        }
        if(product == null){
            throw new IllegalArgumentException("The Product ID you entered doesn't exist in the database.");
        }
        return product;
    }
    
    /**
     * Finds a customer by its unique id.
     * @param custId
     * @return a Customer object or null if not found
     */
     @Override
    public final Customer findCustomerById(String custId) {
        // needs validation
        Customer customer = null;
        if(custId == null||custId.isEmpty()){
            throw new IllegalArgumentException("The customer ID cannot be null or empty.");
        }
        for(Customer c : customers) {
            if(c.getCustomerId().equals(custId)) {
                customer = c;
                break;
            }
        }
        if(customer == null){
            throw new IllegalArgumentException("The Customer ID you entered doesn't exist in the database.");
        }
        return customer;
    }
}
