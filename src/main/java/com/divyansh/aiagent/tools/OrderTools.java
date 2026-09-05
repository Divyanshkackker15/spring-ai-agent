package com.divyansh.aiagent.tools;

import java.util.Map;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

@Component
public class OrderTools {

	private final Map<String, String> orders = Map.of(
	        "1042", "Shipped - arriving tomorrow",
	        "1043", "Processing - not yet shipped",
	        "1044", "Cancelled - out of stock",
	        "1045", "Shipped - arriving next week"
	);
	
	@Tool(description = "Cancel a customer order by its order ID")
	public String cancelOrder(String orderId) {

	    if (orders.containsKey(orderId)) {
	        return "Order " + orderId + " has been cancelled.";
	    } else {
	        return "Order not found";
	    }
	}
}
