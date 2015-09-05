/**
 * 
 */
package org.techmentro.training.struts2x.arch;

import java.util.Enumeration;

import javax.servlet.ServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * @author Adrish
 *
 */
@SuppressWarnings("serial")
public class TechMentroInterceptor implements Interceptor {

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.interceptor.Interceptor#destroy()
	 */
	public void destroy() {	System.out.println("TechMentroInterCeptor Destroy");	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.interceptor.Interceptor#init()
	 */
	public void init() { System.out.println("TechMentroInterCeptor Init");	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.interceptor.Interceptor#intercept(com.opensymphony.xwork2.ActionInvocation)
	 */
	public String intercept(ActionInvocation ai) throws Exception {
		// Preprocessing logic if any
		ValueStack vs = ai.getStack();
		ServletRequest request = ServletActionContext.getRequest();
		@SuppressWarnings("unchecked")
		Enumeration<String>	e = request.getParameterNames();
		
		while(e.hasMoreElements()){
			String pName = e.nextElement();
			String pValue = request.getParameter(pName);
			vs.setValue(pName, pValue);
		}
		//get the next component invoked
		String str = ai.invoke();
		//return succss;//to change the flow
		//post processing logic if any
		
		//return the received string
		return str;
	}

}
