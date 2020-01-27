package com.agroknow.schemaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class SchemaAPI extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SchemaAPI.class, args);
    }

    @Bean
    public Docket schemaApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .paths(PathSelectors.regex("/.*"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("AGINFRA+ Data Integration API")
                .description("The Agroknow Data Integration API is responsible for handling data and types hosted by the Agroknow Data Platform. It provides all necessary CRUD operations for the management of data and semantic resources, while also providing insights to the current state of the platform in terms of supported datatypes.\n")
                .termsOfServiceUrl("")
                .contact("Agroknow")
                .license("")
                .licenseUrl("")
                .version("1.0")
                .build();
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SchemaAPI.class);
    }

}
