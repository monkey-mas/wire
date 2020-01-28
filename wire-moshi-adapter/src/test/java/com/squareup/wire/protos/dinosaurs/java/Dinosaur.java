// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: dinosaur_java.proto
package com.squareup.wire.protos.dinosaurs.java;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import com.squareup.wire.protos.geology.java.Period;
import java.io.IOException;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import okio.ByteString;

public final class Dinosaur extends Message<Dinosaur, Dinosaur.Builder> {
  public static final ProtoAdapter<Dinosaur> ADAPTER = new ProtoAdapter_Dinosaur();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_NAME = "";

  public static final Double DEFAULT_LENGTH_METERS = 0.0d;

  public static final Double DEFAULT_MASS_KILOGRAMS = 0.0d;

  public static final Period DEFAULT_PERIOD = Period.CRETACEOUS;

  /**
   * Common name of this dinosaur, like "Stegosaurus".
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String name;

  /**
   * URLs with images of this dinosaur.
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REPEATED
  )
  public final List<String> picture_urls;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#DOUBLE"
  )
  public final Double length_meters;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#DOUBLE"
  )
  public final Double mass_kilograms;

  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.protos.geology.java.Period#ADAPTER"
  )
  public final Period period;

  public Dinosaur(String name, List<String> picture_urls, Double length_meters,
      Double mass_kilograms, Period period) {
    this(name, picture_urls, length_meters, mass_kilograms, period, ByteString.EMPTY);
  }

  public Dinosaur(String name, List<String> picture_urls, Double length_meters,
      Double mass_kilograms, Period period, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.name = name;
    this.picture_urls = Internal.immutableCopyOf("picture_urls", picture_urls);
    this.length_meters = length_meters;
    this.mass_kilograms = mass_kilograms;
    this.period = period;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.name = name;
    builder.picture_urls = Internal.copyOf(picture_urls);
    builder.length_meters = length_meters;
    builder.mass_kilograms = mass_kilograms;
    builder.period = period;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Dinosaur)) return false;
    Dinosaur o = (Dinosaur) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(name, o.name)
        && picture_urls.equals(o.picture_urls)
        && Internal.equals(length_meters, o.length_meters)
        && Internal.equals(mass_kilograms, o.mass_kilograms)
        && Internal.equals(period, o.period);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (name != null ? name.hashCode() : 0);
      result = result * 37 + picture_urls.hashCode();
      result = result * 37 + (length_meters != null ? length_meters.hashCode() : 0);
      result = result * 37 + (mass_kilograms != null ? mass_kilograms.hashCode() : 0);
      result = result * 37 + (period != null ? period.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (name != null) builder.append(", name=").append(name);
    if (!picture_urls.isEmpty()) builder.append(", picture_urls=").append(picture_urls);
    if (length_meters != null) builder.append(", length_meters=").append(length_meters);
    if (mass_kilograms != null) builder.append(", mass_kilograms=").append(mass_kilograms);
    if (period != null) builder.append(", period=").append(period);
    return builder.replace(0, 2, "Dinosaur{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<Dinosaur, Builder> {
    public String name;

    public List<String> picture_urls;

    public Double length_meters;

    public Double mass_kilograms;

    public Period period;

    public Builder() {
      picture_urls = Internal.newMutableList();
    }

    /**
     * Common name of this dinosaur, like "Stegosaurus".
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * URLs with images of this dinosaur.
     */
    public Builder picture_urls(List<String> picture_urls) {
      Internal.checkElementsNotNull(picture_urls);
      this.picture_urls = picture_urls;
      return this;
    }

    public Builder length_meters(Double length_meters) {
      this.length_meters = length_meters;
      return this;
    }

    public Builder mass_kilograms(Double mass_kilograms) {
      this.mass_kilograms = mass_kilograms;
      return this;
    }

    public Builder period(Period period) {
      this.period = period;
      return this;
    }

    @Override
    public Dinosaur build() {
      return new Dinosaur(name, picture_urls, length_meters, mass_kilograms, period, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_Dinosaur extends ProtoAdapter<Dinosaur> {
    public ProtoAdapter_Dinosaur() {
      super(FieldEncoding.LENGTH_DELIMITED, Dinosaur.class, "type.googleapis.com/squareup.dinosaurs.Dinosaur");
    }

    @Override
    public int encodedSize(Dinosaur value) {
      return ProtoAdapter.STRING.encodedSizeWithTag(1, value.name)
          + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, value.picture_urls)
          + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, value.length_meters)
          + ProtoAdapter.DOUBLE.encodedSizeWithTag(4, value.mass_kilograms)
          + Period.ADAPTER.encodedSizeWithTag(5, value.period)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, Dinosaur value) throws IOException {
      ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name);
      ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 2, value.picture_urls);
      ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, value.length_meters);
      ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, value.mass_kilograms);
      Period.ADAPTER.encodeWithTag(writer, 5, value.period);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public Dinosaur decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.name(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.picture_urls.add(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.length_meters(ProtoAdapter.DOUBLE.decode(reader)); break;
          case 4: builder.mass_kilograms(ProtoAdapter.DOUBLE.decode(reader)); break;
          case 5: {
            try {
              builder.period(Period.ADAPTER.decode(reader));
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
    public Dinosaur redact(Dinosaur value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
