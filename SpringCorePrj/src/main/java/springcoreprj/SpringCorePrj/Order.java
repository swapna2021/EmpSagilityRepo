package springcoreprj.SpringCorePrj;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Order {
	
	private int orderId;
	private Date orderDate;
	private Customer customer;
	private Address address;
	private List itemList;

}
