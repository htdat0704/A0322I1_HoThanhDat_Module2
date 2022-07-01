package ss11_java_collection_framework.bai_tap.useArrayList_QLSP.arrayList;

import java.util.Comparator;

public class PriceDESC implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getPrice() - o1.getPrice());
    }
}
