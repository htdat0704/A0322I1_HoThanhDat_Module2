package ss11_java_collection_framework.bai_tap.useArrayList_QLSP.linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ProductManager {
    private LinkedList<Product> arrayListProduct = new LinkedList<>();
    private Product productR = new Product(13132,"TV");

    public ProductManager(Product product){
        addProduct(product);
    }

    public ProductManager(){
        addProduct(productR);
    }

    public void addProduct(Product product){
        arrayListProduct.add(product);
    }

    public void editProduct(int ID, double price){
        Product productEdit = null;
        for(Product product: arrayListProduct ){
            if(product.getID() == ID){
                productEdit = product;
                break;
            }
        }
        if(productEdit == null){
            System.out.println("No product have ID "+ID+" so no EDIT");
        }else{
            productEdit.setPrice(price);
        }
    }

    public void editProduct(int ID, String name){
        Product productEdit = null;
        for(Product product: arrayListProduct ){
            if(product.getID() == ID){
                productEdit = product;
                break;
            }
        }

        if(productEdit == null){
            System.out.println("No product have ID "+ID+" so no EDIT");
        }else{
            productEdit.setName(name);
        }
    }

    public void editProduct(int ID,double price, String name){
        Product productEdit = null;
        for(Product product: this.arrayListProduct ){
            if(product.getID() == ID){
                productEdit = product;
                break;
            }
        }

        if(productEdit == null){
            System.out.println("No product have ID "+ID+" so no EDIT");
        }else{
            productEdit.setName(name);
            productEdit.setPrice(price);
        }
    }

    public void removeProduct(int ID){
        int index = -1;
        for(Product Obj: this.arrayListProduct){
            index ++;
            if(Obj.getID() == ID){
                break;
            }
        }
        if(index == -1){
            System.out.println("No product have ID "+ID+" so no REMOVE");
        }else{
            arrayListProduct.remove(index);
        }
    }

    public void displayProducts(){
        System.out.println("List of Products: ");
        for(Product Obj: this.arrayListProduct){
            System.out.println(Obj.toString());
        }
    }

    public void findByName(String name){
        Product productFind = null;
        for(Product Obj: this.arrayListProduct){
            if(Obj.getName().equals(name)){
                productFind = Obj;
                System.out.println("Product have name "+name+" is "+Obj.toString());
            }
        }
        if(productFind == null){
            System.out.println("No product is found");
        }
    }

    public void sortPriceASC(){
        PriceASC priceASC = new PriceASC();
        Collections.sort(this.arrayListProduct,priceASC);
    }

    public void sortPriceDESC(){
        PriceDESC priceDESC = new PriceDESC();
        Collections.sort(this.arrayListProduct,priceDESC);
    }
}
