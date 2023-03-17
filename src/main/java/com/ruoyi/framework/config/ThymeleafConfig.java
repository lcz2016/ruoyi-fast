package com.ruoyi.framework.config;

import com.ruoyi.project.tool.thymeleaf.MyUtils.MyUtilsExpDialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.dialect.IDialect;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.templateresolver.ITemplateResolver;

import java.util.Collection;
import java.util.Collections;

/*自定义配置类*/
@Configuration
public class ThymeleafConfig {
    @Autowired
    private Collection<ITemplateResolver> templateResolvers = Collections.emptySet();

    @Autowired(required = false)
    private Collection<IDialect> dialects = Collections.emptySet();

    @Bean
    public SpringTemplateEngine templateEngine()
    {
        SpringTemplateEngine engine = new SpringTemplateEngine();
        for (ITemplateResolver templateResolver : this.templateResolvers)
        {
            engine.addTemplateResolver(templateResolver);
        }
        for (IDialect dialect : this.dialects)
        {
            engine.addDialect(dialect);
        }
        engine.addDialect(new MyUtilsExpDialect());
        return engine;
    }
}
