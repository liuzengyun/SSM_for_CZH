package cn.edu.upc.csn.controller;


import cn.edu.upc.csn.model.Csnuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@Controller
@RequestMapping(value="/csnuser",method = {RequestMethod.POST,RequestMethod.GET})
public class CsnuserController {
    @Autowired
    private cn.edu.upc.csn.service.CsnuserService csnuserService;


    @RequestMapping("/insert")
    @ResponseBody
    public Map<String,Object> insert(@RequestBody Csnuser record){
        Map map=new HashMap<String,Object>();
        map.put("status","success");
        map.put("result",csnuserService.insert(record));
        return  map;
    }
    @RequestMapping("/get")
    @ResponseBody
    public Map<String,Object> get(){
        Map map=new HashMap<String,Object>();
        map.put("status","success");
        return  map;
    }



    @InitBinder
    protected void initBinder(WebDataBinder binder){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));

    }


}