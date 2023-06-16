package project_asm_java.model.entity;

import java.io.Serializable;

public class Catalog implements Serializable{
    private int catalogID;
    private String catalogName;
    private int catalogPriority;
    private boolean catalogStatus;


    public Catalog() {
    }

    public Catalog(int catalogID, String catalogName, int catalogPriority, boolean catalogStatus) {
        this.catalogID = catalogID;
        this.catalogName = catalogName;
        this.catalogPriority = catalogPriority;
        this.catalogStatus = catalogStatus;
    }

    public int getCatalogID() {
        return catalogID;
    }

    public void setCatalogID(int catalogID) {
        this.catalogID = catalogID;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public int getCatalogPriority() {
        return catalogPriority;
    }

    public void setCatalogPriority(int catalogPriority) {
        this.catalogPriority = catalogPriority;
    }

    public boolean isCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.catalogID;
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
        final Catalog other = (Catalog) obj;
        return this.catalogID == other.catalogID;
    }
}
