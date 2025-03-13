class Product {
    String pcode;
    String pname;
    double price;

    Product(String pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }
    static Product findLowestPrice(Product p1, Product p2, Product p3) {
        if (p1.price <= p2.price && p1.price <= p3.price) {
            return p1;
        } else if (p2.price <= p1.price && p2.price <= p3.price) {
            return p2;
        } else {
            return p3;
        }
    }

    public static void main(String[] args) {
   
        Product prod1 = new Product("P001", "Laptop", 50000);
        Product prod2 = new Product("P002", "Tablet", 30000);
        Product prod3 = new Product("P003", "Smartphone", 20000);

    
        Product lowest = findLowestPrice(prod1, prod2, prod3);

  
        System.out.println("Product with the lowest price:");
        System.out.println("Code: " + lowest.pcode);
        System.out.println("Name: " + lowest.pname);
        System.out.println("Price: " + lowest.price);
    }
}
