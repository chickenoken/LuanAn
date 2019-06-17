package org.planning.net.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2019-06-17T14:01:58.405+0700")
public final class _LogPhong extends org.seasar.doma.jdbc.entity.AbstractEntityType<org.planning.net.entity.LogPhong> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _LogPhong __singleton = new _LogPhong();

    /** the maKhachHang */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.LogPhong, java.lang.String, java.lang.Object> $maKhachHang = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.LogPhong, java.lang.String, java.lang.Object>(org.planning.net.entity.LogPhong.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "maKhachHang", "MA_KHACH_HANG", true, true);

    /** the maPhong */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.LogPhong, java.lang.String, java.lang.Object> $maPhong = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.LogPhong, java.lang.String, java.lang.Object>(org.planning.net.entity.LogPhong.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "maPhong", "MA_PHONG", true, true);

    /** the tinhTrang */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.LogPhong, java.lang.String, java.lang.Object> $tinhTrang = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.LogPhong, java.lang.String, java.lang.Object>(org.planning.net.entity.LogPhong.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "tinhTrang", "TINH_TRANG", true, true);

    /** the ngaythue */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.LogPhong, java.lang.String, java.lang.Object> $ngaythue = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.LogPhong, java.lang.String, java.lang.Object>(org.planning.net.entity.LogPhong.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "ngaythue", "NGAY_THUE", true, true);

    /** the ngayTra */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.LogPhong, java.lang.String, java.lang.Object> $ngayTra = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.LogPhong, java.lang.String, java.lang.Object>(org.planning.net.entity.LogPhong.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "ngayTra", "NGAY_TRA", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<org.planning.net.entity.LogPhong> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.LogPhong, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.LogPhong, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.LogPhong, ?>> __entityPropertyTypeMap;

    private _LogPhong() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<org.planning.net.entity.LogPhong>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "LogPhong";
        __catalogName = "";
        __schemaName = "";
        __tableName = "LogPhong";
        __qualifiedTableName = "LogPhong";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.LogPhong, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.LogPhong, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.LogPhong, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.LogPhong, ?>>(5);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.LogPhong, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.LogPhong, ?>>(5);
        __list.add($maKhachHang);
        __map.put("maKhachHang", $maKhachHang);
        __list.add($maPhong);
        __map.put("maPhong", $maPhong);
        __list.add($tinhTrang);
        __map.put("tinhTrang", $tinhTrang);
        __list.add($ngaythue);
        __map.put("ngaythue", $ngaythue);
        __list.add($ngayTra);
        __map.put("ngayTra", $ngayTra);
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
    public void preInsert(org.planning.net.entity.LogPhong entity, org.seasar.doma.jdbc.entity.PreInsertContext<org.planning.net.entity.LogPhong> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(org.planning.net.entity.LogPhong entity, org.seasar.doma.jdbc.entity.PreUpdateContext<org.planning.net.entity.LogPhong> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(org.planning.net.entity.LogPhong entity, org.seasar.doma.jdbc.entity.PreDeleteContext<org.planning.net.entity.LogPhong> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(org.planning.net.entity.LogPhong entity, org.seasar.doma.jdbc.entity.PostInsertContext<org.planning.net.entity.LogPhong> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(org.planning.net.entity.LogPhong entity, org.seasar.doma.jdbc.entity.PostUpdateContext<org.planning.net.entity.LogPhong> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(org.planning.net.entity.LogPhong entity, org.seasar.doma.jdbc.entity.PostDeleteContext<org.planning.net.entity.LogPhong> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.LogPhong, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.LogPhong, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.LogPhong, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.planning.net.entity.LogPhong, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.planning.net.entity.LogPhong, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public org.planning.net.entity.LogPhong newEntity() {
        return new org.planning.net.entity.LogPhong();
    }

    @Override
    public org.planning.net.entity.LogPhong newEntity(java.util.Map<String, Object> __args) {
        return new org.planning.net.entity.LogPhong();
    }

    @Override
    public Class<org.planning.net.entity.LogPhong> getEntityClass() {
        return org.planning.net.entity.LogPhong.class;
    }

    @Override
    public org.planning.net.entity.LogPhong getOriginalStates(org.planning.net.entity.LogPhong __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(org.planning.net.entity.LogPhong __entity) {
    }

    /**
     * @return the singleton
     */
    public static _LogPhong getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _LogPhong newInstance() {
        return new _LogPhong();
    }

}
