package ss11_java_collection_framework.bai_tap.useArrayList_QLSP.arrayList;

import java.util.Comparator;

public class PriceASC implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }
}
