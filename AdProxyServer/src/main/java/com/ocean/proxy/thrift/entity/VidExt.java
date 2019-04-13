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
public class VidExt implements org.apache.thrift.TBase<VidExt, VidExt._Fields>, java.io.Serializable, Cloneable, Comparable<VidExt> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("VidExt");

  private static final org.apache.thrift.protocol.TField TRADING_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("tradingType", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CAMPAIGN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("campaignId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ACCEPT_ADVERTISING_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("acceptAdvertisingType", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new VidExtStandardSchemeFactory());
    schemes.put(TupleScheme.class, new VidExtTupleSchemeFactory());
  }

  public String tradingType; // optional
  public String campaignId; // optional
  public List<String> acceptAdvertisingType; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TRADING_TYPE((short)1, "tradingType"),
    CAMPAIGN_ID((short)2, "campaignId"),
    ACCEPT_ADVERTISING_TYPE((short)3, "acceptAdvertisingType");

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
        case 1: // TRADING_TYPE
          return TRADING_TYPE;
        case 2: // CAMPAIGN_ID
          return CAMPAIGN_ID;
        case 3: // ACCEPT_ADVERTISING_TYPE
          return ACCEPT_ADVERTISING_TYPE;
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
  private static final _Fields optionals[] = {_Fields.TRADING_TYPE,_Fields.CAMPAIGN_ID,_Fields.ACCEPT_ADVERTISING_TYPE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TRADING_TYPE, new org.apache.thrift.meta_data.FieldMetaData("tradingType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CAMPAIGN_ID, new org.apache.thrift.meta_data.FieldMetaData("campaignId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ACCEPT_ADVERTISING_TYPE, new org.apache.thrift.meta_data.FieldMetaData("acceptAdvertisingType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(VidExt.class, metaDataMap);
  }

  public VidExt() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public VidExt(VidExt other) {
    if (other.isSetTradingType()) {
      this.tradingType = other.tradingType;
    }
    if (other.isSetCampaignId()) {
      this.campaignId = other.campaignId;
    }
    if (other.isSetAcceptAdvertisingType()) {
      List<String> __this__acceptAdvertisingType = new ArrayList<String>(other.acceptAdvertisingType);
      this.acceptAdvertisingType = __this__acceptAdvertisingType;
    }
  }

  public VidExt deepCopy() {
    return new VidExt(this);
  }

  
  public void clear() {
    this.tradingType = null;
    this.campaignId = null;
    this.acceptAdvertisingType = null;
  }

  public String getTradingType() {
    return this.tradingType;
  }

  public VidExt setTradingType(String tradingType) {
    this.tradingType = tradingType;
    return this;
  }

  public void unsetTradingType() {
    this.tradingType = null;
  }

  /** Returns true if field tradingType is set (has been assigned a value) and false otherwise */
  public boolean isSetTradingType() {
    return this.tradingType != null;
  }

  public void setTradingTypeIsSet(boolean value) {
    if (!value) {
      this.tradingType = null;
    }
  }

  public String getCampaignId() {
    return this.campaignId;
  }

  public VidExt setCampaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public void unsetCampaignId() {
    this.campaignId = null;
  }

  /** Returns true if field campaignId is set (has been assigned a value) and false otherwise */
  public boolean isSetCampaignId() {
    return this.campaignId != null;
  }

  public void setCampaignIdIsSet(boolean value) {
    if (!value) {
      this.campaignId = null;
    }
  }

  public int getAcceptAdvertisingTypeSize() {
    return (this.acceptAdvertisingType == null) ? 0 : this.acceptAdvertisingType.size();
  }

  public java.util.Iterator<String> getAcceptAdvertisingTypeIterator() {
    return (this.acceptAdvertisingType == null) ? null : this.acceptAdvertisingType.iterator();
  }

  public void addToAcceptAdvertisingType(String elem) {
    if (this.acceptAdvertisingType == null) {
      this.acceptAdvertisingType = new ArrayList<String>();
    }
    this.acceptAdvertisingType.add(elem);
  }

  public List<String> getAcceptAdvertisingType() {
    return this.acceptAdvertisingType;
  }

  public VidExt setAcceptAdvertisingType(List<String> acceptAdvertisingType) {
    this.acceptAdvertisingType = acceptAdvertisingType;
    return this;
  }

  public void unsetAcceptAdvertisingType() {
    this.acceptAdvertisingType = null;
  }

  /** Returns true if field acceptAdvertisingType is set (has been assigned a value) and false otherwise */
  public boolean isSetAcceptAdvertisingType() {
    return this.acceptAdvertisingType != null;
  }

  public void setAcceptAdvertisingTypeIsSet(boolean value) {
    if (!value) {
      this.acceptAdvertisingType = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TRADING_TYPE:
      if (value == null) {
        unsetTradingType();
      } else {
        setTradingType((String)value);
      }
      break;

    case CAMPAIGN_ID:
      if (value == null) {
        unsetCampaignId();
      } else {
        setCampaignId((String)value);
      }
      break;

    case ACCEPT_ADVERTISING_TYPE:
      if (value == null) {
        unsetAcceptAdvertisingType();
      } else {
        setAcceptAdvertisingType((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TRADING_TYPE:
      return getTradingType();

    case CAMPAIGN_ID:
      return getCampaignId();

    case ACCEPT_ADVERTISING_TYPE:
      return getAcceptAdvertisingType();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TRADING_TYPE:
      return isSetTradingType();
    case CAMPAIGN_ID:
      return isSetCampaignId();
    case ACCEPT_ADVERTISING_TYPE:
      return isSetAcceptAdvertisingType();
    }
    throw new IllegalStateException();
  }

  
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof VidExt)
      return this.equals((VidExt)that);
    return false;
  }

  public boolean equals(VidExt that) {
    if (that == null)
      return false;

    boolean this_present_tradingType = true && this.isSetTradingType();
    boolean that_present_tradingType = true && that.isSetTradingType();
    if (this_present_tradingType || that_present_tradingType) {
      if (!(this_present_tradingType && that_present_tradingType))
        return false;
      if (!this.tradingType.equals(that.tradingType))
        return false;
    }

    boolean this_present_campaignId = true && this.isSetCampaignId();
    boolean that_present_campaignId = true && that.isSetCampaignId();
    if (this_present_campaignId || that_present_campaignId) {
      if (!(this_present_campaignId && that_present_campaignId))
        return false;
      if (!this.campaignId.equals(that.campaignId))
        return false;
    }

    boolean this_present_acceptAdvertisingType = true && this.isSetAcceptAdvertisingType();
    boolean that_present_acceptAdvertisingType = true && that.isSetAcceptAdvertisingType();
    if (this_present_acceptAdvertisingType || that_present_acceptAdvertisingType) {
      if (!(this_present_acceptAdvertisingType && that_present_acceptAdvertisingType))
        return false;
      if (!this.acceptAdvertisingType.equals(that.acceptAdvertisingType))
        return false;
    }

    return true;
  }

  
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_tradingType = true && (isSetTradingType());
    list.add(present_tradingType);
    if (present_tradingType)
      list.add(tradingType);

    boolean present_campaignId = true && (isSetCampaignId());
    list.add(present_campaignId);
    if (present_campaignId)
      list.add(campaignId);

    boolean present_acceptAdvertisingType = true && (isSetAcceptAdvertisingType());
    list.add(present_acceptAdvertisingType);
    if (present_acceptAdvertisingType)
      list.add(acceptAdvertisingType);

    return list.hashCode();
  }

  
  public int compareTo(VidExt other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTradingType()).compareTo(other.isSetTradingType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTradingType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tradingType, other.tradingType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCampaignId()).compareTo(other.isSetCampaignId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCampaignId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.campaignId, other.campaignId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAcceptAdvertisingType()).compareTo(other.isSetAcceptAdvertisingType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAcceptAdvertisingType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.acceptAdvertisingType, other.acceptAdvertisingType);
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
    StringBuilder sb = new StringBuilder("VidExt(");
    boolean first = true;

    if (isSetTradingType()) {
      sb.append("tradingType:");
      if (this.tradingType == null) {
        sb.append("null");
      } else {
        sb.append(this.tradingType);
      }
      first = false;
    }
    if (isSetCampaignId()) {
      if (!first) sb.append(", ");
      sb.append("campaignId:");
      if (this.campaignId == null) {
        sb.append("null");
      } else {
        sb.append(this.campaignId);
      }
      first = false;
    }
    if (isSetAcceptAdvertisingType()) {
      if (!first) sb.append(", ");
      sb.append("acceptAdvertisingType:");
      if (this.acceptAdvertisingType == null) {
        sb.append("null");
      } else {
        sb.append(this.acceptAdvertisingType);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class VidExtStandardSchemeFactory implements SchemeFactory {
    public VidExtStandardScheme getScheme() {
      return new VidExtStandardScheme();
    }
  }

  private static class VidExtStandardScheme extends StandardScheme<VidExt> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, VidExt struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TRADING_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tradingType = iprot.readString();
              struct.setTradingTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CAMPAIGN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.campaignId = iprot.readString();
              struct.setCampaignIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ACCEPT_ADVERTISING_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.acceptAdvertisingType = new ArrayList<String>(_list0.size);
                String _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readString();
                  struct.acceptAdvertisingType.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setAcceptAdvertisingTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, VidExt struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tradingType != null) {
        if (struct.isSetTradingType()) {
          oprot.writeFieldBegin(TRADING_TYPE_FIELD_DESC);
          oprot.writeString(struct.tradingType);
          oprot.writeFieldEnd();
        }
      }
      if (struct.campaignId != null) {
        if (struct.isSetCampaignId()) {
          oprot.writeFieldBegin(CAMPAIGN_ID_FIELD_DESC);
          oprot.writeString(struct.campaignId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.acceptAdvertisingType != null) {
        if (struct.isSetAcceptAdvertisingType()) {
          oprot.writeFieldBegin(ACCEPT_ADVERTISING_TYPE_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.acceptAdvertisingType.size()));
            for (String _iter3 : struct.acceptAdvertisingType)
            {
              oprot.writeString(_iter3);
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

  private static class VidExtTupleSchemeFactory implements SchemeFactory {
    public VidExtTupleScheme getScheme() {
      return new VidExtTupleScheme();
    }
  }

  private static class VidExtTupleScheme extends TupleScheme<VidExt> {

    
    public void write(org.apache.thrift.protocol.TProtocol prot, VidExt struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTradingType()) {
        optionals.set(0);
      }
      if (struct.isSetCampaignId()) {
        optionals.set(1);
      }
      if (struct.isSetAcceptAdvertisingType()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetTradingType()) {
        oprot.writeString(struct.tradingType);
      }
      if (struct.isSetCampaignId()) {
        oprot.writeString(struct.campaignId);
      }
      if (struct.isSetAcceptAdvertisingType()) {
        {
          oprot.writeI32(struct.acceptAdvertisingType.size());
          for (String _iter4 : struct.acceptAdvertisingType)
          {
            oprot.writeString(_iter4);
          }
        }
      }
    }

    
    public void read(org.apache.thrift.protocol.TProtocol prot, VidExt struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.tradingType = iprot.readString();
        struct.setTradingTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.campaignId = iprot.readString();
        struct.setCampaignIdIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.acceptAdvertisingType = new ArrayList<String>(_list5.size);
          String _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = iprot.readString();
            struct.acceptAdvertisingType.add(_elem6);
          }
        }
        struct.setAcceptAdvertisingTypeIsSet(true);
      }
    }
  }

}
