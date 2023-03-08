// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReliquaryFilterStateNotify.proto

package emu.grasscutter.net.proto;

public final class ReliquaryFilterStateNotifyOuterClass {
  private ReliquaryFilterStateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReliquaryFilterStateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReliquaryFilterStateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 11;</code>
     */
    int getReliquaryFilterStateMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 11;</code>
     */
    boolean containsReliquaryFilterStateMap(
        int key);
    /**
     * Use {@link #getReliquaryFilterStateMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getReliquaryFilterStateMap();
    /**
     * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 11;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getReliquaryFilterStateMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 11;</code>
     */
    int getReliquaryFilterStateMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 11;</code>
     */
    int getReliquaryFilterStateMapOrThrow(
        int key);
  }
  /**
   * <pre>
   * Name: MAGNGONBPEI
   * CmdId: 680
   * </pre>
   *
   * Protobuf type {@code ReliquaryFilterStateNotify}
   */
  public static final class ReliquaryFilterStateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ReliquaryFilterStateNotify)
      ReliquaryFilterStateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReliquaryFilterStateNotify.newBuilder() to construct.
    private ReliquaryFilterStateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReliquaryFilterStateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ReliquaryFilterStateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.internal_static_ReliquaryFilterStateNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 11:
          return internalGetReliquaryFilterStateMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.internal_static_ReliquaryFilterStateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify.class, emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify.Builder.class);
    }

    public static final int RELIQUARY_FILTER_STATE_MAP_FIELD_NUMBER = 11;
    private static final class ReliquaryFilterStateMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.internal_static_ReliquaryFilterStateNotify_ReliquaryFilterStateMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    @SuppressWarnings("serial")
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> reliquaryFilterStateMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetReliquaryFilterStateMap() {
      if (reliquaryFilterStateMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ReliquaryFilterStateMapDefaultEntryHolder.defaultEntry);
      }
      return reliquaryFilterStateMap_;
    }
    public int getReliquaryFilterStateMapCount() {
      return internalGetReliquaryFilterStateMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 11;</code>
     */
    @java.lang.Override
    public boolean containsReliquaryFilterStateMap(
        int key) {
      
      return internalGetReliquaryFilterStateMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getReliquaryFilterStateMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getReliquaryFilterStateMap() {
      return getReliquaryFilterStateMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 11;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, java.lang.Integer> getReliquaryFilterStateMapMap() {
      return internalGetReliquaryFilterStateMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 11;</code>
     */
    @java.lang.Override
    public int getReliquaryFilterStateMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetReliquaryFilterStateMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 11;</code>
     */
    @java.lang.Override
    public int getReliquaryFilterStateMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetReliquaryFilterStateMap().getMap();
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
        .serializeIntegerMapTo(
          output,
          internalGetReliquaryFilterStateMap(),
          ReliquaryFilterStateMapDefaultEntryHolder.defaultEntry,
          11);
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetReliquaryFilterStateMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        reliquaryFilterStateMap__ = ReliquaryFilterStateMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(11, reliquaryFilterStateMap__);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify other = (emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify) obj;

      if (!internalGetReliquaryFilterStateMap().equals(
          other.internalGetReliquaryFilterStateMap())) return false;
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
      if (!internalGetReliquaryFilterStateMap().getMap().isEmpty()) {
        hash = (37 * hash) + RELIQUARY_FILTER_STATE_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetReliquaryFilterStateMap().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify prototype) {
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
     * Name: MAGNGONBPEI
     * CmdId: 680
     * </pre>
     *
     * Protobuf type {@code ReliquaryFilterStateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReliquaryFilterStateNotify)
        emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.internal_static_ReliquaryFilterStateNotify_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 11:
            return internalGetReliquaryFilterStateMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 11:
            return internalGetMutableReliquaryFilterStateMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.internal_static_ReliquaryFilterStateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify.class, emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify.newBuilder()
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
        internalGetMutableReliquaryFilterStateMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.internal_static_ReliquaryFilterStateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify build() {
        emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify buildPartial() {
        emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify result = new emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.reliquaryFilterStateMap_ = internalGetReliquaryFilterStateMap();
          result.reliquaryFilterStateMap_.makeImmutable();
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
        if (other instanceof emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify other) {
        if (other == emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify.getDefaultInstance()) return this;
        internalGetMutableReliquaryFilterStateMap().mergeFrom(
            other.internalGetReliquaryFilterStateMap());
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
              case 90: {
                com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
                reliquaryFilterStateMap__ = input.readMessage(
                    ReliquaryFilterStateMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableReliquaryFilterStateMap().getMutableMap().put(
                    reliquaryFilterStateMap__.getKey(), reliquaryFilterStateMap__.getValue());
                bitField0_ |= 0x00000001;
                break;
              } // case 90
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
          java.lang.Integer, java.lang.Integer> reliquaryFilterStateMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
          internalGetReliquaryFilterStateMap() {
        if (reliquaryFilterStateMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              ReliquaryFilterStateMapDefaultEntryHolder.defaultEntry);
        }
        return reliquaryFilterStateMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
          internalGetMutableReliquaryFilterStateMap() {
        if (reliquaryFilterStateMap_ == null) {
          reliquaryFilterStateMap_ = com.google.protobuf.MapField.newMapField(
              ReliquaryFilterStateMapDefaultEntryHolder.defaultEntry);
        }
        if (!reliquaryFilterStateMap_.isMutable()) {
          reliquaryFilterStateMap_ = reliquaryFilterStateMap_.copy();
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return reliquaryFilterStateMap_;
      }
      public int getReliquaryFilterStateMapCount() {
        return internalGetReliquaryFilterStateMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 11;</code>
       */
      @java.lang.Override
      public boolean containsReliquaryFilterStateMap(
          int key) {
        
        return internalGetReliquaryFilterStateMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getReliquaryFilterStateMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getReliquaryFilterStateMap() {
        return getReliquaryFilterStateMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 11;</code>
       */
      @java.lang.Override
      public java.util.Map<java.lang.Integer, java.lang.Integer> getReliquaryFilterStateMapMap() {
        return internalGetReliquaryFilterStateMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 11;</code>
       */
      @java.lang.Override
      public int getReliquaryFilterStateMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetReliquaryFilterStateMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 11;</code>
       */
      @java.lang.Override
      public int getReliquaryFilterStateMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetReliquaryFilterStateMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }
      public Builder clearReliquaryFilterStateMap() {
        bitField0_ = (bitField0_ & ~0x00000001);
        internalGetMutableReliquaryFilterStateMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 11;</code>
       */
      public Builder removeReliquaryFilterStateMap(
          int key) {
        
        internalGetMutableReliquaryFilterStateMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
          getMutableReliquaryFilterStateMap() {
        bitField0_ |= 0x00000001;
        return internalGetMutableReliquaryFilterStateMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 11;</code>
       */
      public Builder putReliquaryFilterStateMap(
          int key,
          int value) {
        
        
        internalGetMutableReliquaryFilterStateMap().getMutableMap()
            .put(key, value);
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; reliquary_filter_state_map = 11;</code>
       */
      public Builder putAllReliquaryFilterStateMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableReliquaryFilterStateMap().getMutableMap()
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


      // @@protoc_insertion_point(builder_scope:ReliquaryFilterStateNotify)
    }

    // @@protoc_insertion_point(class_scope:ReliquaryFilterStateNotify)
    private static final emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify();
    }

    public static emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReliquaryFilterStateNotify>
        PARSER = new com.google.protobuf.AbstractParser<ReliquaryFilterStateNotify>() {
      @java.lang.Override
      public ReliquaryFilterStateNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<ReliquaryFilterStateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReliquaryFilterStateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReliquaryFilterStateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReliquaryFilterStateNotify_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReliquaryFilterStateNotify_ReliquaryFilterStateMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReliquaryFilterStateNotify_ReliquaryFilterStateMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n ReliquaryFilterStateNotify.proto\"\272\001\n\032R" +
      "eliquaryFilterStateNotify\022\\\n\032reliquary_f" +
      "ilter_state_map\030\013 \003(\01328.ReliquaryFilterS" +
      "tateNotify.ReliquaryFilterStateMapEntry\032" +
      ">\n\034ReliquaryFilterStateMapEntry\022\013\n\003key\030\001" +
      " \001(\r\022\r\n\005value\030\002 \001(\r:\0028\001B\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ReliquaryFilterStateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ReliquaryFilterStateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReliquaryFilterStateNotify_descriptor,
        new java.lang.String[] { "ReliquaryFilterStateMap", });
    internal_static_ReliquaryFilterStateNotify_ReliquaryFilterStateMapEntry_descriptor =
      internal_static_ReliquaryFilterStateNotify_descriptor.getNestedTypes().get(0);
    internal_static_ReliquaryFilterStateNotify_ReliquaryFilterStateMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReliquaryFilterStateNotify_ReliquaryFilterStateMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}