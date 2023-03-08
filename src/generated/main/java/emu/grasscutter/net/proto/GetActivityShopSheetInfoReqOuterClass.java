// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetActivityShopSheetInfoReq.proto

package emu.grasscutter.net.proto;

public final class GetActivityShopSheetInfoReqOuterClass {
  private GetActivityShopSheetInfoReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetActivityShopSheetInfoReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetActivityShopSheetInfoReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 shop_type = 7;</code>
     * @return The shopType.
     */
    int getShopType();
  }
  /**
   * <pre>
   * Name: FDPHAHHAKNI
   * CmdId: 772
   * </pre>
   *
   * Protobuf type {@code GetActivityShopSheetInfoReq}
   */
  public static final class GetActivityShopSheetInfoReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetActivityShopSheetInfoReq)
      GetActivityShopSheetInfoReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetActivityShopSheetInfoReq.newBuilder() to construct.
    private GetActivityShopSheetInfoReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetActivityShopSheetInfoReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetActivityShopSheetInfoReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.internal_static_GetActivityShopSheetInfoReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.internal_static_GetActivityShopSheetInfoReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq.class, emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq.Builder.class);
    }

    public static final int SHOP_TYPE_FIELD_NUMBER = 7;
    private int shopType_ = 0;
    /**
     * <code>uint32 shop_type = 7;</code>
     * @return The shopType.
     */
    @java.lang.Override
    public int getShopType() {
      return shopType_;
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
      if (shopType_ != 0) {
        output.writeUInt32(7, shopType_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (shopType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, shopType_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq other = (emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq) obj;

      if (getShopType()
          != other.getShopType()) return false;
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
      hash = (37 * hash) + SHOP_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getShopType();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq prototype) {
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
     * Name: FDPHAHHAKNI
     * CmdId: 772
     * </pre>
     *
     * Protobuf type {@code GetActivityShopSheetInfoReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetActivityShopSheetInfoReq)
        emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.internal_static_GetActivityShopSheetInfoReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.internal_static_GetActivityShopSheetInfoReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq.class, emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq.newBuilder()
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
        shopType_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.internal_static_GetActivityShopSheetInfoReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq build() {
        emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq buildPartial() {
        emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq result = new emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.shopType_ = shopType_;
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
        if (other instanceof emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq) {
          return mergeFrom((emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq other) {
        if (other == emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq.getDefaultInstance()) return this;
        if (other.getShopType() != 0) {
          setShopType(other.getShopType());
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
                shopType_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 56
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

      private int shopType_ ;
      /**
       * <code>uint32 shop_type = 7;</code>
       * @return The shopType.
       */
      @java.lang.Override
      public int getShopType() {
        return shopType_;
      }
      /**
       * <code>uint32 shop_type = 7;</code>
       * @param value The shopType to set.
       * @return This builder for chaining.
       */
      public Builder setShopType(int value) {
        
        shopType_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 shop_type = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearShopType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        shopType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GetActivityShopSheetInfoReq)
    }

    // @@protoc_insertion_point(class_scope:GetActivityShopSheetInfoReq)
    private static final emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq();
    }

    public static emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetActivityShopSheetInfoReq>
        PARSER = new com.google.protobuf.AbstractParser<GetActivityShopSheetInfoReq>() {
      @java.lang.Override
      public GetActivityShopSheetInfoReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetActivityShopSheetInfoReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetActivityShopSheetInfoReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetActivityShopSheetInfoReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetActivityShopSheetInfoReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!GetActivityShopSheetInfoReq.proto\"0\n\033G" +
      "etActivityShopSheetInfoReq\022\021\n\tshop_type\030" +
      "\007 \001(\rB\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetActivityShopSheetInfoReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetActivityShopSheetInfoReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetActivityShopSheetInfoReq_descriptor,
        new java.lang.String[] { "ShopType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}