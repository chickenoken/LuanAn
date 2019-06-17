package org.planning.net.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2019-06-17T14:01:58.555+0700")
public final class _SanPham extends org.seasar.doma.jdbc.entity.AbstractEntityType<org.planning.net.entity.SanPham> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _SanPham __singleton = new _SanPham();

    /** the maSanPham */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.SanPham, java.lang.String, java.lang.Object> $maSanPham = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.SanPham, java.lang.String, java.lang.Object>(org.planning.net.entity.SanPham.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "maSanPham", "MA_SAN_PHAM", true, true);

    /** the tenSanPham */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.SanPham, java.lang.String, java.lang.Object> $tenSanPham = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.SanPham, java.lang.String, java.lang.Object>(org.planning.net.entity.SanPham.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "tenSanPham", "TEN_SAN_PHAM", true, true);

    /** the donGia */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.SanPham, java.lang.String, java.lang.Object> $donGia = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.SanPham, java.lang.String, java.lang.Object>(org.planning.net.entity.SanPham.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "donGia", "DON_GIA", true, true);

    /** the soLuong */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.SanPham, java.lang.String, java.lang.Object> $soLuong = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.SanPham, java.lang.String, java.lang.Object>(org.planning.net.entity.SanPham.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "soLuong", "SO_LUONG", true, true);

    /** the tinhTrang */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.SanPham, java.lang.String, java.lang.Object> $tinhTrang = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.SanPham, java.lang.String, java.lang.Object>(org.planning.net.entity.SanPham.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "tinhTrang", "TINH_TRANG", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<org.planning.net.entity.SanPham> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.SanPham, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.SanPham, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.SanPham, ?>> __entityPropertyTypeMap;

    private _SanPham() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<org.planning.net.entity.SanPham>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "SanPham";
        __catalogName = "";
        __schemaName = "";
        __tableName = "SanPham";
        __qualifiedTableName = "SanPham";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.SanPham, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.SanPham, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.SanPham, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.SanPham, ?>>(5);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.SanPham, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.SanPham, ?>>(5);
        __list.add($maSanPham);
        __map.put("maSanPham", $maSanPham);
        __list.add($tenSanPham);
        __map.put("tenSanPham", $tenSanPham);
        __list.add($donGia);
        __map.put("donGia", $donGia);
        __list.add($soLuong);
        __map.put("soLuong", $soLuong);
        __list.add($tinhTrang);
        __map.put("tinhTrang", $tinhTrang);
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
    public void preInsert(org.planning.net.entity.SanPham entity, org.seasar.doma.jdbc.entity.PreInsertContext<org.planning.net.entity.SanPham> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(org.planning.net.entity.SanPham entity, org.seasar.doma.jdbc.entity.PreUpdateContext<org.planning.net.entity.SanPham> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(org.planning.net.entity.SanPham entity, org.seasar.doma.jdbc.entity.PreDeleteContext<org.planning.net.entity.SanPham> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(org.planning.net.entity.SanPham entity, org.seasar.doma.jdbc.entity.PostInsertContext<org.planning.net.entity.SanPham> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(org.planning.net.entity.SanPham entity, org.seasar.doma.jdbc.entity.PostUpdateContext<org.planning.net.entity.SanPham> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(org.planning.net.entity.SanPham entity, org.seasar.doma.jdbc.entity.PostDeleteContext<org.planning.net.entity.SanPham> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.SanPham, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.SanPham, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.SanPham, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.planning.net.entity.SanPham, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.planning.net.entity.SanPham, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public org.planning.net.entity.SanPham newEntity() {
        return new org.planning.net.entity.SanPham();
    }

    @Override
    public org.planning.net.entity.SanPham newEntity(java.util.Map<String, Object> __args) {
        return new org.planning.net.entity.SanPham();
    }

    @Override
    public Class<org.planning.net.entity.SanPham> getEntityClass() {
        return org.planning.net.entity.SanPham.class;
    }

    @Override
    public org.planning.net.entity.SanPham getOriginalStates(org.planning.net.entity.SanPham __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(org.planning.net.entity.SanPham __entity) {
    }

    /**
     * @return the singleton
     */
    public static _SanPham getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _SanPham newInstance() {
        return new _SanPham();
    }

}
