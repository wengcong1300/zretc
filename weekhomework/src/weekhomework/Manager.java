package weekhomework;
/**
 * 经理类
 * @author 翁聪
 *
 */
public class Manager extends Employee{
	private float totalDeductRate;//经理提成比例
	private float totalAmount;//总销售额

	public float getTotalDeductRate() {
		return totalDeductRate;
	}
	public void setTotalDeductRate(float totalDeductRate) {
		this.totalDeductRate = totalDeductRate;
	}
	public float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Manager() {

	}
	public Manager(int num, String name, float rateOfAttend, float basicSal, float prize, float totalDeductRate,
			float totalAmount) {
		super(num, name, rateOfAttend, basicSal, prize);
		this.totalDeductRate = totalDeductRate;
		this.totalAmount = totalAmount;
	}
	/**
	 * 输出经理实发工资函数
	 */
	public void outputWage(){
		System.out.println("经理实发工资:"+(super.getBasicSal()+super.getPrize()*super.getRateOfAttend()+totalAmount*totalDeductRate));
	}
	/**
	 * 输出经理信息函数
	 */
	public void outputInfo() {
		System.out.println("Manager [编号=" + super.getNum() + ", 姓名=" + super.getName() + ", 出勤率=" + super.getRateOfAttend() + ", 基本工资=" + super.getBasicSal()
				+ ", 奖金=" + super.getPrize() + ",经理提成比例="+totalDeductRate+", 个人销售额="+totalAmount+"]"); 
	}

}
