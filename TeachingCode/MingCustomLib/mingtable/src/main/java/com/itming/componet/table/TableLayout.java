package com.itming.componet.table;

import ohos.agp.components.AttrSet;
import ohos.agp.components.ComponentContainer;
import ohos.app.Context;

/**
 * 自定义表格
 */
public class TableLayout extends ComponentContainer {

    //异步数据接口相关参数，其中url参数为必填项
    private String url;

    //开启表格头部工具栏区域
    private TableToolbar tableToolbar;

    //自由配置头部工具栏右侧的图标按钮
    private String[] defaultToolbar;

    //设定容器宽度
    private Integer width;

    //设定容器高度
    private Integer height;

    //设定容器最小宽度
    private Integer cellMinWidth;



    public TableLayout(Context context) {
        super(context);
    }

    public TableLayout(Context context, AttrSet attrSet) {
        super(context, attrSet);
    }

    public TableLayout(Context context, AttrSet attrSet, String styleName) {
        super(context, attrSet, styleName);
    }
}
