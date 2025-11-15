package com.Mobile.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Mobile.entity.MobileEntity;
import com.Mobile.service.MobileService;
import com.globalExceptionHandler.NameNotFoundException;
import com.globalExceptionHandler.PriceNotFoundException;

@RestController
@RequestMapping(value="/mob/api")
public class MobileController {
	@Autowired
	MobileService ms;
	
	@PostMapping(value="/postvalue")
	public String postAll(@RequestBody List<MobileEntity> a)
	{
		return ms.postAll(a);
	}
	@GetMapping(value="/getvalue")
	public List<MobileEntity> getAll()
	{
		return ms.getAll();
	}
	@GetMapping(value="/getvalu/{a}")
	public MobileEntity get(@PathVariable Integer a)
	{
		return ms.get(a);
	}
	@DeleteMapping(value="/getvalue1/{a}")
	public String get1(@PathVariable Integer a)
	{
		return ms.get1(a);
	}
	@PutMapping(value="/getvalue2/{a}")
	public String get2(@RequestBody MobileEntity m,@PathVariable Integer a)
	{
		return ms.get2(m,a);
	}
	@PatchMapping(value="/getvalue3/{a}")
	public String get3(@RequestBody MobileEntity m,@PathVariable Integer a)
	{
		return ms.get3(m,a);
		
	}
	@GetMapping("/getmax")
	public Integer getMax()
	{
		return ms.getMax();
	}
	@GetMapping("/getmax1")
	public MobileEntity getMax1()
	{
		return ms.getMax1();
	}
	@GetMapping("/getAccPrice")
	public List<MobileEntity> getAcc()
	{
		return ms.getAcc();
	}
	@GetMapping("/getcount")
	public long getCount()
	{
		return ms.getCount();
	}
	@GetMapping("/geteven")
	public List<MobileEntity> getEven()
	{
		return ms.getEven();
	}
	@GetMapping("/getpercent")
	public List<MobileEntity> getPercent()
	{
		return ms.getPercent();
	}
	@GetMapping("/getsum")
	public Integer getSum()
	{
		return ms.getSum();
	}
	@GetMapping("/getmaxvalue")
	public int getMaxvalue()
	{
		return ms.getMaxvalue();
	}
	@GetMapping("/get")
	public List<MobileEntity> getDetail()
	{
		return ms.getDetail();				
	}
	@GetMapping("/getbrand/{a}")
	public List<MobileEntity> getbrand(@PathVariable String a)
	{
		return ms.getbrand(a);
	}
	@GetMapping("/getbrand1")
	public List<MobileEntity> getvalue(@RequestParam Integer a,@RequestParam Integer b)
	{
		return ms.getvalue(a,b);
	}
	@GetMapping(value="/getent/{a}")
	public List<MobileEntity> getValue(@PathVariable Integer a)
	{
		return ms.getValue(a);
	}
	@GetMapping("/getjpquery")
	public Integer getJP()
	{
		return ms.getJP();
	}
	@GetMapping(value="/getlike/{a}")
	public List<MobileEntity> getLike(@PathVariable List<MobileEntity> a)
	{
		return ms.getLike(a);
	}
	@GetMapping("/getException/{a}")
	public List<MobileEntity> getExcept(@PathVariable String a) throws NameNotFoundException 
	{
		return ms.getExcept(a);
	}
	@PostMapping(value="/getpostvalue")
	public String postValue(@RequestBody List<MobileEntity> a)
	{
		return ms.postValue(a);
	}
	@GetMapping("/getprice/{a}")
	public List<MobileEntity> getNum(@PathVariable Integer a) throws PriceNotFoundException 
	{
		return ms.getNum(a);
	}
	@GetMapping("/getmaxprice/{a}/{b}")
	public List<MobileEntity> getMax(@PathVariable Integer a,@PathVariable Integer b)
	{
		return ms.getMax(a,b);
	}
	@GetMapping("/getsecmax")
	public List<MobileEntity> getSecMax()
	{
		return ms.getSecMax();
	}
	
}

