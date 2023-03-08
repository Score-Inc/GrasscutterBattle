// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerApplyEnterMpNotify.proto

package emu.grasscutter.net.proto;

public final class PlayerApplyEnterMpNotifyOuterClass {
  private PlayerApplyEnterMpNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerApplyEnterMpNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerApplyEnterMpNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.OnlinePlayerInfo src_player_info = 5;</code>
     * @return Whether the srcPlayerInfo field is set.
     */
    boolean hasSrcPlayerInfo();
    /**
     * <code>.OnlinePlayerInfo src_player_info = 5;</code>
     * @return The srcPlayerInfo.
     */
    emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo getSrcPlayerInfo();
    /**
     * <code>.OnlinePlayerInfo src_player_info = 5;</code>
     */
    emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getSrcPlayerInfoOrBuilder();

    /**
     * <code>uint32 src_thread_index = 7;</code>
     * @return The srcThreadIndex.
     */
    int getSrcThreadIndex();

    /**
     * <code>uint32 src_app_id = 8;</code>
     * @return The srcAppId.
     */
    int getSrcAppId();
  }
  /**
   * <pre>
   * Name: PKHNOEDAGBD
   * CmdId: 1848
   * </pre>
   *
   * Protobuf type {@code PlayerApplyEnterMpNotify}
   */
  public static final class PlayerApplyEnterMpNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerApplyEnterMpNotify)
      PlayerApplyEnterMpNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerApplyEnterMpNotify.newBuilder() to construct.
    private PlayerApplyEnterMpNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerApplyEnterMpNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerApplyEnterMpNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.internal_static_PlayerApplyEnterMpNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.internal_static_PlayerApplyEnterMpNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify.class, emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify.Builder.class);
    }

    public static final int SRC_PLAYER_INFO_FIELD_NUMBER = 5;
    private emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo srcPlayerInfo_;
    /**
     * <code>.OnlinePlayerInfo src_player_info = 5;</code>
     * @return Whether the srcPlayerInfo field is set.
     */
    @java.lang.Override
    public boolean hasSrcPlayerInfo() {
      return srcPlayerInfo_ != null;
    }
    /**
     * <code>.OnlinePlayerInfo src_player_info = 5;</code>
     * @return The srcPlayerInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo getSrcPlayerInfo() {
      return srcPlayerInfo_ == null ? emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : srcPlayerInfo_;
    }
    /**
     * <code>.OnlinePlayerInfo src_player_info = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getSrcPlayerInfoOrBuilder() {
      return srcPlayerInfo_ == null ? emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : srcPlayerInfo_;
    }

    public static final int SRC_THREAD_INDEX_FIELD_NUMBER = 7;
    private int srcThreadIndex_ = 0;
    /**
     * <code>uint32 src_thread_index = 7;</code>
     * @return The srcThreadIndex.
     */
    @java.lang.Override
    public int getSrcThreadIndex() {
      return srcThreadIndex_;
    }

    public static final int SRC_APP_ID_FIELD_NUMBER = 8;
    private int srcAppId_ = 0;
    /**
     * <code>uint32 src_app_id = 8;</code>
     * @return The srcAppId.
     */
    @java.lang.Override
    public int getSrcAppId() {
      return srcAppId_;
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
      if (srcPlayerInfo_ != null) {
        output.writeMessage(5, getSrcPlayerInfo());
      }
      if (srcThreadIndex_ != 0) {
        output.writeUInt32(7, srcThreadIndex_);
      }
      if (srcAppId_ != 0) {
        output.writeUInt32(8, srcAppId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (srcPlayerInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getSrcPlayerInfo());
      }
      if (srcThreadIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, srcThreadIndex_);
      }
      if (srcAppId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, srcAppId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify other = (emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify) obj;

      if (hasSrcPlayerInfo() != other.hasSrcPlayerInfo()) return false;
      if (hasSrcPlayerInfo()) {
        if (!getSrcPlayerInfo()
            .equals(other.getSrcPlayerInfo())) return false;
      }
      if (getSrcThreadIndex()
          != other.getSrcThreadIndex()) return false;
      if (getSrcAppId()
          != other.getSrcAppId()) return false;
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
      if (hasSrcPlayerInfo()) {
        hash = (37 * hash) + SRC_PLAYER_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getSrcPlayerInfo().hashCode();
      }
      hash = (37 * hash) + SRC_THREAD_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getSrcThreadIndex();
      hash = (37 * hash) + SRC_APP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSrcAppId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify prototype) {
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
     * Name: PKHNOEDAGBD
     * CmdId: 1848
     * </pre>
     *
     * Protobuf type {@code PlayerApplyEnterMpNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerApplyEnterMpNotify)
        emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.internal_static_PlayerApplyEnterMpNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.internal_static_PlayerApplyEnterMpNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify.class, emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify.newBuilder()
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
        srcPlayerInfo_ = null;
        if (srcPlayerInfoBuilder_ != null) {
          srcPlayerInfoBuilder_.dispose();
          srcPlayerInfoBuilder_ = null;
        }
        srcThreadIndex_ = 0;
        srcAppId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.internal_static_PlayerApplyEnterMpNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify build() {
        emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify buildPartial() {
        emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify result = new emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.srcPlayerInfo_ = srcPlayerInfoBuilder_ == null
              ? srcPlayerInfo_
              : srcPlayerInfoBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.srcThreadIndex_ = srcThreadIndex_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.srcAppId_ = srcAppId_;
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
        if (other instanceof emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify other) {
        if (other == emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify.getDefaultInstance()) return this;
        if (other.hasSrcPlayerInfo()) {
          mergeSrcPlayerInfo(other.getSrcPlayerInfo());
        }
        if (other.getSrcThreadIndex() != 0) {
          setSrcThreadIndex(other.getSrcThreadIndex());
        }
        if (other.getSrcAppId() != 0) {
          setSrcAppId(other.getSrcAppId());
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
              case 42: {
                input.readMessage(
                    getSrcPlayerInfoFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 42
              case 56: {
                srcThreadIndex_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 56
              case 64: {
                srcAppId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 64
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

      private emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo srcPlayerInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> srcPlayerInfoBuilder_;
      /**
       * <code>.OnlinePlayerInfo src_player_info = 5;</code>
       * @return Whether the srcPlayerInfo field is set.
       */
      public boolean hasSrcPlayerInfo() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.OnlinePlayerInfo src_player_info = 5;</code>
       * @return The srcPlayerInfo.
       */
      public emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo getSrcPlayerInfo() {
        if (srcPlayerInfoBuilder_ == null) {
          return srcPlayerInfo_ == null ? emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : srcPlayerInfo_;
        } else {
          return srcPlayerInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.OnlinePlayerInfo src_player_info = 5;</code>
       */
      public Builder setSrcPlayerInfo(emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
        if (srcPlayerInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          srcPlayerInfo_ = value;
        } else {
          srcPlayerInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.OnlinePlayerInfo src_player_info = 5;</code>
       */
      public Builder setSrcPlayerInfo(
          emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder builderForValue) {
        if (srcPlayerInfoBuilder_ == null) {
          srcPlayerInfo_ = builderForValue.build();
        } else {
          srcPlayerInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.OnlinePlayerInfo src_player_info = 5;</code>
       */
      public Builder mergeSrcPlayerInfo(emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
        if (srcPlayerInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            srcPlayerInfo_ != null &&
            srcPlayerInfo_ != emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance()) {
            getSrcPlayerInfoBuilder().mergeFrom(value);
          } else {
            srcPlayerInfo_ = value;
          }
        } else {
          srcPlayerInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.OnlinePlayerInfo src_player_info = 5;</code>
       */
      public Builder clearSrcPlayerInfo() {
        bitField0_ = (bitField0_ & ~0x00000001);
        srcPlayerInfo_ = null;
        if (srcPlayerInfoBuilder_ != null) {
          srcPlayerInfoBuilder_.dispose();
          srcPlayerInfoBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.OnlinePlayerInfo src_player_info = 5;</code>
       */
      public emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder getSrcPlayerInfoBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getSrcPlayerInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.OnlinePlayerInfo src_player_info = 5;</code>
       */
      public emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getSrcPlayerInfoOrBuilder() {
        if (srcPlayerInfoBuilder_ != null) {
          return srcPlayerInfoBuilder_.getMessageOrBuilder();
        } else {
          return srcPlayerInfo_ == null ?
              emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : srcPlayerInfo_;
        }
      }
      /**
       * <code>.OnlinePlayerInfo src_player_info = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> 
          getSrcPlayerInfoFieldBuilder() {
        if (srcPlayerInfoBuilder_ == null) {
          srcPlayerInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder>(
                  getSrcPlayerInfo(),
                  getParentForChildren(),
                  isClean());
          srcPlayerInfo_ = null;
        }
        return srcPlayerInfoBuilder_;
      }

      private int srcThreadIndex_ ;
      /**
       * <code>uint32 src_thread_index = 7;</code>
       * @return The srcThreadIndex.
       */
      @java.lang.Override
      public int getSrcThreadIndex() {
        return srcThreadIndex_;
      }
      /**
       * <code>uint32 src_thread_index = 7;</code>
       * @param value The srcThreadIndex to set.
       * @return This builder for chaining.
       */
      public Builder setSrcThreadIndex(int value) {
        
        srcThreadIndex_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 src_thread_index = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearSrcThreadIndex() {
        bitField0_ = (bitField0_ & ~0x00000002);
        srcThreadIndex_ = 0;
        onChanged();
        return this;
      }

      private int srcAppId_ ;
      /**
       * <code>uint32 src_app_id = 8;</code>
       * @return The srcAppId.
       */
      @java.lang.Override
      public int getSrcAppId() {
        return srcAppId_;
      }
      /**
       * <code>uint32 src_app_id = 8;</code>
       * @param value The srcAppId to set.
       * @return This builder for chaining.
       */
      public Builder setSrcAppId(int value) {
        
        srcAppId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 src_app_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearSrcAppId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        srcAppId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerApplyEnterMpNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerApplyEnterMpNotify)
    private static final emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify();
    }

    public static emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerApplyEnterMpNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerApplyEnterMpNotify>() {
      @java.lang.Override
      public PlayerApplyEnterMpNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerApplyEnterMpNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerApplyEnterMpNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerApplyEnterMpNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerApplyEnterMpNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036PlayerApplyEnterMpNotify.proto\032\026Online" +
      "PlayerInfo.proto\"t\n\030PlayerApplyEnterMpNo" +
      "tify\022*\n\017src_player_info\030\005 \001(\0132\021.OnlinePl" +
      "ayerInfo\022\030\n\020src_thread_index\030\007 \001(\r\022\022\n\nsr" +
      "c_app_id\030\010 \001(\rB\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.getDescriptor(),
        });
    internal_static_PlayerApplyEnterMpNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerApplyEnterMpNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerApplyEnterMpNotify_descriptor,
        new java.lang.String[] { "SrcPlayerInfo", "SrcThreadIndex", "SrcAppId", });
    emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
