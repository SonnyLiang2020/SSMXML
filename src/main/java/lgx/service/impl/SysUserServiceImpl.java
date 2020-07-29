package lgx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lgx.dao.SysUserDao;
import lgx.entity.SysUser;
import lgx.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {
	
	@Autowired
	private SysUserDao userDao; 

	@Override
	public int addOne(SysUser user) {
		return userDao.addSysUser(user);
	}

	@Override
	public SysUser findOne(SysUser user) {
		return userDao.findOne(user);
	}

	@Override
	public List<SysUser> findAll() {
		return userDao.findAll();
	}

}
