package gefuxing.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan({"gefuxing.mapper"})
public class MyBatisConfig {

}