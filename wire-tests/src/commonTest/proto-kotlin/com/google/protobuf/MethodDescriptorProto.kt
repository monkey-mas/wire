// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: google/protobuf/descriptor.proto
package com.google.protobuf

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.WireField
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Nothing
import kotlin.String
import kotlin.hashCode
import kotlin.jvm.JvmField
import okio.ByteString

/**
 * Describes a method of a service.
 */
class MethodDescriptorProto(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  val name: String? = null,
  /**
   * Input and output type names.  These are resolved in the same way as
   * FieldDescriptorProto.type_name, but must refer to a message type.
   */
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  val input_type: String? = null,
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  val output_type: String? = null,
  @field:WireField(
    tag = 4,
    adapter = "com.google.protobuf.MethodOptions#ADAPTER"
  )
  val options: MethodOptions? = null,
  /**
   * Identifies if client streams multiple client messages
   */
  @field:WireField(
    tag = 5,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  val client_streaming: Boolean? = null,
  /**
   * Identifies if server streams multiple server messages
   */
  @field:WireField(
    tag = 6,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  val server_streaming: Boolean? = null,
  unknownFields: ByteString = ByteString.EMPTY
) : Message<MethodDescriptorProto, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN
  )
  override fun newBuilder(): Nothing = throw AssertionError()

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is MethodDescriptorProto) return false
    return unknownFields == other.unknownFields
        && name == other.name
        && input_type == other.input_type
        && output_type == other.output_type
        && options == other.options
        && client_streaming == other.client_streaming
        && server_streaming == other.server_streaming
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + name.hashCode()
      result = result * 37 + input_type.hashCode()
      result = result * 37 + output_type.hashCode()
      result = result * 37 + options.hashCode()
      result = result * 37 + client_streaming.hashCode()
      result = result * 37 + server_streaming.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (name != null) result += """name=$name"""
    if (input_type != null) result += """input_type=$input_type"""
    if (output_type != null) result += """output_type=$output_type"""
    if (options != null) result += """options=$options"""
    if (client_streaming != null) result += """client_streaming=$client_streaming"""
    if (server_streaming != null) result += """server_streaming=$server_streaming"""
    return result.joinToString(prefix = "MethodDescriptorProto{", separator = ", ", postfix = "}")
  }

  fun copy(
    name: String? = this.name,
    input_type: String? = this.input_type,
    output_type: String? = this.output_type,
    options: MethodOptions? = this.options,
    client_streaming: Boolean? = this.client_streaming,
    server_streaming: Boolean? = this.server_streaming,
    unknownFields: ByteString = this.unknownFields
  ): MethodDescriptorProto = MethodDescriptorProto(name, input_type, output_type, options,
      client_streaming, server_streaming, unknownFields)

  companion object {
    const val DEFAULT_CLIENT_STREAMING: Boolean = false

    const val DEFAULT_SERVER_STREAMING: Boolean = false

    @JvmField
    val ADAPTER: ProtoAdapter<MethodDescriptorProto> = object : ProtoAdapter<MethodDescriptorProto>(
      FieldEncoding.LENGTH_DELIMITED, 
      MethodDescriptorProto::class, 
      "type.googleapis.com/google.protobuf.MethodDescriptorProto"
    ) {
      override fun encodedSize(value: MethodDescriptorProto): Int = 
        ProtoAdapter.STRING.encodedSizeWithTag(1, value.name) +
        ProtoAdapter.STRING.encodedSizeWithTag(2, value.input_type) +
        ProtoAdapter.STRING.encodedSizeWithTag(3, value.output_type) +
        MethodOptions.ADAPTER.encodedSizeWithTag(4, value.options) +
        ProtoAdapter.BOOL.encodedSizeWithTag(5, value.client_streaming) +
        ProtoAdapter.BOOL.encodedSizeWithTag(6, value.server_streaming) +
        value.unknownFields.size

      override fun encode(writer: ProtoWriter, value: MethodDescriptorProto) {
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name)
        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.input_type)
        ProtoAdapter.STRING.encodeWithTag(writer, 3, value.output_type)
        MethodOptions.ADAPTER.encodeWithTag(writer, 4, value.options)
        ProtoAdapter.BOOL.encodeWithTag(writer, 5, value.client_streaming)
        ProtoAdapter.BOOL.encodeWithTag(writer, 6, value.server_streaming)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): MethodDescriptorProto {
        var name: String? = null
        var input_type: String? = null
        var output_type: String? = null
        var options: MethodOptions? = null
        var client_streaming: Boolean? = null
        var server_streaming: Boolean? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> name = ProtoAdapter.STRING.decode(reader)
            2 -> input_type = ProtoAdapter.STRING.decode(reader)
            3 -> output_type = ProtoAdapter.STRING.decode(reader)
            4 -> options = MethodOptions.ADAPTER.decode(reader)
            5 -> client_streaming = ProtoAdapter.BOOL.decode(reader)
            6 -> server_streaming = ProtoAdapter.BOOL.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return MethodDescriptorProto(
          name = name,
          input_type = input_type,
          output_type = output_type,
          options = options,
          client_streaming = client_streaming,
          server_streaming = server_streaming,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: MethodDescriptorProto): MethodDescriptorProto = value.copy(
        options = value.options?.let(MethodOptions.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }
  }
}
