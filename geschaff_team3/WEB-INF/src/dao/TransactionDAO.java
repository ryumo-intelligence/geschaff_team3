package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import bean.Transaction;

public class TransactionDAO {

	private static String RDB_DRIVE = "com.mysql.jdbc.Driver";
	private static String URL = "jdbc:mysql://localhost/shoppingdb";
	private static String USER = "root";
	private static String PASSWD = "root123";

	// DB接続処理
	public static Connection getConnection() {
		try {
			Class.forName(RDB_DRIVE);
			Connection con = DriverManager.getConnection(URL, USER, PASSWD);
			return con;
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}

	public void insert(Transaction transaction) {

		Connection con = null;
		Statement smt = null;

		try {

			con = getConnection();
			smt = con.createStatement();

			// SQLを登録
			String sql = "INSERT INTO transactioninfo VALUES(NULL,'" + transaction.getPurchase_id() + "','"
					+ transaction.getSeller_email() + "'," + transaction.getPurchase_email() + "','0','0'";

			// SQLを実行
			smt.executeUpdate(sql);

		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			if (smt != null) {
				try {
					smt.close();
				} catch (SQLException ignore) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException ignore) {
				}
			}
		}
	}

	// 書籍データを更新するメソッド
	public void updateShippingStatus(Transaction transaction) {

		Connection con = null;
		Statement smt = null;

		try {

			// SQL文を格納
			String sql = "UPDATE transactioninfo SET shipping_status='1' WHERE transaction_id='"
					+ transaction.getTransaction_id() + "'";
			con = getConnection();
			smt = con.createStatement();
			// SQLを「実行
			smt.executeUpdate(sql);

		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			if (smt != null) {
				try {
					smt.close();
				} catch (SQLException ignore) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException ignore) {
				}
			}
		}
	}

	public void updatePaymentStatus(Transaction transaction) {

		Connection con = null;
		Statement smt = null;

		try {

			// SQL文を格納
			String sql = "UPDATE transactioninfo SET payment_status='1' WHERE transaction_id='"
					+ transaction.getTransaction_id() + "'";
			con = getConnection();
			smt = con.createStatement();
			// SQLを「実行
			smt.executeUpdate(sql);

		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			if (smt != null) {
				try {
					smt.close();
				} catch (SQLException ignore) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException ignore) {
				}
			}
		}
	}

}
