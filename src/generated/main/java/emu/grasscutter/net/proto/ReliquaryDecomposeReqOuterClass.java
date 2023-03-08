// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReliquaryDecomposeReq.proto

package emu.grasscutter.net.proto;

public final class ReliquaryDecomposeReqOuterClass {
  private ReliquaryDecomposeReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReliquaryDecomposeReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReliquaryDecomposeReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 target_count = 10;</code>
     * @return The targetCount.
     */
    int getTargetCount();

    /**
     * <code>repeated uint64 guid_list = 12;</code>
     * @return A list containing the guidList.
     */
    java.util.List<java.lang.Long> getGuidListList();
    /**
     * <code>repeated uint64 guid_list = 12;</code>
     * @return The count of guidList.
     */
    int getGuidListCount();
    /**
     * <code>repeated uint64 guid_list = 12;</code>
     * @param index The index of the element to return.
     * @return The guidList at the given index.
     */
    long getGuidList(int index);

    /**
     * <code>uint32 config_id = 14;</code>
     * @return The configId.
     */
    int getConfigId();
  }
  /**
   * <pre>
   * Name: BPIDHOFHENA
   * CmdId: 631
   * </pre>
   *
   * Protobuf type {@code ReliquaryDecomposeReq}
   */
  public static final class ReliquaryDecomposeReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ReliquaryDecomposeReq)
      ReliquaryDecomposeReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReliquaryDecomposeReq.newBuilder() to construct.
    private ReliquaryDecomposeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReliquaryDecomposeReq() {
      guidList_ = emptyLongList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ReliquaryDecomposeReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.internal_static_ReliquaryDecomposeReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.internal_static_ReliquaryDecomposeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq.class, emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq.Builder.class);
    }

    public static final int TARGET_COUNT_FIELD_NUMBER = 10;
    private int targetCount_ = 0;
    /**
     * <code>uint32 target_count = 10;</code>
     * @return The targetCount.
     */
    @java.lang.Override
    public int getTargetCount() {
      return targetCount_;
    }

    public static final int GUID_LIST_FIELD_NUMBER = 12;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.LongList guidList_;
    /**
     * <code>repeated uint64 guid_list = 12;</code>
     * @return A list containing the guidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getGuidListList() {
      return guidList_;
    }
    /**
     * <code>repeated uint64 guid_list = 12;</code>
     * @return The count of guidList.
     */
    public int getGuidListCount() {
      return guidList_.size();
    }
    /**
     * <code>repeated uint64 guid_list = 12;</code>
     * @param index The index of the element to return.
     * @return The guidList at the given index.
     */
    public long getGuidList(int index) {
      return guidList_.getLong(index);
    }
    private int guidListMemoizedSerializedSize = -1;

    public static final int CONFIG_ID_FIELD_NUMBER = 14;
    private int configId_ = 0;
    /**
     * <code>uint32 config_id = 14;</code>
     * @return The configId.
     */
    @java.lang.Override
    public int getConfigId() {
      return configId_;
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
      if (targetCount_ != 0) {
        output.writeUInt32(10, targetCount_);
      }
      if (getGuidListList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(guidListMemoizedSerializedSize);
      }
      for (int i = 0; i < guidList_.size(); i++) {
        output.writeUInt64NoTag(guidList_.getLong(i));
      }
      if (configId_ != 0) {
        output.writeUInt32(14, configId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (targetCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, targetCount_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < guidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(guidList_.getLong(i));
        }
        size += dataSize;
        if (!getGuidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        guidListMemoizedSerializedSize = dataSize;
      }
      if (configId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, configId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq other = (emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq) obj;

      if (getTargetCount()
          != other.getTargetCount()) return false;
      if (!getGuidListList()
          .equals(other.getGuidListList())) return false;
      if (getConfigId()
          != other.getConfigId()) return false;
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
      hash = (37 * hash) + TARGET_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getTargetCount();
      if (getGuidListCount() > 0) {
        hash = (37 * hash) + GUID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getGuidListList().hashCode();
      }
      hash = (37 * hash) + CONFIG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getConfigId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq prototype) {
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
     * Name: BPIDHOFHENA
     * CmdId: 631
     * </pre>
     *
     * Protobuf type {@code ReliquaryDecomposeReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReliquaryDecomposeReq)
        emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.internal_static_ReliquaryDecomposeReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.internal_static_ReliquaryDecomposeReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq.class, emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq.newBuilder()
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
        targetCount_ = 0;
        guidList_ = emptyLongList();
        configId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.internal_static_ReliquaryDecomposeReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq build() {
        emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq buildPartial() {
        emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq result = new emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq result) {
        if (((bitField0_ & 0x00000002) != 0)) {
          guidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.guidList_ = guidList_;
      }

      private void buildPartial0(emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.targetCount_ = targetCount_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.configId_ = configId_;
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
        if (other instanceof emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq) {
          return mergeFrom((emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq other) {
        if (other == emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq.getDefaultInstance()) return this;
        if (other.getTargetCount() != 0) {
          setTargetCount(other.getTargetCount());
        }
        if (!other.guidList_.isEmpty()) {
          if (guidList_.isEmpty()) {
            guidList_ = other.guidList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureGuidListIsMutable();
            guidList_.addAll(other.guidList_);
          }
          onChanged();
        }
        if (other.getConfigId() != 0) {
          setConfigId(other.getConfigId());
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
              case 80: {
                targetCount_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 80
              case 96: {
                long v = input.readUInt64();
                ensureGuidListIsMutable();
                guidList_.addLong(v);
                break;
              } // case 96
              case 98: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureGuidListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  guidList_.addLong(input.readUInt64());
                }
                input.popLimit(limit);
                break;
              } // case 98
              case 112: {
                configId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
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

      private int targetCount_ ;
      /**
       * <code>uint32 target_count = 10;</code>
       * @return The targetCount.
       */
      @java.lang.Override
      public int getTargetCount() {
        return targetCount_;
      }
      /**
       * <code>uint32 target_count = 10;</code>
       * @param value The targetCount to set.
       * @return This builder for chaining.
       */
      public Builder setTargetCount(int value) {
        
        targetCount_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_count = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetCount() {
        bitField0_ = (bitField0_ & ~0x00000001);
        targetCount_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.LongList guidList_ = emptyLongList();
      private void ensureGuidListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          guidList_ = mutableCopy(guidList_);
          bitField0_ |= 0x00000002;
        }
      }
      /**
       * <code>repeated uint64 guid_list = 12;</code>
       * @return A list containing the guidList.
       */
      public java.util.List<java.lang.Long>
          getGuidListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(guidList_) : guidList_;
      }
      /**
       * <code>repeated uint64 guid_list = 12;</code>
       * @return The count of guidList.
       */
      public int getGuidListCount() {
        return guidList_.size();
      }
      /**
       * <code>repeated uint64 guid_list = 12;</code>
       * @param index The index of the element to return.
       * @return The guidList at the given index.
       */
      public long getGuidList(int index) {
        return guidList_.getLong(index);
      }
      /**
       * <code>repeated uint64 guid_list = 12;</code>
       * @param index The index to set the value at.
       * @param value The guidList to set.
       * @return This builder for chaining.
       */
      public Builder setGuidList(
          int index, long value) {
        
        ensureGuidListIsMutable();
        guidList_.setLong(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 guid_list = 12;</code>
       * @param value The guidList to add.
       * @return This builder for chaining.
       */
      public Builder addGuidList(long value) {
        
        ensureGuidListIsMutable();
        guidList_.addLong(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 guid_list = 12;</code>
       * @param values The guidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllGuidList(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureGuidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, guidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 guid_list = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuidList() {
        guidList_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private int configId_ ;
      /**
       * <code>uint32 config_id = 14;</code>
       * @return The configId.
       */
      @java.lang.Override
      public int getConfigId() {
        return configId_;
      }
      /**
       * <code>uint32 config_id = 14;</code>
       * @param value The configId to set.
       * @return This builder for chaining.
       */
      public Builder setConfigId(int value) {
        
        configId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 config_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearConfigId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        configId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ReliquaryDecomposeReq)
    }

    // @@protoc_insertion_point(class_scope:ReliquaryDecomposeReq)
    private static final emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq();
    }

    public static emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReliquaryDecomposeReq>
        PARSER = new com.google.protobuf.AbstractParser<ReliquaryDecomposeReq>() {
      @java.lang.Override
      public ReliquaryDecomposeReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<ReliquaryDecomposeReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReliquaryDecomposeReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReliquaryDecomposeReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReliquaryDecomposeReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033ReliquaryDecomposeReq.proto\"S\n\025Reliqua" +
      "ryDecomposeReq\022\024\n\014target_count\030\n \001(\r\022\021\n\t" +
      "guid_list\030\014 \003(\004\022\021\n\tconfig_id\030\016 \001(\rB\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ReliquaryDecomposeReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ReliquaryDecomposeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReliquaryDecomposeReq_descriptor,
        new java.lang.String[] { "TargetCount", "GuidList", "ConfigId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
