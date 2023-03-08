// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UnlockAvatarTalentRsp.proto

package emu.grasscutter.net.proto;

public final class UnlockAvatarTalentRspOuterClass {
  private UnlockAvatarTalentRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UnlockAvatarTalentRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UnlockAvatarTalentRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 avatar_guid = 5;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();

    /**
     * <code>uint32 talent_id = 13;</code>
     * @return The talentId.
     */
    int getTalentId();

    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * Name: EFFKKHNDIAF
   * CmdId: 1075
   * </pre>
   *
   * Protobuf type {@code UnlockAvatarTalentRsp}
   */
  public static final class UnlockAvatarTalentRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UnlockAvatarTalentRsp)
      UnlockAvatarTalentRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UnlockAvatarTalentRsp.newBuilder() to construct.
    private UnlockAvatarTalentRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UnlockAvatarTalentRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UnlockAvatarTalentRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.internal_static_UnlockAvatarTalentRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.internal_static_UnlockAvatarTalentRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp.class, emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp.Builder.class);
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 5;
    private long avatarGuid_ = 0L;
    /**
     * <code>uint64 avatar_guid = 5;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
    }

    public static final int TALENT_ID_FIELD_NUMBER = 13;
    private int talentId_ = 0;
    /**
     * <code>uint32 talent_id = 13;</code>
     * @return The talentId.
     */
    @java.lang.Override
    public int getTalentId() {
      return talentId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 4;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
        output.writeInt32(4, retcode_);
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(5, avatarGuid_);
      }
      if (talentId_ != 0) {
        output.writeUInt32(13, talentId_);
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
          .computeInt32Size(4, retcode_);
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, avatarGuid_);
      }
      if (talentId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, talentId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp other = (emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp) obj;

      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
      if (getTalentId()
          != other.getTalentId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (37 * hash) + TALENT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTalentId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp prototype) {
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
     * Name: EFFKKHNDIAF
     * CmdId: 1075
     * </pre>
     *
     * Protobuf type {@code UnlockAvatarTalentRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UnlockAvatarTalentRsp)
        emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.internal_static_UnlockAvatarTalentRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.internal_static_UnlockAvatarTalentRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp.class, emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp.newBuilder()
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
        avatarGuid_ = 0L;
        talentId_ = 0;
        retcode_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.internal_static_UnlockAvatarTalentRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp build() {
        emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp buildPartial() {
        emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp result = new emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.avatarGuid_ = avatarGuid_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.talentId_ = talentId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp) {
          return mergeFrom((emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp other) {
        if (other == emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp.getDefaultInstance()) return this;
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
        }
        if (other.getTalentId() != 0) {
          setTalentId(other.getTalentId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
              case 32: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 32
              case 40: {
                avatarGuid_ = input.readUInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 40
              case 104: {
                talentId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 104
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

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 5;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 5;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        avatarGuid_ = 0L;
        onChanged();
        return this;
      }

      private int talentId_ ;
      /**
       * <code>uint32 talent_id = 13;</code>
       * @return The talentId.
       */
      @java.lang.Override
      public int getTalentId() {
        return talentId_;
      }
      /**
       * <code>uint32 talent_id = 13;</code>
       * @param value The talentId to set.
       * @return This builder for chaining.
       */
      public Builder setTalentId(int value) {
        
        talentId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 talent_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearTalentId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        talentId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 4;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000004);
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:UnlockAvatarTalentRsp)
    }

    // @@protoc_insertion_point(class_scope:UnlockAvatarTalentRsp)
    private static final emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp();
    }

    public static emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UnlockAvatarTalentRsp>
        PARSER = new com.google.protobuf.AbstractParser<UnlockAvatarTalentRsp>() {
      @java.lang.Override
      public UnlockAvatarTalentRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<UnlockAvatarTalentRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UnlockAvatarTalentRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UnlockAvatarTalentRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UnlockAvatarTalentRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033UnlockAvatarTalentRsp.proto\"P\n\025UnlockA" +
      "vatarTalentRsp\022\023\n\013avatar_guid\030\005 \001(\004\022\021\n\tt" +
      "alent_id\030\r \001(\r\022\017\n\007retcode\030\004 \001(\005B\033\n\031emu.g" +
      "rasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UnlockAvatarTalentRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UnlockAvatarTalentRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UnlockAvatarTalentRsp_descriptor,
        new java.lang.String[] { "AvatarGuid", "TalentId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}