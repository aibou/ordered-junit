package sample;

import io.aibou.java.junit.ordered.Order;
import io.aibou.java.junit.ordered.OrderedRunner;
import io.aibou.java.junit.ordered.Priority;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by aibou on 2014/01/22.
 */

@RunWith(OrderedRunner.class)
public class SampleTest {

	@Test
	@Order(Priority.LOW)
	public void tailTest(){
		System.out.println("tail");
	}

	@Test
	@Order(Priority.NORMAL)
	public void normalTest(){
		System.out.println("normal");
	}

	@Test
	@Order(Priority.HIGH)
	public void headTest(){
		System.out.println("head");
	}
}

