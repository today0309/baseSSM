package com.ztw.mapperTest;

import javax.annotation.Resource;

import org.junit.Test;

import com.ztw.BaseTest;
import com.ztw.mapper.InitMapper;

public class InitMapperTest extends BaseTest{

	@Resource
	private InitMapper initMapper;
	
	@Test
	public void test000(){
		try {
			System.out.println(initMapper.getAll());
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
