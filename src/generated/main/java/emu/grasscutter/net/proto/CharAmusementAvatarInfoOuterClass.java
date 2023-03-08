// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CharAmusementAvatarInfo.proto

package emu.grasscutter.net.proto;

public final class CharAmusementAvatarInfoOuterClass {
  private CharAmusementAvatarInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CharAmusementAvatarInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CharAmusementAvatarInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 uid = 11;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>uint32 punish_time = 2;</code>
     * @return The punishTime.
     */
    int getPunishTime();

    /**
     * <code>repeated uint32 avatar_id_list = 15;</code>
     * @return A list containing the avatarIdList.
     */
    java.util.List<java.lang.Integer> getAvatarIdListList();
    /**
     * <code>repeated uint32 avatar_id_list = 15;</code>
     * @return The count of avatarIdList.
     */
    int getAvatarIdListCount();
    /**
     * <code>repeated uint32 avatar_id_list = 15;</code>
     * @param index The index of the element to return.
     * @return The avatarIdList at the given index.
     */
    int getAvatarIdList(int index);
  }
  /**
   * <pre>
   * Name: EBCKHAKAFEN
   * </pre>
   *
   * Protobuf type {@code CharAmusementAvatarInfo}
   */
  public static final class CharAmusementAvatarInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CharAmusementAvatarInfo)
      CharAmusementAvatarInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CharAmusementAvatarInfo.newBuilder() to construct.
    private CharAmusementAvatarInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CharAmusementAvatarInfo() {
      avatarIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CharAmusementAvatarInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.internal_static_CharAmusementAvatarInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.internal_static_CharAmusementAvatarInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo.class, emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 11;
    private int uid_ = 0;
    /**
     * <code>uint32 uid = 11;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int PUNISH_TIME_FIELD_NUMBER = 2;
    private int punishTime_ = 0;
    /**
     * <code>uint32 punish_time = 2;</code>
     * @return The punishTime.
     */
    @java.lang.Override
    public int getPunishTime() {
      return punishTime_;
    }

    public static final int AVATAR_ID_LIST_FIELD_NUMBER = 15;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList avatarIdList_;
    /**
     * <code>repeated uint32 avatar_id_list = 15;</code>
     * @return A list containing the avatarIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getAvatarIdListList() {
      return avatarIdList_;
    }
    /**
     * <code>repeated uint32 avatar_id_list = 15;</code>
     * @return The count of avatarIdList.
     */
    public int getAvatarIdListCount() {
      return avatarIdList_.size();
    }
    /**
     * <code>repeated uint32 avatar_id_list = 15;</code>
     * @param index The index of the element to return.
     * @return The avatarIdList at the given index.
     */
    public int getAvatarIdList(int index) {
      return avatarIdList_.getInt(index);
    }
    private int avatarIdListMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (punishTime_ != 0) {
        output.writeUInt32(2, punishTime_);
      }
      if (uid_ != 0) {
        output.writeUInt32(11, uid_);
      }
      if (getAvatarIdListList().size() > 0) {
        output.writeUInt32NoTag(122);
        output.writeUInt32NoTag(avatarIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < avatarIdList_.size(); i++) {
        output.writeUInt32NoTag(avatarIdList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (punishTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, punishTime_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, uid_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < avatarIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(avatarIdList_.getInt(i));
        }
        size += dataSize;
        if (!getAvatarIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        avatarIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo other = (emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo) obj;

      if (getUid()
          != other.getUid()) return false;
      if (getPunishTime()
          != other.getPunishTime()) return false;
      if (!getAvatarIdListList()
          .equals(other.getAvatarIdListList())) return false;
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
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (37 * hash) + PUNISH_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getPunishTime();
      if (getAvatarIdListCount() > 0) {
        hash = (37 * hash) + AVATAR_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAvatarIdListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo prototype) {
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
     * Name: EBCKHAKAFEN
     * </pre>
     *
     * Protobuf type {@code CharAmusementAvatarInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CharAmusementAvatarInfo)
        emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.internal_static_CharAmusementAvatarInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.internal_static_CharAmusementAvatarInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo.class, emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo.newBuilder()
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
        uid_ = 0;
        punishTime_ = 0;
        avatarIdList_ = emptyIntList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.internal_static_CharAmusementAvatarInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo build() {
        emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo buildPartial() {
        emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo result = new emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo result) {
        if (((bitField0_ & 0x00000004) != 0)) {
          avatarIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.avatarIdList_ = avatarIdList_;
      }

      private void buildPartial0(emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.uid_ = uid_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.punishTime_ = punishTime_;
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
        if (other instanceof emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo) {
          return mergeFrom((emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo other) {
        if (other == emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.getPunishTime() != 0) {
          setPunishTime(other.getPunishTime());
        }
        if (!other.avatarIdList_.isEmpty()) {
          if (avatarIdList_.isEmpty()) {
            avatarIdList_ = other.avatarIdList_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureAvatarIdListIsMutable();
            avatarIdList_.addAll(other.avatarIdList_);
          }
          onChanged();
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
                punishTime_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 88: {
                uid_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 88
              case 120: {
                int v = input.readUInt32();
                ensureAvatarIdListIsMutable();
                avatarIdList_.addInt(v);
                break;
              } // case 120
              case 122: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureAvatarIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  avatarIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 122
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

      private int uid_ ;
      /**
       * <code>uint32 uid = 11;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 11;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        uid_ = 0;
        onChanged();
        return this;
      }

      private int punishTime_ ;
      /**
       * <code>uint32 punish_time = 2;</code>
       * @return The punishTime.
       */
      @java.lang.Override
      public int getPunishTime() {
        return punishTime_;
      }
      /**
       * <code>uint32 punish_time = 2;</code>
       * @param value The punishTime to set.
       * @return This builder for chaining.
       */
      public Builder setPunishTime(int value) {
        
        punishTime_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 punish_time = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPunishTime() {
        bitField0_ = (bitField0_ & ~0x00000002);
        punishTime_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList avatarIdList_ = emptyIntList();
      private void ensureAvatarIdListIsMutable() {
        if (!((bitField0_ & 0x00000004) != 0)) {
          avatarIdList_ = mutableCopy(avatarIdList_);
          bitField0_ |= 0x00000004;
        }
      }
      /**
       * <code>repeated uint32 avatar_id_list = 15;</code>
       * @return A list containing the avatarIdList.
       */
      public java.util.List<java.lang.Integer>
          getAvatarIdListList() {
        return ((bitField0_ & 0x00000004) != 0) ?
                 java.util.Collections.unmodifiableList(avatarIdList_) : avatarIdList_;
      }
      /**
       * <code>repeated uint32 avatar_id_list = 15;</code>
       * @return The count of avatarIdList.
       */
      public int getAvatarIdListCount() {
        return avatarIdList_.size();
      }
      /**
       * <code>repeated uint32 avatar_id_list = 15;</code>
       * @param index The index of the element to return.
       * @return The avatarIdList at the given index.
       */
      public int getAvatarIdList(int index) {
        return avatarIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 avatar_id_list = 15;</code>
       * @param index The index to set the value at.
       * @param value The avatarIdList to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarIdList(
          int index, int value) {
        
        ensureAvatarIdListIsMutable();
        avatarIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 avatar_id_list = 15;</code>
       * @param value The avatarIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAvatarIdList(int value) {
        
        ensureAvatarIdListIsMutable();
        avatarIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 avatar_id_list = 15;</code>
       * @param values The avatarIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllAvatarIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureAvatarIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, avatarIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 avatar_id_list = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarIdList() {
        avatarIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000004);
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


      // @@protoc_insertion_point(builder_scope:CharAmusementAvatarInfo)
    }

    // @@protoc_insertion_point(class_scope:CharAmusementAvatarInfo)
    private static final emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo();
    }

    public static emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CharAmusementAvatarInfo>
        PARSER = new com.google.protobuf.AbstractParser<CharAmusementAvatarInfo>() {
      @java.lang.Override
      public CharAmusementAvatarInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<CharAmusementAvatarInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CharAmusementAvatarInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CharAmusementAvatarInfoOuterClass.CharAmusementAvatarInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CharAmusementAvatarInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CharAmusementAvatarInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035CharAmusementAvatarInfo.proto\"S\n\027CharA" +
      "musementAvatarInfo\022\013\n\003uid\030\013 \001(\r\022\023\n\013punis" +
      "h_time\030\002 \001(\r\022\026\n\016avatar_id_list\030\017 \003(\rB\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CharAmusementAvatarInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CharAmusementAvatarInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CharAmusementAvatarInfo_descriptor,
        new java.lang.String[] { "Uid", "PunishTime", "AvatarIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}