// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SalvageBundleChallengeInfo.proto

package emu.grasscutter.net.proto;

public final class SalvageBundleChallengeInfoOuterClass {
  private SalvageBundleChallengeInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SalvageBundleChallengeInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SalvageBundleChallengeInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 finished_bundle_list = 13;</code>
     * @return A list containing the finishedBundleList.
     */
    java.util.List<java.lang.Integer> getFinishedBundleListList();
    /**
     * <code>repeated uint32 finished_bundle_list = 13;</code>
     * @return The count of finishedBundleList.
     */
    int getFinishedBundleListCount();
    /**
     * <code>repeated uint32 finished_bundle_list = 13;</code>
     * @param index The index of the element to return.
     * @return The finishedBundleList at the given index.
     */
    int getFinishedBundleList(int index);
  }
  /**
   * <pre>
   * Name: CLCLGFMLOOG
   * </pre>
   *
   * Protobuf type {@code SalvageBundleChallengeInfo}
   */
  public static final class SalvageBundleChallengeInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SalvageBundleChallengeInfo)
      SalvageBundleChallengeInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SalvageBundleChallengeInfo.newBuilder() to construct.
    private SalvageBundleChallengeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SalvageBundleChallengeInfo() {
      finishedBundleList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SalvageBundleChallengeInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.internal_static_SalvageBundleChallengeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.internal_static_SalvageBundleChallengeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo.class, emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo.Builder.class);
    }

    public static final int FINISHED_BUNDLE_LIST_FIELD_NUMBER = 13;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList finishedBundleList_;
    /**
     * <code>repeated uint32 finished_bundle_list = 13;</code>
     * @return A list containing the finishedBundleList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getFinishedBundleListList() {
      return finishedBundleList_;
    }
    /**
     * <code>repeated uint32 finished_bundle_list = 13;</code>
     * @return The count of finishedBundleList.
     */
    public int getFinishedBundleListCount() {
      return finishedBundleList_.size();
    }
    /**
     * <code>repeated uint32 finished_bundle_list = 13;</code>
     * @param index The index of the element to return.
     * @return The finishedBundleList at the given index.
     */
    public int getFinishedBundleList(int index) {
      return finishedBundleList_.getInt(index);
    }
    private int finishedBundleListMemoizedSerializedSize = -1;

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
      if (getFinishedBundleListList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(finishedBundleListMemoizedSerializedSize);
      }
      for (int i = 0; i < finishedBundleList_.size(); i++) {
        output.writeUInt32NoTag(finishedBundleList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < finishedBundleList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(finishedBundleList_.getInt(i));
        }
        size += dataSize;
        if (!getFinishedBundleListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        finishedBundleListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo other = (emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo) obj;

      if (!getFinishedBundleListList()
          .equals(other.getFinishedBundleListList())) return false;
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
      if (getFinishedBundleListCount() > 0) {
        hash = (37 * hash) + FINISHED_BUNDLE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getFinishedBundleListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo prototype) {
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
     * Name: CLCLGFMLOOG
     * </pre>
     *
     * Protobuf type {@code SalvageBundleChallengeInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SalvageBundleChallengeInfo)
        emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.internal_static_SalvageBundleChallengeInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.internal_static_SalvageBundleChallengeInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo.class, emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo.newBuilder()
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
        finishedBundleList_ = emptyIntList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.internal_static_SalvageBundleChallengeInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo build() {
        emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo buildPartial() {
        emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo result = new emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo result) {
        if (((bitField0_ & 0x00000001) != 0)) {
          finishedBundleList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.finishedBundleList_ = finishedBundleList_;
      }

      private void buildPartial0(emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo result) {
        int from_bitField0_ = bitField0_;
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
        if (other instanceof emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo other) {
        if (other == emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo.getDefaultInstance()) return this;
        if (!other.finishedBundleList_.isEmpty()) {
          if (finishedBundleList_.isEmpty()) {
            finishedBundleList_ = other.finishedBundleList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFinishedBundleListIsMutable();
            finishedBundleList_.addAll(other.finishedBundleList_);
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
              case 104: {
                int v = input.readUInt32();
                ensureFinishedBundleListIsMutable();
                finishedBundleList_.addInt(v);
                break;
              } // case 104
              case 106: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureFinishedBundleListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  finishedBundleList_.addInt(input.readUInt32());
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

      private com.google.protobuf.Internal.IntList finishedBundleList_ = emptyIntList();
      private void ensureFinishedBundleListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          finishedBundleList_ = mutableCopy(finishedBundleList_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       * <code>repeated uint32 finished_bundle_list = 13;</code>
       * @return A list containing the finishedBundleList.
       */
      public java.util.List<java.lang.Integer>
          getFinishedBundleListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(finishedBundleList_) : finishedBundleList_;
      }
      /**
       * <code>repeated uint32 finished_bundle_list = 13;</code>
       * @return The count of finishedBundleList.
       */
      public int getFinishedBundleListCount() {
        return finishedBundleList_.size();
      }
      /**
       * <code>repeated uint32 finished_bundle_list = 13;</code>
       * @param index The index of the element to return.
       * @return The finishedBundleList at the given index.
       */
      public int getFinishedBundleList(int index) {
        return finishedBundleList_.getInt(index);
      }
      /**
       * <code>repeated uint32 finished_bundle_list = 13;</code>
       * @param index The index to set the value at.
       * @param value The finishedBundleList to set.
       * @return This builder for chaining.
       */
      public Builder setFinishedBundleList(
          int index, int value) {
        
        ensureFinishedBundleListIsMutable();
        finishedBundleList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 finished_bundle_list = 13;</code>
       * @param value The finishedBundleList to add.
       * @return This builder for chaining.
       */
      public Builder addFinishedBundleList(int value) {
        
        ensureFinishedBundleListIsMutable();
        finishedBundleList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 finished_bundle_list = 13;</code>
       * @param values The finishedBundleList to add.
       * @return This builder for chaining.
       */
      public Builder addAllFinishedBundleList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureFinishedBundleListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, finishedBundleList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 finished_bundle_list = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishedBundleList() {
        finishedBundleList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:SalvageBundleChallengeInfo)
    }

    // @@protoc_insertion_point(class_scope:SalvageBundleChallengeInfo)
    private static final emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo();
    }

    public static emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SalvageBundleChallengeInfo>
        PARSER = new com.google.protobuf.AbstractParser<SalvageBundleChallengeInfo>() {
      @java.lang.Override
      public SalvageBundleChallengeInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<SalvageBundleChallengeInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SalvageBundleChallengeInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SalvageBundleChallengeInfoOuterClass.SalvageBundleChallengeInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SalvageBundleChallengeInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SalvageBundleChallengeInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n SalvageBundleChallengeInfo.proto\":\n\032Sa" +
      "lvageBundleChallengeInfo\022\034\n\024finished_bun" +
      "dle_list\030\r \003(\rB\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SalvageBundleChallengeInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SalvageBundleChallengeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SalvageBundleChallengeInfo_descriptor,
        new java.lang.String[] { "FinishedBundleList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
