package bootstrap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedWebApplicationContext;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.ConfigurableWebApplicationContext;

@SpringBootApplication
@EnableZuulProxy
public class GatewayApplication {

    private static final Logger logger = LoggerFactory.getLogger(GatewayApplication.class);
    private static ConfigurableWebApplicationContext context = null;

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);

//        logger.info("ocs-api gateway service is starting");
//
//        context = new EmbeddedWebApplicationContext();
//        context.refresh();
//        context.start();
//
//        logger.info("ocs-api gateway service start completely");
    }
}
