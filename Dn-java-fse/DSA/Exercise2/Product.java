public class Product {
    int productId;
    String productName;
    String Category;
    public Product(int productId,String productName,String Category){
        this.productId = productId;
        this.productName = productName;
        this.Category = Category;
    }
 public void display()
 {
    System.out.println(productId + " " + productName + " " + Category);
     }
}