package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import dao.UserRepository;
import domain.UserBean;
public class UserRepositortyService {
	@Autowired
	private UserRepository userRespository;

	@Transactional(readOnly = true)
	public Optional<UserBean> login(String account, String passwd) {
		Optional<UserBean>bean = userRespository.findByAccount(account);
		if(bean!=null) {
			if(passwd!=null && passwd.length()!=0) {
				String pass = bean.get().getPassword();
				String temp = passwd;
				if(pass.equals(temp)) {
					return bean;
				}
			}
		}
		return null;
	}

//	public List<UserBean> select(UserBean bean) {
//		List<UserBean> result = null;
//		if(bean!=null && bean.getId()!=null && !bean.getId().equals(0)) {
//			Optional<UserBean> optional = userRespository.findById(bean.getId());
//			if(optional.isPresent()) {
//				result = new ArrayList<UserBean>();
//				result.add(optional.get());
//			}
//		} else {
//			result = userRespository.findAll();
//		}
//		return result;
//	}
//	
//	public UserBean insert (UserBean bean) {
//		UserBean result =null;
//		if(bean!=null&& bean.getId()!=null) {
//			boolean exist=userRespository.existsById(bean.getId());
//			if(!exist) {
//				return userRespository.save(bean);			
//		}
//	}
//	return result;
//}
}
