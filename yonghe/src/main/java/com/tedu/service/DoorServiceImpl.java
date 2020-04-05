package com.tedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.dao.DoorMapper;
import com.tedu.pojo.Door;

/* spring会扫描service包下的所有类
 * 将类上带有@Service注解的类, 自动注册到
 * spring容器中, 即由spring创建该类的实例 */
@Service 
public class DoorServiceImpl 
			implements DoorService {
	@Autowired //由spring自动为属性赋值
	DoorMapper doorMapper;
	
	
	public List<Door> findAll() {
		//调用findAll方法查询所有门店信息
		List<Door> list = doorMapper.findAll();
		return list;
	}

	
	public void deleteById(Integer id) {
		//根据id删除门店信息
		doorMapper.deleteById(id);
	}

	
	public void addDoor(Door door) {
		doorMapper.addDoor(door);
	}

	
	public Door findById(Integer id) {
		Door door = doorMapper.findById(id);
		return door;
	}

	
	public void updateById(Door door) {
		doorMapper.updateById(door);
	}
}




