package com.itming.componet.table;

import ohos.agp.components.AttrSet;
import ohos.agp.components.Component;
import ohos.agp.components.ComponentContainer;
import ohos.app.Context;

public class TableToolbar extends ComponentContainer {

    private Component component;

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    public TableToolbar(Context context) {
        super(context);
    }

    public TableToolbar(Context context, AttrSet attrSet) {
        super(context, attrSet);
    }

    public TableToolbar(Context context, AttrSet attrSet, String styleName) {
        super(context, attrSet, styleName);
    }
}
