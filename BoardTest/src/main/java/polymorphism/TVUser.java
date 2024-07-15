package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		//0. applicationCon���ٰ� bin��ü ����
		
		//1. Spring �����̳ʸ� �����Ѵ�.
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
	
		//2. Spring �����̳ʷκ��� �ʿ��� ��ü�� ��û(Look Up)�Ѵ�.
		// lookup�ϴ� ���� �����̵Ǽ� �츮�� ���� ��ü�� ����ְԵ� (��ü�� ����ϱ����� ����)
		TV tv = (TV)factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		//3. Spring �����̳ʸ� �����Ѵ�.
		factory.close(); //�����̳ʿ� �Բ� ��ü�� ������
	}
}