package spring_web_app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@ComponentScan(basePackages = "spring_web_app.Controller")

public class SpringConfig implements WebMvcConfigurer 
{
	

}
