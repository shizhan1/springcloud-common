package com.ccsens.histrixmonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @description:
 * @author: wuHuiJuan
 * @create: 2019/11/27 13:59
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableHystrixDashboard
@EnableTurbine
public class HistrixMonitorApplication {
    public static void main(String[] args) {
        SpringApplication.run(HistrixMonitorApplication.class, args);
    }
}
