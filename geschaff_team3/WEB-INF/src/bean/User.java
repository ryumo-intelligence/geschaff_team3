
package bean;

public class User {

	private String email; // メールアドレス
	private String password; // パスワード
	private String name;
	private String name_kana;
	private String authority; // 権限（0：管理者 1：一般ユーザー、）
	private String user_name; // ユーザーネーム
	private String birthday; // 生年月日
	private String adress; // 住所




	public User() {
		this.email = null;
		this.password = null;
		this.name = null;
		this.name_kana = null;
		this.authority = null;
		this.user_name = null;
		this.birthday = null;
		this.adress = null;
	}

	//ゲッターメソッド
	public String getEmail() {

		return email;
	}
	public String getPassword() {

		return password;
	}
	public String getName() {

		return name;
	}
	public String getName_kana() {

		return name_kana;
	}

	public String getAuthority() {

		return authority;
	}

	public String getUser_name() {

		return user_name;
	}

	public String getBirtday() {

		return birthday;
	}

	public String getAdress() {

		return adress;
	}


	//セッターメソッド
	public void setEmail(String email) {

		this.email = email;
	}
	public void setPassword(String password) {

		this.password = password;
	}

	public void setName(String name) {

		this.name = name;
	}

	public void setName_kana(String name_kana) {

		this.name_kana = name_kana;
	}

	public void setAuthority(String authority) {

		this.authority = authority;
	}

	public void setUser_name(String user_name) {

		this.user_name = user_name;
	}

	public void setBirthday(String birthday) {

		this.birthday = birthday;
	}

	public void setAdress(String adress) {

		this.adress = adress;
	}

}
