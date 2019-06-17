package org.planning.net.dao.impl;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2019-06-17T14:01:58.714+0700")
public class testDomaimpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.planning.net.dao.testDoma {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public testDomaimpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public java.lang.String testDoma() {
        entering("org.planning.net.dao.impl.testDomaimpl", "testDoma");
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/planning/net/dao/testDoma/testDoma.sql");
            __query.setCallerClassName("org.planning.net.dao.impl.testDomaimpl");
            __query.setCallerMethodName("testDoma");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.String> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.String>(__query, new org.seasar.doma.internal.jdbc.command.BasicSingleResultHandler<java.lang.String>(new org.seasar.doma.wrapper.StringWrapper(), false));
            java.lang.String __result = __command.execute();
            __query.complete();
            exiting("org.planning.net.dao.impl.testDomaimpl", "testDoma", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.planning.net.dao.impl.testDomaimpl", "testDoma", __e);
            throw __e;
        }
    }

    @Override
    public org.planning.net.entity.NhanVien selectByTaiKhoanAndPass(java.lang.String taiKhoan, java.lang.String matKhau) {
        entering("org.planning.net.dao.impl.testDomaimpl", "selectByTaiKhoanAndPass", taiKhoan, matKhau);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/planning/net/dao/testDoma/selectByTaiKhoanAndPass.sql");
            __query.addParameter("taiKhoan", java.lang.String.class, taiKhoan);
            __query.addParameter("matKhau", java.lang.String.class, matKhau);
            __query.setCallerClassName("org.planning.net.dao.impl.testDomaimpl");
            __query.setCallerMethodName("selectByTaiKhoanAndPass");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<org.planning.net.entity.NhanVien> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<org.planning.net.entity.NhanVien>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<org.planning.net.entity.NhanVien>(org.planning.net.entity._NhanVien.getSingletonInternal()));
            org.planning.net.entity.NhanVien __result = __command.execute();
            __query.complete();
            exiting("org.planning.net.dao.impl.testDomaimpl", "selectByTaiKhoanAndPass", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.planning.net.dao.impl.testDomaimpl", "selectByTaiKhoanAndPass", __e);
            throw __e;
        }
    }

}
