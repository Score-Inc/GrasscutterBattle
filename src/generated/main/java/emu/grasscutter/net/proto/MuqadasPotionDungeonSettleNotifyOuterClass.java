// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MuqadasPotionDungeonSettleNotify.proto

package emu.grasscutter.net.proto;

public final class MuqadasPotionDungeonSettleNotifyOuterClass {
  private MuqadasPotionDungeonSettleNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MuqadasPotionDungeonSettleNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MuqadasPotionDungeonSettleNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 capture_weakness_count = 5;</code>
     * @return The captureWeaknessCount.
     */
    int getCaptureWeaknessCount();

    /**
     * <code>bool is_success = 4;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();

    /**
     * <code>uint32 final_score = 14;</code>
     * @return The finalScore.
     */
    int getFinalScore();

    /**
     * <code>uint32 level_id = 15;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>bool is_new_record = 11;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();
  }
  /**
   * <pre>
   * Name: JFKAHOGJIMO
   * CmdId: 20893
   * </pre>
   *
   * Protobuf type {@code MuqadasPotionDungeonSettleNotify}
   */
  public static final class MuqadasPotionDungeonSettleNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MuqadasPotionDungeonSettleNotify)
      MuqadasPotionDungeonSettleNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MuqadasPotionDungeonSettleNotify.newBuilder() to construct.
    private MuqadasPotionDungeonSettleNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MuqadasPotionDungeonSettleNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MuqadasPotionDungeonSettleNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.internal_static_MuqadasPotionDungeonSettleNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.internal_static_MuqadasPotionDungeonSettleNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify.class, emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify.Builder.class);
    }

    public static final int CAPTURE_WEAKNESS_COUNT_FIELD_NUMBER = 5;
    private int captureWeaknessCount_ = 0;
    /**
     * <code>uint32 capture_weakness_count = 5;</code>
     * @return The captureWeaknessCount.
     */
    @java.lang.Override
    public int getCaptureWeaknessCount() {
      return captureWeaknessCount_;
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 4;
    private boolean isSuccess_ = false;
    /**
     * <code>bool is_success = 4;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
    }

    public static final int FINAL_SCORE_FIELD_NUMBER = 14;
    private int finalScore_ = 0;
    /**
     * <code>uint32 final_score = 14;</code>
     * @return The finalScore.
     */
    @java.lang.Override
    public int getFinalScore() {
      return finalScore_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 15;
    private int levelId_ = 0;
    /**
     * <code>uint32 level_id = 15;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 11;
    private boolean isNewRecord_ = false;
    /**
     * <code>bool is_new_record = 11;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
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
      if (isSuccess_ != false) {
        output.writeBool(4, isSuccess_);
      }
      if (captureWeaknessCount_ != 0) {
        output.writeUInt32(5, captureWeaknessCount_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(11, isNewRecord_);
      }
      if (finalScore_ != 0) {
        output.writeUInt32(14, finalScore_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(15, levelId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isSuccess_);
      }
      if (captureWeaknessCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, captureWeaknessCount_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, isNewRecord_);
      }
      if (finalScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, finalScore_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify other = (emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify) obj;

      if (getCaptureWeaknessCount()
          != other.getCaptureWeaknessCount()) return false;
      if (getIsSuccess()
          != other.getIsSuccess()) return false;
      if (getFinalScore()
          != other.getFinalScore()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
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
      hash = (37 * hash) + CAPTURE_WEAKNESS_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCaptureWeaknessCount();
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (37 * hash) + FINAL_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getFinalScore();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify prototype) {
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
     * Name: JFKAHOGJIMO
     * CmdId: 20893
     * </pre>
     *
     * Protobuf type {@code MuqadasPotionDungeonSettleNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MuqadasPotionDungeonSettleNotify)
        emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.internal_static_MuqadasPotionDungeonSettleNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.internal_static_MuqadasPotionDungeonSettleNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify.class, emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify.newBuilder()
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
        captureWeaknessCount_ = 0;
        isSuccess_ = false;
        finalScore_ = 0;
        levelId_ = 0;
        isNewRecord_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.internal_static_MuqadasPotionDungeonSettleNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify build() {
        emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify buildPartial() {
        emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify result = new emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.captureWeaknessCount_ = captureWeaknessCount_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isSuccess_ = isSuccess_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.finalScore_ = finalScore_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.levelId_ = levelId_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.isNewRecord_ = isNewRecord_;
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
        if (other instanceof emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify) {
          return mergeFrom((emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify other) {
        if (other == emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify.getDefaultInstance()) return this;
        if (other.getCaptureWeaknessCount() != 0) {
          setCaptureWeaknessCount(other.getCaptureWeaknessCount());
        }
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
        }
        if (other.getFinalScore() != 0) {
          setFinalScore(other.getFinalScore());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
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
              case 32: {
                isSuccess_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 32
              case 40: {
                captureWeaknessCount_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 40
              case 88: {
                isNewRecord_ = input.readBool();
                bitField0_ |= 0x00000010;
                break;
              } // case 88
              case 112: {
                finalScore_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 112
              case 120: {
                levelId_ = input.readUInt32();
                bitField0_ |= 0x00000008;
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

      private int captureWeaknessCount_ ;
      /**
       * <code>uint32 capture_weakness_count = 5;</code>
       * @return The captureWeaknessCount.
       */
      @java.lang.Override
      public int getCaptureWeaknessCount() {
        return captureWeaknessCount_;
      }
      /**
       * <code>uint32 capture_weakness_count = 5;</code>
       * @param value The captureWeaknessCount to set.
       * @return This builder for chaining.
       */
      public Builder setCaptureWeaknessCount(int value) {
        
        captureWeaknessCount_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 capture_weakness_count = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearCaptureWeaknessCount() {
        bitField0_ = (bitField0_ & ~0x00000001);
        captureWeaknessCount_ = 0;
        onChanged();
        return this;
      }

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 4;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 4;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {
        
        isSuccess_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isSuccess_ = false;
        onChanged();
        return this;
      }

      private int finalScore_ ;
      /**
       * <code>uint32 final_score = 14;</code>
       * @return The finalScore.
       */
      @java.lang.Override
      public int getFinalScore() {
        return finalScore_;
      }
      /**
       * <code>uint32 final_score = 14;</code>
       * @param value The finalScore to set.
       * @return This builder for chaining.
       */
      public Builder setFinalScore(int value) {
        
        finalScore_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 final_score = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinalScore() {
        bitField0_ = (bitField0_ & ~0x00000004);
        finalScore_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 15;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 15;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        levelId_ = 0;
        onChanged();
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 11;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 11;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        bitField0_ = (bitField0_ & ~0x00000010);
        isNewRecord_ = false;
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


      // @@protoc_insertion_point(builder_scope:MuqadasPotionDungeonSettleNotify)
    }

    // @@protoc_insertion_point(class_scope:MuqadasPotionDungeonSettleNotify)
    private static final emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify();
    }

    public static emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MuqadasPotionDungeonSettleNotify>
        PARSER = new com.google.protobuf.AbstractParser<MuqadasPotionDungeonSettleNotify>() {
      @java.lang.Override
      public MuqadasPotionDungeonSettleNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<MuqadasPotionDungeonSettleNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MuqadasPotionDungeonSettleNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MuqadasPotionDungeonSettleNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MuqadasPotionDungeonSettleNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&MuqadasPotionDungeonSettleNotify.proto" +
      "\"\224\001\n MuqadasPotionDungeonSettleNotify\022\036\n" +
      "\026capture_weakness_count\030\005 \001(\r\022\022\n\nis_succ" +
      "ess\030\004 \001(\010\022\023\n\013final_score\030\016 \001(\r\022\020\n\010level_" +
      "id\030\017 \001(\r\022\025\n\ris_new_record\030\013 \001(\010B\033\n\031emu.g" +
      "rasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MuqadasPotionDungeonSettleNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MuqadasPotionDungeonSettleNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MuqadasPotionDungeonSettleNotify_descriptor,
        new java.lang.String[] { "CaptureWeaknessCount", "IsSuccess", "FinalScore", "LevelId", "IsNewRecord", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}