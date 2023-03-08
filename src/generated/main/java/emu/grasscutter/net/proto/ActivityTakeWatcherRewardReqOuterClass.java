// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ActivityTakeWatcherRewardReq.proto

package emu.grasscutter.net.proto;

public final class ActivityTakeWatcherRewardReqOuterClass {
  private ActivityTakeWatcherRewardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ActivityTakeWatcherRewardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ActivityTakeWatcherRewardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 activity_id = 5;</code>
     * @return The activityId.
     */
    int getActivityId();

    /**
     * <code>uint32 watcher_id = 15;</code>
     * @return The watcherId.
     */
    int getWatcherId();
  }
  /**
   * <pre>
   * Name: DEADHMNJBHA
   * CmdId: 2063
   * </pre>
   *
   * Protobuf type {@code ActivityTakeWatcherRewardReq}
   */
  public static final class ActivityTakeWatcherRewardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ActivityTakeWatcherRewardReq)
      ActivityTakeWatcherRewardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ActivityTakeWatcherRewardReq.newBuilder() to construct.
    private ActivityTakeWatcherRewardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ActivityTakeWatcherRewardReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ActivityTakeWatcherRewardReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.internal_static_ActivityTakeWatcherRewardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.internal_static_ActivityTakeWatcherRewardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq.class, emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq.Builder.class);
    }

    public static final int ACTIVITY_ID_FIELD_NUMBER = 5;
    private int activityId_ = 0;
    /**
     * <code>uint32 activity_id = 5;</code>
     * @return The activityId.
     */
    @java.lang.Override
    public int getActivityId() {
      return activityId_;
    }

    public static final int WATCHER_ID_FIELD_NUMBER = 15;
    private int watcherId_ = 0;
    /**
     * <code>uint32 watcher_id = 15;</code>
     * @return The watcherId.
     */
    @java.lang.Override
    public int getWatcherId() {
      return watcherId_;
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
      if (activityId_ != 0) {
        output.writeUInt32(5, activityId_);
      }
      if (watcherId_ != 0) {
        output.writeUInt32(15, watcherId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (activityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, activityId_);
      }
      if (watcherId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, watcherId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq other = (emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq) obj;

      if (getActivityId()
          != other.getActivityId()) return false;
      if (getWatcherId()
          != other.getWatcherId()) return false;
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
      hash = (37 * hash) + ACTIVITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getActivityId();
      hash = (37 * hash) + WATCHER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getWatcherId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq prototype) {
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
     * Name: DEADHMNJBHA
     * CmdId: 2063
     * </pre>
     *
     * Protobuf type {@code ActivityTakeWatcherRewardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ActivityTakeWatcherRewardReq)
        emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.internal_static_ActivityTakeWatcherRewardReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.internal_static_ActivityTakeWatcherRewardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq.class, emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq.newBuilder()
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
        activityId_ = 0;
        watcherId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.internal_static_ActivityTakeWatcherRewardReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq build() {
        emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq buildPartial() {
        emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq result = new emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.activityId_ = activityId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.watcherId_ = watcherId_;
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
        if (other instanceof emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq) {
          return mergeFrom((emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq other) {
        if (other == emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq.getDefaultInstance()) return this;
        if (other.getActivityId() != 0) {
          setActivityId(other.getActivityId());
        }
        if (other.getWatcherId() != 0) {
          setWatcherId(other.getWatcherId());
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
              case 40: {
                activityId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 40
              case 120: {
                watcherId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 120
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

      private int activityId_ ;
      /**
       * <code>uint32 activity_id = 5;</code>
       * @return The activityId.
       */
      @java.lang.Override
      public int getActivityId() {
        return activityId_;
      }
      /**
       * <code>uint32 activity_id = 5;</code>
       * @param value The activityId to set.
       * @return This builder for chaining.
       */
      public Builder setActivityId(int value) {
        
        activityId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 activity_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearActivityId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        activityId_ = 0;
        onChanged();
        return this;
      }

      private int watcherId_ ;
      /**
       * <code>uint32 watcher_id = 15;</code>
       * @return The watcherId.
       */
      @java.lang.Override
      public int getWatcherId() {
        return watcherId_;
      }
      /**
       * <code>uint32 watcher_id = 15;</code>
       * @param value The watcherId to set.
       * @return This builder for chaining.
       */
      public Builder setWatcherId(int value) {
        
        watcherId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 watcher_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearWatcherId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        watcherId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ActivityTakeWatcherRewardReq)
    }

    // @@protoc_insertion_point(class_scope:ActivityTakeWatcherRewardReq)
    private static final emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq();
    }

    public static emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ActivityTakeWatcherRewardReq>
        PARSER = new com.google.protobuf.AbstractParser<ActivityTakeWatcherRewardReq>() {
      @java.lang.Override
      public ActivityTakeWatcherRewardReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<ActivityTakeWatcherRewardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ActivityTakeWatcherRewardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivityTakeWatcherRewardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActivityTakeWatcherRewardReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"ActivityTakeWatcherRewardReq.proto\"G\n\034" +
      "ActivityTakeWatcherRewardReq\022\023\n\013activity" +
      "_id\030\005 \001(\r\022\022\n\nwatcher_id\030\017 \001(\rB\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ActivityTakeWatcherRewardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ActivityTakeWatcherRewardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActivityTakeWatcherRewardReq_descriptor,
        new java.lang.String[] { "ActivityId", "WatcherId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
