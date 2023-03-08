// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MuqadasPotionInfo.proto

package emu.grasscutter.net.proto;

public final class MuqadasPotionInfoOuterClass {
  private MuqadasPotionInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MuqadasPotionInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MuqadasPotionInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 muqadasPotionLevelDataList = 13;</code>
     * @return The muqadasPotionLevelDataList.
     */
    int getMuqadasPotionLevelDataList();

    /**
     * <code>uint32 score = 14;</code>
     * @return The score.
     */
    int getScore();

    /**
     * <code>uint32 Unk3300_LKEICOLMPII = 3;</code>
     * @return The unk3300LKEICOLMPII.
     */
    int getUnk3300LKEICOLMPII();

    /**
     * <code>uint32 captureWeaknessCount = 5;</code>
     * @return The captureWeaknessCount.
     */
    int getCaptureWeaknessCount();
  }
  /**
   * Protobuf type {@code MuqadasPotionInfo}
   */
  public static final class MuqadasPotionInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MuqadasPotionInfo)
      MuqadasPotionInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MuqadasPotionInfo.newBuilder() to construct.
    private MuqadasPotionInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MuqadasPotionInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MuqadasPotionInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.internal_static_MuqadasPotionInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.internal_static_MuqadasPotionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo.class, emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo.Builder.class);
    }

    public static final int MUQADASPOTIONLEVELDATALIST_FIELD_NUMBER = 13;
    private int muqadasPotionLevelDataList_ = 0;
    /**
     * <code>uint32 muqadasPotionLevelDataList = 13;</code>
     * @return The muqadasPotionLevelDataList.
     */
    @java.lang.Override
    public int getMuqadasPotionLevelDataList() {
      return muqadasPotionLevelDataList_;
    }

    public static final int SCORE_FIELD_NUMBER = 14;
    private int score_ = 0;
    /**
     * <code>uint32 score = 14;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }

    public static final int UNK3300_LKEICOLMPII_FIELD_NUMBER = 3;
    private int unk3300LKEICOLMPII_ = 0;
    /**
     * <code>uint32 Unk3300_LKEICOLMPII = 3;</code>
     * @return The unk3300LKEICOLMPII.
     */
    @java.lang.Override
    public int getUnk3300LKEICOLMPII() {
      return unk3300LKEICOLMPII_;
    }

    public static final int CAPTUREWEAKNESSCOUNT_FIELD_NUMBER = 5;
    private int captureWeaknessCount_ = 0;
    /**
     * <code>uint32 captureWeaknessCount = 5;</code>
     * @return The captureWeaknessCount.
     */
    @java.lang.Override
    public int getCaptureWeaknessCount() {
      return captureWeaknessCount_;
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
      if (unk3300LKEICOLMPII_ != 0) {
        output.writeUInt32(3, unk3300LKEICOLMPII_);
      }
      if (captureWeaknessCount_ != 0) {
        output.writeUInt32(5, captureWeaknessCount_);
      }
      if (muqadasPotionLevelDataList_ != 0) {
        output.writeUInt32(13, muqadasPotionLevelDataList_);
      }
      if (score_ != 0) {
        output.writeUInt32(14, score_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300LKEICOLMPII_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, unk3300LKEICOLMPII_);
      }
      if (captureWeaknessCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, captureWeaknessCount_);
      }
      if (muqadasPotionLevelDataList_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, muqadasPotionLevelDataList_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, score_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo other = (emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo) obj;

      if (getMuqadasPotionLevelDataList()
          != other.getMuqadasPotionLevelDataList()) return false;
      if (getScore()
          != other.getScore()) return false;
      if (getUnk3300LKEICOLMPII()
          != other.getUnk3300LKEICOLMPII()) return false;
      if (getCaptureWeaknessCount()
          != other.getCaptureWeaknessCount()) return false;
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
      hash = (37 * hash) + MUQADASPOTIONLEVELDATALIST_FIELD_NUMBER;
      hash = (53 * hash) + getMuqadasPotionLevelDataList();
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (37 * hash) + UNK3300_LKEICOLMPII_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300LKEICOLMPII();
      hash = (37 * hash) + CAPTUREWEAKNESSCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCaptureWeaknessCount();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo prototype) {
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
     * Protobuf type {@code MuqadasPotionInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MuqadasPotionInfo)
        emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.internal_static_MuqadasPotionInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.internal_static_MuqadasPotionInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo.class, emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo.newBuilder()
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
        muqadasPotionLevelDataList_ = 0;
        score_ = 0;
        unk3300LKEICOLMPII_ = 0;
        captureWeaknessCount_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.internal_static_MuqadasPotionInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo build() {
        emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo buildPartial() {
        emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo result = new emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.muqadasPotionLevelDataList_ = muqadasPotionLevelDataList_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.score_ = score_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.unk3300LKEICOLMPII_ = unk3300LKEICOLMPII_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.captureWeaknessCount_ = captureWeaknessCount_;
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
        if (other instanceof emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo) {
          return mergeFrom((emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo other) {
        if (other == emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo.getDefaultInstance()) return this;
        if (other.getMuqadasPotionLevelDataList() != 0) {
          setMuqadasPotionLevelDataList(other.getMuqadasPotionLevelDataList());
        }
        if (other.getScore() != 0) {
          setScore(other.getScore());
        }
        if (other.getUnk3300LKEICOLMPII() != 0) {
          setUnk3300LKEICOLMPII(other.getUnk3300LKEICOLMPII());
        }
        if (other.getCaptureWeaknessCount() != 0) {
          setCaptureWeaknessCount(other.getCaptureWeaknessCount());
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
              case 24: {
                unk3300LKEICOLMPII_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 40: {
                captureWeaknessCount_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 40
              case 104: {
                muqadasPotionLevelDataList_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 104
              case 112: {
                score_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 112
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

      private int muqadasPotionLevelDataList_ ;
      /**
       * <code>uint32 muqadasPotionLevelDataList = 13;</code>
       * @return The muqadasPotionLevelDataList.
       */
      @java.lang.Override
      public int getMuqadasPotionLevelDataList() {
        return muqadasPotionLevelDataList_;
      }
      /**
       * <code>uint32 muqadasPotionLevelDataList = 13;</code>
       * @param value The muqadasPotionLevelDataList to set.
       * @return This builder for chaining.
       */
      public Builder setMuqadasPotionLevelDataList(int value) {
        
        muqadasPotionLevelDataList_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 muqadasPotionLevelDataList = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearMuqadasPotionLevelDataList() {
        bitField0_ = (bitField0_ & ~0x00000001);
        muqadasPotionLevelDataList_ = 0;
        onChanged();
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 14;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 14;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        bitField0_ = (bitField0_ & ~0x00000002);
        score_ = 0;
        onChanged();
        return this;
      }

      private int unk3300LKEICOLMPII_ ;
      /**
       * <code>uint32 Unk3300_LKEICOLMPII = 3;</code>
       * @return The unk3300LKEICOLMPII.
       */
      @java.lang.Override
      public int getUnk3300LKEICOLMPII() {
        return unk3300LKEICOLMPII_;
      }
      /**
       * <code>uint32 Unk3300_LKEICOLMPII = 3;</code>
       * @param value The unk3300LKEICOLMPII to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300LKEICOLMPII(int value) {
        
        unk3300LKEICOLMPII_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_LKEICOLMPII = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300LKEICOLMPII() {
        bitField0_ = (bitField0_ & ~0x00000004);
        unk3300LKEICOLMPII_ = 0;
        onChanged();
        return this;
      }

      private int captureWeaknessCount_ ;
      /**
       * <code>uint32 captureWeaknessCount = 5;</code>
       * @return The captureWeaknessCount.
       */
      @java.lang.Override
      public int getCaptureWeaknessCount() {
        return captureWeaknessCount_;
      }
      /**
       * <code>uint32 captureWeaknessCount = 5;</code>
       * @param value The captureWeaknessCount to set.
       * @return This builder for chaining.
       */
      public Builder setCaptureWeaknessCount(int value) {
        
        captureWeaknessCount_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 captureWeaknessCount = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearCaptureWeaknessCount() {
        bitField0_ = (bitField0_ & ~0x00000008);
        captureWeaknessCount_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MuqadasPotionInfo)
    }

    // @@protoc_insertion_point(class_scope:MuqadasPotionInfo)
    private static final emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo();
    }

    public static emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MuqadasPotionInfo>
        PARSER = new com.google.protobuf.AbstractParser<MuqadasPotionInfo>() {
      @java.lang.Override
      public MuqadasPotionInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<MuqadasPotionInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MuqadasPotionInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MuqadasPotionInfoOuterClass.MuqadasPotionInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MuqadasPotionInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MuqadasPotionInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027MuqadasPotionInfo.proto\"\201\001\n\021MuqadasPot" +
      "ionInfo\022\"\n\032muqadasPotionLevelDataList\030\r " +
      "\001(\r\022\r\n\005score\030\016 \001(\r\022\033\n\023Unk3300_LKEICOLMPI" +
      "I\030\003 \001(\r\022\034\n\024captureWeaknessCount\030\005 \001(\rB\033\n" +
      "\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MuqadasPotionInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MuqadasPotionInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MuqadasPotionInfo_descriptor,
        new java.lang.String[] { "MuqadasPotionLevelDataList", "Score", "Unk3300LKEICOLMPII", "CaptureWeaknessCount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}