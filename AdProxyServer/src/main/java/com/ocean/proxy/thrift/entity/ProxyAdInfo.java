/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ocean.proxy.thrift.entity;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-1-13")
public class ProxyAdInfo implements org.apache.thrift.TBase<ProxyAdInfo, ProxyAdInfo._Fields>, java.io.Serializable, Cloneable, Comparable<ProxyAdInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ProxyAdInfo");

  private static final org.apache.thrift.protocol.TField AD_CONTENT_FIELD_DESC = new org.apache.thrift.protocol.TField("ad_content", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField PROXY_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("proxy_name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PV_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("pv_url", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField CLICK_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("click_url", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ProxyAdInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ProxyAdInfoTupleSchemeFactory());
  }

  public com.ocean.proxy.thrift.entity.AdContent ad_content; // optional
  public String proxy_name; // optional
  public List<String> pv_url; // optional
  public List<String> click_url; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    AD_CONTENT((short)1, "ad_content"),
    PROXY_NAME((short)2, "proxy_name"),
    PV_URL((short)3, "pv_url"),
    CLICK_URL((short)4, "click_url");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // AD_CONTENT
          return AD_CONTENT;
        case 2: // PROXY_NAME
          return PROXY_NAME;
        case 3: // PV_URL
          return PV_URL;
        case 4: // CLICK_URL
          return CLICK_URL;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.AD_CONTENT,_Fields.PROXY_NAME,_Fields.PV_URL,_Fields.CLICK_URL};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.AD_CONTENT, new org.apache.thrift.meta_data.FieldMetaData("ad_content", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ocean.proxy.thrift.entity.AdContent.class)));
    tmpMap.put(_Fields.PROXY_NAME, new org.apache.thrift.meta_data.FieldMetaData("proxy_name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PV_URL, new org.apache.thrift.meta_data.FieldMetaData("pv_url", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.CLICK_URL, new org.apache.thrift.meta_data.FieldMetaData("click_url", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ProxyAdInfo.class, metaDataMap);
  }

  public ProxyAdInfo() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ProxyAdInfo(ProxyAdInfo other) {
    if (other.isSetAd_content()) {
      this.ad_content = new com.ocean.proxy.thrift.entity.AdContent(other.ad_content);
    }
    if (other.isSetProxy_name()) {
      this.proxy_name = other.proxy_name;
    }
    if (other.isSetPv_url()) {
      List<String> __this__pv_url = new ArrayList<String>(other.pv_url);
      this.pv_url = __this__pv_url;
    }
    if (other.isSetClick_url()) {
      List<String> __this__click_url = new ArrayList<String>(other.click_url);
      this.click_url = __this__click_url;
    }
  }

  public ProxyAdInfo deepCopy() {
    return new ProxyAdInfo(this);
  }

  
  public void clear() {
    this.ad_content = null;
    this.proxy_name = null;
    this.pv_url = null;
    this.click_url = null;
  }

  public com.ocean.proxy.thrift.entity.AdContent getAd_content() {
    return this.ad_content;
  }

  public ProxyAdInfo setAd_content(com.ocean.proxy.thrift.entity.AdContent ad_content) {
    this.ad_content = ad_content;
    return this;
  }

  public void unsetAd_content() {
    this.ad_content = null;
  }

  /** Returns true if field ad_content is set (has been assigned a value) and false otherwise */
  public boolean isSetAd_content() {
    return this.ad_content != null;
  }

  public void setAd_contentIsSet(boolean value) {
    if (!value) {
      this.ad_content = null;
    }
  }

  public String getProxy_name() {
    return this.proxy_name;
  }

  public ProxyAdInfo setProxy_name(String proxy_name) {
    this.proxy_name = proxy_name;
    return this;
  }

  public void unsetProxy_name() {
    this.proxy_name = null;
  }

  /** Returns true if field proxy_name is set (has been assigned a value) and false otherwise */
  public boolean isSetProxy_name() {
    return this.proxy_name != null;
  }

  public void setProxy_nameIsSet(boolean value) {
    if (!value) {
      this.proxy_name = null;
    }
  }

  public int getPv_urlSize() {
    return (this.pv_url == null) ? 0 : this.pv_url.size();
  }

  public java.util.Iterator<String> getPv_urlIterator() {
    return (this.pv_url == null) ? null : this.pv_url.iterator();
  }

  public void addToPv_url(String elem) {
    if (this.pv_url == null) {
      this.pv_url = new ArrayList<String>();
    }
    this.pv_url.add(elem);
  }

  public List<String> getPv_url() {
    return this.pv_url;
  }

  public ProxyAdInfo setPv_url(List<String> pv_url) {
    this.pv_url = pv_url;
    return this;
  }

  public void unsetPv_url() {
    this.pv_url = null;
  }

  /** Returns true if field pv_url is set (has been assigned a value) and false otherwise */
  public boolean isSetPv_url() {
    return this.pv_url != null;
  }

  public void setPv_urlIsSet(boolean value) {
    if (!value) {
      this.pv_url = null;
    }
  }

  public int getClick_urlSize() {
    return (this.click_url == null) ? 0 : this.click_url.size();
  }

  public java.util.Iterator<String> getClick_urlIterator() {
    return (this.click_url == null) ? null : this.click_url.iterator();
  }

  public void addToClick_url(String elem) {
    if (this.click_url == null) {
      this.click_url = new ArrayList<String>();
    }
    this.click_url.add(elem);
  }

  public List<String> getClick_url() {
    return this.click_url;
  }

  public ProxyAdInfo setClick_url(List<String> click_url) {
    this.click_url = click_url;
    return this;
  }

  public void unsetClick_url() {
    this.click_url = null;
  }

  /** Returns true if field click_url is set (has been assigned a value) and false otherwise */
  public boolean isSetClick_url() {
    return this.click_url != null;
  }

  public void setClick_urlIsSet(boolean value) {
    if (!value) {
      this.click_url = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case AD_CONTENT:
      if (value == null) {
        unsetAd_content();
      } else {
        setAd_content((com.ocean.proxy.thrift.entity.AdContent)value);
      }
      break;

    case PROXY_NAME:
      if (value == null) {
        unsetProxy_name();
      } else {
        setProxy_name((String)value);
      }
      break;

    case PV_URL:
      if (value == null) {
        unsetPv_url();
      } else {
        setPv_url((List<String>)value);
      }
      break;

    case CLICK_URL:
      if (value == null) {
        unsetClick_url();
      } else {
        setClick_url((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case AD_CONTENT:
      return getAd_content();

    case PROXY_NAME:
      return getProxy_name();

    case PV_URL:
      return getPv_url();

    case CLICK_URL:
      return getClick_url();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case AD_CONTENT:
      return isSetAd_content();
    case PROXY_NAME:
      return isSetProxy_name();
    case PV_URL:
      return isSetPv_url();
    case CLICK_URL:
      return isSetClick_url();
    }
    throw new IllegalStateException();
  }

  
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ProxyAdInfo)
      return this.equals((ProxyAdInfo)that);
    return false;
  }

  public boolean equals(ProxyAdInfo that) {
    if (that == null)
      return false;

    boolean this_present_ad_content = true && this.isSetAd_content();
    boolean that_present_ad_content = true && that.isSetAd_content();
    if (this_present_ad_content || that_present_ad_content) {
      if (!(this_present_ad_content && that_present_ad_content))
        return false;
      if (!this.ad_content.equals(that.ad_content))
        return false;
    }

    boolean this_present_proxy_name = true && this.isSetProxy_name();
    boolean that_present_proxy_name = true && that.isSetProxy_name();
    if (this_present_proxy_name || that_present_proxy_name) {
      if (!(this_present_proxy_name && that_present_proxy_name))
        return false;
      if (!this.proxy_name.equals(that.proxy_name))
        return false;
    }

    boolean this_present_pv_url = true && this.isSetPv_url();
    boolean that_present_pv_url = true && that.isSetPv_url();
    if (this_present_pv_url || that_present_pv_url) {
      if (!(this_present_pv_url && that_present_pv_url))
        return false;
      if (!this.pv_url.equals(that.pv_url))
        return false;
    }

    boolean this_present_click_url = true && this.isSetClick_url();
    boolean that_present_click_url = true && that.isSetClick_url();
    if (this_present_click_url || that_present_click_url) {
      if (!(this_present_click_url && that_present_click_url))
        return false;
      if (!this.click_url.equals(that.click_url))
        return false;
    }

    return true;
  }

  
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_ad_content = true && (isSetAd_content());
    list.add(present_ad_content);
    if (present_ad_content)
      list.add(ad_content);

    boolean present_proxy_name = true && (isSetProxy_name());
    list.add(present_proxy_name);
    if (present_proxy_name)
      list.add(proxy_name);

    boolean present_pv_url = true && (isSetPv_url());
    list.add(present_pv_url);
    if (present_pv_url)
      list.add(pv_url);

    boolean present_click_url = true && (isSetClick_url());
    list.add(present_click_url);
    if (present_click_url)
      list.add(click_url);

    return list.hashCode();
  }

  
  public int compareTo(ProxyAdInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAd_content()).compareTo(other.isSetAd_content());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAd_content()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ad_content, other.ad_content);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetProxy_name()).compareTo(other.isSetProxy_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProxy_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.proxy_name, other.proxy_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPv_url()).compareTo(other.isSetPv_url());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPv_url()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pv_url, other.pv_url);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClick_url()).compareTo(other.isSetClick_url());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClick_url()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.click_url, other.click_url);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  
  public String toString() {
    StringBuilder sb = new StringBuilder("ProxyAdInfo(");
    boolean first = true;

    if (isSetAd_content()) {
      sb.append("ad_content:");
      if (this.ad_content == null) {
        sb.append("null");
      } else {
        sb.append(this.ad_content);
      }
      first = false;
    }
    if (isSetProxy_name()) {
      if (!first) sb.append(", ");
      sb.append("proxy_name:");
      if (this.proxy_name == null) {
        sb.append("null");
      } else {
        sb.append(this.proxy_name);
      }
      first = false;
    }
    if (isSetPv_url()) {
      if (!first) sb.append(", ");
      sb.append("pv_url:");
      if (this.pv_url == null) {
        sb.append("null");
      } else {
        sb.append(this.pv_url);
      }
      first = false;
    }
    if (isSetClick_url()) {
      if (!first) sb.append(", ");
      sb.append("click_url:");
      if (this.click_url == null) {
        sb.append("null");
      } else {
        sb.append(this.click_url);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (ad_content != null) {
      ad_content.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ProxyAdInfoStandardSchemeFactory implements SchemeFactory {
    public ProxyAdInfoStandardScheme getScheme() {
      return new ProxyAdInfoStandardScheme();
    }
  }

  private static class ProxyAdInfoStandardScheme extends StandardScheme<ProxyAdInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ProxyAdInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // AD_CONTENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.ad_content = new com.ocean.proxy.thrift.entity.AdContent();
              struct.ad_content.read(iprot);
              struct.setAd_contentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PROXY_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.proxy_name = iprot.readString();
              struct.setProxy_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PV_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list18 = iprot.readListBegin();
                struct.pv_url = new ArrayList<String>(_list18.size);
                String _elem19;
                for (int _i20 = 0; _i20 < _list18.size; ++_i20)
                {
                  _elem19 = iprot.readString();
                  struct.pv_url.add(_elem19);
                }
                iprot.readListEnd();
              }
              struct.setPv_urlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CLICK_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list21 = iprot.readListBegin();
                struct.click_url = new ArrayList<String>(_list21.size);
                String _elem22;
                for (int _i23 = 0; _i23 < _list21.size; ++_i23)
                {
                  _elem22 = iprot.readString();
                  struct.click_url.add(_elem22);
                }
                iprot.readListEnd();
              }
              struct.setClick_urlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ProxyAdInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.ad_content != null) {
        if (struct.isSetAd_content()) {
          oprot.writeFieldBegin(AD_CONTENT_FIELD_DESC);
          struct.ad_content.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.proxy_name != null) {
        if (struct.isSetProxy_name()) {
          oprot.writeFieldBegin(PROXY_NAME_FIELD_DESC);
          oprot.writeString(struct.proxy_name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.pv_url != null) {
        if (struct.isSetPv_url()) {
          oprot.writeFieldBegin(PV_URL_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.pv_url.size()));
            for (String _iter24 : struct.pv_url)
            {
              oprot.writeString(_iter24);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.click_url != null) {
        if (struct.isSetClick_url()) {
          oprot.writeFieldBegin(CLICK_URL_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.click_url.size()));
            for (String _iter25 : struct.click_url)
            {
              oprot.writeString(_iter25);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ProxyAdInfoTupleSchemeFactory implements SchemeFactory {
    public ProxyAdInfoTupleScheme getScheme() {
      return new ProxyAdInfoTupleScheme();
    }
  }

  private static class ProxyAdInfoTupleScheme extends TupleScheme<ProxyAdInfo> {

    
    public void write(org.apache.thrift.protocol.TProtocol prot, ProxyAdInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAd_content()) {
        optionals.set(0);
      }
      if (struct.isSetProxy_name()) {
        optionals.set(1);
      }
      if (struct.isSetPv_url()) {
        optionals.set(2);
      }
      if (struct.isSetClick_url()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetAd_content()) {
        struct.ad_content.write(oprot);
      }
      if (struct.isSetProxy_name()) {
        oprot.writeString(struct.proxy_name);
      }
      if (struct.isSetPv_url()) {
        {
          oprot.writeI32(struct.pv_url.size());
          for (String _iter26 : struct.pv_url)
          {
            oprot.writeString(_iter26);
          }
        }
      }
      if (struct.isSetClick_url()) {
        {
          oprot.writeI32(struct.click_url.size());
          for (String _iter27 : struct.click_url)
          {
            oprot.writeString(_iter27);
          }
        }
      }
    }

    
    public void read(org.apache.thrift.protocol.TProtocol prot, ProxyAdInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.ad_content = new com.ocean.proxy.thrift.entity.AdContent();
        struct.ad_content.read(iprot);
        struct.setAd_contentIsSet(true);
      }
      if (incoming.get(1)) {
        struct.proxy_name = iprot.readString();
        struct.setProxy_nameIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list28 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.pv_url = new ArrayList<String>(_list28.size);
          String _elem29;
          for (int _i30 = 0; _i30 < _list28.size; ++_i30)
          {
            _elem29 = iprot.readString();
            struct.pv_url.add(_elem29);
          }
        }
        struct.setPv_urlIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list31 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.click_url = new ArrayList<String>(_list31.size);
          String _elem32;
          for (int _i33 = 0; _i33 < _list31.size; ++_i33)
          {
            _elem32 = iprot.readString();
            struct.click_url.add(_elem32);
          }
        }
        struct.setClick_urlIsSet(true);
      }
    }
  }

}

