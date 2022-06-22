package bean;

public class Product {

		private int product_id;
		private String seller_email; // メールアドレス
		private String salse_status;
		private String product_status;
		private String product_name;
		private int price;
		private String product_text;
		private String product_genre;



		public Product() {
			this.product_id = 0;
			this.seller_email = null;
			this.salse_status = null;
			this.product_status = null;
			this.product_name = null;
			this.price = 0;
			this.product_text = null;
			this.product_genre = null;
		}

		//ゲッターメソッド
		public int getProduct_id() {

			return product_id;
		}
		public String getSeller_email() {

			return seller_email;
		}
		public String getSalse_status() {

			return salse_status;
		}
		public String getProduct_status() {

			return product_status;
		}

		public String getProduct_name() {

			return product_name;
		}

		public int getPrice() {

			return price;
		}

		public String getProduct_text() {

			return product_text;
		}

		public String getProduct_genre() {

			return product_genre;
		}


		//セッターメソッド
		public void setProduct_id(int product_id) {

			this.product_id = product_id;
		}
		public void setSeller_email(String seller_email) {

			this.seller_email = seller_email;
		}

		public void setSalse_status(String salse_status) {

			this.salse_status = salse_status;
		}

		public void setProduct_status(String product_status) {

			this.product_status = product_status;
		}

		public void setProduct_name(String product_name) {

			this.product_name = product_name;
		}

		public void setPrice(int price) {

			this.price = price;
		}

		public void setProduct_text(String product_text) {

			this.product_text = product_text;
		}

		public void setProduct_genre(String product_genre) {

			this.product_genre = product_genre;
		}

	}


