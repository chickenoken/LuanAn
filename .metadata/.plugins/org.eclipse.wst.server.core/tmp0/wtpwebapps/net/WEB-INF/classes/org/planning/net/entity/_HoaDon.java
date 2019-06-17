package org.planning.net.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2019-06-17T14:01:58.569+0700")
public final class _HoaDon extends org.seasar.doma.jdbc.entity.AbstractEntityType<org.planning.net.entity.HoaDon> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _HoaDon __singleton = new _HoaDon();

    /** the maHoaDon */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.HoaDon, java.lang.String, java.lang.Object> $maHoaDon = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.HoaDon, java.lang.String, java.lang.Object>(org.planning.net.entity.HoaDon.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "maHoaDon", "MA_HOA_DON", true, true);

    /** the maKhachHang */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.HoaDon, java.lang.String, java.lang.Object> $maKhachHang = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.HoaDon, java.lang.String, java.lang.Object>(org.planning.net.entity.HoaDon.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "maKhachHang", "MA_KHACH_HANG", true, true);

    /** the maSanPham */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.HoaDon, java.lang.String, java.lang.Object> $maSanPham = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.HoaDon, java.lang.String, java.lang.Object>(org.planning.net.entity.HoaDon.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "maSanPham", "MA_SAN_PHAM", true, true);

    /** the maNhanVien */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.HoaDon, java.lang.String, java.lang.Object> $maNhanVien = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.HoaDon, java.lang.String, java.lang.Object>(org.planning.net.entity.HoaDon.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "maNhanVien", "MA_NHAN_VIEN", true, true);

    /** the soLuong */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.HoaDon, java.lang.Integer, java.lang.Object> $soLuong = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.HoaDon, java.lang.Integer, java.lang.Object>(org.planning.net.entity.HoaDon.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "soLuong", "SO_LUONG", true, true);

    /** the thanhTien */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.HoaDon, java.lang.Integer, java.lang.Object> $thanhTien = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.planning.net.entity.HoaDon, java.lang.Integer, java.lang.Object>(org.planning.net.entity.HoaDon.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "thanhTien", "THANH_TIEN", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<org.planning.net.entity.HoaDon> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.HoaDon, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.HoaDon, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.HoaDon, ?>> __entityPropertyTypeMap;

    private _HoaDon() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<org.planning.net.entity.HoaDon>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "HoaDon";
        __catalogName = "";
        __schemaName = "";
        __tableName = "HoaDon";
        __qualifiedTableName = "HoaDon";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.HoaDon, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.HoaDon, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.HoaDon, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.HoaDon, ?>>(6);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.HoaDon, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.HoaDon, ?>>(6);
        __list.add($maHoaDon);
        __map.put("maHoaDon", $maHoaDon);
        __list.add($maKhachHang);
        __map.put("maKhachHang", $maKhachHang);
        __list.add($maSanPham);
        __map.put("maSanPham", $maSanPham);
        __list.add($maNhanVien);
        __map.put("maNhanVien", $maNhanVien);
        __list.add($soLuong);
        __map.put("soLuong", $soLuong);
        __list.add($thanhTien);
        __map.put("thanhTien", $thanhTien);
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
    public void preInsert(org.planning.net.entity.HoaDon entity, org.seasar.doma.jdbc.entity.PreInsertContext<org.planning.net.entity.HoaDon> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(org.planning.net.entity.HoaDon entity, org.seasar.doma.jdbc.entity.PreUpdateContext<org.planning.net.entity.HoaDon> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(org.planning.net.entity.HoaDon entity, org.seasar.doma.jdbc.entity.PreDeleteContext<org.planning.net.entity.HoaDon> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(org.planning.net.entity.HoaDon entity, org.seasar.doma.jdbc.entity.PostInsertContext<org.planning.net.entity.HoaDon> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(org.planning.net.entity.HoaDon entity, org.seasar.doma.jdbc.entity.PostUpdateContext<org.planning.net.entity.HoaDon> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(org.planning.net.entity.HoaDon entity, org.seasar.doma.jdbc.entity.PostDeleteContext<org.planning.net.entity.HoaDon> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.HoaDon, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.HoaDon, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.planning.net.entity.HoaDon, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.planning.net.entity.HoaDon, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.planning.net.entity.HoaDon, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public org.planning.net.entity.HoaDon newEntity() {
        return new org.planning.net.entity.HoaDon();
    }

    @Override
    public org.planning.net.entity.HoaDon newEntity(java.util.Map<String, Object> __args) {
        return new org.planning.net.entity.HoaDon();
    }

    @Override
    public Class<org.planning.net.entity.HoaDon> getEntityClass() {
        return org.planning.net.entity.HoaDon.class;
    }

    @Override
    public org.planning.net.entity.HoaDon getOriginalStates(org.planning.net.entity.HoaDon __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(org.planning.net.entity.HoaDon __entity) {
    }

    /**
     * @return the singleton
     */
    public static _HoaDon getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _HoaDon newInstance() {
        return new _HoaDon();
    }

}
