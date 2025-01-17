package springcoreprj.SpringCorePrj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration//configuratio inf will be there
@PropertySource("classpath:data.properties")
@ComponentScan(basePackages ="springcoreprj.SpringCorePrj" )
public class EmpConfig {
	
}
