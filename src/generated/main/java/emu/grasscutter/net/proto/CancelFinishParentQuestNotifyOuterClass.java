// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CancelFinishParentQuestNotify.proto

package emu.grasscutter.net.proto;

public final class CancelFinishParentQuestNotifyOuterClass {
  private CancelFinishParentQuestNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CancelFinishParentQuestNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CancelFinishParentQuestNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 parent_quest_id = 7;</code>
     * @return The parentQuestId.
     */
    int getParentQuestId();
  }
  /**
   * <pre>
   * Name: BHNAKHDCBOL
   * CmdId: 402
   * </pre>
   *
   * Protobuf type {@code CancelFinishParentQuestNotify}
   */
  public static final class CancelFinishParentQuestNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CancelFinishParentQuestNotify)
      CancelFinishParentQuestNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CancelFinishParentQuestNotify.newBuilder() to construct.
    private CancelFinishParentQuestNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CancelFinishParentQuestNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CancelFinishParentQuestNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.internal_static_CancelFinishParentQuestNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.internal_static_CancelFinishParentQuestNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify.class, emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify.Builder.class);
    }

    public static final int PARENT_QUEST_ID_FIELD_NUMBER = 7;
    private int parentQuestId_ = 0;
    /**
     * <code>uint32 parent_quest_id = 7;</code>
     * @return The parentQuestId.
     */
    @java.lang.Override
    public int getParentQuestId() {
      return parentQuestId_;
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
      if (parentQuestId_ != 0) {
        output.writeUInt32(7, parentQuestId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (parentQuestId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, parentQuestId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify other = (emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify) obj;

      if (getParentQuestId()
          != other.getParentQuestId()) return false;
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
      hash = (37 * hash) + PARENT_QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getParentQuestId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify prototype) {
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
     * Name: BHNAKHDCBOL
     * CmdId: 402
     * </pre>
     *
     * Protobuf type {@code CancelFinishParentQuestNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CancelFinishParentQuestNotify)
        emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.internal_static_CancelFinishParentQuestNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.internal_static_CancelFinishParentQuestNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify.class, emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify.newBuilder()
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
        parentQuestId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.internal_static_CancelFinishParentQuestNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify build() {
        emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify buildPartial() {
        emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify result = new emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.parentQuestId_ = parentQuestId_;
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
        if (other instanceof emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify) {
          return mergeFrom((emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify other) {
        if (other == emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify.getDefaultInstance()) return this;
        if (other.getParentQuestId() != 0) {
          setParentQuestId(other.getParentQuestId());
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
              case 56: {
                parentQuestId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 56
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

      private int parentQuestId_ ;
      /**
       * <code>uint32 parent_quest_id = 7;</code>
       * @return The parentQuestId.
       */
      @java.lang.Override
      public int getParentQuestId() {
        return parentQuestId_;
      }
      /**
       * <code>uint32 parent_quest_id = 7;</code>
       * @param value The parentQuestId to set.
       * @return This builder for chaining.
       */
      public Builder setParentQuestId(int value) {
        
        parentQuestId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 parent_quest_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearParentQuestId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        parentQuestId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CancelFinishParentQuestNotify)
    }

    // @@protoc_insertion_point(class_scope:CancelFinishParentQuestNotify)
    private static final emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify();
    }

    public static emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CancelFinishParentQuestNotify>
        PARSER = new com.google.protobuf.AbstractParser<CancelFinishParentQuestNotify>() {
      @java.lang.Override
      public CancelFinishParentQuestNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<CancelFinishParentQuestNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CancelFinishParentQuestNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CancelFinishParentQuestNotifyOuterClass.CancelFinishParentQuestNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CancelFinishParentQuestNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CancelFinishParentQuestNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#CancelFinishParentQuestNotify.proto\"8\n" +
      "\035CancelFinishParentQuestNotify\022\027\n\017parent" +
      "_quest_id\030\007 \001(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CancelFinishParentQuestNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CancelFinishParentQuestNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CancelFinishParentQuestNotify_descriptor,
        new java.lang.String[] { "ParentQuestId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
