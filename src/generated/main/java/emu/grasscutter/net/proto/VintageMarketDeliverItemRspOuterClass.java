// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VintageMarketDeliverItemRsp.proto

package emu.grasscutter.net.proto;

public final class VintageMarketDeliverItemRspOuterClass {
  private VintageMarketDeliverItemRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VintageMarketDeliverItemRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VintageMarketDeliverItemRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 trader_id = 12;</code>
     * @return The traderId.
     */
    int getTraderId();
  }
  /**
   * <pre>
   * Name: MDOKHMOGGKL
   * CmdId: 24023
   * </pre>
   *
   * Protobuf type {@code VintageMarketDeliverItemRsp}
   */
  public static final class VintageMarketDeliverItemRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VintageMarketDeliverItemRsp)
      VintageMarketDeliverItemRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VintageMarketDeliverItemRsp.newBuilder() to construct.
    private VintageMarketDeliverItemRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VintageMarketDeliverItemRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new VintageMarketDeliverItemRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.internal_static_VintageMarketDeliverItemRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.internal_static_VintageMarketDeliverItemRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp.class, emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 7;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int TRADER_ID_FIELD_NUMBER = 12;
    private int traderId_ = 0;
    /**
     * <code>uint32 trader_id = 12;</code>
     * @return The traderId.
     */
    @java.lang.Override
    public int getTraderId() {
      return traderId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (retcode_ != 0) {
        output.writeInt32(7, retcode_);
      }
      if (traderId_ != 0) {
        output.writeUInt32(12, traderId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, retcode_);
      }
      if (traderId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, traderId_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp other = (emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getTraderId()
          != other.getTraderId()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + TRADER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTraderId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Name: MDOKHMOGGKL
     * CmdId: 24023
     * </pre>
     *
     * Protobuf type {@code VintageMarketDeliverItemRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VintageMarketDeliverItemRsp)
        emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.internal_static_VintageMarketDeliverItemRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.internal_static_VintageMarketDeliverItemRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp.class, emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        retcode_ = 0;
        traderId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.internal_static_VintageMarketDeliverItemRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp build() {
        emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp buildPartial() {
        emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp result = new emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.traderId_ = traderId_;
        }
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp) {
          return mergeFrom((emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp other) {
        if (other == emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getTraderId() != 0) {
          setTraderId(other.getTraderId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 56: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 56
              case 96: {
                traderId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 96
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int retcode_ ;
      /**
       * <code>int32 retcode = 7;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int traderId_ ;
      /**
       * <code>uint32 trader_id = 12;</code>
       * @return The traderId.
       */
      @java.lang.Override
      public int getTraderId() {
        return traderId_;
      }
      /**
       * <code>uint32 trader_id = 12;</code>
       * @param value The traderId to set.
       * @return This builder for chaining.
       */
      public Builder setTraderId(int value) {
        
        traderId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 trader_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearTraderId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        traderId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:VintageMarketDeliverItemRsp)
    }

    // @@protoc_insertion_point(class_scope:VintageMarketDeliverItemRsp)
    private static final emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp();
    }

    public static emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VintageMarketDeliverItemRsp>
        PARSER = new com.google.protobuf.AbstractParser<VintageMarketDeliverItemRsp>() {
      @java.lang.Override
      public VintageMarketDeliverItemRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<VintageMarketDeliverItemRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VintageMarketDeliverItemRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.VintageMarketDeliverItemRspOuterClass.VintageMarketDeliverItemRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VintageMarketDeliverItemRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VintageMarketDeliverItemRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!VintageMarketDeliverItemRsp.proto\"A\n\033V" +
      "intageMarketDeliverItemRsp\022\017\n\007retcode\030\007 " +
      "\001(\005\022\021\n\ttrader_id\030\014 \001(\rB\033\n\031emu.grasscutte" +
      "r.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_VintageMarketDeliverItemRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VintageMarketDeliverItemRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VintageMarketDeliverItemRsp_descriptor,
        new java.lang.String[] { "Retcode", "TraderId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
