/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint;

/**
 *
 * @author Michael
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {

   @RequestMapping(value = "/index", method = RequestMethod.GET)
   public String index() {
	   return "index";
   }
   
   @RequestMapping(value = "/redirect", method = RequestMethod.GET)
   public String redirect() {
     
      return "redirect:finalPage";
   }
   
   @RequestMapping(value = "/finalPage", method = RequestMethod.GET)
   public String finalPage() {
     
      return "final";
   }
}