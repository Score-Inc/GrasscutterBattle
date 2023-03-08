// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetParentQuestVideoKeyRsp.proto

package emu.grasscutter.net.proto;

public final class GetParentQuestVideoKeyRspOuterClass {
  private GetParentQuestVideoKeyRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetParentQuestVideoKeyRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetParentQuestVideoKeyRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 parent_quest_id = 11;</code>
     * @return The parentQuestId.
     */
    int getParentQuestId();

    /**
     * <code>uint64 video_key = 9;</code>
     * @return The videoKey.
     */
    long getVideoKey();

    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * Name: AALPIPNOICA
   * CmdId: 493
   * </pre>
   *
   * Protobuf type {@code GetParentQuestVideoKeyRsp}
   */
  public static final class GetParentQuestVideoKeyRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetParentQuestVideoKeyRsp)
      GetParentQuestVideoKeyRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetParentQuestVideoKeyRsp.newBuilder() to construct.
    private GetParentQuestVideoKeyRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetParentQuestVideoKeyRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetParentQuestVideoKeyRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.internal_static_GetParentQuestVideoKeyRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.internal_static_GetParentQuestVideoKeyRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp.class, emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp.Builder.class);
    }

    public static final int PARENT_QUEST_ID_FIELD_NUMBER = 11;
    private int parentQuestId_ = 0;
    /**
     * <code>uint32 parent_quest_id = 11;</code>
     * @return The parentQuestId.
     */
    @java.lang.Override
    public int getParentQuestId() {
      return parentQuestId_;
    }

    public static final int VIDEO_KEY_FIELD_NUMBER = 9;
    private long videoKey_ = 0L;
    /**
     * <code>uint64 video_key = 9;</code>
     * @return The videoKey.
     */
    @java.lang.Override
    public long getVideoKey() {
      return videoKey_;
    }

    public static final int RETCODE_FIELD_NUMBER = 1;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 1;</code>
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
        output.writeInt32(1, retcode_);
      }
      if (videoKey_ != 0L) {
        output.writeUInt64(9, videoKey_);
      }
      if (parentQuestId_ != 0) {
        output.writeUInt32(11, parentQuestId_);
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
          .computeInt32Size(1, retcode_);
      }
      if (videoKey_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(9, videoKey_);
      }
      if (parentQuestId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, parentQuestId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp other = (emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp) obj;

      if (getParentQuestId()
          != other.getParentQuestId()) return false;
      if (getVideoKey()
          != other.getVideoKey()) return false;
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
      hash = (37 * hash) + PARENT_QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getParentQuestId();
      hash = (37 * hash) + VIDEO_KEY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getVideoKey());
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp prototype) {
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
     * Name: AALPIPNOICA
     * CmdId: 493
     * </pre>
     *
     * Protobuf type {@code GetParentQuestVideoKeyRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetParentQuestVideoKeyRsp)
        emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.internal_static_GetParentQuestVideoKeyRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.internal_static_GetParentQuestVideoKeyRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp.class, emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp.newBuilder()
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
        parentQuestId_ = 0;
        videoKey_ = 0L;
        retcode_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.internal_static_GetParentQuestVideoKeyRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp build() {
        emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp buildPartial() {
        emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp result = new emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.parentQuestId_ = parentQuestId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.videoKey_ = videoKey_;
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
        if (other instanceof emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp other) {
        if (other == emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp.getDefaultInstance()) return this;
        if (other.getParentQuestId() != 0) {
          setParentQuestId(other.getParentQuestId());
        }
        if (other.getVideoKey() != 0L) {
          setVideoKey(other.getVideoKey());
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
              case 8: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 8
              case 72: {
                videoKey_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 72
              case 88: {
                parentQuestId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 88
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

      private int parentQuestId_ ;
      /**
       * <code>uint32 parent_quest_id = 11;</code>
       * @return The parentQuestId.
       */
      @java.lang.Override
      public int getParentQuestId() {
        return parentQuestId_;
      }
      /**
       * <code>uint32 parent_quest_id = 11;</code>
       * @param value The parentQuestId to set.
       * @return This builder for chaining.
       */
      public Builder setParentQuestId(int value) {
        
        parentQuestId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 parent_quest_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearParentQuestId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        parentQuestId_ = 0;
        onChanged();
        return this;
      }

      private long videoKey_ ;
      /**
       * <code>uint64 video_key = 9;</code>
       * @return The videoKey.
       */
      @java.lang.Override
      public long getVideoKey() {
        return videoKey_;
      }
      /**
       * <code>uint64 video_key = 9;</code>
       * @param value The videoKey to set.
       * @return This builder for chaining.
       */
      public Builder setVideoKey(long value) {
        
        videoKey_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 video_key = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearVideoKey() {
        bitField0_ = (bitField0_ & ~0x00000002);
        videoKey_ = 0L;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 1;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 1;</code>
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
       * <code>int32 retcode = 1;</code>
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


      // @@protoc_insertion_point(builder_scope:GetParentQuestVideoKeyRsp)
    }

    // @@protoc_insertion_point(class_scope:GetParentQuestVideoKeyRsp)
    private static final emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp();
    }

    public static emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetParentQuestVideoKeyRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetParentQuestVideoKeyRsp>() {
      @java.lang.Override
      public GetParentQuestVideoKeyRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetParentQuestVideoKeyRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetParentQuestVideoKeyRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetParentQuestVideoKeyRspOuterClass.GetParentQuestVideoKeyRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetParentQuestVideoKeyRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetParentQuestVideoKeyRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037GetParentQuestVideoKeyRsp.proto\"X\n\031Get" +
      "ParentQuestVideoKeyRsp\022\027\n\017parent_quest_i" +
      "d\030\013 \001(\r\022\021\n\tvideo_key\030\t \001(\004\022\017\n\007retcode\030\001 " +
      "\001(\005B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetParentQuestVideoKeyRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetParentQuestVideoKeyRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetParentQuestVideoKeyRsp_descriptor,
        new java.lang.String[] { "ParentQuestId", "VideoKey", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
