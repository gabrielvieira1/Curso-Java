package sessao13.EnumeracaoComposicao;

import java.util.Date;

public class EnumProgram {

	public static void main(String[] args) {
		
		EnumOrder order = new EnumOrder(1080, new Date(), EnumOrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		EnumOrderStatus os1 = EnumOrderStatus.DELIVERED;
		
		EnumOrderStatus os2 = EnumOrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
