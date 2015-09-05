/**
 * 
 */
package org.techmentro.training.struts2x.arch;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Result;

/**
 * @author Adrish
 *
 */
@SuppressWarnings("serial")
public class TechMentroResult implements Result {
	private String pageUrl;
	public static final String DEFAULT_PARAM = "pageUrl";
	/**
	 * @return the pageUrl
	 */
	public String getPageUrl() {
		return pageUrl;
	}
	/**
	 * @param pageUrl the pageUrl to set
	 */
	public void setPageUrl(String pageUrl) {
		System.out.println("pageUrl value is getting set");
		this.pageUrl = pageUrl;
	}
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.Result#execute(com.opensymphony.xwork2.ActionInvocation)
	 */
	public void execute(ActionInvocation ai) throws Exception {
		System.out.println("Result is asked to invoke the page");
		ServletRequest  request = ServletActionContext.getRequest();
		ServletResponse response = ServletActionContext.getResponse();
		RequestDispatcher dispatcher = request.getRequestDispatcher(pageUrl);
		dispatcher.forward(request, response);
	}
}
