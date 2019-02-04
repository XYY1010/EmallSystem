package com.emall.dataobject;

import java.util.List;

/**
 * @author cckk1995
 * @date 2019/01/20 PM
 */
public class MealDO {
    private int attrId;
    private String itemId;
    private String attrName;
    private List<ItemAttrValDO> value;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public int getAttrId() {
        return attrId;
    }

    public void setAttrId(int attrId) {
        this.attrId = attrId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public List<ItemAttrValDO> getValue() {
        return value;
    }

    public void setValue(List<ItemAttrValDO> value) {
        this.value = value;
    }
}
