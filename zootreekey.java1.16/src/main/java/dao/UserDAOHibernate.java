//package dao;
//
//import java.io.Serializable;
//
//import javax.persistence.PersistenceContext;
//
//import org.hibernate.Session;
//import org.springframework.stereotype.Repository;
//
//import domain.UserBean;
//
//@Repository
//public class UserDAOHibernate implements UserRepsitory {
//		@PersistenceContext
//		private Session session;
//
//		public Session getSession() {
//			return this.session;
//		}
//
//		public UserBean select(String custid) {
//			if (custid != null) {
//				return this.getSession().get(UserBean.class, custid);
//			}
//			return null;
//		}
//
//		public boolean update(String password, String email, java.util.Date birth, String custid) {
//			if (custid != null) {
//				UserBean temp = this.getSession().get(UserBean.class, custid);
//				if (temp != null) {
//					temp.setPassword(password);
//					temp.setEmail(email);
//					return true;
//				}
//			}
//			return false;
//		}
//
//		@Override
//		public UserBean insert(UserBean bean) {
//			if (bean != null && bean.getaccount() != null) {
//				UserBean temp = this.getSession().get(UserBean.class, bean.getaccount());
//				if (temp == null) {
//					Serializable pk = this.getSession().save(bean);
//					return bean;
//				}
//			}
//			return null;
//		}
//	}
//
//}
