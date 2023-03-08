// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ForgeQueueData.proto

package emu.grasscutter.net.proto;

public final class ForgeQueueDataOuterClass {
  private ForgeQueueDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ForgeQueueDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ForgeQueueData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 queueId = 11;</code>
     * @return The queueId.
     */
    int getQueueId();

    /**
     * <code>uint32 avatar_id = 13;</code>
     * @return The avatarId.
     */
    int getAvatarId();

    /**
     * <code>uint32 forge_id = 3;</code>
     * @return The forgeId.
     */
    int getForgeId();

    /**
     * <code>uint32 unfinishCount = 6;</code>
     * @return The unfinishCount.
     */
    int getUnfinishCount();

    /**
     * <code>uint32 finishCount = 5;</code>
     * @return The finishCount.
     */
    int getFinishCount();

    /**
     * <code>uint32 nextFinishTimestamp = 2;</code>
     * @return The nextFinishTimestamp.
     */
    int getNextFinishTimestamp();

    /**
     * <code>uint32 totalFinishTimestamp = 10;</code>
     * @return The totalFinishTimestamp.
     */
    int getTotalFinishTimestamp();
  }
  /**
   * <pre>
   * Name: DBDNABMNFAO
   * </pre>
   *
   * Protobuf type {@code ForgeQueueData}
   */
  public static final class ForgeQueueData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ForgeQueueData)
      ForgeQueueDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ForgeQueueData.newBuilder() to construct.
    private ForgeQueueData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ForgeQueueData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ForgeQueueData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ForgeQueueDataOuterClass.internal_static_ForgeQueueData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ForgeQueueDataOuterClass.internal_static_ForgeQueueData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData.class, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData.Builder.class);
    }

    public static final int QUEUEID_FIELD_NUMBER = 11;
    private int queueId_ = 0;
    /**
     * <code>uint32 queueId = 11;</code>
     * @return The queueId.
     */
    @java.lang.Override
    public int getQueueId() {
      return queueId_;
    }

    public static final int AVATAR_ID_FIELD_NUMBER = 13;
    private int avatarId_ = 0;
    /**
     * <code>uint32 avatar_id = 13;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
    }

    public static final int FORGE_ID_FIELD_NUMBER = 3;
    private int forgeId_ = 0;
    /**
     * <code>uint32 forge_id = 3;</code>
     * @return The forgeId.
     */
    @java.lang.Override
    public int getForgeId() {
      return forgeId_;
    }

    public static final int UNFINISHCOUNT_FIELD_NUMBER = 6;
    private int unfinishCount_ = 0;
    /**
     * <code>uint32 unfinishCount = 6;</code>
     * @return The unfinishCount.
     */
    @java.lang.Override
    public int getUnfinishCount() {
      return unfinishCount_;
    }

    public static final int FINISHCOUNT_FIELD_NUMBER = 5;
    private int finishCount_ = 0;
    /**
     * <code>uint32 finishCount = 5;</code>
     * @return The finishCount.
     */
    @java.lang.Override
    public int getFinishCount() {
      return finishCount_;
    }

    public static final int NEXTFINISHTIMESTAMP_FIELD_NUMBER = 2;
    private int nextFinishTimestamp_ = 0;
    /**
     * <code>uint32 nextFinishTimestamp = 2;</code>
     * @return The nextFinishTimestamp.
     */
    @java.lang.Override
    public int getNextFinishTimestamp() {
      return nextFinishTimestamp_;
    }

    public static final int TOTALFINISHTIMESTAMP_FIELD_NUMBER = 10;
    private int totalFinishTimestamp_ = 0;
    /**
     * <code>uint32 totalFinishTimestamp = 10;</code>
     * @return The totalFinishTimestamp.
     */
    @java.lang.Override
    public int getTotalFinishTimestamp() {
      return totalFinishTimestamp_;
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
      if (nextFinishTimestamp_ != 0) {
        output.writeUInt32(2, nextFinishTimestamp_);
      }
      if (forgeId_ != 0) {
        output.writeUInt32(3, forgeId_);
      }
      if (finishCount_ != 0) {
        output.writeUInt32(5, finishCount_);
      }
      if (unfinishCount_ != 0) {
        output.writeUInt32(6, unfinishCount_);
      }
      if (totalFinishTimestamp_ != 0) {
        output.writeUInt32(10, totalFinishTimestamp_);
      }
      if (queueId_ != 0) {
        output.writeUInt32(11, queueId_);
      }
      if (avatarId_ != 0) {
        output.writeUInt32(13, avatarId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (nextFinishTimestamp_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, nextFinishTimestamp_);
      }
      if (forgeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, forgeId_);
      }
      if (finishCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, finishCount_);
      }
      if (unfinishCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, unfinishCount_);
      }
      if (totalFinishTimestamp_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, totalFinishTimestamp_);
      }
      if (queueId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, queueId_);
      }
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, avatarId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData other = (emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData) obj;

      if (getQueueId()
          != other.getQueueId()) return false;
      if (getAvatarId()
          != other.getAvatarId()) return false;
      if (getForgeId()
          != other.getForgeId()) return false;
      if (getUnfinishCount()
          != other.getUnfinishCount()) return false;
      if (getFinishCount()
          != other.getFinishCount()) return false;
      if (getNextFinishTimestamp()
          != other.getNextFinishTimestamp()) return false;
      if (getTotalFinishTimestamp()
          != other.getTotalFinishTimestamp()) return false;
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
      hash = (37 * hash) + QUEUEID_FIELD_NUMBER;
      hash = (53 * hash) + getQueueId();
      hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (37 * hash) + FORGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getForgeId();
      hash = (37 * hash) + UNFINISHCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getUnfinishCount();
      hash = (37 * hash) + FINISHCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getFinishCount();
      hash = (37 * hash) + NEXTFINISHTIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getNextFinishTimestamp();
      hash = (37 * hash) + TOTALFINISHTIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getTotalFinishTimestamp();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData prototype) {
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
     * Name: DBDNABMNFAO
     * </pre>
     *
     * Protobuf type {@code ForgeQueueData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ForgeQueueData)
        emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ForgeQueueDataOuterClass.internal_static_ForgeQueueData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ForgeQueueDataOuterClass.internal_static_ForgeQueueData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData.class, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData.newBuilder()
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
        queueId_ = 0;
        avatarId_ = 0;
        forgeId_ = 0;
        unfinishCount_ = 0;
        finishCount_ = 0;
        nextFinishTimestamp_ = 0;
        totalFinishTimestamp_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ForgeQueueDataOuterClass.internal_static_ForgeQueueData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData build() {
        emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData buildPartial() {
        emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData result = new emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.queueId_ = queueId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.avatarId_ = avatarId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.forgeId_ = forgeId_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.unfinishCount_ = unfinishCount_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.finishCount_ = finishCount_;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.nextFinishTimestamp_ = nextFinishTimestamp_;
        }
        if (((from_bitField0_ & 0x00000040) != 0)) {
          result.totalFinishTimestamp_ = totalFinishTimestamp_;
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
        if (other instanceof emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData) {
          return mergeFrom((emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData other) {
        if (other == emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData.getDefaultInstance()) return this;
        if (other.getQueueId() != 0) {
          setQueueId(other.getQueueId());
        }
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
        }
        if (other.getForgeId() != 0) {
          setForgeId(other.getForgeId());
        }
        if (other.getUnfinishCount() != 0) {
          setUnfinishCount(other.getUnfinishCount());
        }
        if (other.getFinishCount() != 0) {
          setFinishCount(other.getFinishCount());
        }
        if (other.getNextFinishTimestamp() != 0) {
          setNextFinishTimestamp(other.getNextFinishTimestamp());
        }
        if (other.getTotalFinishTimestamp() != 0) {
          setTotalFinishTimestamp(other.getTotalFinishTimestamp());
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
                nextFinishTimestamp_ = input.readUInt32();
                bitField0_ |= 0x00000020;
                break;
              } // case 16
              case 24: {
                forgeId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 40: {
                finishCount_ = input.readUInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 40
              case 48: {
                unfinishCount_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 48
              case 80: {
                totalFinishTimestamp_ = input.readUInt32();
                bitField0_ |= 0x00000040;
                break;
              } // case 80
              case 88: {
                queueId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 88
              case 104: {
                avatarId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 104
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

      private int queueId_ ;
      /**
       * <code>uint32 queueId = 11;</code>
       * @return The queueId.
       */
      @java.lang.Override
      public int getQueueId() {
        return queueId_;
      }
      /**
       * <code>uint32 queueId = 11;</code>
       * @param value The queueId to set.
       * @return This builder for chaining.
       */
      public Builder setQueueId(int value) {
        
        queueId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 queueId = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearQueueId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        queueId_ = 0;
        onChanged();
        return this;
      }

      private int avatarId_ ;
      /**
       * <code>uint32 avatar_id = 13;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatar_id = 13;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {
        
        avatarId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        avatarId_ = 0;
        onChanged();
        return this;
      }

      private int forgeId_ ;
      /**
       * <code>uint32 forge_id = 3;</code>
       * @return The forgeId.
       */
      @java.lang.Override
      public int getForgeId() {
        return forgeId_;
      }
      /**
       * <code>uint32 forge_id = 3;</code>
       * @param value The forgeId to set.
       * @return This builder for chaining.
       */
      public Builder setForgeId(int value) {
        
        forgeId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 forge_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearForgeId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        forgeId_ = 0;
        onChanged();
        return this;
      }

      private int unfinishCount_ ;
      /**
       * <code>uint32 unfinishCount = 6;</code>
       * @return The unfinishCount.
       */
      @java.lang.Override
      public int getUnfinishCount() {
        return unfinishCount_;
      }
      /**
       * <code>uint32 unfinishCount = 6;</code>
       * @param value The unfinishCount to set.
       * @return This builder for chaining.
       */
      public Builder setUnfinishCount(int value) {
        
        unfinishCount_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 unfinishCount = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnfinishCount() {
        bitField0_ = (bitField0_ & ~0x00000008);
        unfinishCount_ = 0;
        onChanged();
        return this;
      }

      private int finishCount_ ;
      /**
       * <code>uint32 finishCount = 5;</code>
       * @return The finishCount.
       */
      @java.lang.Override
      public int getFinishCount() {
        return finishCount_;
      }
      /**
       * <code>uint32 finishCount = 5;</code>
       * @param value The finishCount to set.
       * @return This builder for chaining.
       */
      public Builder setFinishCount(int value) {
        
        finishCount_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 finishCount = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishCount() {
        bitField0_ = (bitField0_ & ~0x00000010);
        finishCount_ = 0;
        onChanged();
        return this;
      }

      private int nextFinishTimestamp_ ;
      /**
       * <code>uint32 nextFinishTimestamp = 2;</code>
       * @return The nextFinishTimestamp.
       */
      @java.lang.Override
      public int getNextFinishTimestamp() {
        return nextFinishTimestamp_;
      }
      /**
       * <code>uint32 nextFinishTimestamp = 2;</code>
       * @param value The nextFinishTimestamp to set.
       * @return This builder for chaining.
       */
      public Builder setNextFinishTimestamp(int value) {
        
        nextFinishTimestamp_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 nextFinishTimestamp = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearNextFinishTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000020);
        nextFinishTimestamp_ = 0;
        onChanged();
        return this;
      }

      private int totalFinishTimestamp_ ;
      /**
       * <code>uint32 totalFinishTimestamp = 10;</code>
       * @return The totalFinishTimestamp.
       */
      @java.lang.Override
      public int getTotalFinishTimestamp() {
        return totalFinishTimestamp_;
      }
      /**
       * <code>uint32 totalFinishTimestamp = 10;</code>
       * @param value The totalFinishTimestamp to set.
       * @return This builder for chaining.
       */
      public Builder setTotalFinishTimestamp(int value) {
        
        totalFinishTimestamp_ = value;
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 totalFinishTimestamp = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalFinishTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000040);
        totalFinishTimestamp_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ForgeQueueData)
    }

    // @@protoc_insertion_point(class_scope:ForgeQueueData)
    private static final emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData();
    }

    public static emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ForgeQueueData>
        PARSER = new com.google.protobuf.AbstractParser<ForgeQueueData>() {
      @java.lang.Override
      public ForgeQueueData parsePartialFrom(
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

    public static com.google.protobuf.Parser<ForgeQueueData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ForgeQueueData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ForgeQueueData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ForgeQueueData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024ForgeQueueData.proto\"\255\001\n\016ForgeQueueDat" +
      "a\022\017\n\007queueId\030\013 \001(\r\022\021\n\tavatar_id\030\r \001(\r\022\020\n" +
      "\010forge_id\030\003 \001(\r\022\025\n\runfinishCount\030\006 \001(\r\022\023" +
      "\n\013finishCount\030\005 \001(\r\022\033\n\023nextFinishTimesta" +
      "mp\030\002 \001(\r\022\034\n\024totalFinishTimestamp\030\n \001(\rB\033" +
      "\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ForgeQueueData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ForgeQueueData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ForgeQueueData_descriptor,
        new java.lang.String[] { "QueueId", "AvatarId", "ForgeId", "UnfinishCount", "FinishCount", "NextFinishTimestamp", "TotalFinishTimestamp", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}