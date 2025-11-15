package com.Mobile.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Mobile.entity.MobileEntity;

public interface MobileRepository extends JpaRepository<MobileEntity,Integer>{
	
	@Query(value="SELECT max(price) FROM mobiledb.mobile_table",nativeQuery=true)
	public int getMaxvalue();
	
	@Query(value="SELECT*FROM mobiledb.mobile_table WHERE price=(SELECT max(price) FROM mobiledb.mobile_table)",nativeQuery=true)
	public List<MobileEntity> getDetail();
	
	@Query(value="SELECT * FROM mobiledb.mobile_table WHERE brand=?1",nativeQuery=true)
	public List<MobileEntity> getbrand(String a);
	
	@Query(value="SELECT*FROM mobiledb.mobile_table WHERE price BETWEEN ?1 and ?2",nativeQuery=true)
	public List<MobileEntity> getvalue(Integer a,Integer b);
	
	@Query(value="SELECT e FROM MobileEntity e WHERE e.price=?1")
	public List<MobileEntity> getValue(Integer a);
	
	@Query(value="SEL"+"ECT max(e.price) FROM MobileEntity e")
	public Integer getJP();
	
//	@Query(value="SELECT e FROM MobileEntity e WHERE e.price LIKE 'a%'")
//	public List<MobileEntity> getValue(Integer a);
//	
//	@Query(value="SELECT e FROM MobileEntity e WHERE e.price LIKE '%a'")
//	public List<MobileEntity> getValue(Integer a);
//	
//	@Query(value="SELECT e FROM MobileEntity e WHERE e.price LIKE '_a%'")
//	public List<MobileEntity> getValue(Integer a);
//	
//	@Query(value="SELECT e FROM MobileEntity e WHERE e.price LIKE IN('a%', 's%', 'k%')")
//	public List<MobileEntity> getValue(Integer a);
//	
//	@Query(value="SELECT e FROM MobileEntity e WHERE price=1000 or price=2000 or price=3000")
//	public List<MobileEntity> getValue(Integer a);
//	
//	@Query(value="SELECT e FROM MobileEntity e WHERE price IN (1000,2000,3000)")
//	public List<MobileEntity> getValue(Integer a);
	
	@Query(value="SELECT e FROM MobileEntity e WHERE e.price=?1 ")
	public List<MobileEntity> getLike(List<MobileEntity> a);
	
	@Query(value="SELECT*FROM mobiledb.mobile_table WHERE brand=?1",nativeQuery=true)
	public List<MobileEntity> getExcept(String a);
	
	@Query(value="SELECT*FROM mobiledb.mobile_table WHERE price=?1",nativeQuery=true)
	public List<MobileEntity> getNum(Integer a);
	
	@Query(value="SELECT*FROM mobiledb.mobile_table WHERE price>=? and price<=?",nativeQuery=true)
	public List<MobileEntity> getMax(Integer a, Integer b);
	

}
