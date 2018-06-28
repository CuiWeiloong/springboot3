package com.cralor.springboot3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
//@RequestMapping(value = "hello")
public class HelloController {

 /*   @Value("${person.size}")
    private String size;
    @Value("${person.content}")
    private String content;*/

    @Autowired
    private Person person;

    /**
     * 多个路径对应同一个方法           method = RequestMethod.GET   如果不指定请求方式，get post 都可以，所以要指定
     * @return
     */
    @RequestMapping(value = {"/hello","hi"},method = RequestMethod.GET)
    public String say(){
        return "Hello Spring Boot!";
    }
    /**
     * 获取url中的参数
     * @param id
     * @param pre
     * @return
     */
    @RequestMapping(value = {"/{pre}/test/{id}"},method = RequestMethod.GET)
    public String hello(@PathVariable("id") String id,@PathVariable("pre") String pre){
        return pre+"Hello Spring Boot!"+id;
    }
    /**
     * 获取请求参数1
     * @param id
     * @return
     */
    @RequestMapping(value = {"/test1"})
    public String test(@RequestParam(value = "id",required = false,defaultValue = "0") String id){
        return "Hello Spring Boot!"+id;
    }
    /**
     * 获取请求参数2  @GetMapping  默认get请求，@PostMapping 默认post请求
     * @param id
     * @return
     */
//  @PostMapping("test2")
    @GetMapping("test2")
    public String test1(@RequestParam(value = "id",required = false,defaultValue = "0") String id){
        return "Hello Spring Boot!"+id;
    }
    @RequestMapping(value = {"/say"},method = RequestMethod.POST)
    public String say1(){
        return "Hello Spring Boot!";
    }
    @GetMapping( "size")
    public String size(){
        return person.getSize();
    }

    /**
     * 访问static中的静态页面，有后缀。默认无法直接跳转到static下，可以用重定向
     * @return
     */
    @GetMapping( "sss")
    public ModelAndView test3(){
        return new ModelAndView("redirect:test.html");
    }
    @RequestMapping( "zzz")
    public ModelAndView test5(ModelAndView modelAndView){
        modelAndView.setViewName("thymeleaft");
        return modelAndView;
    }

}
