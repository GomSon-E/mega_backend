package step8_01.technique;

/*
 * 
 * # toString : 객체에 관한 정보를 문자열로 반환한다.
 * 
 * */

class OrderDto {
	
	private String orderId;
	private String goodsId;	
	private String memberId;
	private String goodsTitle;
	private String deliveryMethod;
	private String deliveryAddress;
	private String deliveryMessage;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getGoodsTitle() {
		return goodsTitle;
	}
	public void setGoodsTitle(String goodsTitle) {
		this.goodsTitle = goodsTitle;
	}
	public String getDeliveryMethod() {
		return deliveryMethod;
	}
	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public String getDeliveryMessage() {
		return deliveryMessage;
	}
	public void setDeliveryMessage(String deliveryMessage) {
		this.deliveryMessage = deliveryMessage;
	}
	
	// toString 생성 단축키
	// 좌측 상단 Source > Generate toString > Generate
	
	@Override
	public String toString() {
		return "OrderDto [orderId=" + orderId + ", goodsId=" + goodsId + ", memberId=" + memberId + ", goodsTitle="
				+ goodsTitle + ", deliveryMethod=" + deliveryMethod + ", deliveryAddress=" + deliveryAddress
				+ ", deliveryMessage=" + deliveryMessage + "]";
	}

}

public class TechniqueEx13 {

	public static void main(String[] args) {

		OrderDto order1 = new OrderDto();
		order1.setOrderId("o1");
		order1.setGoodsId("g1");
		order1.setMemberId("m1");
		order1.setGoodsTitle("스프링 문법");
		order1.setDeliveryAddress("테헤란로");
		order1.setDeliveryMethod("택배수령");
		order1.setDeliveryMessage("경비실 앞에 맡겨주세요");
		
		System.out.println(order1);
		
		OrderDto order2 = new OrderDto();
		order2.setOrderId("o2");
		order2.setGoodsId("g2");
		order2.setMemberId("m2");
		order2.setGoodsTitle("JSP 문법");
		order2.setDeliveryAddress("삼성동");
		order2.setDeliveryMethod("편의점");
		order2.setDeliveryMessage("배송 전 연락주세요");
		
		System.out.println(order2);
		
	}

}
