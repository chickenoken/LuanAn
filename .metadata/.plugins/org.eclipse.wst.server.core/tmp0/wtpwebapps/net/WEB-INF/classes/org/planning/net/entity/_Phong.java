package org.planning.net.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2019-06-17T14:01:58.530+0700")
public final class _Phong extends org.seasar.doma.jdbc.entity.AbstractEntityType<org.planning.net.entity.Phong> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _Phong __singleton = new _Phong();

    /** the maPhong */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.Phong, java.lang.String, java.lang.Object> $maPhong = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.Phong, java.lang.String, java.lang.Object>(org.planning.net.entity.Phong.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "maPhong", "MA_PHONG", true, true);

    /** the loaiPhong */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.Phong, java.lang.String, java.lang.Object> $loaiPhong = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.Phong, java.lang.String, java.lang.Object>(org.planning.net.entity.Phong.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "loaiPhong", "LOAI_PHONG", true, true);

    /** the donGia */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.Phong, java.lang.String, java.lang.Object> $donGia = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.Phong, java.lang.String, java.lang.Object>(org.planning.net.entity.Phong.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "donGia", "DON_GIA", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<org.planning.net.entity.Phong> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.Phong, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.Phong, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.Phong, ?>> __entityPropertyTypeMap;

    private _Phong() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<org.planning.net.entity.Phong>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "Phong";
        __catalogName = "";
        __schemaName = "";
        __tableName = "Phong";
        __qualifiedTableName = "Phong";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.Phong, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.Phong, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.Phong, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.Phong, ?>>(3);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.Phong, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.Phong, ?>>(3);
        __list.add($maPhong);
        __map.put("maPhong", $maPhong);
        __list.add($loaiPhong);
        __map.put("loaiPhong", $loaiPhong);
        __list.add($donGia);
        __map.put("donGia", $donGia);
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
    public void preInsert(org.planning.net.entity.Phong entity, org.seasar.doma.jdbc.entity.PreInsertContext<org.planning.net.entity.Phong> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(org.planning.net.entity.Phong entity, org.seasar.doma.jdbc.entity.PreUpdateContext<org.planning.net.entity.Phong> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(org.planning.net.entity.Phong entity, org.seasar.doma.jdbc.entity.PreDeleteContext<org.planning.net.entity.Phong> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(org.planning.net.entity.Phong entity, org.seasar.doma.jdbc.entity.PostInsertContext<org.planning.net.entity.Phong> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(org.planning.net.entity.Phong entity, org.seasar.doma.jdbc.entity.PostUpdateContext<org.planning.net.entity.Phong> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(org.planning.net.entity.Phong entity, org.seasar.doma.jdbc.entity.PostDeleteContext<org.planning.net.entity.Phong> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.Phong, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.Phong, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.Phong, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.planning.net.entity.Phong, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.planning.net.entity.Phong, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public org.planning.net.entity.Phong newEntity() {
        return new org.planning.net.entity.Phong();
    }

    @Override
    public org.planning.net.entity.Phong newEntity(java.util.Map<String, Object> __args) {
        return new org.planning.net.entity.Phong();
    }

    @Override
    public Class<org.planning.net.entity.Phong> getEntityClass() {
        return org.planning.net.entity.Phong.class;
    }

    @Override
    public org.planning.net.entity.Phong getOriginalStates(org.planning.net.entity.Phong __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(org.planning.net.entity.Phong __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Phong getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Phong newInstance() {
        return new _Phong();
    }

}
