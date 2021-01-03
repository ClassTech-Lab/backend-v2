package com.classtechlab.manager;

import com.classtechlab.manager.domain.model.category.StringToCategoryIdConverter;
import com.classtechlab.manager.domain.model.keyword.StringToKeywordIdConverter;
import com.classtechlab.manager.domain.model.provider.StringToProviderIdConverter;
import com.classtechlab.manager.domain.model.tool.StringToToolIdConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ManagerConfiguration implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToToolIdConverter());
        registry.addConverter(new StringToKeywordIdConverter());
        registry.addConverter(new StringToCategoryIdConverter());
        registry.addConverter(new StringToProviderIdConverter());
    }
}
