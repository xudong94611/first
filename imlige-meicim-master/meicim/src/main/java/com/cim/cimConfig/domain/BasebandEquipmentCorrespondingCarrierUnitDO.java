package com.cim.cimConfig.domain;

import java.io.Serializable;

public class BasebandEquipmentCorrespondingCarrierUnitDO implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private Integer serial;
    //
    private String basebandEquipmentModel;
    //
    private String carrierUnitModels;

    /**
     * 设置：
     */
    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    /**
     * 获取：
     */
    public Integer getSerial() {
        return serial;
    }

    public String getBasebandEquipmentModel() {
        return basebandEquipmentModel;
    }

    public void setBasebandEquipmentModel(String basebandEquipmentModel) {
        this.basebandEquipmentModel = basebandEquipmentModel;
    }

    public String getCarrierUnitModels() {
        return carrierUnitModels;
    }

    public void setCarrierUnitModels(String carrierUnitModels) {
        this.carrierUnitModels = carrierUnitModels;
    }
}
