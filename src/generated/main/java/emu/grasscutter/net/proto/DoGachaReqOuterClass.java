// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DoGachaReq.proto

package emu.grasscutter.net.proto;

public final class DoGachaReqOuterClass {
  private DoGachaReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DoGachaReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DoGachaReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gachaScheduleId = 3;</code>
     * @return The gachaScheduleId.
     */
    int getGachaScheduleId();

    /**
     * <code>uint32 gachaTimes = 6;</code>
     * @return The gachaTimes.
     */
    int getGachaTimes();

    /**
     * <code>uint32 gachaRandom = 12;</code>
     * @return The gachaRandom.
     */
    int getGachaRandom();

    /**
     * <code>uint32 gachaType = 5;</code>
     * @return The gachaType.
     */
    int getGachaType();

    /**
     * <code>string gacha_tag = 14;</code>
     * @return The gachaTag.
     */
    java.lang.String getGachaTag();
    /**
     * <code>string gacha_tag = 14;</code>
     * @return The bytes for gachaTag.
     */
    com.google.protobuf.ByteString
        getGachaTagBytes();
  }
  /**
   * <pre>
   * Name: KBMLDGNEKHA
   * CmdId: 1554
   * </pre>
   *
   * Protobuf type {@code DoGachaReq}
   */
  public static final class DoGachaReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DoGachaReq)
      DoGachaReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DoGachaReq.newBuilder() to construct.
    private DoGachaReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DoGachaReq() {
      gachaTag_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DoGachaReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.DoGachaReqOuterClass.internal_static_DoGachaReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DoGachaReqOuterClass.internal_static_DoGachaReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq.class, emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq.Builder.class);
    }

    public static final int GACHASCHEDULEID_FIELD_NUMBER = 3;
    private int gachaScheduleId_ = 0;
    /**
     * <code>uint32 gachaScheduleId = 3;</code>
     * @return The gachaScheduleId.
     */
    @java.lang.Override
    public int getGachaScheduleId() {
      return gachaScheduleId_;
    }

    public static final int GACHATIMES_FIELD_NUMBER = 6;
    private int gachaTimes_ = 0;
    /**
     * <code>uint32 gachaTimes = 6;</code>
     * @return The gachaTimes.
     */
    @java.lang.Override
    public int getGachaTimes() {
      return gachaTimes_;
    }

    public static final int GACHARANDOM_FIELD_NUMBER = 12;
    private int gachaRandom_ = 0;
    /**
     * <code>uint32 gachaRandom = 12;</code>
     * @return The gachaRandom.
     */
    @java.lang.Override
    public int getGachaRandom() {
      return gachaRandom_;
    }

    public static final int GACHATYPE_FIELD_NUMBER = 5;
    private int gachaType_ = 0;
    /**
     * <code>uint32 gachaType = 5;</code>
     * @return The gachaType.
     */
    @java.lang.Override
    public int getGachaType() {
      return gachaType_;
    }

    public static final int GACHA_TAG_FIELD_NUMBER = 14;
    @SuppressWarnings("serial")
    private volatile java.lang.Object gachaTag_ = "";
    /**
     * <code>string gacha_tag = 14;</code>
     * @return The gachaTag.
     */
    @java.lang.Override
    public java.lang.String getGachaTag() {
      java.lang.Object ref = gachaTag_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gachaTag_ = s;
        return s;
      }
    }
    /**
     * <code>string gacha_tag = 14;</code>
     * @return The bytes for gachaTag.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getGachaTagBytes() {
      java.lang.Object ref = gachaTag_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gachaTag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (gachaScheduleId_ != 0) {
        output.writeUInt32(3, gachaScheduleId_);
      }
      if (gachaType_ != 0) {
        output.writeUInt32(5, gachaType_);
      }
      if (gachaTimes_ != 0) {
        output.writeUInt32(6, gachaTimes_);
      }
      if (gachaRandom_ != 0) {
        output.writeUInt32(12, gachaRandom_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gachaTag_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 14, gachaTag_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (gachaScheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, gachaScheduleId_);
      }
      if (gachaType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, gachaType_);
      }
      if (gachaTimes_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, gachaTimes_);
      }
      if (gachaRandom_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, gachaRandom_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gachaTag_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(14, gachaTag_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq other = (emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq) obj;

      if (getGachaScheduleId()
          != other.getGachaScheduleId()) return false;
      if (getGachaTimes()
          != other.getGachaTimes()) return false;
      if (getGachaRandom()
          != other.getGachaRandom()) return false;
      if (getGachaType()
          != other.getGachaType()) return false;
      if (!getGachaTag()
          .equals(other.getGachaTag())) return false;
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
      hash = (37 * hash) + GACHASCHEDULEID_FIELD_NUMBER;
      hash = (53 * hash) + getGachaScheduleId();
      hash = (37 * hash) + GACHATIMES_FIELD_NUMBER;
      hash = (53 * hash) + getGachaTimes();
      hash = (37 * hash) + GACHARANDOM_FIELD_NUMBER;
      hash = (53 * hash) + getGachaRandom();
      hash = (37 * hash) + GACHATYPE_FIELD_NUMBER;
      hash = (53 * hash) + getGachaType();
      hash = (37 * hash) + GACHA_TAG_FIELD_NUMBER;
      hash = (53 * hash) + getGachaTag().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq prototype) {
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
     * Name: KBMLDGNEKHA
     * CmdId: 1554
     * </pre>
     *
     * Protobuf type {@code DoGachaReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DoGachaReq)
        emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DoGachaReqOuterClass.internal_static_DoGachaReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DoGachaReqOuterClass.internal_static_DoGachaReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq.class, emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq.newBuilder()
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
        gachaScheduleId_ = 0;
        gachaTimes_ = 0;
        gachaRandom_ = 0;
        gachaType_ = 0;
        gachaTag_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DoGachaReqOuterClass.internal_static_DoGachaReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq build() {
        emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq buildPartial() {
        emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq result = new emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.gachaScheduleId_ = gachaScheduleId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.gachaTimes_ = gachaTimes_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.gachaRandom_ = gachaRandom_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.gachaType_ = gachaType_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.gachaTag_ = gachaTag_;
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
        if (other instanceof emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq) {
          return mergeFrom((emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq other) {
        if (other == emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq.getDefaultInstance()) return this;
        if (other.getGachaScheduleId() != 0) {
          setGachaScheduleId(other.getGachaScheduleId());
        }
        if (other.getGachaTimes() != 0) {
          setGachaTimes(other.getGachaTimes());
        }
        if (other.getGachaRandom() != 0) {
          setGachaRandom(other.getGachaRandom());
        }
        if (other.getGachaType() != 0) {
          setGachaType(other.getGachaType());
        }
        if (!other.getGachaTag().isEmpty()) {
          gachaTag_ = other.gachaTag_;
          bitField0_ |= 0x00000010;
          onChanged();
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
                gachaScheduleId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 24
              case 40: {
                gachaType_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 40
              case 48: {
                gachaTimes_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 48
              case 96: {
                gachaRandom_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 96
              case 114: {
                gachaTag_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000010;
                break;
              } // case 114
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

      private int gachaScheduleId_ ;
      /**
       * <code>uint32 gachaScheduleId = 3;</code>
       * @return The gachaScheduleId.
       */
      @java.lang.Override
      public int getGachaScheduleId() {
        return gachaScheduleId_;
      }
      /**
       * <code>uint32 gachaScheduleId = 3;</code>
       * @param value The gachaScheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setGachaScheduleId(int value) {
        
        gachaScheduleId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gachaScheduleId = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearGachaScheduleId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        gachaScheduleId_ = 0;
        onChanged();
        return this;
      }

      private int gachaTimes_ ;
      /**
       * <code>uint32 gachaTimes = 6;</code>
       * @return The gachaTimes.
       */
      @java.lang.Override
      public int getGachaTimes() {
        return gachaTimes_;
      }
      /**
       * <code>uint32 gachaTimes = 6;</code>
       * @param value The gachaTimes to set.
       * @return This builder for chaining.
       */
      public Builder setGachaTimes(int value) {
        
        gachaTimes_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gachaTimes = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearGachaTimes() {
        bitField0_ = (bitField0_ & ~0x00000002);
        gachaTimes_ = 0;
        onChanged();
        return this;
      }

      private int gachaRandom_ ;
      /**
       * <code>uint32 gachaRandom = 12;</code>
       * @return The gachaRandom.
       */
      @java.lang.Override
      public int getGachaRandom() {
        return gachaRandom_;
      }
      /**
       * <code>uint32 gachaRandom = 12;</code>
       * @param value The gachaRandom to set.
       * @return This builder for chaining.
       */
      public Builder setGachaRandom(int value) {
        
        gachaRandom_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gachaRandom = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearGachaRandom() {
        bitField0_ = (bitField0_ & ~0x00000004);
        gachaRandom_ = 0;
        onChanged();
        return this;
      }

      private int gachaType_ ;
      /**
       * <code>uint32 gachaType = 5;</code>
       * @return The gachaType.
       */
      @java.lang.Override
      public int getGachaType() {
        return gachaType_;
      }
      /**
       * <code>uint32 gachaType = 5;</code>
       * @param value The gachaType to set.
       * @return This builder for chaining.
       */
      public Builder setGachaType(int value) {
        
        gachaType_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gachaType = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearGachaType() {
        bitField0_ = (bitField0_ & ~0x00000008);
        gachaType_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object gachaTag_ = "";
      /**
       * <code>string gacha_tag = 14;</code>
       * @return The gachaTag.
       */
      public java.lang.String getGachaTag() {
        java.lang.Object ref = gachaTag_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          gachaTag_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string gacha_tag = 14;</code>
       * @return The bytes for gachaTag.
       */
      public com.google.protobuf.ByteString
          getGachaTagBytes() {
        java.lang.Object ref = gachaTag_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          gachaTag_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string gacha_tag = 14;</code>
       * @param value The gachaTag to set.
       * @return This builder for chaining.
       */
      public Builder setGachaTag(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        gachaTag_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>string gacha_tag = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearGachaTag() {
        gachaTag_ = getDefaultInstance().getGachaTag();
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
        return this;
      }
      /**
       * <code>string gacha_tag = 14;</code>
       * @param value The bytes for gachaTag to set.
       * @return This builder for chaining.
       */
      public Builder setGachaTagBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        gachaTag_ = value;
        bitField0_ |= 0x00000010;
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


      // @@protoc_insertion_point(builder_scope:DoGachaReq)
    }

    // @@protoc_insertion_point(class_scope:DoGachaReq)
    private static final emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq();
    }

    public static emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DoGachaReq>
        PARSER = new com.google.protobuf.AbstractParser<DoGachaReq>() {
      @java.lang.Override
      public DoGachaReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<DoGachaReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DoGachaReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DoGachaReqOuterClass.DoGachaReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DoGachaReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DoGachaReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020DoGachaReq.proto\"t\n\nDoGachaReq\022\027\n\017gach" +
      "aScheduleId\030\003 \001(\r\022\022\n\ngachaTimes\030\006 \001(\r\022\023\n" +
      "\013gachaRandom\030\014 \001(\r\022\021\n\tgachaType\030\005 \001(\r\022\021\n" +
      "\tgacha_tag\030\016 \001(\tB\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DoGachaReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DoGachaReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DoGachaReq_descriptor,
        new java.lang.String[] { "GachaScheduleId", "GachaTimes", "GachaRandom", "GachaType", "GachaTag", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}