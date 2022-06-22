package bean;

public class Transaction {

	private int transaction_id;
	private int purchase_id;
	private String seller_email;
	private String purchase_email;
	private String shipping_status;
	private String payment_status;



	public Transaction() {
		this.transaction_id = 0;
		this.purchase_id = 0;
		this.seller_email = null;
		this.purchase_email = null;
		this.shipping_status = null;
		this.payment_status = null;
	}

	//ゲッターメソッド
	public int getTransaction_id() {

		return transaction_id;
	}
	public int getPurchase_id() {

		return purchase_id;
	}
	public String getSeller_email() {

		return seller_email;
	}
	public String getPurchase_email() {

		return purchase_email;
	}

	public String getShipping_statuse() {

		return shipping_status;
	}

	public String getPayment_status() {

		return payment_status;
	}


	//セッターメソッド
	public void setTransaction_id(int transaction_id) {

		this.transaction_id = transaction_id;
	}
	public void setPurchase_id(int purchase_id) {

		this.purchase_id = purchase_id;
	}

	public void setSeller_email(String seller_email) {

		this.seller_email = seller_email;
	}

	public void setPurchase_email(String purchase_email) {

		this.purchase_email = purchase_email;
	}

	public void setShipping_status(String shipping_status) {

		this.shipping_status = shipping_status;
	}

	public void setPayment_status(String payment_status) {

		this.payment_status = payment_status;
	}


}
