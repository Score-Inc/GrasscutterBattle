// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneReliquaryInfo.proto

package emu.grasscutter.net.proto;

public final class SceneReliquaryInfoOuterClass {
  private SceneReliquaryInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneReliquaryInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneReliquaryInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 item_id = 1;</code>
     * @return The itemId.
     */
    int getItemId();

    /**
     * <code>uint64 guid = 2;</code>
     * @return The guid.
     */
    long getGuid();

    /**
     * <code>uint32 level = 3;</code>
     * @return The level.
     */
    int getLevel();

    /**
     * <code>uint32 promote_level = 4;</code>
     * @return The promoteLevel.
     */
    int getPromoteLevel();
  }
  /**
   * <pre>
   * Name: MAIEBCGCJMB
   * </pre>
   *
   * Protobuf type {@code SceneReliquaryInfo}
   */
  public static final class SceneReliquaryInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneReliquaryInfo)
      SceneReliquaryInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneReliquaryInfo.newBuilder() to construct.
    private SceneReliquaryInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneReliquaryInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneReliquaryInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.internal_static_SceneReliquaryInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.internal_static_SceneReliquaryInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo.class, emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo.Builder.class);
    }

    public static final int ITEM_ID_FIELD_NUMBER = 1;
    private int itemId_ = 0;
    /**
     * <code>uint32 item_id = 1;</code>
     * @return The itemId.
     */
    @java.lang.Override
    public int getItemId() {
      return itemId_;
    }

    public static final int GUID_FIELD_NUMBER = 2;
    private long guid_ = 0L;
    /**
     * <code>uint64 guid = 2;</code>
     * @return The guid.
     */
    @java.lang.Override
    public long getGuid() {
      return guid_;
    }

    public static final int LEVEL_FIELD_NUMBER = 3;
    private int level_ = 0;
    /**
     * <code>uint32 level = 3;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      return level_;
    }

    public static final int PROMOTE_LEVEL_FIELD_NUMBER = 4;
    private int promoteLevel_ = 0;
    /**
     * <code>uint32 promote_level = 4;</code>
     * @return The promoteLevel.
     */
    @java.lang.Override
    public int getPromoteLevel() {
      return promoteLevel_;
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
      if (itemId_ != 0) {
        output.writeUInt32(1, itemId_);
      }
      if (guid_ != 0L) {
        output.writeUInt64(2, guid_);
      }
      if (level_ != 0) {
        output.writeUInt32(3, level_);
      }
      if (promoteLevel_ != 0) {
        output.writeUInt32(4, promoteLevel_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (itemId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, itemId_);
      }
      if (guid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, guid_);
      }
      if (level_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, level_);
      }
      if (promoteLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, promoteLevel_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo other = (emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo) obj;

      if (getItemId()
          != other.getItemId()) return false;
      if (getGuid()
          != other.getGuid()) return false;
      if (getLevel()
          != other.getLevel()) return false;
      if (getPromoteLevel()
          != other.getPromoteLevel()) return false;
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
      hash = (37 * hash) + ITEM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getItemId();
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getGuid());
      hash = (37 * hash) + LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getLevel();
      hash = (37 * hash) + PROMOTE_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getPromoteLevel();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo prototype) {
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
     * Name: MAIEBCGCJMB
     * </pre>
     *
     * Protobuf type {@code SceneReliquaryInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneReliquaryInfo)
        emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.internal_static_SceneReliquaryInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.internal_static_SceneReliquaryInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo.class, emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo.newBuilder()
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
        itemId_ = 0;
        guid_ = 0L;
        level_ = 0;
        promoteLevel_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.internal_static_SceneReliquaryInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo build() {
        emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo buildPartial() {
        emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo result = new emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.itemId_ = itemId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.guid_ = guid_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.level_ = level_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.promoteLevel_ = promoteLevel_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo other) {
        if (other == emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo.getDefaultInstance()) return this;
        if (other.getItemId() != 0) {
          setItemId(other.getItemId());
        }
        if (other.getGuid() != 0L) {
          setGuid(other.getGuid());
        }
        if (other.getLevel() != 0) {
          setLevel(other.getLevel());
        }
        if (other.getPromoteLevel() != 0) {
          setPromoteLevel(other.getPromoteLevel());
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
                itemId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                guid_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                level_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 32: {
                promoteLevel_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
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

      private int itemId_ ;
      /**
       * <code>uint32 item_id = 1;</code>
       * @return The itemId.
       */
      @java.lang.Override
      public int getItemId() {
        return itemId_;
      }
      /**
       * <code>uint32 item_id = 1;</code>
       * @param value The itemId to set.
       * @return This builder for chaining.
       */
      public Builder setItemId(int value) {
        
        itemId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 item_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        itemId_ = 0;
        onChanged();
        return this;
      }

      private long guid_ ;
      /**
       * <code>uint64 guid = 2;</code>
       * @return The guid.
       */
      @java.lang.Override
      public long getGuid() {
        return guid_;
      }
      /**
       * <code>uint64 guid = 2;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(long value) {
        
        guid_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 guid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        guid_ = 0L;
        onChanged();
        return this;
      }

      private int level_ ;
      /**
       * <code>uint32 level = 3;</code>
       * @return The level.
       */
      @java.lang.Override
      public int getLevel() {
        return level_;
      }
      /**
       * <code>uint32 level = 3;</code>
       * @param value The level to set.
       * @return This builder for chaining.
       */
      public Builder setLevel(int value) {
        
        level_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevel() {
        bitField0_ = (bitField0_ & ~0x00000004);
        level_ = 0;
        onChanged();
        return this;
      }

      private int promoteLevel_ ;
      /**
       * <code>uint32 promote_level = 4;</code>
       * @return The promoteLevel.
       */
      @java.lang.Override
      public int getPromoteLevel() {
        return promoteLevel_;
      }
      /**
       * <code>uint32 promote_level = 4;</code>
       * @param value The promoteLevel to set.
       * @return This builder for chaining.
       */
      public Builder setPromoteLevel(int value) {
        
        promoteLevel_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 promote_level = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearPromoteLevel() {
        bitField0_ = (bitField0_ & ~0x00000008);
        promoteLevel_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneReliquaryInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneReliquaryInfo)
    private static final emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo();
    }

    public static emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneReliquaryInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneReliquaryInfo>() {
      @java.lang.Override
      public SceneReliquaryInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneReliquaryInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneReliquaryInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneReliquaryInfoOuterClass.SceneReliquaryInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneReliquaryInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneReliquaryInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030SceneReliquaryInfo.proto\"Y\n\022SceneReliq" +
      "uaryInfo\022\017\n\007item_id\030\001 \001(\r\022\014\n\004guid\030\002 \001(\004\022" +
      "\r\n\005level\030\003 \001(\r\022\025\n\rpromote_level\030\004 \001(\rB\033\n" +
      "\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneReliquaryInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneReliquaryInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneReliquaryInfo_descriptor,
        new java.lang.String[] { "ItemId", "Guid", "Level", "PromoteLevel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
