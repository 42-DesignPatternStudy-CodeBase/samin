package abstractFactoryPattern.daoFactory.oracleFactory;

import abstractFactoryPattern.daoFactory.DaoFactory;
import abstractFactoryPattern.dao.UserInfoDao;
import abstractFactoryPattern.productDao.ProductDao;
import abstractFactoryPattern.dao.oracleDao.UserInfoOracleDao;
import abstractFactoryPattern.productDao.productDaoOracle.ProductOracleDao;

public class OracleDaoFactory extends DaoFactory {
    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoOracleDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductOracleDao();
    }
}