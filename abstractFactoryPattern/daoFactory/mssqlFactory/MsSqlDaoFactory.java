package abstractFactoryPattern.daoFactory.mssqlFactory;

import abstractFactoryPattern.daoFactory.DaoFactory;
import abstractFactoryPattern.dao.UserInfoDao;
import abstractFactoryPattern.productDao.ProductDao;
import abstractFactoryPattern.productDao.productDaoMssql.ProductMsSqlDao;
import abstractFactoryPattern.dao.mssqlDao.UserInfoMssqlDao;


public class MsSqlDaoFactory extends DaoFactory {
    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoMssqlDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductMsSqlDao();
    }
}