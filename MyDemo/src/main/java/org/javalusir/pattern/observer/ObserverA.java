package org.javalusir.pattern.observer;

/**
 * implements Iobserver interface
 * @author JavaLuSir
 *
 */
public class ObserverA implements IObserver{

	private String state;
	public void update(String newState) {
		state = newState;
		System.out.println("A主题状态为:"+state);
	}

}
