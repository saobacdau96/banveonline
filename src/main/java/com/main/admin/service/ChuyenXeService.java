package com.main.admin.service;

import com.main.admin.model.ChuyenXe;

public interface ChuyenXeService {
	
	public Iterable<ChuyenXe> findAll();
	
	public void xoaChuyenXe(int id);
	
	public void luuChuyenXe(ChuyenXe chuyenXe);
	
	public ChuyenXe tim(int id);
}
