package lgx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import lgx.entity.SysUser;

@Repository
public interface SysUserDao {
	
	@Insert("insert into sys_user values(null, #{username}, #{password}, 1)")
	public int addSysUser(SysUser user);
	
	@Select("select * from sys_user where username=#{username} and password=#{password}")
	public SysUser findOne(SysUser user);
	
	@Select("select * from sys_user")
	public List<SysUser> findAll();

}
