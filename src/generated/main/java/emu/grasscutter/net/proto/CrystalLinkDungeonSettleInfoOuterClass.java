// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CrystalLinkDungeonSettleInfo.proto

package emu.grasscutter.net.proto;

public final class CrystalLinkDungeonSettleInfoOuterClass {
  private CrystalLinkDungeonSettleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CrystalLinkDungeonSettleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CrystalLinkDungeonSettleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool IIKHHOCDJDK = 5;</code>
     * @return The iIKHHOCDJDK.
     */
    boolean getIIKHHOCDJDK();

    /**
     * <code>uint32 DNCGDPEOCHL = 1;</code>
     * @return The dNCGDPEOCHL.
     */
    int getDNCGDPEOCHL();

    /**
     * <code>uint32 final_score = 11;</code>
     * @return The finalScore.
     */
    int getFinalScore();

    /**
     * <code>bool is_new_record = 6;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();

    /**
     * <code>uint32 difficulty_id = 13;</code>
     * @return The difficultyId.
     */
    int getDifficultyId();

    /**
     * <code>uint32 ACLMNJDOGKP = 9;</code>
     * @return The aCLMNJDOGKP.
     */
    int getACLMNJDOGKP();

    /**
     * <code>uint32 level_id = 15;</code>
     * @return The levelId.
     */
    int getLevelId();
  }
  /**
   * <pre>
   * Name: IPCPFADOJFH
   * </pre>
   *
   * Protobuf type {@code CrystalLinkDungeonSettleInfo}
   */
  public static final class CrystalLinkDungeonSettleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CrystalLinkDungeonSettleInfo)
      CrystalLinkDungeonSettleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CrystalLinkDungeonSettleInfo.newBuilder() to construct.
    private CrystalLinkDungeonSettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CrystalLinkDungeonSettleInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CrystalLinkDungeonSettleInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.internal_static_CrystalLinkDungeonSettleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.internal_static_CrystalLinkDungeonSettleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo.class, emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo.Builder.class);
    }

    public static final int IIKHHOCDJDK_FIELD_NUMBER = 5;
    private boolean iIKHHOCDJDK_ = false;
    /**
     * <code>bool IIKHHOCDJDK = 5;</code>
     * @return The iIKHHOCDJDK.
     */
    @java.lang.Override
    public boolean getIIKHHOCDJDK() {
      return iIKHHOCDJDK_;
    }

    public static final int DNCGDPEOCHL_FIELD_NUMBER = 1;
    private int dNCGDPEOCHL_ = 0;
    /**
     * <code>uint32 DNCGDPEOCHL = 1;</code>
     * @return The dNCGDPEOCHL.
     */
    @java.lang.Override
    public int getDNCGDPEOCHL() {
      return dNCGDPEOCHL_;
    }

    public static final int FINAL_SCORE_FIELD_NUMBER = 11;
    private int finalScore_ = 0;
    /**
     * <code>uint32 final_score = 11;</code>
     * @return The finalScore.
     */
    @java.lang.Override
    public int getFinalScore() {
      return finalScore_;
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 6;
    private boolean isNewRecord_ = false;
    /**
     * <code>bool is_new_record = 6;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
    }

    public static final int DIFFICULTY_ID_FIELD_NUMBER = 13;
    private int difficultyId_ = 0;
    /**
     * <code>uint32 difficulty_id = 13;</code>
     * @return The difficultyId.
     */
    @java.lang.Override
    public int getDifficultyId() {
      return difficultyId_;
    }

    public static final int ACLMNJDOGKP_FIELD_NUMBER = 9;
    private int aCLMNJDOGKP_ = 0;
    /**
     * <code>uint32 ACLMNJDOGKP = 9;</code>
     * @return The aCLMNJDOGKP.
     */
    @java.lang.Override
    public int getACLMNJDOGKP() {
      return aCLMNJDOGKP_;
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
      if (dNCGDPEOCHL_ != 0) {
        output.writeUInt32(1, dNCGDPEOCHL_);
      }
      if (iIKHHOCDJDK_ != false) {
        output.writeBool(5, iIKHHOCDJDK_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(6, isNewRecord_);
      }
      if (aCLMNJDOGKP_ != 0) {
        output.writeUInt32(9, aCLMNJDOGKP_);
      }
      if (finalScore_ != 0) {
        output.writeUInt32(11, finalScore_);
      }
      if (difficultyId_ != 0) {
        output.writeUInt32(13, difficultyId_);
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
      if (dNCGDPEOCHL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, dNCGDPEOCHL_);
      }
      if (iIKHHOCDJDK_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, iIKHHOCDJDK_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isNewRecord_);
      }
      if (aCLMNJDOGKP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, aCLMNJDOGKP_);
      }
      if (finalScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, finalScore_);
      }
      if (difficultyId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, difficultyId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo other = (emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo) obj;

      if (getIIKHHOCDJDK()
          != other.getIIKHHOCDJDK()) return false;
      if (getDNCGDPEOCHL()
          != other.getDNCGDPEOCHL()) return false;
      if (getFinalScore()
          != other.getFinalScore()) return false;
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
      if (getDifficultyId()
          != other.getDifficultyId()) return false;
      if (getACLMNJDOGKP()
          != other.getACLMNJDOGKP()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
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
      hash = (37 * hash) + IIKHHOCDJDK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIIKHHOCDJDK());
      hash = (37 * hash) + DNCGDPEOCHL_FIELD_NUMBER;
      hash = (53 * hash) + getDNCGDPEOCHL();
      hash = (37 * hash) + FINAL_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getFinalScore();
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (37 * hash) + DIFFICULTY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDifficultyId();
      hash = (37 * hash) + ACLMNJDOGKP_FIELD_NUMBER;
      hash = (53 * hash) + getACLMNJDOGKP();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo prototype) {
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
     * Name: IPCPFADOJFH
     * </pre>
     *
     * Protobuf type {@code CrystalLinkDungeonSettleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CrystalLinkDungeonSettleInfo)
        emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.internal_static_CrystalLinkDungeonSettleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.internal_static_CrystalLinkDungeonSettleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo.class, emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo.newBuilder()
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
        iIKHHOCDJDK_ = false;
        dNCGDPEOCHL_ = 0;
        finalScore_ = 0;
        isNewRecord_ = false;
        difficultyId_ = 0;
        aCLMNJDOGKP_ = 0;
        levelId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.internal_static_CrystalLinkDungeonSettleInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo build() {
        emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo buildPartial() {
        emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo result = new emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.iIKHHOCDJDK_ = iIKHHOCDJDK_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.dNCGDPEOCHL_ = dNCGDPEOCHL_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.finalScore_ = finalScore_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.isNewRecord_ = isNewRecord_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.difficultyId_ = difficultyId_;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.aCLMNJDOGKP_ = aCLMNJDOGKP_;
        }
        if (((from_bitField0_ & 0x00000040) != 0)) {
          result.levelId_ = levelId_;
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
        if (other instanceof emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo) {
          return mergeFrom((emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo other) {
        if (other == emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo.getDefaultInstance()) return this;
        if (other.getIIKHHOCDJDK() != false) {
          setIIKHHOCDJDK(other.getIIKHHOCDJDK());
        }
        if (other.getDNCGDPEOCHL() != 0) {
          setDNCGDPEOCHL(other.getDNCGDPEOCHL());
        }
        if (other.getFinalScore() != 0) {
          setFinalScore(other.getFinalScore());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
        }
        if (other.getDifficultyId() != 0) {
          setDifficultyId(other.getDifficultyId());
        }
        if (other.getACLMNJDOGKP() != 0) {
          setACLMNJDOGKP(other.getACLMNJDOGKP());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
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
                dNCGDPEOCHL_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 8
              case 40: {
                iIKHHOCDJDK_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 40
              case 48: {
                isNewRecord_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 48
              case 72: {
                aCLMNJDOGKP_ = input.readUInt32();
                bitField0_ |= 0x00000020;
                break;
              } // case 72
              case 88: {
                finalScore_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 88
              case 104: {
                difficultyId_ = input.readUInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 104
              case 120: {
                levelId_ = input.readUInt32();
                bitField0_ |= 0x00000040;
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

      private boolean iIKHHOCDJDK_ ;
      /**
       * <code>bool IIKHHOCDJDK = 5;</code>
       * @return The iIKHHOCDJDK.
       */
      @java.lang.Override
      public boolean getIIKHHOCDJDK() {
        return iIKHHOCDJDK_;
      }
      /**
       * <code>bool IIKHHOCDJDK = 5;</code>
       * @param value The iIKHHOCDJDK to set.
       * @return This builder for chaining.
       */
      public Builder setIIKHHOCDJDK(boolean value) {
        
        iIKHHOCDJDK_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool IIKHHOCDJDK = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIIKHHOCDJDK() {
        bitField0_ = (bitField0_ & ~0x00000001);
        iIKHHOCDJDK_ = false;
        onChanged();
        return this;
      }

      private int dNCGDPEOCHL_ ;
      /**
       * <code>uint32 DNCGDPEOCHL = 1;</code>
       * @return The dNCGDPEOCHL.
       */
      @java.lang.Override
      public int getDNCGDPEOCHL() {
        return dNCGDPEOCHL_;
      }
      /**
       * <code>uint32 DNCGDPEOCHL = 1;</code>
       * @param value The dNCGDPEOCHL to set.
       * @return This builder for chaining.
       */
      public Builder setDNCGDPEOCHL(int value) {
        
        dNCGDPEOCHL_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 DNCGDPEOCHL = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearDNCGDPEOCHL() {
        bitField0_ = (bitField0_ & ~0x00000002);
        dNCGDPEOCHL_ = 0;
        onChanged();
        return this;
      }

      private int finalScore_ ;
      /**
       * <code>uint32 final_score = 11;</code>
       * @return The finalScore.
       */
      @java.lang.Override
      public int getFinalScore() {
        return finalScore_;
      }
      /**
       * <code>uint32 final_score = 11;</code>
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
       * <code>uint32 final_score = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinalScore() {
        bitField0_ = (bitField0_ & ~0x00000004);
        finalScore_ = 0;
        onChanged();
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 6;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 6;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        bitField0_ = (bitField0_ & ~0x00000008);
        isNewRecord_ = false;
        onChanged();
        return this;
      }

      private int difficultyId_ ;
      /**
       * <code>uint32 difficulty_id = 13;</code>
       * @return The difficultyId.
       */
      @java.lang.Override
      public int getDifficultyId() {
        return difficultyId_;
      }
      /**
       * <code>uint32 difficulty_id = 13;</code>
       * @param value The difficultyId to set.
       * @return This builder for chaining.
       */
      public Builder setDifficultyId(int value) {
        
        difficultyId_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficulty_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficultyId() {
        bitField0_ = (bitField0_ & ~0x00000010);
        difficultyId_ = 0;
        onChanged();
        return this;
      }

      private int aCLMNJDOGKP_ ;
      /**
       * <code>uint32 ACLMNJDOGKP = 9;</code>
       * @return The aCLMNJDOGKP.
       */
      @java.lang.Override
      public int getACLMNJDOGKP() {
        return aCLMNJDOGKP_;
      }
      /**
       * <code>uint32 ACLMNJDOGKP = 9;</code>
       * @param value The aCLMNJDOGKP to set.
       * @return This builder for chaining.
       */
      public Builder setACLMNJDOGKP(int value) {
        
        aCLMNJDOGKP_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ACLMNJDOGKP = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearACLMNJDOGKP() {
        bitField0_ = (bitField0_ & ~0x00000020);
        aCLMNJDOGKP_ = 0;
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
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        bitField0_ = (bitField0_ & ~0x00000040);
        levelId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CrystalLinkDungeonSettleInfo)
    }

    // @@protoc_insertion_point(class_scope:CrystalLinkDungeonSettleInfo)
    private static final emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo();
    }

    public static emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CrystalLinkDungeonSettleInfo>
        PARSER = new com.google.protobuf.AbstractParser<CrystalLinkDungeonSettleInfo>() {
      @java.lang.Override
      public CrystalLinkDungeonSettleInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<CrystalLinkDungeonSettleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CrystalLinkDungeonSettleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CrystalLinkDungeonSettleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CrystalLinkDungeonSettleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"CrystalLinkDungeonSettleInfo.proto\"\262\001\n" +
      "\034CrystalLinkDungeonSettleInfo\022\023\n\013IIKHHOC" +
      "DJDK\030\005 \001(\010\022\023\n\013DNCGDPEOCHL\030\001 \001(\r\022\023\n\013final" +
      "_score\030\013 \001(\r\022\025\n\ris_new_record\030\006 \001(\010\022\025\n\rd" +
      "ifficulty_id\030\r \001(\r\022\023\n\013ACLMNJDOGKP\030\t \001(\r\022" +
      "\020\n\010level_id\030\017 \001(\rB\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CrystalLinkDungeonSettleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CrystalLinkDungeonSettleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CrystalLinkDungeonSettleInfo_descriptor,
        new java.lang.String[] { "IIKHHOCDJDK", "DNCGDPEOCHL", "FinalScore", "IsNewRecord", "DifficultyId", "ACLMNJDOGKP", "LevelId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
