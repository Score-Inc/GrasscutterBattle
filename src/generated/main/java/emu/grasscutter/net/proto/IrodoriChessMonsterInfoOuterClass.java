// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IrodoriChessMonsterInfo.proto

package emu.grasscutter.net.proto;

public final class IrodoriChessMonsterInfoOuterClass {
  private IrodoriChessMonsterInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IrodoriChessMonsterInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IrodoriChessMonsterInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 affix_list = 8;</code>
     * @return A list containing the affixList.
     */
    java.util.List<java.lang.Integer> getAffixListList();
    /**
     * <code>repeated uint32 affix_list = 8;</code>
     * @return The count of affixList.
     */
    int getAffixListCount();
    /**
     * <code>repeated uint32 affix_list = 8;</code>
     * @param index The index of the element to return.
     * @return The affixList at the given index.
     */
    int getAffixList(int index);

    /**
     * <code>uint32 level = 5;</code>
     * @return The level.
     */
    int getLevel();

    /**
     * <code>uint32 grant_points = 2;</code>
     * @return The grantPoints.
     */
    int getGrantPoints();

    /**
     * <code>uint32 monster_id = 12;</code>
     * @return The monsterId.
     */
    int getMonsterId();
  }
  /**
   * <pre>
   * Name: GLEKJEAFNOD
   * </pre>
   *
   * Protobuf type {@code IrodoriChessMonsterInfo}
   */
  public static final class IrodoriChessMonsterInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IrodoriChessMonsterInfo)
      IrodoriChessMonsterInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IrodoriChessMonsterInfo.newBuilder() to construct.
    private IrodoriChessMonsterInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IrodoriChessMonsterInfo() {
      affixList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IrodoriChessMonsterInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.internal_static_IrodoriChessMonsterInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.internal_static_IrodoriChessMonsterInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo.class, emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo.Builder.class);
    }

    public static final int AFFIX_LIST_FIELD_NUMBER = 8;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList affixList_;
    /**
     * <code>repeated uint32 affix_list = 8;</code>
     * @return A list containing the affixList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getAffixListList() {
      return affixList_;
    }
    /**
     * <code>repeated uint32 affix_list = 8;</code>
     * @return The count of affixList.
     */
    public int getAffixListCount() {
      return affixList_.size();
    }
    /**
     * <code>repeated uint32 affix_list = 8;</code>
     * @param index The index of the element to return.
     * @return The affixList at the given index.
     */
    public int getAffixList(int index) {
      return affixList_.getInt(index);
    }
    private int affixListMemoizedSerializedSize = -1;

    public static final int LEVEL_FIELD_NUMBER = 5;
    private int level_ = 0;
    /**
     * <code>uint32 level = 5;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      return level_;
    }

    public static final int GRANT_POINTS_FIELD_NUMBER = 2;
    private int grantPoints_ = 0;
    /**
     * <code>uint32 grant_points = 2;</code>
     * @return The grantPoints.
     */
    @java.lang.Override
    public int getGrantPoints() {
      return grantPoints_;
    }

    public static final int MONSTER_ID_FIELD_NUMBER = 12;
    private int monsterId_ = 0;
    /**
     * <code>uint32 monster_id = 12;</code>
     * @return The monsterId.
     */
    @java.lang.Override
    public int getMonsterId() {
      return monsterId_;
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
      if (grantPoints_ != 0) {
        output.writeUInt32(2, grantPoints_);
      }
      if (level_ != 0) {
        output.writeUInt32(5, level_);
      }
      if (getAffixListList().size() > 0) {
        output.writeUInt32NoTag(66);
        output.writeUInt32NoTag(affixListMemoizedSerializedSize);
      }
      for (int i = 0; i < affixList_.size(); i++) {
        output.writeUInt32NoTag(affixList_.getInt(i));
      }
      if (monsterId_ != 0) {
        output.writeUInt32(12, monsterId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (grantPoints_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, grantPoints_);
      }
      if (level_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, level_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < affixList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(affixList_.getInt(i));
        }
        size += dataSize;
        if (!getAffixListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        affixListMemoizedSerializedSize = dataSize;
      }
      if (monsterId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, monsterId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo other = (emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo) obj;

      if (!getAffixListList()
          .equals(other.getAffixListList())) return false;
      if (getLevel()
          != other.getLevel()) return false;
      if (getGrantPoints()
          != other.getGrantPoints()) return false;
      if (getMonsterId()
          != other.getMonsterId()) return false;
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
      if (getAffixListCount() > 0) {
        hash = (37 * hash) + AFFIX_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAffixListList().hashCode();
      }
      hash = (37 * hash) + LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getLevel();
      hash = (37 * hash) + GRANT_POINTS_FIELD_NUMBER;
      hash = (53 * hash) + getGrantPoints();
      hash = (37 * hash) + MONSTER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMonsterId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo prototype) {
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
     * Name: GLEKJEAFNOD
     * </pre>
     *
     * Protobuf type {@code IrodoriChessMonsterInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IrodoriChessMonsterInfo)
        emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.internal_static_IrodoriChessMonsterInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.internal_static_IrodoriChessMonsterInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo.class, emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo.newBuilder()
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
        affixList_ = emptyIntList();
        level_ = 0;
        grantPoints_ = 0;
        monsterId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.internal_static_IrodoriChessMonsterInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo build() {
        emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo buildPartial() {
        emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo result = new emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo result) {
        if (((bitField0_ & 0x00000001) != 0)) {
          affixList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.affixList_ = affixList_;
      }

      private void buildPartial0(emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.level_ = level_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.grantPoints_ = grantPoints_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.monsterId_ = monsterId_;
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
        if (other instanceof emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo) {
          return mergeFrom((emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo other) {
        if (other == emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo.getDefaultInstance()) return this;
        if (!other.affixList_.isEmpty()) {
          if (affixList_.isEmpty()) {
            affixList_ = other.affixList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAffixListIsMutable();
            affixList_.addAll(other.affixList_);
          }
          onChanged();
        }
        if (other.getLevel() != 0) {
          setLevel(other.getLevel());
        }
        if (other.getGrantPoints() != 0) {
          setGrantPoints(other.getGrantPoints());
        }
        if (other.getMonsterId() != 0) {
          setMonsterId(other.getMonsterId());
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
                grantPoints_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 16
              case 40: {
                level_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 40
              case 64: {
                int v = input.readUInt32();
                ensureAffixListIsMutable();
                affixList_.addInt(v);
                break;
              } // case 64
              case 66: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureAffixListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  affixList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 66
              case 96: {
                monsterId_ = input.readUInt32();
                bitField0_ |= 0x00000008;
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

      private com.google.protobuf.Internal.IntList affixList_ = emptyIntList();
      private void ensureAffixListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          affixList_ = mutableCopy(affixList_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       * <code>repeated uint32 affix_list = 8;</code>
       * @return A list containing the affixList.
       */
      public java.util.List<java.lang.Integer>
          getAffixListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(affixList_) : affixList_;
      }
      /**
       * <code>repeated uint32 affix_list = 8;</code>
       * @return The count of affixList.
       */
      public int getAffixListCount() {
        return affixList_.size();
      }
      /**
       * <code>repeated uint32 affix_list = 8;</code>
       * @param index The index of the element to return.
       * @return The affixList at the given index.
       */
      public int getAffixList(int index) {
        return affixList_.getInt(index);
      }
      /**
       * <code>repeated uint32 affix_list = 8;</code>
       * @param index The index to set the value at.
       * @param value The affixList to set.
       * @return This builder for chaining.
       */
      public Builder setAffixList(
          int index, int value) {
        
        ensureAffixListIsMutable();
        affixList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 affix_list = 8;</code>
       * @param value The affixList to add.
       * @return This builder for chaining.
       */
      public Builder addAffixList(int value) {
        
        ensureAffixListIsMutable();
        affixList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 affix_list = 8;</code>
       * @param values The affixList to add.
       * @return This builder for chaining.
       */
      public Builder addAllAffixList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureAffixListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, affixList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 affix_list = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearAffixList() {
        affixList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int level_ ;
      /**
       * <code>uint32 level = 5;</code>
       * @return The level.
       */
      @java.lang.Override
      public int getLevel() {
        return level_;
      }
      /**
       * <code>uint32 level = 5;</code>
       * @param value The level to set.
       * @return This builder for chaining.
       */
      public Builder setLevel(int value) {
        
        level_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevel() {
        bitField0_ = (bitField0_ & ~0x00000002);
        level_ = 0;
        onChanged();
        return this;
      }

      private int grantPoints_ ;
      /**
       * <code>uint32 grant_points = 2;</code>
       * @return The grantPoints.
       */
      @java.lang.Override
      public int getGrantPoints() {
        return grantPoints_;
      }
      /**
       * <code>uint32 grant_points = 2;</code>
       * @param value The grantPoints to set.
       * @return This builder for chaining.
       */
      public Builder setGrantPoints(int value) {
        
        grantPoints_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 grant_points = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearGrantPoints() {
        bitField0_ = (bitField0_ & ~0x00000004);
        grantPoints_ = 0;
        onChanged();
        return this;
      }

      private int monsterId_ ;
      /**
       * <code>uint32 monster_id = 12;</code>
       * @return The monsterId.
       */
      @java.lang.Override
      public int getMonsterId() {
        return monsterId_;
      }
      /**
       * <code>uint32 monster_id = 12;</code>
       * @param value The monsterId to set.
       * @return This builder for chaining.
       */
      public Builder setMonsterId(int value) {
        
        monsterId_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 monster_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearMonsterId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        monsterId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:IrodoriChessMonsterInfo)
    }

    // @@protoc_insertion_point(class_scope:IrodoriChessMonsterInfo)
    private static final emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo();
    }

    public static emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IrodoriChessMonsterInfo>
        PARSER = new com.google.protobuf.AbstractParser<IrodoriChessMonsterInfo>() {
      @java.lang.Override
      public IrodoriChessMonsterInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<IrodoriChessMonsterInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IrodoriChessMonsterInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IrodoriChessMonsterInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IrodoriChessMonsterInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035IrodoriChessMonsterInfo.proto\"f\n\027Irodo" +
      "riChessMonsterInfo\022\022\n\naffix_list\030\010 \003(\r\022\r" +
      "\n\005level\030\005 \001(\r\022\024\n\014grant_points\030\002 \001(\r\022\022\n\nm" +
      "onster_id\030\014 \001(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_IrodoriChessMonsterInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IrodoriChessMonsterInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IrodoriChessMonsterInfo_descriptor,
        new java.lang.String[] { "AffixList", "Level", "GrantPoints", "MonsterId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
