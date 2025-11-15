package com.Mobile.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mobile.Dao.MobileDao;
import com.Mobile.entity.MobileEntity;
import com.globalExceptionHandler.NameNotFoundException;
import com.globalExceptionHandler.PriceNotFoundException;

@Service
public class MobileService {
	@Autowired
	MobileDao md;
	public String postAll(List<MobileEntity> a)
	{
		return md.postAll(a);
	}
	public List<MobileEntity> getAll()
	{
		return md.getAll();
	}
	public MobileEntity get(Integer a)
	{
		return md.get(a);
	}
	public String get1(Integer a)
	{
		return md.get1(a);
	}
	public String get2(MobileEntity m,Integer a)
	{
		return md.get2(m,a);
	}
	public String get3(MobileEntity m,Integer a)
	{
		return md.get3(m,a);
	}
	public Integer getMax()
	{
		List<MobileEntity> x=md.getAll();
		return x.stream().map(y->y.getPrice()).max(Comparable::compareTo).get();
	}
	public MobileEntity getMax1()
	{
		List<MobileEntity> c=md.getAll();
		return c.stream().max(Comparator.comparing(MobileEntity::getPrice)).get();
	}
	public List<MobileEntity> getAcc()
	{
		List<MobileEntity> d=md.getAll();
		return d.stream().sorted(Comparator.comparing(MobileEntity::getPrice)).collect(Collectors.toList());
	}
	public long getCount()
	{
		List<MobileEntity> a=md.getAll();
		return a.stream().map(x->x.getColor()).count();
	}
	public List<MobileEntity> getEven()
	{
		List<MobileEntity> even=md.getAll();
		return even.stream().filter(x->x.getBrand().length()%2==0).collect(Collectors.toList());
	}
	public List<MobileEntity> getPercent()
	{
		List<MobileEntity> percent=md.getAll();
		return percent.stream().map(x->{ 
			if(x.getBrand().length()%2==0) 
			{
				x.setPrice(x.getPrice()+x.getPrice()*10/100);
			}
			return x;
			}).collect(Collectors.toList());
	}
	public Integer getSum()
	{
		List<MobileEntity> sum=md.getAll();
		return sum.stream().map(x->x.getPrice()).collect(Collectors.summingInt(x->x));
	}
	public int getMaxvalue()
	{
		return md.getMaxvalue();
	}
	public List<MobileEntity> getDetail()
	{
		return md.getDetail();
	}
	public List<MobileEntity> getbrand(String a)
	{
		return md.getbrand(a);
	}
	public List<MobileEntity> getvalue(Integer a, Integer b)
	{
		return md.getvalue(a,b);
	}
	public List<MobileEntity> getValue(Integer a)
	{
		return md.getValue(a);
	}
	public Integer getJP()
	{
		return md.getJP();
	}
	public List<MobileEntity> getLike(List<MobileEntity> a)
	{
		return md.getLike(a);
	}
	public List<MobileEntity> getExcept(String a) throws NameNotFoundException
	{
		List<MobileEntity> result=md.getExcept(a);
		if(result.isEmpty())
		{
			throw new NameNotFoundException ("Name Not Found");
		}
		else {
			return md.getExcept(a);
		}
	}
	public String postValue(List<MobileEntity> a)
	{
		return md.postValue(a);
	}
	public List<MobileEntity> getNum(Integer a) throws PriceNotFoundException
	{
		List<MobileEntity> price=md.getNum(a);
		if(price.isEmpty())
		{
			throw new PriceNotFoundException("Price Not found");
		}
		else {
			return md.getNum(a);
		}
	}
	public List<MobileEntity> getMax(Integer a, Integer b)
	{
		return md.getMax(a,b);
	}
	
	public List<MobileEntity> getSecMax()
	{
		List<MobileEntity> c=md.getAll();
		
		Integer second=c.stream().map(x->x.getPrice()).sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
			
		ArrayList<MobileEntity> distinct=new ArrayList<>();
		c.forEach(x->{
			if(x.getPrice()==second) {
				distinct.add(x);
			}
			});
return distinct;
//		List<Integer> firstMax=distinct.stream().map(x->x.getPrice()).distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//		
//		int second=firstMax;
//		
//		List<MobileEntity> secondMax=distinct.stream().filter(x->x.getPrice()==second).collect(Collectors.toList());
//		return secondMax;
//		
	}

}
