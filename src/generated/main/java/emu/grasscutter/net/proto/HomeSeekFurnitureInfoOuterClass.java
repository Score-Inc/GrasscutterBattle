// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeSeekFurnitureInfo.proto

package emu.grasscutter.net.proto;

public final class HomeSeekFurnitureInfoOuterClass {
  private HomeSeekFurnitureInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeSeekFurnitureInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeSeekFurnitureInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3300_LGEAPLJCJFH = 10;</code>
     * @return The unk3300LGEAPLJCJFH.
     */
    int getUnk3300LGEAPLJCJFH();

    /**
     * <code>uint32 Unk3300_DAEEBIEAOMN = 11;</code>
     * @return The unk3300DAEEBIEAOMN.
     */
    int getUnk3300DAEEBIEAOMN();

    /**
     * <code>uint32 Unk3300_ENKOGPIEHFD = 8;</code>
     * @return The unk3300ENKOGPIEHFD.
     */
    int getUnk3300ENKOGPIEHFD();

    /**
     * <code>map&lt;uint32, uint32&gt; playerScoreMap = 12;</code>
     */
    int getPlayerScoreMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; playerScoreMap = 12;</code>
     */
    boolean containsPlayerScoreMap(
        int key);
    /**
     * Use {@link #getPlayerScoreMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getPlayerScoreMap();
    /**
     * <code>map&lt;uint32, uint32&gt; playerScoreMap = 12;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getPlayerScoreMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; playerScoreMap = 12;</code>
     */
    int getPlayerScoreMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; playerScoreMap = 12;</code>
     */
    int getPlayerScoreMapOrThrow(
        int key);
  }
  /**
   * Protobuf type {@code HomeSeekFurnitureInfo}
   */
  public static final class HomeSeekFurnitureInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeSeekFurnitureInfo)
      HomeSeekFurnitureInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeSeekFurnitureInfo.newBuilder() to construct.
    private HomeSeekFurnitureInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeSeekFurnitureInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeSeekFurnitureInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.internal_static_HomeSeekFurnitureInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 12:
          return internalGetPlayerScoreMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.internal_static_HomeSeekFurnitureInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo.class, emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo.Builder.class);
    }

    public static final int UNK3300_LGEAPLJCJFH_FIELD_NUMBER = 10;
    private int unk3300LGEAPLJCJFH_ = 0;
    /**
     * <code>uint32 Unk3300_LGEAPLJCJFH = 10;</code>
     * @return The unk3300LGEAPLJCJFH.
     */
    @java.lang.Override
    public int getUnk3300LGEAPLJCJFH() {
      return unk3300LGEAPLJCJFH_;
    }

    public static final int UNK3300_DAEEBIEAOMN_FIELD_NUMBER = 11;
    private int unk3300DAEEBIEAOMN_ = 0;
    /**
     * <code>uint32 Unk3300_DAEEBIEAOMN = 11;</code>
     * @return The unk3300DAEEBIEAOMN.
     */
    @java.lang.Override
    public int getUnk3300DAEEBIEAOMN() {
      return unk3300DAEEBIEAOMN_;
    }

    public static final int UNK3300_ENKOGPIEHFD_FIELD_NUMBER = 8;
    private int unk3300ENKOGPIEHFD_ = 0;
    /**
     * <code>uint32 Unk3300_ENKOGPIEHFD = 8;</code>
     * @return The unk3300ENKOGPIEHFD.
     */
    @java.lang.Override
    public int getUnk3300ENKOGPIEHFD() {
      return unk3300ENKOGPIEHFD_;
    }

    public static final int PLAYERSCOREMAP_FIELD_NUMBER = 12;
    private static final class PlayerScoreMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.internal_static_HomeSeekFurnitureInfo_PlayerScoreMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    @SuppressWarnings("serial")
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> playerScoreMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetPlayerScoreMap() {
      if (playerScoreMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            PlayerScoreMapDefaultEntryHolder.defaultEntry);
      }
      return playerScoreMap_;
    }
    public int getPlayerScoreMapCount() {
      return internalGetPlayerScoreMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; playerScoreMap = 12;</code>
     */
    @java.lang.Override
    public boolean containsPlayerScoreMap(
        int key) {
      
      return internalGetPlayerScoreMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getPlayerScoreMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getPlayerScoreMap() {
      return getPlayerScoreMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; playerScoreMap = 12;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, java.lang.Integer> getPlayerScoreMapMap() {
      return internalGetPlayerScoreMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; playerScoreMap = 12;</code>
     */
    @java.lang.Override
    public int getPlayerScoreMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetPlayerScoreMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; playerScoreMap = 12;</code>
     */
    @java.lang.Override
    public int getPlayerScoreMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetPlayerScoreMap().getMap();
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
      if (unk3300ENKOGPIEHFD_ != 0) {
        output.writeUInt32(8, unk3300ENKOGPIEHFD_);
      }
      if (unk3300LGEAPLJCJFH_ != 0) {
        output.writeUInt32(10, unk3300LGEAPLJCJFH_);
      }
      if (unk3300DAEEBIEAOMN_ != 0) {
        output.writeUInt32(11, unk3300DAEEBIEAOMN_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetPlayerScoreMap(),
          PlayerScoreMapDefaultEntryHolder.defaultEntry,
          12);
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300ENKOGPIEHFD_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, unk3300ENKOGPIEHFD_);
      }
      if (unk3300LGEAPLJCJFH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, unk3300LGEAPLJCJFH_);
      }
      if (unk3300DAEEBIEAOMN_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, unk3300DAEEBIEAOMN_);
      }
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetPlayerScoreMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        playerScoreMap__ = PlayerScoreMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(12, playerScoreMap__);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo other = (emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo) obj;

      if (getUnk3300LGEAPLJCJFH()
          != other.getUnk3300LGEAPLJCJFH()) return false;
      if (getUnk3300DAEEBIEAOMN()
          != other.getUnk3300DAEEBIEAOMN()) return false;
      if (getUnk3300ENKOGPIEHFD()
          != other.getUnk3300ENKOGPIEHFD()) return false;
      if (!internalGetPlayerScoreMap().equals(
          other.internalGetPlayerScoreMap())) return false;
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
      hash = (37 * hash) + UNK3300_LGEAPLJCJFH_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300LGEAPLJCJFH();
      hash = (37 * hash) + UNK3300_DAEEBIEAOMN_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300DAEEBIEAOMN();
      hash = (37 * hash) + UNK3300_ENKOGPIEHFD_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300ENKOGPIEHFD();
      if (!internalGetPlayerScoreMap().getMap().isEmpty()) {
        hash = (37 * hash) + PLAYERSCOREMAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetPlayerScoreMap().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo prototype) {
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
     * Protobuf type {@code HomeSeekFurnitureInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeSeekFurnitureInfo)
        emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.internal_static_HomeSeekFurnitureInfo_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 12:
            return internalGetPlayerScoreMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 12:
            return internalGetMutablePlayerScoreMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.internal_static_HomeSeekFurnitureInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo.class, emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo.newBuilder()
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
        unk3300LGEAPLJCJFH_ = 0;
        unk3300DAEEBIEAOMN_ = 0;
        unk3300ENKOGPIEHFD_ = 0;
        internalGetMutablePlayerScoreMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.internal_static_HomeSeekFurnitureInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo build() {
        emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo buildPartial() {
        emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo result = new emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.unk3300LGEAPLJCJFH_ = unk3300LGEAPLJCJFH_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.unk3300DAEEBIEAOMN_ = unk3300DAEEBIEAOMN_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.unk3300ENKOGPIEHFD_ = unk3300ENKOGPIEHFD_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.playerScoreMap_ = internalGetPlayerScoreMap();
          result.playerScoreMap_.makeImmutable();
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
        if (other instanceof emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo) {
          return mergeFrom((emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo other) {
        if (other == emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo.getDefaultInstance()) return this;
        if (other.getUnk3300LGEAPLJCJFH() != 0) {
          setUnk3300LGEAPLJCJFH(other.getUnk3300LGEAPLJCJFH());
        }
        if (other.getUnk3300DAEEBIEAOMN() != 0) {
          setUnk3300DAEEBIEAOMN(other.getUnk3300DAEEBIEAOMN());
        }
        if (other.getUnk3300ENKOGPIEHFD() != 0) {
          setUnk3300ENKOGPIEHFD(other.getUnk3300ENKOGPIEHFD());
        }
        internalGetMutablePlayerScoreMap().mergeFrom(
            other.internalGetPlayerScoreMap());
        bitField0_ |= 0x00000008;
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
                unk3300ENKOGPIEHFD_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 64
              case 80: {
                unk3300LGEAPLJCJFH_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 80
              case 88: {
                unk3300DAEEBIEAOMN_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 88
              case 98: {
                com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
                playerScoreMap__ = input.readMessage(
                    PlayerScoreMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutablePlayerScoreMap().getMutableMap().put(
                    playerScoreMap__.getKey(), playerScoreMap__.getValue());
                bitField0_ |= 0x00000008;
                break;
              } // case 98
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

      private int unk3300LGEAPLJCJFH_ ;
      /**
       * <code>uint32 Unk3300_LGEAPLJCJFH = 10;</code>
       * @return The unk3300LGEAPLJCJFH.
       */
      @java.lang.Override
      public int getUnk3300LGEAPLJCJFH() {
        return unk3300LGEAPLJCJFH_;
      }
      /**
       * <code>uint32 Unk3300_LGEAPLJCJFH = 10;</code>
       * @param value The unk3300LGEAPLJCJFH to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300LGEAPLJCJFH(int value) {
        
        unk3300LGEAPLJCJFH_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_LGEAPLJCJFH = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300LGEAPLJCJFH() {
        bitField0_ = (bitField0_ & ~0x00000001);
        unk3300LGEAPLJCJFH_ = 0;
        onChanged();
        return this;
      }

      private int unk3300DAEEBIEAOMN_ ;
      /**
       * <code>uint32 Unk3300_DAEEBIEAOMN = 11;</code>
       * @return The unk3300DAEEBIEAOMN.
       */
      @java.lang.Override
      public int getUnk3300DAEEBIEAOMN() {
        return unk3300DAEEBIEAOMN_;
      }
      /**
       * <code>uint32 Unk3300_DAEEBIEAOMN = 11;</code>
       * @param value The unk3300DAEEBIEAOMN to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300DAEEBIEAOMN(int value) {
        
        unk3300DAEEBIEAOMN_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_DAEEBIEAOMN = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300DAEEBIEAOMN() {
        bitField0_ = (bitField0_ & ~0x00000002);
        unk3300DAEEBIEAOMN_ = 0;
        onChanged();
        return this;
      }

      private int unk3300ENKOGPIEHFD_ ;
      /**
       * <code>uint32 Unk3300_ENKOGPIEHFD = 8;</code>
       * @return The unk3300ENKOGPIEHFD.
       */
      @java.lang.Override
      public int getUnk3300ENKOGPIEHFD() {
        return unk3300ENKOGPIEHFD_;
      }
      /**
       * <code>uint32 Unk3300_ENKOGPIEHFD = 8;</code>
       * @param value The unk3300ENKOGPIEHFD to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300ENKOGPIEHFD(int value) {
        
        unk3300ENKOGPIEHFD_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_ENKOGPIEHFD = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300ENKOGPIEHFD() {
        bitField0_ = (bitField0_ & ~0x00000004);
        unk3300ENKOGPIEHFD_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> playerScoreMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
          internalGetPlayerScoreMap() {
        if (playerScoreMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              PlayerScoreMapDefaultEntryHolder.defaultEntry);
        }
        return playerScoreMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
          internalGetMutablePlayerScoreMap() {
        if (playerScoreMap_ == null) {
          playerScoreMap_ = com.google.protobuf.MapField.newMapField(
              PlayerScoreMapDefaultEntryHolder.defaultEntry);
        }
        if (!playerScoreMap_.isMutable()) {
          playerScoreMap_ = playerScoreMap_.copy();
        }
        bitField0_ |= 0x00000008;
        onChanged();
        return playerScoreMap_;
      }
      public int getPlayerScoreMapCount() {
        return internalGetPlayerScoreMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; playerScoreMap = 12;</code>
       */
      @java.lang.Override
      public boolean containsPlayerScoreMap(
          int key) {
        
        return internalGetPlayerScoreMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getPlayerScoreMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getPlayerScoreMap() {
        return getPlayerScoreMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; playerScoreMap = 12;</code>
       */
      @java.lang.Override
      public java.util.Map<java.lang.Integer, java.lang.Integer> getPlayerScoreMapMap() {
        return internalGetPlayerScoreMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; playerScoreMap = 12;</code>
       */
      @java.lang.Override
      public int getPlayerScoreMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetPlayerScoreMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; playerScoreMap = 12;</code>
       */
      @java.lang.Override
      public int getPlayerScoreMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetPlayerScoreMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }
      public Builder clearPlayerScoreMap() {
        bitField0_ = (bitField0_ & ~0x00000008);
        internalGetMutablePlayerScoreMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; playerScoreMap = 12;</code>
       */
      public Builder removePlayerScoreMap(
          int key) {
        
        internalGetMutablePlayerScoreMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
          getMutablePlayerScoreMap() {
        bitField0_ |= 0x00000008;
        return internalGetMutablePlayerScoreMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; playerScoreMap = 12;</code>
       */
      public Builder putPlayerScoreMap(
          int key,
          int value) {
        
        
        internalGetMutablePlayerScoreMap().getMutableMap()
            .put(key, value);
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; playerScoreMap = 12;</code>
       */
      public Builder putAllPlayerScoreMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutablePlayerScoreMap().getMutableMap()
            .putAll(values);
        bitField0_ |= 0x00000008;
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


      // @@protoc_insertion_point(builder_scope:HomeSeekFurnitureInfo)
    }

    // @@protoc_insertion_point(class_scope:HomeSeekFurnitureInfo)
    private static final emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo();
    }

    public static emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeSeekFurnitureInfo>
        PARSER = new com.google.protobuf.AbstractParser<HomeSeekFurnitureInfo>() {
      @java.lang.Override
      public HomeSeekFurnitureInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeSeekFurnitureInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeSeekFurnitureInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeSeekFurnitureInfoOuterClass.HomeSeekFurnitureInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeSeekFurnitureInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeSeekFurnitureInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeSeekFurnitureInfo_PlayerScoreMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeSeekFurnitureInfo_PlayerScoreMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033HomeSeekFurnitureInfo.proto\"\351\001\n\025HomeSe" +
      "ekFurnitureInfo\022\033\n\023Unk3300_LGEAPLJCJFH\030\n" +
      " \001(\r\022\033\n\023Unk3300_DAEEBIEAOMN\030\013 \001(\r\022\033\n\023Unk" +
      "3300_ENKOGPIEHFD\030\010 \001(\r\022B\n\016playerScoreMap" +
      "\030\014 \003(\0132*.HomeSeekFurnitureInfo.PlayerSco" +
      "reMapEntry\0325\n\023PlayerScoreMapEntry\022\013\n\003key" +
      "\030\001 \001(\r\022\r\n\005value\030\002 \001(\r:\0028\001B\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeSeekFurnitureInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeSeekFurnitureInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeSeekFurnitureInfo_descriptor,
        new java.lang.String[] { "Unk3300LGEAPLJCJFH", "Unk3300DAEEBIEAOMN", "Unk3300ENKOGPIEHFD", "PlayerScoreMap", });
    internal_static_HomeSeekFurnitureInfo_PlayerScoreMapEntry_descriptor =
      internal_static_HomeSeekFurnitureInfo_descriptor.getNestedTypes().get(0);
    internal_static_HomeSeekFurnitureInfo_PlayerScoreMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeSeekFurnitureInfo_PlayerScoreMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}