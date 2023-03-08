// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChannellerSlabLoopDungeonResultInfo.proto

package emu.grasscutter.net.proto;

public final class ChannellerSlabLoopDungeonResultInfoOuterClass {
  private ChannellerSlabLoopDungeonResultInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChannellerSlabLoopDungeonResultInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChannellerSlabLoopDungeonResultInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_in_time_limit = 9;</code>
     * @return The isInTimeLimit.
     */
    boolean getIsInTimeLimit();

    /**
     * <code>bool is_success = 12;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();

    /**
     * <code>uint32 challenge_score = 7;</code>
     * @return The challengeScore.
     */
    int getChallengeScore();

    /**
     * <code>uint32 challenge_max_score = 11;</code>
     * @return The challengeMaxScore.
     */
    int getChallengeMaxScore();

    /**
     * <code>uint32 dungeon_index = 2;</code>
     * @return The dungeonIndex.
     */
    int getDungeonIndex();
  }
  /**
   * <pre>
   * Name: PNOJAMMOOGN
   * </pre>
   *
   * Protobuf type {@code ChannellerSlabLoopDungeonResultInfo}
   */
  public static final class ChannellerSlabLoopDungeonResultInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChannellerSlabLoopDungeonResultInfo)
      ChannellerSlabLoopDungeonResultInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChannellerSlabLoopDungeonResultInfo.newBuilder() to construct.
    private ChannellerSlabLoopDungeonResultInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChannellerSlabLoopDungeonResultInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChannellerSlabLoopDungeonResultInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.internal_static_ChannellerSlabLoopDungeonResultInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.internal_static_ChannellerSlabLoopDungeonResultInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo.class, emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo.Builder.class);
    }

    public static final int IS_IN_TIME_LIMIT_FIELD_NUMBER = 9;
    private boolean isInTimeLimit_ = false;
    /**
     * <code>bool is_in_time_limit = 9;</code>
     * @return The isInTimeLimit.
     */
    @java.lang.Override
    public boolean getIsInTimeLimit() {
      return isInTimeLimit_;
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 12;
    private boolean isSuccess_ = false;
    /**
     * <code>bool is_success = 12;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
    }

    public static final int CHALLENGE_SCORE_FIELD_NUMBER = 7;
    private int challengeScore_ = 0;
    /**
     * <code>uint32 challenge_score = 7;</code>
     * @return The challengeScore.
     */
    @java.lang.Override
    public int getChallengeScore() {
      return challengeScore_;
    }

    public static final int CHALLENGE_MAX_SCORE_FIELD_NUMBER = 11;
    private int challengeMaxScore_ = 0;
    /**
     * <code>uint32 challenge_max_score = 11;</code>
     * @return The challengeMaxScore.
     */
    @java.lang.Override
    public int getChallengeMaxScore() {
      return challengeMaxScore_;
    }

    public static final int DUNGEON_INDEX_FIELD_NUMBER = 2;
    private int dungeonIndex_ = 0;
    /**
     * <code>uint32 dungeon_index = 2;</code>
     * @return The dungeonIndex.
     */
    @java.lang.Override
    public int getDungeonIndex() {
      return dungeonIndex_;
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
      if (dungeonIndex_ != 0) {
        output.writeUInt32(2, dungeonIndex_);
      }
      if (challengeScore_ != 0) {
        output.writeUInt32(7, challengeScore_);
      }
      if (isInTimeLimit_ != false) {
        output.writeBool(9, isInTimeLimit_);
      }
      if (challengeMaxScore_ != 0) {
        output.writeUInt32(11, challengeMaxScore_);
      }
      if (isSuccess_ != false) {
        output.writeBool(12, isSuccess_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dungeonIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, dungeonIndex_);
      }
      if (challengeScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, challengeScore_);
      }
      if (isInTimeLimit_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isInTimeLimit_);
      }
      if (challengeMaxScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, challengeMaxScore_);
      }
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isSuccess_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo other = (emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo) obj;

      if (getIsInTimeLimit()
          != other.getIsInTimeLimit()) return false;
      if (getIsSuccess()
          != other.getIsSuccess()) return false;
      if (getChallengeScore()
          != other.getChallengeScore()) return false;
      if (getChallengeMaxScore()
          != other.getChallengeMaxScore()) return false;
      if (getDungeonIndex()
          != other.getDungeonIndex()) return false;
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
      hash = (37 * hash) + IS_IN_TIME_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsInTimeLimit());
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (37 * hash) + CHALLENGE_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeScore();
      hash = (37 * hash) + CHALLENGE_MAX_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeMaxScore();
      hash = (37 * hash) + DUNGEON_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonIndex();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo prototype) {
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
     * Name: PNOJAMMOOGN
     * </pre>
     *
     * Protobuf type {@code ChannellerSlabLoopDungeonResultInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChannellerSlabLoopDungeonResultInfo)
        emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.internal_static_ChannellerSlabLoopDungeonResultInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.internal_static_ChannellerSlabLoopDungeonResultInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo.class, emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo.newBuilder()
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
        isInTimeLimit_ = false;
        isSuccess_ = false;
        challengeScore_ = 0;
        challengeMaxScore_ = 0;
        dungeonIndex_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.internal_static_ChannellerSlabLoopDungeonResultInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo build() {
        emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo buildPartial() {
        emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo result = new emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isInTimeLimit_ = isInTimeLimit_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isSuccess_ = isSuccess_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.challengeScore_ = challengeScore_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.challengeMaxScore_ = challengeMaxScore_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.dungeonIndex_ = dungeonIndex_;
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
        if (other instanceof emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo) {
          return mergeFrom((emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo other) {
        if (other == emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo.getDefaultInstance()) return this;
        if (other.getIsInTimeLimit() != false) {
          setIsInTimeLimit(other.getIsInTimeLimit());
        }
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
        }
        if (other.getChallengeScore() != 0) {
          setChallengeScore(other.getChallengeScore());
        }
        if (other.getChallengeMaxScore() != 0) {
          setChallengeMaxScore(other.getChallengeMaxScore());
        }
        if (other.getDungeonIndex() != 0) {
          setDungeonIndex(other.getDungeonIndex());
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
                dungeonIndex_ = input.readUInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 16
              case 56: {
                challengeScore_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 56
              case 72: {
                isInTimeLimit_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 72
              case 88: {
                challengeMaxScore_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 88
              case 96: {
                isSuccess_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 96
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

      private boolean isInTimeLimit_ ;
      /**
       * <code>bool is_in_time_limit = 9;</code>
       * @return The isInTimeLimit.
       */
      @java.lang.Override
      public boolean getIsInTimeLimit() {
        return isInTimeLimit_;
      }
      /**
       * <code>bool is_in_time_limit = 9;</code>
       * @param value The isInTimeLimit to set.
       * @return This builder for chaining.
       */
      public Builder setIsInTimeLimit(boolean value) {
        
        isInTimeLimit_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_in_time_limit = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsInTimeLimit() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isInTimeLimit_ = false;
        onChanged();
        return this;
      }

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 12;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 12;</code>
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
       * <code>bool is_success = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isSuccess_ = false;
        onChanged();
        return this;
      }

      private int challengeScore_ ;
      /**
       * <code>uint32 challenge_score = 7;</code>
       * @return The challengeScore.
       */
      @java.lang.Override
      public int getChallengeScore() {
        return challengeScore_;
      }
      /**
       * <code>uint32 challenge_score = 7;</code>
       * @param value The challengeScore to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeScore(int value) {
        
        challengeScore_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_score = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeScore() {
        bitField0_ = (bitField0_ & ~0x00000004);
        challengeScore_ = 0;
        onChanged();
        return this;
      }

      private int challengeMaxScore_ ;
      /**
       * <code>uint32 challenge_max_score = 11;</code>
       * @return The challengeMaxScore.
       */
      @java.lang.Override
      public int getChallengeMaxScore() {
        return challengeMaxScore_;
      }
      /**
       * <code>uint32 challenge_max_score = 11;</code>
       * @param value The challengeMaxScore to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeMaxScore(int value) {
        
        challengeMaxScore_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_max_score = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeMaxScore() {
        bitField0_ = (bitField0_ & ~0x00000008);
        challengeMaxScore_ = 0;
        onChanged();
        return this;
      }

      private int dungeonIndex_ ;
      /**
       * <code>uint32 dungeon_index = 2;</code>
       * @return The dungeonIndex.
       */
      @java.lang.Override
      public int getDungeonIndex() {
        return dungeonIndex_;
      }
      /**
       * <code>uint32 dungeon_index = 2;</code>
       * @param value The dungeonIndex to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonIndex(int value) {
        
        dungeonIndex_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_index = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonIndex() {
        bitField0_ = (bitField0_ & ~0x00000010);
        dungeonIndex_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ChannellerSlabLoopDungeonResultInfo)
    }

    // @@protoc_insertion_point(class_scope:ChannellerSlabLoopDungeonResultInfo)
    private static final emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo();
    }

    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChannellerSlabLoopDungeonResultInfo>
        PARSER = new com.google.protobuf.AbstractParser<ChannellerSlabLoopDungeonResultInfo>() {
      @java.lang.Override
      public ChannellerSlabLoopDungeonResultInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<ChannellerSlabLoopDungeonResultInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChannellerSlabLoopDungeonResultInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChannellerSlabLoopDungeonResultInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChannellerSlabLoopDungeonResultInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)ChannellerSlabLoopDungeonResultInfo.pr" +
      "oto\"\240\001\n#ChannellerSlabLoopDungeonResultI" +
      "nfo\022\030\n\020is_in_time_limit\030\t \001(\010\022\022\n\nis_succ" +
      "ess\030\014 \001(\010\022\027\n\017challenge_score\030\007 \001(\r\022\033\n\023ch" +
      "allenge_max_score\030\013 \001(\r\022\025\n\rdungeon_index" +
      "\030\002 \001(\rB\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChannellerSlabLoopDungeonResultInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChannellerSlabLoopDungeonResultInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChannellerSlabLoopDungeonResultInfo_descriptor,
        new java.lang.String[] { "IsInTimeLimit", "IsSuccess", "ChallengeScore", "ChallengeMaxScore", "DungeonIndex", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}