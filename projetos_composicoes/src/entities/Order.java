package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
	private LocalDateTime moment;
	private OrderStatus status;
	
	private List<OrderItem> items = new ArrayList<>();
	private Client client;

	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public void addItem(OrderItem items) {
		this.items.add(items);
	}
	
	public void removeItem(OrderItem items) {
		this.items.remove(items);
	}	
	

	public double total() {
		double sum = 0;
		for (OrderItem subt : items) {
			sum += subt.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: ");
		sb.append(fmt.format(moment) + "\n");
		sb.append("Order status: " + OrderStatus.valueOf("PROCESSING") + "\n");
		sb.append("Client: " + client.getName() + " (" + client.getBirthDate() + ") - " + client.getEmail() + "\n");
		sb.append("Order items: ");
		for (OrderItem order : items) {
			sb.append(order.getProduct().getNameProduct() + ", $" + order.getPrice()
					+ ", Quantity: " + order.getQuantity() + ", Subtotal: " + String.format("%.2f", order.subTotal()) + "\n");
		}
		sb.append("Total :" + String.format("%.2f", total()));		
		return sb.toString();
	} 
}
