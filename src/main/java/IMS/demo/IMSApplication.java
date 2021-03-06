package IMS.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan(basePackages = "IMS.demo.dataobject.mapper")
@EnableCaching
public class IMSApplication {

	public static void main(String[] args) {
		SpringApplication.run(IMSApplication.class, args);
	}
}
