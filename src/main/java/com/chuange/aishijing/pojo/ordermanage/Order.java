package com.chuange.aishijing.pojo.ordermanage;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Administrator on 2018-11-07.
 * 全部订单
 */
@Entity
@Table(name="ASJ_ORDER")
public class Order implements java.io.Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private String orderMarking;//订单编号
    @Temporal(TemporalType.TIMESTAMP)
    private Date purchaseTime;//购买时间
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderTime;//下单时间
    @Temporal(TemporalType.TIMESTAMP)
    private Date paymentTime;//支付时间
    private String purchaser;//购买人
    private String purchaserTel;//购买人手机号
    private Long purchaseuser;//购买用户ID
    private String orderStatus;//订单状态
    private String className;//课程名称
    private String lecturer;//讲师
    private String orderAmount;//订单金额
    private String coupondeductionAmount;//优惠券抵扣金额
    private String userpaidAmount;//用户实付金额
    private String paymentMethod;//支付方式
    private String paymentOrder;//支付单号
    private String paymentCharge;//交易手续费
     
    public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(@NotNull Long id, String orderMarking, Date purchaseTime, Date orderTime, Date paymentTime,
			String purchaser, String purchaserTel, Long purchaseuser, String orderStatus, String className,
			String lecturer, String orderAmount, String coupondeductionAmount, String userpaidAmount,
			String paymentMethod, String paymentOrder, String paymentCharge) {
		super();
		this.id = id;
		this.orderMarking = orderMarking;
		this.purchaseTime = purchaseTime;
		this.orderTime = orderTime;
		this.paymentTime = paymentTime;
		this.purchaser = purchaser;
		this.purchaserTel = purchaserTel;
		this.purchaseuser = purchaseuser;
		this.orderStatus = orderStatus;
		this.className = className;
		this.lecturer = lecturer;
		this.orderAmount = orderAmount;
		this.coupondeductionAmount = coupondeductionAmount;
		this.userpaidAmount = userpaidAmount;
		this.paymentMethod = paymentMethod;
		this.paymentOrder = paymentOrder;
		this.paymentCharge = paymentCharge;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderMarking=" + orderMarking + ", purchaseTime=" + purchaseTime + ", orderTime="
				+ orderTime + ", paymentTime=" + paymentTime + ", purchaser=" + purchaser + ", purchaserTel="
				+ purchaserTel + ", purchaseuser=" + purchaseuser + ", orderStatus=" + orderStatus + ", className="
				+ className + ", lecturer=" + lecturer + ", orderAmount=" + orderAmount + ", coupondeductionAmount="
				+ coupondeductionAmount + ", userpaidAmount=" + userpaidAmount + ", paymentMethod=" + paymentMethod
				+ ", paymentOrder=" + paymentOrder + ", paymentCharge=" + paymentCharge + "]";
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Date getPaymentTime() {
		return paymentTime;
	}

	public void setPaymentTime(Date paymentTime) {
		this.paymentTime = paymentTime;
	}

	public Long getPurchaseuser() {
		return purchaseuser;
	}

	public void setPurchaseuser(Long purchaseuser) {
		this.purchaseuser = purchaseuser;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPaymentCharge() {
		return paymentCharge;
	}

	public void setPaymentCharge(String paymentCharge) {
		this.paymentCharge = paymentCharge;
	}

	public Date getPurchaseTime() {
		return purchaseTime;
	}

	public void setPurchaseTime(Date purchaseTime) {
		this.purchaseTime = purchaseTime;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderMarking() {
        return orderMarking;
    }

    public void setOrderMarking(String orderMarking) {
        this.orderMarking = orderMarking;
    }

    public String getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(String purchaser) {
        this.purchaser = purchaser;
    }

    public String getPurchaserTel() {
        return purchaserTel;
    }

    public void setPurchaserTel(String purchaserTel) {
        this.purchaserTel = purchaserTel;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getCoupondeductionAmount() {
        return coupondeductionAmount;
    }

    public void setCoupondeductionAmount(String coupondeductionAmount) {
        this.coupondeductionAmount = coupondeductionAmount;
    }

    public String getUserpaidAmount() {
        return userpaidAmount;
    }

    public void setUserpaidAmount(String userpaidAmount) {
        this.userpaidAmount = userpaidAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentOrder() {
        return paymentOrder;
    }

    public void setPaymentOrder(String paymentOrder) {
        this.paymentOrder = paymentOrder;
    }
}

