package com.coolweather.android.db;
import org.litepal.crud.DataSupport;
/**
 * Created by X454W on 2018/6/9.
 */

public class Province extends DataSupport {
    /*查询省得到的内容如下：{"id":26,"name":"贵州"}*/
    private int id;
    private String provinceName;
    private int provinceCode; //省代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
