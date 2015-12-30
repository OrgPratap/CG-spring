package com.container;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.anno.RequestMapping;
import com.controller.AccountController;

public class SomeContainer {

	// ------------------------------

	AccountController controller = new AccountController();

	// -------------------------------

	public void processRequest(String url) {

		Class clazz = controller.getClass();
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			RequestMapping rm = method.getAnnotation(RequestMapping.class);
			if (rm != null) {
				String urlValue = rm.url();
				if (url.equals(urlValue)) {
					try {
						method.invoke(controller, new Object[] {});
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

	}

}
