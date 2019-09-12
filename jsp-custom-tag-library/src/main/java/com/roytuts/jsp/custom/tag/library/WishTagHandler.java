package com.roytuts.jsp.custom.tag.library;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class WishTagHandler extends TagSupport {

	private static final long serialVersionUID = 1L;

	private String name;

	@Override
	public int doStartTag() throws JspException {
		JspWriter jspWriter = pageContext.getOut();
		try {
			jspWriter.println("Hello " + name);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
