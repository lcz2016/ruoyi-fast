package com.ruoyi.project.tool.thymeleaf.MyUtils;

import org.thymeleaf.dialect.IExpressionObjectDialect;
import org.thymeleaf.expression.IExpressionObjectFactory;

public class MyUtilsExpDialect implements IExpressionObjectDialect {
    @Override
    public IExpressionObjectFactory getExpressionObjectFactory() {
        return new MyUtilsObjectFactory();
    }

    @Override
    public String getName() {
        return "MyUtils Dialect";
    }
}
