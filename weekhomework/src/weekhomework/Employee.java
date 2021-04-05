package weekhomework;
/**
 * 员工类
 * @author 翁聪
 *
 */
public class Employee {
	private int num;//编号
	private String name;//姓名
	private float rateOfAttend;//出勤率
	private float basicSal;//基本工资
	private float prize;//奖金
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getRateOfAttend() {
		return rateOfAttend;
	}
	public void setRateOfAttend(float rateOfAttend) {
		this.rateOfAttend = rateOfAttend;
	}
	public float getBasicSal() {
		return basicSal;
	}
	public void setBasicSal(float basicSal) {
		this.basicSal = basicSal;
	}
	public float getPrize() {
		return prize;
	}
	public void setPrize(float prize) {
		this.prize = prize;
	}
	/**
	 * 输出基本员工信息函数
	 */
	public void outputInfo() {
		System.out.println("Employee [编号=" + num + ", 姓名=" + name + ", 出勤率=" + rateOfAttend + ", 基本工资=" + basicSal
				+ ", 奖金=" + prize + "]"); 
	}
	/**
	 * 输出实发工资函数
	 */
	public void outputWage(){
		System.out.println("员工实发工资:"+(basicSal+prize*rateOfAttend));
	}
	public Employee(int num, String name, float rateOfAttend, float basicSal, float prize) {
		super();
		this.num = num;
		this.name = name;
		this.rateOfAttend = rateOfAttend;
		this.basicSal = basicSal;
		this.prize = prize;
	}
	public Employee() {
		super();
	}
	
}
