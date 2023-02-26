package abstractFactoryPattern.daoFactory.mysqlFactory;

import abstractFactoryPattern.daoFactory.DaoFactory;
import abstractFactoryPattern.dao.UserInfoDao;
import abstractFactoryPattern.productDao.ProductDao;
import abstractFactoryPattern.productDao.productDaoMysql.ProductMySqlDao;
import abstractFactoryPattern.dao.mysqlDao.UserInfoMysqlDao;

public class MySqlDaoFactory extends DaoFactory {
    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoMysqlDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductMySqlDao();
    }
}