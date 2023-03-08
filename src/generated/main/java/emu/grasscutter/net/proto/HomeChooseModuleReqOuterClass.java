// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeChooseModuleReq.proto

package emu.grasscutter.net.proto;

public final class HomeChooseModuleReqOuterClass {
  private HomeChooseModuleReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeChooseModuleReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeChooseModuleReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 module_id = 2;</code>
     * @return The moduleId.
     */
    int getModuleId();
  }
  /**
   * <pre>
   * Name: ECIDMELIJDF
   * CmdId: 4843
   * </pre>
   *
   * Protobuf type {@code HomeChooseModuleReq}
   */
  public static final class HomeChooseModuleReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeChooseModuleReq)
      HomeChooseModuleReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeChooseModuleReq.newBuilder() to construct.
    private HomeChooseModuleReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeChooseModuleReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeChooseModuleReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.internal_static_HomeChooseModuleReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.internal_static_HomeChooseModuleReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq.class, emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq.Builder.class);
    }

    public static final int MODULE_ID_FIELD_NUMBER = 2;
    private int moduleId_ = 0;
    /**
     * <code>uint32 module_id = 2;</code>
     * @return The moduleId.
     */
    @java.lang.Override
    public int getModuleId() {
      return moduleId_;
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
      if (moduleId_ != 0) {
        output.writeUInt32(2, moduleId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (moduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, moduleId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq other = (emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq) obj;

      if (getModuleId()
          != other.getModuleId()) return false;
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
      hash = (37 * hash) + MODULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getModuleId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq prototype) {
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
     * Name: ECIDMELIJDF
     * CmdId: 4843
     * </pre>
     *
     * Protobuf type {@code HomeChooseModuleReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeChooseModuleReq)
        emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.internal_static_HomeChooseModuleReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.internal_static_HomeChooseModuleReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq.class, emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq.newBuilder()
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
        moduleId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.internal_static_HomeChooseModuleReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq build() {
        emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq buildPartial() {
        emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq result = new emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.moduleId_ = moduleId_;
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
        if (other instanceof emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq) {
          return mergeFrom((emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq other) {
        if (other == emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq.getDefaultInstance()) return this;
        if (other.getModuleId() != 0) {
          setModuleId(other.getModuleId());
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
              case 16: {
                moduleId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 16
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

      private int moduleId_ ;
      /**
       * <code>uint32 module_id = 2;</code>
       * @return The moduleId.
       */
      @java.lang.Override
      public int getModuleId() {
        return moduleId_;
      }
      /**
       * <code>uint32 module_id = 2;</code>
       * @param value The moduleId to set.
       * @return This builder for chaining.
       */
      public Builder setModuleId(int value) {
        
        moduleId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 module_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearModuleId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        moduleId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeChooseModuleReq)
    }

    // @@protoc_insertion_point(class_scope:HomeChooseModuleReq)
    private static final emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq();
    }

    public static emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeChooseModuleReq>
        PARSER = new com.google.protobuf.AbstractParser<HomeChooseModuleReq>() {
      @java.lang.Override
      public HomeChooseModuleReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeChooseModuleReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeChooseModuleReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeChooseModuleReqOuterClass.HomeChooseModuleReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeChooseModuleReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeChooseModuleReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031HomeChooseModuleReq.proto\"(\n\023HomeChoos" +
      "eModuleReq\022\021\n\tmodule_id\030\002 \001(\rB\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeChooseModuleReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeChooseModuleReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeChooseModuleReq_descriptor,
        new java.lang.String[] { "ModuleId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
