package org.planning.net.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2019-06-17T14:01:58.515+0700")
public final class _KhachHang extends org.seasar.doma.jdbc.entity.AbstractEntityType<org.planning.net.entity.KhachHang> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _KhachHang __singleton = new _KhachHang();

    /** the maKhachHang */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.KhachHang, java.lang.String, java.lang.Object> $maKhachHang = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.KhachHang, java.lang.String, java.lang.Object>(org.planning.net.entity.KhachHang.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "maKhachHang", "MA_KHACH_HANG", true, true);

    /** the tenKhachHang */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.KhachHang, java.lang.String, java.lang.Object> $tenKhachHang = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.KhachHang, java.lang.String, java.lang.Object>(org.planning.net.entity.KhachHang.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "tenKhachHang", "TEN_KHACH_HANG", true, true);

    /** the sdt */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.KhachHang, java.lang.String, java.lang.Object> $sdt = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.KhachHang, java.lang.String, java.lang.Object>(org.planning.net.entity.KhachHang.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sdt", "SDT", true, true);

    /** the taiKhoan */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.KhachHang, java.lang.Integer, java.lang.Object> $taiKhoan = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.KhachHang, java.lang.Integer, java.lang.Object>(org.planning.net.entity.KhachHang.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "taiKhoan", "TAI_KHOAN", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<org.planning.net.entity.KhachHang> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.KhachHang, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.KhachHang, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.KhachHang, ?>> __entityPropertyTypeMap;

    private _KhachHang() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<org.planning.net.entity.KhachHang>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "KhachHang";
        __catalogName = "";
        __schemaName = "";
        __tableName = "KhachHang";
        __qualifiedTableName = "KhachHang";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.KhachHang, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.KhachHang, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.KhachHang, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.KhachHang, ?>>(4);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.KhachHang, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.KhachHang, ?>>(4);
        __list.add($maKhachHang);
        __map.put("maKhachHang", $maKhachHang);
        __list.add($tenKhachHang);
        __map.put("tenKhachHang", $tenKhachHang);
        __list.add($sdt);
        __map.put("sdt", $sdt);
        __list.add($taiKhoan);
        __map.put("taiKhoan", $taiKhoan);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return __tableName;
    }

    @Override
    public String getQualifiedTableName() {
        return __qualifiedTableName;
    }

    @Override
    public void preInsert(org.planning.net.entity.KhachHang entity, org.seasar.doma.jdbc.entity.PreInsertContext<org.planning.net.entity.KhachHang> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(org.planning.net.entity.KhachHang entity, org.seasar.doma.jdbc.entity.PreUpdateContext<org.planning.net.entity.KhachHang> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(org.planning.net.entity.KhachHang entity, org.seasar.doma.jdbc.entity.PreDeleteContext<org.planning.net.entity.KhachHang> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(org.planning.net.entity.KhachHang entity, org.seasar.doma.jdbc.entity.PostInsertContext<org.planning.net.entity.KhachHang> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(org.planning.net.entity.KhachHang entity, org.seasar.doma.jdbc.entity.PostUpdateContext<org.planning.net.entity.KhachHang> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(org.planning.net.entity.KhachHang entity, org.seasar.doma.jdbc.entity.PostDeleteContext<org.planning.net.entity.KhachHang> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.KhachHang, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.KhachHang, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.KhachHang, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.planning.net.entity.KhachHang, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.planning.net.entity.KhachHang, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public org.planning.net.entity.KhachHang newEntity() {
        return new org.planning.net.entity.KhachHang();
    }

    @Override
    public org.planning.net.entity.KhachHang newEntity(java.util.Map<String, Object> __args) {
        return new org.planning.net.entity.KhachHang();
    }

    @Override
    public Class<org.planning.net.entity.KhachHang> getEntityClass() {
        return org.planning.net.entity.KhachHang.class;
    }

    @Override
    public org.planning.net.entity.KhachHang getOriginalStates(org.planning.net.entity.KhachHang __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(org.planning.net.entity.KhachHang __entity) {
    }

    /**
     * @return the singleton
     */
    public static _KhachHang getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _KhachHang newInstance() {
        return new _KhachHang();
    }

}
