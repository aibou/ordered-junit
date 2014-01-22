package io.aibou.java.junit.ordered;

import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by A13167 on 2014/01/22.
 */
public class OrderedRunner extends BlockJUnit4ClassRunner {
	public OrderedRunner(Class<?> klass) throws InitializationError {
		super(klass);
	}

	@Override
	protected List<FrameworkMethod> computeTestMethods() {
		List<FrameworkMethod> methodList = super.computeTestMethods();
		Collections.sort(methodList, new Comparator<FrameworkMethod>() {
			public int compare(FrameworkMethod m1, FrameworkMethod m2) {
				Order o1 = m1.getAnnotation(Order.class);
				Order o2 = m2.getAnnotation(Order.class);

				if(o1 == null) {
					return -1;
				}
				if(o2 == null) {
					return 1;
				}

				return o1.value().getPriorityNumber() - o2.value().getPriorityNumber();
			}
		});
		return methodList;
	}
}