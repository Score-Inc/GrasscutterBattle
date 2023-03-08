// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerApplyEnterMpRsp.proto

package emu.grasscutter.net.proto;

public final class PlayerApplyEnterMpRspOuterClass {
  private PlayerApplyEnterMpRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerApplyEnterMpRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerApplyEnterMpRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 target_uid = 14;</code>
     * @return The targetUid.
     */
    int getTargetUid();

    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 param = 2;</code>
     * @return The param.
     */
    int getParam();
  }
  /**
   * <pre>
   * Name: KPEIDOAPHOC
   * CmdId: 1809
   * </pre>
   *
   * Protobuf type {@code PlayerApplyEnterMpRsp}
   */
  public static final class PlayerApplyEnterMpRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerApplyEnterMpRsp)
      PlayerApplyEnterMpRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerApplyEnterMpRsp.newBuilder() to construct.
    private PlayerApplyEnterMpRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerApplyEnterMpRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerApplyEnterMpRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.internal_static_PlayerApplyEnterMpRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.internal_static_PlayerApplyEnterMpRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp.class, emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp.Builder.class);
    }

    public static final int TARGET_UID_FIELD_NUMBER = 14;
    private int targetUid_ = 0;
    /**
     * <code>uint32 target_uid = 14;</code>
     * @return The targetUid.
     */
    @java.lang.Override
    public int getTargetUid() {
      return targetUid_;
    }

    public static final int RETCODE_FIELD_NUMBER = 11;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int PARAM_FIELD_NUMBER = 2;
    private int param_ = 0;
    /**
     * <code>uint32 param = 2;</code>
     * @return The param.
     */
    @java.lang.Override
    public int getParam() {
      return param_;
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
      if (param_ != 0) {
        output.writeUInt32(2, param_);
      }
      if (retcode_ != 0) {
        output.writeInt32(11, retcode_);
      }
      if (targetUid_ != 0) {
        output.writeUInt32(14, targetUid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (param_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, param_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, retcode_);
      }
      if (targetUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, targetUid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp other = (emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp) obj;

      if (getTargetUid()
          != other.getTargetUid()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getParam()
          != other.getParam()) return false;
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
      hash = (37 * hash) + TARGET_UID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetUid();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + PARAM_FIELD_NUMBER;
      hash = (53 * hash) + getParam();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp prototype) {
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
     * Name: KPEIDOAPHOC
     * CmdId: 1809
     * </pre>
     *
     * Protobuf type {@code PlayerApplyEnterMpRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerApplyEnterMpRsp)
        emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.internal_static_PlayerApplyEnterMpRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.internal_static_PlayerApplyEnterMpRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp.class, emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp.newBuilder()
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
        targetUid_ = 0;
        retcode_ = 0;
        param_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.internal_static_PlayerApplyEnterMpRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp build() {
        emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp buildPartial() {
        emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp result = new emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.targetUid_ = targetUid_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.param_ = param_;
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
        if (other instanceof emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp other) {
        if (other == emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp.getDefaultInstance()) return this;
        if (other.getTargetUid() != 0) {
          setTargetUid(other.getTargetUid());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getParam() != 0) {
          setParam(other.getParam());
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
                param_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 16
              case 88: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 88
              case 112: {
                targetUid_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 112
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

      private int targetUid_ ;
      /**
       * <code>uint32 target_uid = 14;</code>
       * @return The targetUid.
       */
      @java.lang.Override
      public int getTargetUid() {
        return targetUid_;
      }
      /**
       * <code>uint32 target_uid = 14;</code>
       * @param value The targetUid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetUid(int value) {
        
        targetUid_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_uid = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetUid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        targetUid_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 11;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int param_ ;
      /**
       * <code>uint32 param = 2;</code>
       * @return The param.
       */
      @java.lang.Override
      public int getParam() {
        return param_;
      }
      /**
       * <code>uint32 param = 2;</code>
       * @param value The param to set.
       * @return This builder for chaining.
       */
      public Builder setParam(int value) {
        
        param_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 param = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam() {
        bitField0_ = (bitField0_ & ~0x00000004);
        param_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerApplyEnterMpRsp)
    }

    // @@protoc_insertion_point(class_scope:PlayerApplyEnterMpRsp)
    private static final emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp();
    }

    public static emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerApplyEnterMpRsp>
        PARSER = new com.google.protobuf.AbstractParser<PlayerApplyEnterMpRsp>() {
      @java.lang.Override
      public PlayerApplyEnterMpRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerApplyEnterMpRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerApplyEnterMpRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerApplyEnterMpRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerApplyEnterMpRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033PlayerApplyEnterMpRsp.proto\"K\n\025PlayerA" +
      "pplyEnterMpRsp\022\022\n\ntarget_uid\030\016 \001(\r\022\017\n\007re" +
      "tcode\030\013 \001(\005\022\r\n\005param\030\002 \001(\rB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayerApplyEnterMpRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerApplyEnterMpRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerApplyEnterMpRsp_descriptor,
        new java.lang.String[] { "TargetUid", "Retcode", "Param", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
