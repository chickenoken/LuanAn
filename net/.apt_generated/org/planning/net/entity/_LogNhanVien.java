package org.planning.net.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2019-06-17T14:01:58.584+0700")
public final class _LogNhanVien extends org.seasar.doma.jdbc.entity.AbstractEntityType<org.planning.net.entity.LogNhanVien> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _LogNhanVien __singleton = new _LogNhanVien();

    /** the maNhanVien */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.LogNhanVien, java.lang.String, java.lang.Object> $maNhanVien = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.LogNhanVien, java.lang.String, java.lang.Object>(org.planning.net.entity.LogNhanVien.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "maNhanVien", "MA_NHAN_VIEN", true, true);

    /** the dangNhap */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.LogNhanVien, java.lang.String, java.lang.Object> $dangNhap = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.LogNhanVien, java.lang.String, java.lang.Object>(org.planning.net.entity.LogNhanVien.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "dangNhap", "DANG_NHAP", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<org.planning.net.entity.LogNhanVien> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.LogNhanVien, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.LogNhanVien, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.LogNhanVien, ?>> __entityPropertyTypeMap;

    private _LogNhanVien() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<org.planning.net.entity.LogNhanVien>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "LogNhanVien";
        __catalogName = "";
        __schemaName = "";
        __tableName = "LogNhanVien";
        __qualifiedTableName = "LogNhanVien";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.LogNhanVien, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.LogNhanVien, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.LogNhanVien, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.LogNhanVien, ?>>(2);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.LogNhanVien, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.LogNhanVien, ?>>(2);
        __list.add($maNhanVien);
        __map.put("maNhanVien", $maNhanVien);
        __list.add($dangNhap);
        __map.put("dangNhap", $dangNhap);
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
    public void preInsert(org.planning.net.entity.LogNhanVien entity, org.seasar.doma.jdbc.entity.PreInsertContext<org.planning.net.entity.LogNhanVien> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(org.planning.net.entity.LogNhanVien entity, org.seasar.doma.jdbc.entity.PreUpdateContext<org.planning.net.entity.LogNhanVien> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(org.planning.net.entity.LogNhanVien entity, org.seasar.doma.jdbc.entity.PreDeleteContext<org.planning.net.entity.LogNhanVien> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(org.planning.net.entity.LogNhanVien entity, org.seasar.doma.jdbc.entity.PostInsertContext<org.planning.net.entity.LogNhanVien> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(org.planning.net.entity.LogNhanVien entity, org.seasar.doma.jdbc.entity.PostUpdateContext<org.planning.net.entity.LogNhanVien> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(org.planning.net.entity.LogNhanVien entity, org.seasar.doma.jdbc.entity.PostDeleteContext<org.planning.net.entity.LogNhanVien> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.LogNhanVien, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.LogNhanVien, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.LogNhanVien, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.planning.net.entity.LogNhanVien, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.planning.net.entity.LogNhanVien, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public org.planning.net.entity.LogNhanVien newEntity() {
        return new org.planning.net.entity.LogNhanVien();
    }

    @Override
    public org.planning.net.entity.LogNhanVien newEntity(java.util.Map<String, Object> __args) {
        return new org.planning.net.entity.LogNhanVien();
    }

    @Override
    public Class<org.planning.net.entity.LogNhanVien> getEntityClass() {
        return org.planning.net.entity.LogNhanVien.class;
    }

    @Override
    public org.planning.net.entity.LogNhanVien getOriginalStates(org.planning.net.entity.LogNhanVien __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(org.planning.net.entity.LogNhanVien __entity) {
    }

    /**
     * @return the singleton
     */
    public static _LogNhanVien getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _LogNhanVien newInstance() {
        return new _LogNhanVien();
    }

}
