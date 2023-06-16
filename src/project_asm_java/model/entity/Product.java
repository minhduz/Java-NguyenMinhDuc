package project_asm_java.model.entity;

import java.io.Serializable;

public class Product implements Serializable{
    private int productID;
    private String productName;
    private double productPrice;
    private Catalog productCatalog;
    private boolean productStatus;

    public Product() {
    }

    public Product(int productID, String productName, double productPrice, Catalog productCatalog, boolean productStatus) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCatalog = productCatalog;
        this.productStatus = productStatus;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public Catalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(Catalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.productID;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        return this.productID == other.productID;
    }
    
    
}
