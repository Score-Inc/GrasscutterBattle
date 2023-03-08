// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SetUpAvatarTeamReq.proto

package emu.grasscutter.net.proto;

public final class SetUpAvatarTeamReqOuterClass {
  private SetUpAvatarTeamReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetUpAvatarTeamReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetUpAvatarTeamReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint64 avatar_team_guid_list = 13;</code>
     * @return A list containing the avatarTeamGuidList.
     */
    java.util.List<java.lang.Long> getAvatarTeamGuidListList();
    /**
     * <code>repeated uint64 avatar_team_guid_list = 13;</code>
     * @return The count of avatarTeamGuidList.
     */
    int getAvatarTeamGuidListCount();
    /**
     * <code>repeated uint64 avatar_team_guid_list = 13;</code>
     * @param index The index of the element to return.
     * @return The avatarTeamGuidList at the given index.
     */
    long getAvatarTeamGuidList(int index);

    /**
     * <code>uint32 team_id = 8;</code>
     * @return The teamId.
     */
    int getTeamId();

    /**
     * <code>uint64 cur_avatar_guid = 11;</code>
     * @return The curAvatarGuid.
     */
    long getCurAvatarGuid();
  }
  /**
   * <pre>
   * Name: IOACHNLALKO
   * CmdId: 1638
   * </pre>
   *
   * Protobuf type {@code SetUpAvatarTeamReq}
   */
  public static final class SetUpAvatarTeamReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetUpAvatarTeamReq)
      SetUpAvatarTeamReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetUpAvatarTeamReq.newBuilder() to construct.
    private SetUpAvatarTeamReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetUpAvatarTeamReq() {
      avatarTeamGuidList_ = emptyLongList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SetUpAvatarTeamReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.internal_static_SetUpAvatarTeamReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.internal_static_SetUpAvatarTeamReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq.class, emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq.Builder.class);
    }

    public static final int AVATAR_TEAM_GUID_LIST_FIELD_NUMBER = 13;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.LongList avatarTeamGuidList_;
    /**
     * <code>repeated uint64 avatar_team_guid_list = 13;</code>
     * @return A list containing the avatarTeamGuidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getAvatarTeamGuidListList() {
      return avatarTeamGuidList_;
    }
    /**
     * <code>repeated uint64 avatar_team_guid_list = 13;</code>
     * @return The count of avatarTeamGuidList.
     */
    public int getAvatarTeamGuidListCount() {
      return avatarTeamGuidList_.size();
    }
    /**
     * <code>repeated uint64 avatar_team_guid_list = 13;</code>
     * @param index The index of the element to return.
     * @return The avatarTeamGuidList at the given index.
     */
    public long getAvatarTeamGuidList(int index) {
      return avatarTeamGuidList_.getLong(index);
    }
    private int avatarTeamGuidListMemoizedSerializedSize = -1;

    public static final int TEAM_ID_FIELD_NUMBER = 8;
    private int teamId_ = 0;
    /**
     * <code>uint32 team_id = 8;</code>
     * @return The teamId.
     */
    @java.lang.Override
    public int getTeamId() {
      return teamId_;
    }

    public static final int CUR_AVATAR_GUID_FIELD_NUMBER = 11;
    private long curAvatarGuid_ = 0L;
    /**
     * <code>uint64 cur_avatar_guid = 11;</code>
     * @return The curAvatarGuid.
     */
    @java.lang.Override
    public long getCurAvatarGuid() {
      return curAvatarGuid_;
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
      getSerializedSize();
      if (teamId_ != 0) {
        output.writeUInt32(8, teamId_);
      }
      if (curAvatarGuid_ != 0L) {
        output.writeUInt64(11, curAvatarGuid_);
      }
      if (getAvatarTeamGuidListList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(avatarTeamGuidListMemoizedSerializedSize);
      }
      for (int i = 0; i < avatarTeamGuidList_.size(); i++) {
        output.writeUInt64NoTag(avatarTeamGuidList_.getLong(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (teamId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, teamId_);
      }
      if (curAvatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(11, curAvatarGuid_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < avatarTeamGuidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(avatarTeamGuidList_.getLong(i));
        }
        size += dataSize;
        if (!getAvatarTeamGuidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        avatarTeamGuidListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq other = (emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq) obj;

      if (!getAvatarTeamGuidListList()
          .equals(other.getAvatarTeamGuidListList())) return false;
      if (getTeamId()
          != other.getTeamId()) return false;
      if (getCurAvatarGuid()
          != other.getCurAvatarGuid()) return false;
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
      if (getAvatarTeamGuidListCount() > 0) {
        hash = (37 * hash) + AVATAR_TEAM_GUID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAvatarTeamGuidListList().hashCode();
      }
      hash = (37 * hash) + TEAM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTeamId();
      hash = (37 * hash) + CUR_AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCurAvatarGuid());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq prototype) {
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
     * Name: IOACHNLALKO
     * CmdId: 1638
     * </pre>
     *
     * Protobuf type {@code SetUpAvatarTeamReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetUpAvatarTeamReq)
        emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.internal_static_SetUpAvatarTeamReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.internal_static_SetUpAvatarTeamReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq.class, emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq.newBuilder()
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
        avatarTeamGuidList_ = emptyLongList();
        teamId_ = 0;
        curAvatarGuid_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.internal_static_SetUpAvatarTeamReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq build() {
        emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq buildPartial() {
        emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq result = new emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq result) {
        if (((bitField0_ & 0x00000001) != 0)) {
          avatarTeamGuidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.avatarTeamGuidList_ = avatarTeamGuidList_;
      }

      private void buildPartial0(emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.teamId_ = teamId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.curAvatarGuid_ = curAvatarGuid_;
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
        if (other instanceof emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq) {
          return mergeFrom((emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq other) {
        if (other == emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq.getDefaultInstance()) return this;
        if (!other.avatarTeamGuidList_.isEmpty()) {
          if (avatarTeamGuidList_.isEmpty()) {
            avatarTeamGuidList_ = other.avatarTeamGuidList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAvatarTeamGuidListIsMutable();
            avatarTeamGuidList_.addAll(other.avatarTeamGuidList_);
          }
          onChanged();
        }
        if (other.getTeamId() != 0) {
          setTeamId(other.getTeamId());
        }
        if (other.getCurAvatarGuid() != 0L) {
          setCurAvatarGuid(other.getCurAvatarGuid());
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
              case 64: {
                teamId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 64
              case 88: {
                curAvatarGuid_ = input.readUInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 88
              case 104: {
                long v = input.readUInt64();
                ensureAvatarTeamGuidListIsMutable();
                avatarTeamGuidList_.addLong(v);
                break;
              } // case 104
              case 106: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureAvatarTeamGuidListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  avatarTeamGuidList_.addLong(input.readUInt64());
                }
                input.popLimit(limit);
                break;
              } // case 106
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

      private com.google.protobuf.Internal.LongList avatarTeamGuidList_ = emptyLongList();
      private void ensureAvatarTeamGuidListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          avatarTeamGuidList_ = mutableCopy(avatarTeamGuidList_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       * <code>repeated uint64 avatar_team_guid_list = 13;</code>
       * @return A list containing the avatarTeamGuidList.
       */
      public java.util.List<java.lang.Long>
          getAvatarTeamGuidListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(avatarTeamGuidList_) : avatarTeamGuidList_;
      }
      /**
       * <code>repeated uint64 avatar_team_guid_list = 13;</code>
       * @return The count of avatarTeamGuidList.
       */
      public int getAvatarTeamGuidListCount() {
        return avatarTeamGuidList_.size();
      }
      /**
       * <code>repeated uint64 avatar_team_guid_list = 13;</code>
       * @param index The index of the element to return.
       * @return The avatarTeamGuidList at the given index.
       */
      public long getAvatarTeamGuidList(int index) {
        return avatarTeamGuidList_.getLong(index);
      }
      /**
       * <code>repeated uint64 avatar_team_guid_list = 13;</code>
       * @param index The index to set the value at.
       * @param value The avatarTeamGuidList to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarTeamGuidList(
          int index, long value) {
        
        ensureAvatarTeamGuidListIsMutable();
        avatarTeamGuidList_.setLong(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 avatar_team_guid_list = 13;</code>
       * @param value The avatarTeamGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addAvatarTeamGuidList(long value) {
        
        ensureAvatarTeamGuidListIsMutable();
        avatarTeamGuidList_.addLong(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 avatar_team_guid_list = 13;</code>
       * @param values The avatarTeamGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllAvatarTeamGuidList(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureAvatarTeamGuidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, avatarTeamGuidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 avatar_team_guid_list = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarTeamGuidList() {
        avatarTeamGuidList_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int teamId_ ;
      /**
       * <code>uint32 team_id = 8;</code>
       * @return The teamId.
       */
      @java.lang.Override
      public int getTeamId() {
        return teamId_;
      }
      /**
       * <code>uint32 team_id = 8;</code>
       * @param value The teamId to set.
       * @return This builder for chaining.
       */
      public Builder setTeamId(int value) {
        
        teamId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 team_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearTeamId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        teamId_ = 0;
        onChanged();
        return this;
      }

      private long curAvatarGuid_ ;
      /**
       * <code>uint64 cur_avatar_guid = 11;</code>
       * @return The curAvatarGuid.
       */
      @java.lang.Override
      public long getCurAvatarGuid() {
        return curAvatarGuid_;
      }
      /**
       * <code>uint64 cur_avatar_guid = 11;</code>
       * @param value The curAvatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setCurAvatarGuid(long value) {
        
        curAvatarGuid_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 cur_avatar_guid = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurAvatarGuid() {
        bitField0_ = (bitField0_ & ~0x00000004);
        curAvatarGuid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:SetUpAvatarTeamReq)
    }

    // @@protoc_insertion_point(class_scope:SetUpAvatarTeamReq)
    private static final emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq();
    }

    public static emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetUpAvatarTeamReq>
        PARSER = new com.google.protobuf.AbstractParser<SetUpAvatarTeamReq>() {
      @java.lang.Override
      public SetUpAvatarTeamReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<SetUpAvatarTeamReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SetUpAvatarTeamReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetUpAvatarTeamReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetUpAvatarTeamReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030SetUpAvatarTeamReq.proto\"]\n\022SetUpAvata" +
      "rTeamReq\022\035\n\025avatar_team_guid_list\030\r \003(\004\022" +
      "\017\n\007team_id\030\010 \001(\r\022\027\n\017cur_avatar_guid\030\013 \001(" +
      "\004B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SetUpAvatarTeamReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetUpAvatarTeamReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetUpAvatarTeamReq_descriptor,
        new java.lang.String[] { "AvatarTeamGuidList", "TeamId", "CurAvatarGuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
