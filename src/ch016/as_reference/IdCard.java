package ch016.as_reference;

/**
 * 演示this作为对象的默认引用
 * 该类描述身份证
 * @author 程序猿大头
 * 
 */
public class IdCard {
	/**
	 * 身份证号码
	 */
	private String idNo;

	/**
	 * 身份证地址
	 */
	private String address;

	/**
	 * 身份证对应的人
	 */
	private Person person;

	public IdCard() {

	}

	public IdCard(String idNo, String address, Person person) {
		this.idNo = idNo;
		this.address = address;
		this.person = person;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
