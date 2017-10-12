package cn.com.liandi.springmvc.controller;




import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.com.liandi.springmvc.service.HelloService;

@Controller
public class HelloController extends AbstracXmmContoller {

	private static Log logger=LogFactory.getLog(HelloController.class);
	@Autowired
	private HelloService helloService;
	
	@RequestMapping("hello")
	public ModelAndView hello(ModelMap model, HttpServletRequest request, HttpServletResponse response){
		logger.info( "hello 启动了。。。");
		  return new ModelAndView("hello");
	}
}
