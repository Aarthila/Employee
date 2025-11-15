package com.Mobile.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Mobile.Repository.MobileRepository;
import com.Mobile.entity.MobileEntity;

@Repository
public class MobileDao {
	@Autowired
	MobileRepository mr;
	
	public String postAll(List<MobileEntity> a)
	{
		mr.saveAll(a);
		return "Saved Successfully";
	}
	public List<MobileEntity> getAll()
	{
		return mr.findAll();
	}
	public MobileEntity get(Integer a)
	{
		MobileEntity x=mr.findById(a).get();
		return x;
	}
	public String get1(Integer a)
	{
		mr.deleteById(a);
		return "Delete Successfully";
	}
	public String get2(MobileEntity m,Integer a)
	{
		MobileEntity x=mr.findById(a).get();
		x.setBrand(m.getBrand());
		x.setPrice(m.getPrice());
		x.setSize(m.getSize());
		x.setColor(m.getColor());
		x.setWarrenty(m.getWarrenty());
		mr.save(x);
		return "Updated Successfully";
	}
	public String get3(MobileEntity m,Integer a)
	{
		MobileEntity x=mr.findById(a).get();
		x.setPrice(m.getPrice());
		mr.save(x);
		return "Update Successfully";
	}
	public int getMaxvalue()
	{
		return mr.getMaxvalue();
	}
	public List<MobileEntity> getDetail()
	{
		return mr.getDetail();
	}
	public List<MobileEntity> getbrand(String a)
	{
		return mr.getbrand(a);
	}
	public List<MobileEntity> getvalue(Integer a, Integer b)
	{
		return mr.getvalue(a,b);
	}
	public List<MobileEntity> getValue(Integer a)
	{
		return mr.getValue(a);
	}
	public Integer getJP()
	{
		return mr.getJP();
	}
	public List<MobileEntity> getLike(List<MobileEntity> a)
	{
		return mr.getLike(a);
	}
	public List<MobileEntity> getExcept(String a)
	{
		return mr.getExcept(a);
	}
	public String postValue(List<MobileEntity> a)
	{
		mr.saveAll(a);
		return "Saved Successfullies";
	}
	public List<MobileEntity> getNum(Integer a)
	{
		return mr.getNum(a);
	}
	public List<MobileEntity> getMax(Integer a,Integer b)
	{
		return mr.getMax(a,b);
	}
	

}
