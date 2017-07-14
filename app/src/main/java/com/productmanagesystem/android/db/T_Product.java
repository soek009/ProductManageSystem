package com.productmanagesystem.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/4/6.
 */

public class T_Product extends DataSupport {
    private int ProductId;
    private String ProductName;
    private int ProductClassId;
    private String ProductInfo;
    private int ProductPGet;
    private int ProductPSellMin;
    private int ProductPSellPra;
    private int ProductPSellMax;
    private String ProductBarcode;
    private int ProductNum;
    private String ProductPicNum;

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getProductClassId() {
        return ProductClassId;
    }

    public void setProductClassId(int productClassId) {
        ProductClassId = productClassId;
    }

    public String getProductInfo() {
        return ProductInfo;
    }

    public void setProductInfo(String productInfo) {
        ProductInfo = productInfo;
    }

    public int getProductPGet() {
        return ProductPGet;
    }

    public void setProductPGet(int productPGet) {
        ProductPGet = productPGet;
    }

    public int getProductPSellMin() {
        return ProductPSellMin;
    }

    public void setProductPSellMin(int productPSellMin) {
        ProductPSellMin = productPSellMin;
    }

    public int getProductPSellPra() {
        return ProductPSellPra;
    }

    public void setProductPSellPra(int productPSellPra) {
        ProductPSellPra = productPSellPra;
    }

    public int getProductPSellMax() {
        return ProductPSellMax;
    }

    public void setProductPSellMax(int productPSellMax) {
        ProductPSellMax = productPSellMax;
    }

    public String getProductBarcode() {
        return ProductBarcode;
    }

    public void setProductBarcode(String productBarcode) {
        ProductBarcode = productBarcode;
    }

    public int getProductNum() {
        return ProductNum;
    }

    public void setProductNum(int productNum) {
        ProductNum = productNum;
    }

    public String getProductPicNum() {
        return ProductPicNum;
    }

    public void setProductPicNum(String productPicNum) {
        ProductPicNum = productPicNum;
    }
}
