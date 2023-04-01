package org.example.HomeWork1;
import java.util.List;
public class VendingMachine<T extends Product> {
    private List<T> listProduct;
    public VendingMachine(List<T> listproducts) {
        this.listProduct = listproducts;
    }
    public String getProduct(String name, Integer volume) {
         for (T p: listProduct )
             if(p.getNameProduct().equals(name)
                 && p.getPrice().equals(volume)) {
                     return p.getNameProduct();
         }
         return "Товар не найден";
    }
    public List<T> getListProduct() {
        return listProduct;
    }
}
