// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: unknown_fields.proto
package com.squareup.wire.protos.unknownfields;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import okio.ByteString;

public final class VersionTwo extends Message<VersionTwo, VersionTwo.Builder> {
  public static final ProtoAdapter<VersionTwo> ADAPTER = new ProtoAdapter_VersionTwo();

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_I = 0;

  public static final Integer DEFAULT_V2_I = 0;

  public static final String DEFAULT_V2_S = "";

  public static final Integer DEFAULT_V2_F32 = 0;

  public static final Long DEFAULT_V2_F64 = 0L;

  public static final EnumVersionTwo DEFAULT_EN = EnumVersionTwo.SHREK_V2;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer i;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer v2_i;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String v2_s;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#FIXED32"
  )
  public final Integer v2_f32;

  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#FIXED64"
  )
  public final Long v2_f64;

  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REPEATED
  )
  public final List<String> v2_rs;

  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.protos.unknownfields.NestedVersionTwo#ADAPTER"
  )
  public final NestedVersionTwo obj;

  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.protos.unknownfields.EnumVersionTwo#ADAPTER"
  )
  public final EnumVersionTwo en;

  public VersionTwo(Integer i, Integer v2_i, String v2_s, Integer v2_f32, Long v2_f64,
      List<String> v2_rs, NestedVersionTwo obj, EnumVersionTwo en) {
    this(i, v2_i, v2_s, v2_f32, v2_f64, v2_rs, obj, en, ByteString.EMPTY);
  }

  public VersionTwo(Integer i, Integer v2_i, String v2_s, Integer v2_f32, Long v2_f64,
      List<String> v2_rs, NestedVersionTwo obj, EnumVersionTwo en, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.i = i;
    this.v2_i = v2_i;
    this.v2_s = v2_s;
    this.v2_f32 = v2_f32;
    this.v2_f64 = v2_f64;
    this.v2_rs = Internal.immutableCopyOf("v2_rs", v2_rs);
    this.obj = obj;
    this.en = en;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.i = i;
    builder.v2_i = v2_i;
    builder.v2_s = v2_s;
    builder.v2_f32 = v2_f32;
    builder.v2_f64 = v2_f64;
    builder.v2_rs = Internal.copyOf(v2_rs);
    builder.obj = obj;
    builder.en = en;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof VersionTwo)) return false;
    VersionTwo o = (VersionTwo) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(i, o.i)
        && Internal.equals(v2_i, o.v2_i)
        && Internal.equals(v2_s, o.v2_s)
        && Internal.equals(v2_f32, o.v2_f32)
        && Internal.equals(v2_f64, o.v2_f64)
        && v2_rs.equals(o.v2_rs)
        && Internal.equals(obj, o.obj)
        && Internal.equals(en, o.en);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (i != null ? i.hashCode() : 0);
      result = result * 37 + (v2_i != null ? v2_i.hashCode() : 0);
      result = result * 37 + (v2_s != null ? v2_s.hashCode() : 0);
      result = result * 37 + (v2_f32 != null ? v2_f32.hashCode() : 0);
      result = result * 37 + (v2_f64 != null ? v2_f64.hashCode() : 0);
      result = result * 37 + v2_rs.hashCode();
      result = result * 37 + (obj != null ? obj.hashCode() : 0);
      result = result * 37 + (en != null ? en.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (i != null) builder.append(", i=").append(i);
    if (v2_i != null) builder.append(", v2_i=").append(v2_i);
    if (v2_s != null) builder.append(", v2_s=").append(v2_s);
    if (v2_f32 != null) builder.append(", v2_f32=").append(v2_f32);
    if (v2_f64 != null) builder.append(", v2_f64=").append(v2_f64);
    if (!v2_rs.isEmpty()) builder.append(", v2_rs=").append(v2_rs);
    if (obj != null) builder.append(", obj=").append(obj);
    if (en != null) builder.append(", en=").append(en);
    return builder.replace(0, 2, "VersionTwo{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<VersionTwo, Builder> {
    public Integer i;

    public Integer v2_i;

    public String v2_s;

    public Integer v2_f32;

    public Long v2_f64;

    public List<String> v2_rs;

    public NestedVersionTwo obj;

    public EnumVersionTwo en;

    public Builder() {
      v2_rs = Internal.newMutableList();
    }

    public Builder i(Integer i) {
      this.i = i;
      return this;
    }

    public Builder v2_i(Integer v2_i) {
      this.v2_i = v2_i;
      return this;
    }

    public Builder v2_s(String v2_s) {
      this.v2_s = v2_s;
      return this;
    }

    public Builder v2_f32(Integer v2_f32) {
      this.v2_f32 = v2_f32;
      return this;
    }

    public Builder v2_f64(Long v2_f64) {
      this.v2_f64 = v2_f64;
      return this;
    }

    public Builder v2_rs(List<String> v2_rs) {
      Internal.checkElementsNotNull(v2_rs);
      this.v2_rs = v2_rs;
      return this;
    }

    public Builder obj(NestedVersionTwo obj) {
      this.obj = obj;
      return this;
    }

    public Builder en(EnumVersionTwo en) {
      this.en = en;
      return this;
    }

    @Override
    public VersionTwo build() {
      return new VersionTwo(i, v2_i, v2_s, v2_f32, v2_f64, v2_rs, obj, en, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_VersionTwo extends ProtoAdapter<VersionTwo> {
    public ProtoAdapter_VersionTwo() {
      super(FieldEncoding.LENGTH_DELIMITED, VersionTwo.class);
    }

    @Override
    public int encodedSize(VersionTwo value) {
      return ProtoAdapter.INT32.encodedSizeWithTag(1, value.i)
          + ProtoAdapter.INT32.encodedSizeWithTag(2, value.v2_i)
          + ProtoAdapter.STRING.encodedSizeWithTag(3, value.v2_s)
          + ProtoAdapter.FIXED32.encodedSizeWithTag(4, value.v2_f32)
          + ProtoAdapter.FIXED64.encodedSizeWithTag(5, value.v2_f64)
          + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, value.v2_rs)
          + NestedVersionTwo.ADAPTER.encodedSizeWithTag(7, value.obj)
          + EnumVersionTwo.ADAPTER.encodedSizeWithTag(8, value.en)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, VersionTwo value) throws IOException {
      ProtoAdapter.INT32.encodeWithTag(writer, 1, value.i);
      ProtoAdapter.INT32.encodeWithTag(writer, 2, value.v2_i);
      ProtoAdapter.STRING.encodeWithTag(writer, 3, value.v2_s);
      ProtoAdapter.FIXED32.encodeWithTag(writer, 4, value.v2_f32);
      ProtoAdapter.FIXED64.encodeWithTag(writer, 5, value.v2_f64);
      ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 6, value.v2_rs);
      NestedVersionTwo.ADAPTER.encodeWithTag(writer, 7, value.obj);
      EnumVersionTwo.ADAPTER.encodeWithTag(writer, 8, value.en);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public VersionTwo decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.i(ProtoAdapter.INT32.decode(reader)); break;
          case 2: builder.v2_i(ProtoAdapter.INT32.decode(reader)); break;
          case 3: builder.v2_s(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.v2_f32(ProtoAdapter.FIXED32.decode(reader)); break;
          case 5: builder.v2_f64(ProtoAdapter.FIXED64.decode(reader)); break;
          case 6: builder.v2_rs.add(ProtoAdapter.STRING.decode(reader)); break;
          case 7: builder.obj(NestedVersionTwo.ADAPTER.decode(reader)); break;
          case 8: {
            try {
              builder.en(EnumVersionTwo.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          default: {
            reader.readUnknownField(tag);
          }
        }
      }
      builder.addUnknownFields(reader.endMessageAndGetUnknownFields(token));
      return builder.build();
    }

    @Override
    public VersionTwo redact(VersionTwo value) {
      Builder builder = value.newBuilder();
      if (builder.obj != null) builder.obj = NestedVersionTwo.ADAPTER.redact(builder.obj);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
