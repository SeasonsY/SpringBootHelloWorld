package springboot.chapter3.config;

import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan(value = "springboot.chapter3.*")
public class AppConfig {
    @Bean(name="dataSource")
    public DataSource getDataSource(){
        Properties props = new Properties();
        props.setProperty("driver", "com.mysql.jdbc.Driver");
        props.setProperty("url", "jdbc:mysql://localhost:3306/chapter3");
        props.setProperty("username", "root");
        props.setProperty("password", "fjqwpo");
        DataSource dataSource = null;
        try{
            dataSource = BasicDataSourceFactory.createDataSource(props);
        }catch (Exception e){
            e.printStackTrace();
        }
        return dataSource;
    }
}
