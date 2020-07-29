package lgx.service;

import java.util.List;

import lgx.entity.SysUser;

public interface SysUserService {
	
	public int addOne(SysUser user);
	
	public SysUser findOne(SysUser user);
	
	public List<SysUser> findAll();

}
