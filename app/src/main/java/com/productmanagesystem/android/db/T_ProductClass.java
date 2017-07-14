package com.productmanagesystem.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/4/6.
 */

public class T_ProductClass extends DataSupport {
    private int ProductClassId;
    private String ProductClassName;

    public int getProductClassId() {
        return ProductClassId;
    }

    public void setProductClassId(int productClassId) {
        ProductClassId = productClassId;
    }

    public String getProductClassName() {
        return ProductClassName;
    }

    public void setProductClassName(String productClassName) {
        ProductClassName = productClassName;
    }
}
