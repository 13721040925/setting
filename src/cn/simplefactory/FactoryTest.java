package cn.simplefactory;


// 二者共同的接口
interface Human {
	public void eat();

	public void sleep();

	public void beat();
}

class Male implements Human {
	@Override
	public void eat() {
		System.out.println("Male can eat.");
	}

	@Override
	public void sleep() {
		System.out.println("Male can sleep.");
	}

	@Override
	public void beat() {
		System.out.println("Male can beat.");
	}
}

class Female implements Human {
	@Override
	public void eat() {
		System.out.println("Female can eat.");
	}

	@Override
	public void sleep() {
		System.out.println("Female can sleep.");
	}

	@Override
	public void beat() {
		System.out.println("Female can beat.");
	}
}

/**
 * 普通工厂模式
 * 
 * @author Administrator
 *
 */
class HumanFactory1 {
	public Human createHuman(String gender) {
		if (gender.equals("male")) {
			return new Male();
		} else if (gender.equals("female")) {
			return new Female();
		} else {
			System.out.println("请输入正确的类型！");
			return null;
		}
	}
}

// 多个工厂模式
class HumanFactory2 {
	public Male createMale() {
		return new Male();
	}

	public Female createFemale() {
		return new Female();
	}
}

public class FactoryTest {
	public static void main(String[] args) {
		HumanFactory1 factory1 = new HumanFactory1();
		Human male1 = factory1.createHuman("male");
		male1.eat();
		male1.sleep();
		male1.beat();

		HumanFactory2 factory2 = new HumanFactory2();
		Human male2 = factory2.createMale();
		male2.eat();
		male2.sleep();
		male2.beat();
	}
}
