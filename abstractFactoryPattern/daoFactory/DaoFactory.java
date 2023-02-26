package abstractFactoryPattern.daoFactory;

import abstractFactoryPattern.dao.UserInfoDao;
import abstractFactoryPattern.productDao.ProductDao;

public abstract class DaoFactory {
    public abstract UserInfoDao createUserInfoDao();
    public abstract ProductDao createProductDao();
}