package polymorphism;

public class BeanFactory { //Ŭ���̾�Ʈ���� �ڵ������� TV��ü�� ������ �� �ֵ��� ����
	public Object getBean(String beanName) {
		if(beanName.equals("samsung")) {
			return new SamsungTV();
		} else if(beanName.equals("lg")) {
			return new LgTV();
		}
		return null;
	}
}