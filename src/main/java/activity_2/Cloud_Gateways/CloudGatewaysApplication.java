package activity_2.Cloud_Gateways;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudGatewaysApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGatewaysApplication.class, args);
	}

}
