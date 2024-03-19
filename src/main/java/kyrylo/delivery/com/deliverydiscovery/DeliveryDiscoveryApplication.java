package kyrylo.delivery.com.deliverydiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DeliveryDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryDiscoveryApplication.class, args);
	}

}
