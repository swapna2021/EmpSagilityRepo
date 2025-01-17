package springcoreprj.SpringCorePrj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Component
public class Employee {
	
	@Value("${Employee.name}")
	private String name;
	@Value("${Employee.id}")
	private int id;
	@Value("${Employee.sal}")
	private double sal;
	@Autowired
	private Address address;

}
