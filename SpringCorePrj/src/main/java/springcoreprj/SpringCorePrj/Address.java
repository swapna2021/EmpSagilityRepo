package springcoreprj.SpringCorePrj;

import org.springframework.beans.factory.annotation.Value;
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
public class Address {
	
	@Value("${Address.city}")
	private String city;
	@Value("${Address.state}")
	private String state;
	@Value("${Address.pin}")
	private String pin;

}
