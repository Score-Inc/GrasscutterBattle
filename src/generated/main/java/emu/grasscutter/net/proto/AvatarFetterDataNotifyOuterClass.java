// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarFetterDataNotify.proto

package emu.grasscutter.net.proto;

public final class AvatarFetterDataNotifyOuterClass {
  private AvatarFetterDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarFetterDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarFetterDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint64, .AvatarFetterInfo&gt; fetter_info_map = 8;</code>
     */
    int getFetterInfoMapCount();
    /**
     * <code>map&lt;uint64, .AvatarFetterInfo&gt; fetter_info_map = 8;</code>
     */
    boolean containsFetterInfoMap(
        long key);
    /**
     * Use {@link #getFetterInfoMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo>
    getFetterInfoMap();
    /**
     * <code>map&lt;uint64, .AvatarFetterInfo&gt; fetter_info_map = 8;</code>
     */
    java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo>
    getFetterInfoMapMap();
    /**
     * <code>map&lt;uint64, .AvatarFetterInfo&gt; fetter_info_map = 8;</code>
     */
    /* nullable */
emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo getFetterInfoMapOrDefault(
        long key,
        /* nullable */
emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo defaultValue);
    /**
     * <code>map&lt;uint64, .AvatarFetterInfo&gt; fetter_info_map = 8;</code>
     */
    emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo getFetterInfoMapOrThrow(
        long key);
  }
  /**
   * <pre>
   * Name: KKADAHCNCNG
   * CmdId: 1648
   * </pre>
   *
   * Protobuf type {@code AvatarFetterDataNotify}
   */
  public static final class AvatarFetterDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarFetterDataNotify)
      AvatarFetterDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarFetterDataNotify.newBuilder() to construct.
    private AvatarFetterDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarFetterDataNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarFetterDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.internal_static_AvatarFetterDataNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 8:
          return internalGetFetterInfoMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.internal_static_AvatarFetterDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify.class, emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify.Builder.class);
    }

    public static final int FETTER_INFO_MAP_FIELD_NUMBER = 8;
    private static final class FetterInfoMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Long, emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Long, emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo>newDefaultInstance(
                  emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.internal_static_AvatarFetterDataNotify_FetterInfoMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT64,
                  0L,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo.getDefaultInstance());
    }
    @SuppressWarnings("serial")
    private com.google.protobuf.MapField<
        java.lang.Long, emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo> fetterInfoMap_;
    private com.google.protobuf.MapField<java.lang.Long, emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo>
    internalGetFetterInfoMap() {
      if (fetterInfoMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            FetterInfoMapDefaultEntryHolder.defaultEntry);
      }
      return fetterInfoMap_;
    }
    public int getFetterInfoMapCount() {
      return internalGetFetterInfoMap().getMap().size();
    }
    /**
     * <code>map&lt;uint64, .AvatarFetterInfo&gt; fetter_info_map = 8;</code>
     */
    @java.lang.Override
    public boolean containsFetterInfoMap(
        long key) {
      
      return internalGetFetterInfoMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getFetterInfoMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo> getFetterInfoMap() {
      return getFetterInfoMapMap();
    }
    /**
     * <code>map&lt;uint64, .AvatarFetterInfo&gt; fetter_info_map = 8;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo> getFetterInfoMapMap() {
      return internalGetFetterInfoMap().getMap();
    }
    /**
     * <code>map&lt;uint64, .AvatarFetterInfo&gt; fetter_info_map = 8;</code>
     */
    @java.lang.Override
    public /* nullable */
emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo getFetterInfoMapOrDefault(
        long key,
        /* nullable */
emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo defaultValue) {
      
      java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo> map =
          internalGetFetterInfoMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint64, .AvatarFetterInfo&gt; fetter_info_map = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo getFetterInfoMapOrThrow(
        long key) {
      
      java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo> map =
          internalGetFetterInfoMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
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
      com.google.protobuf.GeneratedMessageV3
        .serializeLongMapTo(
          output,
          internalGetFetterInfoMap(),
          FetterInfoMapDefaultEntryHolder.defaultEntry,
          8);
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Long, emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo> entry
           : internalGetFetterInfoMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Long, emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo>
        fetterInfoMap__ = FetterInfoMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(8, fetterInfoMap__);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify other = (emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify) obj;

      if (!internalGetFetterInfoMap().equals(
          other.internalGetFetterInfoMap())) return false;
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
      if (!internalGetFetterInfoMap().getMap().isEmpty()) {
        hash = (37 * hash) + FETTER_INFO_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetFetterInfoMap().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify prototype) {
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
     * Name: KKADAHCNCNG
     * CmdId: 1648
     * </pre>
     *
     * Protobuf type {@code AvatarFetterDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarFetterDataNotify)
        emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.internal_static_AvatarFetterDataNotify_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 8:
            return internalGetFetterInfoMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 8:
            return internalGetMutableFetterInfoMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.internal_static_AvatarFetterDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify.class, emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify.newBuilder()
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
        internalGetMutableFetterInfoMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.internal_static_AvatarFetterDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify build() {
        emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify buildPartial() {
        emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify result = new emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.fetterInfoMap_ = internalGetFetterInfoMap();
          result.fetterInfoMap_.makeImmutable();
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
        if (other instanceof emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify other) {
        if (other == emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify.getDefaultInstance()) return this;
        internalGetMutableFetterInfoMap().mergeFrom(
            other.internalGetFetterInfoMap());
        bitField0_ |= 0x00000001;
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
              case 66: {
                com.google.protobuf.MapEntry<java.lang.Long, emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo>
                fetterInfoMap__ = input.readMessage(
                    FetterInfoMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableFetterInfoMap().getMutableMap().put(
                    fetterInfoMap__.getKey(), fetterInfoMap__.getValue());
                bitField0_ |= 0x00000001;
                break;
              } // case 66
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

      private com.google.protobuf.MapField<
          java.lang.Long, emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo> fetterInfoMap_;
      private com.google.protobuf.MapField<java.lang.Long, emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo>
          internalGetFetterInfoMap() {
        if (fetterInfoMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              FetterInfoMapDefaultEntryHolder.defaultEntry);
        }
        return fetterInfoMap_;
      }
      private com.google.protobuf.MapField<java.lang.Long, emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo>
          internalGetMutableFetterInfoMap() {
        if (fetterInfoMap_ == null) {
          fetterInfoMap_ = com.google.protobuf.MapField.newMapField(
              FetterInfoMapDefaultEntryHolder.defaultEntry);
        }
        if (!fetterInfoMap_.isMutable()) {
          fetterInfoMap_ = fetterInfoMap_.copy();
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return fetterInfoMap_;
      }
      public int getFetterInfoMapCount() {
        return internalGetFetterInfoMap().getMap().size();
      }
      /**
       * <code>map&lt;uint64, .AvatarFetterInfo&gt; fetter_info_map = 8;</code>
       */
      @java.lang.Override
      public boolean containsFetterInfoMap(
          long key) {
        
        return internalGetFetterInfoMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getFetterInfoMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo> getFetterInfoMap() {
        return getFetterInfoMapMap();
      }
      /**
       * <code>map&lt;uint64, .AvatarFetterInfo&gt; fetter_info_map = 8;</code>
       */
      @java.lang.Override
      public java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo> getFetterInfoMapMap() {
        return internalGetFetterInfoMap().getMap();
      }
      /**
       * <code>map&lt;uint64, .AvatarFetterInfo&gt; fetter_info_map = 8;</code>
       */
      @java.lang.Override
      public /* nullable */
emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo getFetterInfoMapOrDefault(
          long key,
          /* nullable */
emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo defaultValue) {
        
        java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo> map =
            internalGetFetterInfoMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint64, .AvatarFetterInfo&gt; fetter_info_map = 8;</code>
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo getFetterInfoMapOrThrow(
          long key) {
        
        java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo> map =
            internalGetFetterInfoMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }
      public Builder clearFetterInfoMap() {
        bitField0_ = (bitField0_ & ~0x00000001);
        internalGetMutableFetterInfoMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint64, .AvatarFetterInfo&gt; fetter_info_map = 8;</code>
       */
      public Builder removeFetterInfoMap(
          long key) {
        
        internalGetMutableFetterInfoMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo>
          getMutableFetterInfoMap() {
        bitField0_ |= 0x00000001;
        return internalGetMutableFetterInfoMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint64, .AvatarFetterInfo&gt; fetter_info_map = 8;</code>
       */
      public Builder putFetterInfoMap(
          long key,
          emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo value) {
        
        if (value == null) { throw new NullPointerException("map value"); }
        internalGetMutableFetterInfoMap().getMutableMap()
            .put(key, value);
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>map&lt;uint64, .AvatarFetterInfo&gt; fetter_info_map = 8;</code>
       */
      public Builder putAllFetterInfoMap(
          java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo> values) {
        internalGetMutableFetterInfoMap().getMutableMap()
            .putAll(values);
        bitField0_ |= 0x00000001;
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


      // @@protoc_insertion_point(builder_scope:AvatarFetterDataNotify)
    }

    // @@protoc_insertion_point(class_scope:AvatarFetterDataNotify)
    private static final emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify();
    }

    public static emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarFetterDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<AvatarFetterDataNotify>() {
      @java.lang.Override
      public AvatarFetterDataNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<AvatarFetterDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarFetterDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarFetterDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarFetterDataNotify_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarFetterDataNotify_FetterInfoMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarFetterDataNotify_FetterInfoMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034AvatarFetterDataNotify.proto\032\026AvatarFe" +
      "tterInfo.proto\"\246\001\n\026AvatarFetterDataNotif" +
      "y\022C\n\017fetter_info_map\030\010 \003(\0132*.AvatarFette" +
      "rDataNotify.FetterInfoMapEntry\032G\n\022Fetter" +
      "InfoMapEntry\022\013\n\003key\030\001 \001(\004\022 \n\005value\030\002 \001(\013" +
      "2\021.AvatarFetterInfo:\0028\001B\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.getDescriptor(),
        });
    internal_static_AvatarFetterDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarFetterDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarFetterDataNotify_descriptor,
        new java.lang.String[] { "FetterInfoMap", });
    internal_static_AvatarFetterDataNotify_FetterInfoMapEntry_descriptor =
      internal_static_AvatarFetterDataNotify_descriptor.getNestedTypes().get(0);
    internal_static_AvatarFetterDataNotify_FetterInfoMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarFetterDataNotify_FetterInfoMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}