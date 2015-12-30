package com.mts.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mts.service.TxrService;

@Controller
public class TxrController {

	@Autowired
	private TxrService txrService;

	@RequestMapping(value = "/txr", method = RequestMethod.POST)
	public ModelAndView doTxr(@RequestParam String fromAccNum,
			                  @RequestParam String toAccNum,
			                  @RequestParam double amount) {

		txrService.txr(fromAccNum, toAccNum, amount);

		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "Txr Successfull");
		mav.setViewName("status");
		return mav;
	}

}
