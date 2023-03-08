// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IrodoriMasterLevelInfo.proto

package emu.grasscutter.net.proto;

public final class IrodoriMasterLevelInfoOuterClass {
  private IrodoriMasterLevelInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IrodoriMasterLevelInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IrodoriMasterLevelInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 levelId = 1;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>repeated .IrodoriMasterLevelDetailInfo detailInfo = 14;</code>
     */
    java.util.List<emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo> 
        getDetailInfoList();
    /**
     * <code>repeated .IrodoriMasterLevelDetailInfo detailInfo = 14;</code>
     */
    emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo getDetailInfo(int index);
    /**
     * <code>repeated .IrodoriMasterLevelDetailInfo detailInfo = 14;</code>
     */
    int getDetailInfoCount();
    /**
     * <code>repeated .IrodoriMasterLevelDetailInfo detailInfo = 14;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfoOrBuilder> 
        getDetailInfoOrBuilderList();
    /**
     * <code>repeated .IrodoriMasterLevelDetailInfo detailInfo = 14;</code>
     */
    emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfoOrBuilder getDetailInfoOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code IrodoriMasterLevelInfo}
   */
  public static final class IrodoriMasterLevelInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IrodoriMasterLevelInfo)
      IrodoriMasterLevelInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IrodoriMasterLevelInfo.newBuilder() to construct.
    private IrodoriMasterLevelInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IrodoriMasterLevelInfo() {
      detailInfo_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IrodoriMasterLevelInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.internal_static_IrodoriMasterLevelInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.internal_static_IrodoriMasterLevelInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo.class, emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo.Builder.class);
    }

    public static final int LEVELID_FIELD_NUMBER = 1;
    private int levelId_ = 0;
    /**
     * <code>uint32 levelId = 1;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int DETAILINFO_FIELD_NUMBER = 14;
    @SuppressWarnings("serial")
    private java.util.List<emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo> detailInfo_;
    /**
     * <code>repeated .IrodoriMasterLevelDetailInfo detailInfo = 14;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo> getDetailInfoList() {
      return detailInfo_;
    }
    /**
     * <code>repeated .IrodoriMasterLevelDetailInfo detailInfo = 14;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfoOrBuilder> 
        getDetailInfoOrBuilderList() {
      return detailInfo_;
    }
    /**
     * <code>repeated .IrodoriMasterLevelDetailInfo detailInfo = 14;</code>
     */
    @java.lang.Override
    public int getDetailInfoCount() {
      return detailInfo_.size();
    }
    /**
     * <code>repeated .IrodoriMasterLevelDetailInfo detailInfo = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo getDetailInfo(int index) {
      return detailInfo_.get(index);
    }
    /**
     * <code>repeated .IrodoriMasterLevelDetailInfo detailInfo = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfoOrBuilder getDetailInfoOrBuilder(
        int index) {
      return detailInfo_.get(index);
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
      if (levelId_ != 0) {
        output.writeUInt32(1, levelId_);
      }
      for (int i = 0; i < detailInfo_.size(); i++) {
        output.writeMessage(14, detailInfo_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, levelId_);
      }
      for (int i = 0; i < detailInfo_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, detailInfo_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo other = (emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (!getDetailInfoList()
          .equals(other.getDetailInfoList())) return false;
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
      hash = (37 * hash) + LEVELID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      if (getDetailInfoCount() > 0) {
        hash = (37 * hash) + DETAILINFO_FIELD_NUMBER;
        hash = (53 * hash) + getDetailInfoList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo prototype) {
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
     * Protobuf type {@code IrodoriMasterLevelInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IrodoriMasterLevelInfo)
        emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.internal_static_IrodoriMasterLevelInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.internal_static_IrodoriMasterLevelInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo.class, emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo.newBuilder()
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
        levelId_ = 0;
        if (detailInfoBuilder_ == null) {
          detailInfo_ = java.util.Collections.emptyList();
        } else {
          detailInfo_ = null;
          detailInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.internal_static_IrodoriMasterLevelInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo build() {
        emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo buildPartial() {
        emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo result = new emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo result) {
        if (detailInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            detailInfo_ = java.util.Collections.unmodifiableList(detailInfo_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.detailInfo_ = detailInfo_;
        } else {
          result.detailInfo_ = detailInfoBuilder_.build();
        }
      }

      private void buildPartial0(emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.levelId_ = levelId_;
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
        if (other instanceof emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo) {
          return mergeFrom((emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo other) {
        if (other == emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (detailInfoBuilder_ == null) {
          if (!other.detailInfo_.isEmpty()) {
            if (detailInfo_.isEmpty()) {
              detailInfo_ = other.detailInfo_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureDetailInfoIsMutable();
              detailInfo_.addAll(other.detailInfo_);
            }
            onChanged();
          }
        } else {
          if (!other.detailInfo_.isEmpty()) {
            if (detailInfoBuilder_.isEmpty()) {
              detailInfoBuilder_.dispose();
              detailInfoBuilder_ = null;
              detailInfo_ = other.detailInfo_;
              bitField0_ = (bitField0_ & ~0x00000002);
              detailInfoBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getDetailInfoFieldBuilder() : null;
            } else {
              detailInfoBuilder_.addAllMessages(other.detailInfo_);
            }
          }
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
                levelId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 114: {
                emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo m =
                    input.readMessage(
                        emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.parser(),
                        extensionRegistry);
                if (detailInfoBuilder_ == null) {
                  ensureDetailInfoIsMutable();
                  detailInfo_.add(m);
                } else {
                  detailInfoBuilder_.addMessage(m);
                }
                break;
              } // case 114
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

      private int levelId_ ;
      /**
       * <code>uint32 levelId = 1;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 levelId = 1;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 levelId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        levelId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo> detailInfo_ =
        java.util.Collections.emptyList();
      private void ensureDetailInfoIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          detailInfo_ = new java.util.ArrayList<emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo>(detailInfo_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo, emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.Builder, emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfoOrBuilder> detailInfoBuilder_;

      /**
       * <code>repeated .IrodoriMasterLevelDetailInfo detailInfo = 14;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo> getDetailInfoList() {
        if (detailInfoBuilder_ == null) {
          return java.util.Collections.unmodifiableList(detailInfo_);
        } else {
          return detailInfoBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .IrodoriMasterLevelDetailInfo detailInfo = 14;</code>
       */
      public int getDetailInfoCount() {
        if (detailInfoBuilder_ == null) {
          return detailInfo_.size();
        } else {
          return detailInfoBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .IrodoriMasterLevelDetailInfo detailInfo = 14;</code>
       */
      public emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo getDetailInfo(int index) {
        if (detailInfoBuilder_ == null) {
          return detailInfo_.get(index);
        } else {
          return detailInfoBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .IrodoriMasterLevelDetailInfo detailInfo = 14;</code>
       */
      public Builder setDetailInfo(
          int index, emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo value) {
        if (detailInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDetailInfoIsMutable();
          detailInfo_.set(index, value);
          onChanged();
        } else {
          detailInfoBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriMasterLevelDetailInfo detailInfo = 14;</code>
       */
      public Builder setDetailInfo(
          int index, emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.Builder builderForValue) {
        if (detailInfoBuilder_ == null) {
          ensureDetailInfoIsMutable();
          detailInfo_.set(index, builderForValue.build());
          onChanged();
        } else {
          detailInfoBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriMasterLevelDetailInfo detailInfo = 14;</code>
       */
      public Builder addDetailInfo(emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo value) {
        if (detailInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDetailInfoIsMutable();
          detailInfo_.add(value);
          onChanged();
        } else {
          detailInfoBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriMasterLevelDetailInfo detailInfo = 14;</code>
       */
      public Builder addDetailInfo(
          int index, emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo value) {
        if (detailInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDetailInfoIsMutable();
          detailInfo_.add(index, value);
          onChanged();
        } else {
          detailInfoBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriMasterLevelDetailInfo detailInfo = 14;</code>
       */
      public Builder addDetailInfo(
          emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.Builder builderForValue) {
        if (detailInfoBuilder_ == null) {
          ensureDetailInfoIsMutable();
          detailInfo_.add(builderForValue.build());
          onChanged();
        } else {
          detailInfoBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriMasterLevelDetailInfo detailInfo = 14;</code>
       */
      public Builder addDetailInfo(
          int index, emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.Builder builderForValue) {
        if (detailInfoBuilder_ == null) {
          ensureDetailInfoIsMutable();
          detailInfo_.add(index, builderForValue.build());
          onChanged();
        } else {
          detailInfoBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriMasterLevelDetailInfo detailInfo = 14;</code>
       */
      public Builder addAllDetailInfo(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo> values) {
        if (detailInfoBuilder_ == null) {
          ensureDetailInfoIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, detailInfo_);
          onChanged();
        } else {
          detailInfoBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriMasterLevelDetailInfo detailInfo = 14;</code>
       */
      public Builder clearDetailInfo() {
        if (detailInfoBuilder_ == null) {
          detailInfo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          detailInfoBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriMasterLevelDetailInfo detailInfo = 14;</code>
       */
      public Builder removeDetailInfo(int index) {
        if (detailInfoBuilder_ == null) {
          ensureDetailInfoIsMutable();
          detailInfo_.remove(index);
          onChanged();
        } else {
          detailInfoBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriMasterLevelDetailInfo detailInfo = 14;</code>
       */
      public emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.Builder getDetailInfoBuilder(
          int index) {
        return getDetailInfoFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .IrodoriMasterLevelDetailInfo detailInfo = 14;</code>
       */
      public emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfoOrBuilder getDetailInfoOrBuilder(
          int index) {
        if (detailInfoBuilder_ == null) {
          return detailInfo_.get(index);  } else {
          return detailInfoBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .IrodoriMasterLevelDetailInfo detailInfo = 14;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfoOrBuilder> 
           getDetailInfoOrBuilderList() {
        if (detailInfoBuilder_ != null) {
          return detailInfoBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(detailInfo_);
        }
      }
      /**
       * <code>repeated .IrodoriMasterLevelDetailInfo detailInfo = 14;</code>
       */
      public emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.Builder addDetailInfoBuilder() {
        return getDetailInfoFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .IrodoriMasterLevelDetailInfo detailInfo = 14;</code>
       */
      public emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.Builder addDetailInfoBuilder(
          int index) {
        return getDetailInfoFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .IrodoriMasterLevelDetailInfo detailInfo = 14;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.Builder> 
           getDetailInfoBuilderList() {
        return getDetailInfoFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo, emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.Builder, emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfoOrBuilder> 
          getDetailInfoFieldBuilder() {
        if (detailInfoBuilder_ == null) {
          detailInfoBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo, emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.Builder, emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfoOrBuilder>(
                  detailInfo_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          detailInfo_ = null;
        }
        return detailInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:IrodoriMasterLevelInfo)
    }

    // @@protoc_insertion_point(class_scope:IrodoriMasterLevelInfo)
    private static final emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo();
    }

    public static emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IrodoriMasterLevelInfo>
        PARSER = new com.google.protobuf.AbstractParser<IrodoriMasterLevelInfo>() {
      @java.lang.Override
      public IrodoriMasterLevelInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<IrodoriMasterLevelInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IrodoriMasterLevelInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.IrodoriMasterLevelInfoOuterClass.IrodoriMasterLevelInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IrodoriMasterLevelInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IrodoriMasterLevelInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034IrodoriMasterLevelInfo.proto\032\"IrodoriM" +
      "asterLevelDetailInfo.proto\"\\\n\026IrodoriMas" +
      "terLevelInfo\022\017\n\007levelId\030\001 \001(\r\0221\n\ndetailI" +
      "nfo\030\016 \003(\0132\035.IrodoriMasterLevelDetailInfo" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.getDescriptor(),
        });
    internal_static_IrodoriMasterLevelInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IrodoriMasterLevelInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IrodoriMasterLevelInfo_descriptor,
        new java.lang.String[] { "LevelId", "DetailInfo", });
    emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
