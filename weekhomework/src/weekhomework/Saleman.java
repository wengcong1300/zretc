package weekhomework;
/**
 * 销售员类
 * @author 翁聪
 *
 */
public class Saleman extends Employee{
	private float deductRate;//销售员提成比例
	private float personAmount;//个人销售额
	public float getDeductRate() {
		return deductRate;
	}
	public void setDeductRate(float deductRate) {
		this.deductRate = deductRate;
	}
	public float getPersonAmount() {
		return personAmount;
	}
	public void setPersonAmount(float personAmount) {
		this.personAmount = personAmount;
	}
	public Saleman(int num, String name, float rateOfAttend, float basicSal, float prize, float deductRate,
			float personAmount) {
		super(num, name, rateOfAttend, basicSal, prize);
		this.deductRate = deductRate;
		this.personAmount = personAmount;
	}
	public Saleman() {

	}
	/**
	 * 输出销售员实发工资函数
	 */
	public void outputWage(){
		System.out.println("销售员实发工资:"+(super.getBasicSal()+super.getPrize()*super.getRateOfAttend()+personAmount*deductRate));
	}
	/**
	 * 输出销售员信息函数
	 */
	public void outputInfo() {
		System.out.println("Saleman [编号=" + super.getNum() + ", 姓名=" + super.getName() + ", 出勤率=" + super.getRateOfAttend() + ", 基本工资=" + super.getBasicSal()
				+ ", 奖金=" + super.getPrize() + ",销售员提成比例="+deductRate+", 个人销售额="+personAmount+"]"); 
	}
}
