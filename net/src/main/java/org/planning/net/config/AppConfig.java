package org.planning.net.config;

import java.io.IOException;
import java.util.Properties;

import javax.inject.Singleton;
import javax.sql.DataSource;

import org.seasar.doma.SingletonConfig;
import org.seasar.doma.jdbc.DomaAbstractConfig;
import org.seasar.doma.jdbc.SimpleDataSource;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.MssqlDialect;
import org.seasar.doma.jdbc.tx.LocalTransaction;
import org.seasar.doma.jdbc.tx.LocalTransactionalDataSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javassist.bytecode.stackmap.TypeData.ClassName;

@SingletonConfig
@Transactional
@Component
@Repository
public class AppConfig extends DomaAbstractConfig {

    private static final String JDBC_FILE = "datasource-cfg.properties";

    private static final String URL = "jdbc.sqlServer.url";

    private static final String USER = "jdbc.sqlServer.user";

    private static final String PASSWORD = "jdbc.sqlServer.password";

    private static final String DATABASE_NAME = "jdbc.sqlServer.databaseName";

    static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    protected static final LocalTransactionalDataSource dataSource = createDataSource();

    protected static final Dialect dialect = new MssqlDialect();

    @Override
    public DataSource getDataSource() {

        return dataSource;
    }

    @Override
    public Dialect getDialect() {

        return dialect;
    }

    protected static LocalTransactionalDataSource createDataSource() {

        Properties prop = new Properties();
        try {
            prop.load(ClassName.class.getClassLoader().getResourceAsStream(JDBC_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String url = prop.getProperty(URL);
        String user = prop.getProperty(USER);
        String password = prop.getProperty(PASSWORD);
        String databaseName = prop.getProperty(DATABASE_NAME);

        String connection = url + ";" + "databaseName=" + databaseName;

        SimpleDataSource dataSource = new SimpleDataSource();
        dataSource.setUrl(connection);
        dataSource.setUser(user);
        dataSource.setPassword(password);

        return new LocalTransactionalDataSource(dataSource);
    }

    public static LocalTransaction getLocalTransaction() {

        return dataSource.getLocalTransaction(defaultJdbcLogger);
    }

//     TODO example
//     LocalTransaction tx = NaganoSqlServerDbConfig.getLocalTransaction();
//     tx.begin();
//
//     SqlServerDao sqlServerDao = new SqlServerDaoimpl();
//     int csdc = sqlServerDao.selectCountTestSqlServer();
//     System.out.println(csdc);
//
//     tx.commit();

}