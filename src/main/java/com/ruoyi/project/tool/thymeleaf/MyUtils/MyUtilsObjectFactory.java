package com.ruoyi.project.tool.thymeleaf.MyUtils;

import com.ruoyi.common.utils.MyUtils;
import org.thymeleaf.context.IExpressionContext;
import org.thymeleaf.expression.IExpressionObjectFactory;

import java.util.HashSet;
import java.util.Set;

public class MyUtilsObjectFactory implements IExpressionObjectFactory {

    /**
     * 自定义内置对象名称
     */
    private static final String EXPRESSION_OBJECT_NAME = "MyUtils";
    @Override
    public Set<String> getAllExpressionObjectNames() {
        Set<String> names = new HashSet<>();
        names.add(EXPRESSION_OBJECT_NAME);
        return names;
    }

    @Override
    public Object buildObject(IExpressionContext context, String expressionObjectName) {
        if (EXPRESSION_OBJECT_NAME.equals(expressionObjectName)){
            return new MyUtils();
        }
        return null;
    }

    @Override
    public boolean isCacheable(String expressionObjectName) {
        return false;
    }
}
