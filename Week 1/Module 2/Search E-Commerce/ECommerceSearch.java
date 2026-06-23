public class ECommerceSearch {
    static class Product {
        int productId;
        String productName;
        String category;
        Product(int productId, String productName, String category) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
        }
    }

    public static Product linearSearch(Product[] products, int id) {
        for (Product p : products) {
            if (p.productId == id) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int id) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (products[mid].productId == id) {
                return products[mid];
            }
            if (products[mid].productId < id) {
            left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
    public static void sortProducts(Product[] products) {
        java.util.Arrays.sort(products,java.util.Comparator.comparingInt(p -> p.productId));
    }
    public static void main(String[] args) {
        Product[] products = {
            new Product(103, "Laptop", "Electronics"),
            new Product(101, "Phone", "Electronics"),
            new Product(105, "Shoes", "Fashion"),
            new Product(102, "Watch", "Accessories")
        };
        System.out.println("Linear Search:");
        Product p1 = linearSearch(products, 105);
        if (p1 != null) {
            System.out.println(p1.productId + "-" + p1.productName + "-" + p1.category);
        }
        
        sortProducts(products);
        System.out.println("\nBinary Search:");
        Product p2 = binarySearch(products, 105);
        if (p2 != null) {
            System.out.println(p2.productId + "-" + p2.productName + "-" + p2.category);
        }
    }
}