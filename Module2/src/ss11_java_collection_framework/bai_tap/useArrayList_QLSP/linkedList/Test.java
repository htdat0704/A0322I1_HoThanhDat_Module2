package ss11_java_collection_framework.bai_tap.useArrayList_QLSP.linkedList;

public class Test {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.addProduct(new Product(2323,"Ban phim"));
        productManager.addProduct(new Product(23253,"Laptop"));
        productManager.addProduct(new Product(23223,"Noi nuoc"));
        productManager.addProduct(new Product(2321233,"Quat"));
        productManager.addProduct(new Product(23253,"Tu lanh"));
        productManager.displayProducts();
        productManager.removeProduct(3);
        productManager.editProduct(0,9999);
        productManager.editProduct(1,"Chuot");
        productManager.editProduct(2,123456,"PC");
        productManager.displayProducts();
        productManager.findByName("Chuot");
        System.out.println("After sort ASC");
        productManager.sortPriceASC();
        productManager.displayProducts();
        System.out.println("After sort DESC");
        productManager.sortPriceDESC();
        productManager.displayProducts();

    }
}
