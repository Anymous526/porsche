package com.wallet.porsche.web.controller;

import java.beans.PropertyEditor;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

public class BaseController {

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class,
				(PropertyEditor) new CustomDateEditor(new SimpleDateFormat(
						"yyyy-MM-dd HH:mm:ss"), true));
	}
}
