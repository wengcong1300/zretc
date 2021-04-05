package weekhomework;
/**
 * 测试类
 * @author 翁聪
 *
 */
public class EmployeeTest {

	public static void main(String[] args) {
		//无参构造和有参构造方法创建销售员
		Saleman s0=new Saleman();
		s0.outputInfo();//输出基本信息
		s0.outputWage();//输出实发工资
		Saleman s1=new Saleman(1, "夏利", 0.8f, 3000f, 1000f, 0.2f, 10000f);
		s1.outputInfo();//输出基本信息
		s1.outputWage();//输出实发工资

		//无参构造和有参构造方法创建经理
		Manager m0=new Manager();
		m0.outputInfo();//输出基本信息
		m0.outputWage();//输出实发工资
		Manager m1=new Manager(2, "毛五", 0.8f, 5000f, 2000f, 0.5f, 30000f);
		m1.outputInfo();//输出基本信息
		m1.outputWage();//输出实发工资
	}

}
