// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityChangeNotify.proto

package emu.grasscutter.net.proto;

public final class AbilityChangeNotifyOuterClass {
  private AbilityChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.AbilityControlBlock ability_control_block = 12;</code>
     * @return Whether the abilityControlBlock field is set.
     */
    boolean hasAbilityControlBlock();
    /**
     * <code>.AbilityControlBlock ability_control_block = 12;</code>
     * @return The abilityControlBlock.
     */
    emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock getAbilityControlBlock();
    /**
     * <code>.AbilityControlBlock ability_control_block = 12;</code>
     */
    emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder getAbilityControlBlockOrBuilder();

    /**
     * <code>uint32 entity_id = 2;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * <pre>
   * Name: FGNFEPLECFC
   * CmdId: 1159
   * </pre>
   *
   * Protobuf type {@code AbilityChangeNotify}
   */
  public static final class AbilityChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityChangeNotify)
      AbilityChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityChangeNotify.newBuilder() to construct.
    private AbilityChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityChangeNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.internal_static_AbilityChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.internal_static_AbilityChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify.class, emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify.Builder.class);
    }

    public static final int ABILITY_CONTROL_BLOCK_FIELD_NUMBER = 12;
    private emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock abilityControlBlock_;
    /**
     * <code>.AbilityControlBlock ability_control_block = 12;</code>
     * @return Whether the abilityControlBlock field is set.
     */
    @java.lang.Override
    public boolean hasAbilityControlBlock() {
      return abilityControlBlock_ != null;
    }
    /**
     * <code>.AbilityControlBlock ability_control_block = 12;</code>
     * @return The abilityControlBlock.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock getAbilityControlBlock() {
      return abilityControlBlock_ == null ? emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock.getDefaultInstance() : abilityControlBlock_;
    }
    /**
     * <code>.AbilityControlBlock ability_control_block = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder getAbilityControlBlockOrBuilder() {
      return abilityControlBlock_ == null ? emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock.getDefaultInstance() : abilityControlBlock_;
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 2;
    private int entityId_ = 0;
    /**
     * <code>uint32 entity_id = 2;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
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
      if (entityId_ != 0) {
        output.writeUInt32(2, entityId_);
      }
      if (abilityControlBlock_ != null) {
        output.writeMessage(12, getAbilityControlBlock());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, entityId_);
      }
      if (abilityControlBlock_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, getAbilityControlBlock());
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
      if (!(obj instanceof emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify other = (emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify) obj;

      if (hasAbilityControlBlock() != other.hasAbilityControlBlock()) return false;
      if (hasAbilityControlBlock()) {
        if (!getAbilityControlBlock()
            .equals(other.getAbilityControlBlock())) return false;
      }
      if (getEntityId()
          != other.getEntityId()) return false;
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
      if (hasAbilityControlBlock()) {
        hash = (37 * hash) + ABILITY_CONTROL_BLOCK_FIELD_NUMBER;
        hash = (53 * hash) + getAbilityControlBlock().hashCode();
      }
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify prototype) {
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
     * Name: FGNFEPLECFC
     * CmdId: 1159
     * </pre>
     *
     * Protobuf type {@code AbilityChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityChangeNotify)
        emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.internal_static_AbilityChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.internal_static_AbilityChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify.class, emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify.newBuilder()
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
        abilityControlBlock_ = null;
        if (abilityControlBlockBuilder_ != null) {
          abilityControlBlockBuilder_.dispose();
          abilityControlBlockBuilder_ = null;
        }
        entityId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.internal_static_AbilityChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify build() {
        emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify buildPartial() {
        emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify result = new emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.abilityControlBlock_ = abilityControlBlockBuilder_ == null
              ? abilityControlBlock_
              : abilityControlBlockBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.entityId_ = entityId_;
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
        if (other instanceof emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify other) {
        if (other == emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify.getDefaultInstance()) return this;
        if (other.hasAbilityControlBlock()) {
          mergeAbilityControlBlock(other.getAbilityControlBlock());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
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
                entityId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 98: {
                input.readMessage(
                    getAbilityControlBlockFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
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

      private emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock abilityControlBlock_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock, emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock.Builder, emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder> abilityControlBlockBuilder_;
      /**
       * <code>.AbilityControlBlock ability_control_block = 12;</code>
       * @return Whether the abilityControlBlock field is set.
       */
      public boolean hasAbilityControlBlock() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 12;</code>
       * @return The abilityControlBlock.
       */
      public emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock getAbilityControlBlock() {
        if (abilityControlBlockBuilder_ == null) {
          return abilityControlBlock_ == null ? emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock.getDefaultInstance() : abilityControlBlock_;
        } else {
          return abilityControlBlockBuilder_.getMessage();
        }
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 12;</code>
       */
      public Builder setAbilityControlBlock(emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock value) {
        if (abilityControlBlockBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          abilityControlBlock_ = value;
        } else {
          abilityControlBlockBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 12;</code>
       */
      public Builder setAbilityControlBlock(
          emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock.Builder builderForValue) {
        if (abilityControlBlockBuilder_ == null) {
          abilityControlBlock_ = builderForValue.build();
        } else {
          abilityControlBlockBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 12;</code>
       */
      public Builder mergeAbilityControlBlock(emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock value) {
        if (abilityControlBlockBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            abilityControlBlock_ != null &&
            abilityControlBlock_ != emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock.getDefaultInstance()) {
            getAbilityControlBlockBuilder().mergeFrom(value);
          } else {
            abilityControlBlock_ = value;
          }
        } else {
          abilityControlBlockBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 12;</code>
       */
      public Builder clearAbilityControlBlock() {
        bitField0_ = (bitField0_ & ~0x00000001);
        abilityControlBlock_ = null;
        if (abilityControlBlockBuilder_ != null) {
          abilityControlBlockBuilder_.dispose();
          abilityControlBlockBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 12;</code>
       */
      public emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock.Builder getAbilityControlBlockBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getAbilityControlBlockFieldBuilder().getBuilder();
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 12;</code>
       */
      public emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder getAbilityControlBlockOrBuilder() {
        if (abilityControlBlockBuilder_ != null) {
          return abilityControlBlockBuilder_.getMessageOrBuilder();
        } else {
          return abilityControlBlock_ == null ?
              emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock.getDefaultInstance() : abilityControlBlock_;
        }
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 12;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock, emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock.Builder, emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder> 
          getAbilityControlBlockFieldBuilder() {
        if (abilityControlBlockBuilder_ == null) {
          abilityControlBlockBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock, emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock.Builder, emu.grasscutter.net.proto.AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder>(
                  getAbilityControlBlock(),
                  getParentForChildren(),
                  isClean());
          abilityControlBlock_ = null;
        }
        return abilityControlBlockBuilder_;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 2;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 2;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        entityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AbilityChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:AbilityChangeNotify)
    private static final emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify();
    }

    public static emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<AbilityChangeNotify>() {
      @java.lang.Override
      public AbilityChangeNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<AbilityChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031AbilityChangeNotify.proto\032\031AbilityCont" +
      "rolBlock.proto\"]\n\023AbilityChangeNotify\0223\n" +
      "\025ability_control_block\030\014 \001(\0132\024.AbilityCo" +
      "ntrolBlock\022\021\n\tentity_id\030\002 \001(\rB\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AbilityControlBlockOuterClass.getDescriptor(),
        });
    internal_static_AbilityChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityChangeNotify_descriptor,
        new java.lang.String[] { "AbilityControlBlock", "EntityId", });
    emu.grasscutter.net.proto.AbilityControlBlockOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
