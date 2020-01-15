package sessao13.EnumeracaoComposicao;

import java.util.Date;

public class EnumOrder {
	
	private Integer id;
	private Date moment;
	private EnumOrderStatus status;
	
	public EnumOrder() {
		
	}
	
	public EnumOrder(Integer id, Date moment, EnumOrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public EnumOrderStatus getStatus() {
		return status;
	}
	public void setStatus(EnumOrderStatus status) {
		this.status = status;
	}

	public String toString() {
		return "EnumOrder [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
	
	

}
