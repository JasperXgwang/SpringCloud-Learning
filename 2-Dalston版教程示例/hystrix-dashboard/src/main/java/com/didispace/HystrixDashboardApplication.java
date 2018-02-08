package com.didispace;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * http://localhost:1301/hystrix/monitor?stream=http%3A%2F%2Flocalhost%3A2101%2Fhystrix.stream
 */
@EnableHystrixDashboard
@SpringCloudApplication
public class HystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardApplication.class, args);
	}

}
