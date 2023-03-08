// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BounceConjuringInfo.proto

package emu.grasscutter.net.proto;

public final class BounceConjuringInfoOuterClass {
  private BounceConjuringInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BounceConjuringInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BounceConjuringInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 totalDestroyedMachineCount = 5;</code>
     * @return The totalDestroyedMachineCount.
     */
    int getTotalDestroyedMachineCount();

    /**
     * <code>uint32 totalScore = 4;</code>
     * @return The totalScore.
     */
    int getTotalScore();
  }
  /**
   * Protobuf type {@code BounceConjuringInfo}
   */
  public static final class BounceConjuringInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BounceConjuringInfo)
      BounceConjuringInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BounceConjuringInfo.newBuilder() to construct.
    private BounceConjuringInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BounceConjuringInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BounceConjuringInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.internal_static_BounceConjuringInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.internal_static_BounceConjuringInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo.class, emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo.Builder.class);
    }

    public static final int TOTALDESTROYEDMACHINECOUNT_FIELD_NUMBER = 5;
    private int totalDestroyedMachineCount_ = 0;
    /**
     * <code>uint32 totalDestroyedMachineCount = 5;</code>
     * @return The totalDestroyedMachineCount.
     */
    @java.lang.Override
    public int getTotalDestroyedMachineCount() {
      return totalDestroyedMachineCount_;
    }

    public static final int TOTALSCORE_FIELD_NUMBER = 4;
    private int totalScore_ = 0;
    /**
     * <code>uint32 totalScore = 4;</code>
     * @return The totalScore.
     */
    @java.lang.Override
    public int getTotalScore() {
      return totalScore_;
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
      if (totalScore_ != 0) {
        output.writeUInt32(4, totalScore_);
      }
      if (totalDestroyedMachineCount_ != 0) {
        output.writeUInt32(5, totalDestroyedMachineCount_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (totalScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, totalScore_);
      }
      if (totalDestroyedMachineCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, totalDestroyedMachineCount_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo other = (emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo) obj;

      if (getTotalDestroyedMachineCount()
          != other.getTotalDestroyedMachineCount()) return false;
      if (getTotalScore()
          != other.getTotalScore()) return false;
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
      hash = (37 * hash) + TOTALDESTROYEDMACHINECOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getTotalDestroyedMachineCount();
      hash = (37 * hash) + TOTALSCORE_FIELD_NUMBER;
      hash = (53 * hash) + getTotalScore();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo prototype) {
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
     * Protobuf type {@code BounceConjuringInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BounceConjuringInfo)
        emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.internal_static_BounceConjuringInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.internal_static_BounceConjuringInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo.class, emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo.newBuilder()
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
        totalDestroyedMachineCount_ = 0;
        totalScore_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.internal_static_BounceConjuringInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo build() {
        emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo buildPartial() {
        emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo result = new emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.totalDestroyedMachineCount_ = totalDestroyedMachineCount_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.totalScore_ = totalScore_;
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
        if (other instanceof emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo) {
          return mergeFrom((emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo other) {
        if (other == emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo.getDefaultInstance()) return this;
        if (other.getTotalDestroyedMachineCount() != 0) {
          setTotalDestroyedMachineCount(other.getTotalDestroyedMachineCount());
        }
        if (other.getTotalScore() != 0) {
          setTotalScore(other.getTotalScore());
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
                totalScore_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 32
              case 40: {
                totalDestroyedMachineCount_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 40
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

      private int totalDestroyedMachineCount_ ;
      /**
       * <code>uint32 totalDestroyedMachineCount = 5;</code>
       * @return The totalDestroyedMachineCount.
       */
      @java.lang.Override
      public int getTotalDestroyedMachineCount() {
        return totalDestroyedMachineCount_;
      }
      /**
       * <code>uint32 totalDestroyedMachineCount = 5;</code>
       * @param value The totalDestroyedMachineCount to set.
       * @return This builder for chaining.
       */
      public Builder setTotalDestroyedMachineCount(int value) {
        
        totalDestroyedMachineCount_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 totalDestroyedMachineCount = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalDestroyedMachineCount() {
        bitField0_ = (bitField0_ & ~0x00000001);
        totalDestroyedMachineCount_ = 0;
        onChanged();
        return this;
      }

      private int totalScore_ ;
      /**
       * <code>uint32 totalScore = 4;</code>
       * @return The totalScore.
       */
      @java.lang.Override
      public int getTotalScore() {
        return totalScore_;
      }
      /**
       * <code>uint32 totalScore = 4;</code>
       * @param value The totalScore to set.
       * @return This builder for chaining.
       */
      public Builder setTotalScore(int value) {
        
        totalScore_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 totalScore = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalScore() {
        bitField0_ = (bitField0_ & ~0x00000002);
        totalScore_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BounceConjuringInfo)
    }

    // @@protoc_insertion_point(class_scope:BounceConjuringInfo)
    private static final emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo();
    }

    public static emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BounceConjuringInfo>
        PARSER = new com.google.protobuf.AbstractParser<BounceConjuringInfo>() {
      @java.lang.Override
      public BounceConjuringInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<BounceConjuringInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BounceConjuringInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BounceConjuringInfoOuterClass.BounceConjuringInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BounceConjuringInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BounceConjuringInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031BounceConjuringInfo.proto\"M\n\023BounceCon" +
      "juringInfo\022\"\n\032totalDestroyedMachineCount" +
      "\030\005 \001(\r\022\022\n\ntotalScore\030\004 \001(\rB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BounceConjuringInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BounceConjuringInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BounceConjuringInfo_descriptor,
        new java.lang.String[] { "TotalDestroyedMachineCount", "TotalScore", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
