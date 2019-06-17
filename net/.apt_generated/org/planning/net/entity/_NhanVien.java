package org.planning.net.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2019-06-17T14:01:58.497+0700")
public final class _NhanVien extends org.seasar.doma.jdbc.entity.AbstractEntityType<org.planning.net.entity.NhanVien> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _NhanVien __singleton = new _NhanVien();

    /** the maNhanVien */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.NhanVien, java.lang.String, java.lang.Object> $maNhanVien = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.NhanVien, java.lang.String, java.lang.Object>(org.planning.net.entity.NhanVien.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "maNhanVien", "MA_NHAN_VIEN", true, true);

    /** the tenNhanVien */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.NhanVien, java.lang.String, java.lang.Object> $tenNhanVien = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.NhanVien, java.lang.String, java.lang.Object>(org.planning.net.entity.NhanVien.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "tenNhanVien", "TEN_NHAN_VIEN", true, true);

    /** the role */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.NhanVien, java.lang.String, java.lang.Object> $role = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.NhanVien, java.lang.String, java.lang.Object>(org.planning.net.entity.NhanVien.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "role", "ROLE", true, true);

    /** the taiKhoan */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.NhanVien, java.lang.String, java.lang.Object> $taiKhoan = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.NhanVien, java.lang.String, java.lang.Object>(org.planning.net.entity.NhanVien.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "taiKhoan", "TAI_KHOAN", true, true);

    /** the matKhau */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.NhanVien, java.lang.String, java.lang.Object> $matKhau = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.NhanVien, java.lang.String, java.lang.Object>(org.planning.net.entity.NhanVien.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "matKhau", "MAT_KHAU", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<org.planning.net.entity.NhanVien> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.NhanVien, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.NhanVien, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.NhanVien, ?>> __entityPropertyTypeMap;

    private _NhanVien() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<org.planning.net.entity.NhanVien>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "NhanVien";
        __catalogName = "";
        __schemaName = "";
        __tableName = "NhanVien";
        __qualifiedTableName = "NhanVien";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.NhanVien, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.NhanVien, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.NhanVien, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.NhanVien, ?>>(5);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.NhanVien, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.NhanVien, ?>>(5);
        __list.add($maNhanVien);
        __map.put("maNhanVien", $maNhanVien);
        __list.add($tenNhanVien);
        __map.put("tenNhanVien", $tenNhanVien);
        __list.add($role);
        __map.put("role", $role);
        __list.add($taiKhoan);
        __map.put("taiKhoan", $taiKhoan);
        __list.add($matKhau);
        __map.put("matKhau", $matKhau);
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
    public void preInsert(org.planning.net.entity.NhanVien entity, org.seasar.doma.jdbc.entity.PreInsertContext<org.planning.net.entity.NhanVien> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(org.planning.net.entity.NhanVien entity, org.seasar.doma.jdbc.entity.PreUpdateContext<org.planning.net.entity.NhanVien> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(org.planning.net.entity.NhanVien entity, org.seasar.doma.jdbc.entity.PreDeleteContext<org.planning.net.entity.NhanVien> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(org.planning.net.entity.NhanVien entity, org.seasar.doma.jdbc.entity.PostInsertContext<org.planning.net.entity.NhanVien> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(org.planning.net.entity.NhanVien entity, org.seasar.doma.jdbc.entity.PostUpdateContext<org.planning.net.entity.NhanVien> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(org.planning.net.entity.NhanVien entity, org.seasar.doma.jdbc.entity.PostDeleteContext<org.planning.net.entity.NhanVien> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.NhanVien, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.NhanVien, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.NhanVien, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.planning.net.entity.NhanVien, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.planning.net.entity.NhanVien, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public org.planning.net.entity.NhanVien newEntity() {
        return new org.planning.net.entity.NhanVien();
    }

    @Override
    public org.planning.net.entity.NhanVien newEntity(java.util.Map<String, Object> __args) {
        return new org.planning.net.entity.NhanVien();
    }

    @Override
    public Class<org.planning.net.entity.NhanVien> getEntityClass() {
        return org.planning.net.entity.NhanVien.class;
    }

    @Override
    public org.planning.net.entity.NhanVien getOriginalStates(org.planning.net.entity.NhanVien __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(org.planning.net.entity.NhanVien __entity) {
    }

    /**
     * @return the singleton
     */
    public static _NhanVien getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _NhanVien newInstance() {
        return new _NhanVien();
    }

}
