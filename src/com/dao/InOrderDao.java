package com.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.entity.InOrder;

@Repository("/inOrderDao")
public interface InOrderDao {

	/**
	 * 通过id查找订单信息
	 * @param id
	 * @return
	 */
	public InOrder findById(Integer id);


	/**
	 * 查找所有未批准订单信息
	 * @return
	 */
	public List<InOrder> Nlist(Map<String,Object> map);

	public List<InOrder> allNlist();

	public List<InOrder> allYlist();

	/**
	 * 查找所有已批准的订单信息(进货记录里查看用)
	 * @return
	 */
	public List<InOrder> Ylist(Map<String,Object> map);

	/**
	 * 删除订单
	 * @param id
	 * @return
	 */
	public int delete(Integer id);


	/**
	 * 添加订单信息
	 * @param order
	 * @return
	 */
	public int add(InOrder order);

	/**
	 * 更新订单信息
	 * @param order
	 * @return
	 */
	public int update(InOrder order);
	
	/**
	 * 获取所有未批准订单的数量
	 * @return
	 */
	public int getNCount(Map<String,Object> map);
	
	/**
	 * 获取所有已批准订单的数量
	 * @return
	 */
	public int getYCount(Map<String,Object> map);
}

