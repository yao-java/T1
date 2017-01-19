package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import mapper.ItemsMapper;

import po.Items;
import service.ItemsService;
@Service
public class ItemsServiceImpl implements ItemsService {
	@Autowired
	private ItemsMapper itemsMapper;
	
	@Cacheable(value="testCache")
	@Override
	public List<Items> findItemsList() throws Exception {
		System.out.println("查数据库了===========");
		return itemsMapper.list();
	}

}
