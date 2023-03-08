// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UnlockPersonalLineRsp.proto

package emu.grasscutter.net.proto;

public final class UnlockPersonalLineRspOuterClass {
  private UnlockPersonalLineRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UnlockPersonalLineRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UnlockPersonalLineRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 personal_line_id = 5;</code>
     * @return The personalLineId.
     */
    int getPersonalLineId();

    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 level = 1;</code>
     * @return Whether the level field is set.
     */
    boolean hasLevel();
    /**
     * <code>uint32 level = 1;</code>
     * @return The level.
     */
    int getLevel();

    /**
     * <code>uint32 chapter_id = 6;</code>
     * @return Whether the chapterId field is set.
     */
    boolean hasChapterId();
    /**
     * <code>uint32 chapter_id = 6;</code>
     * @return The chapterId.
     */
    int getChapterId();

    public emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp.ParamCase getParamCase();
  }
  /**
   * <pre>
   * Name: IFBACLBBNBH
   * CmdId: 471
   * </pre>
   *
   * Protobuf type {@code UnlockPersonalLineRsp}
   */
  public static final class UnlockPersonalLineRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UnlockPersonalLineRsp)
      UnlockPersonalLineRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UnlockPersonalLineRsp.newBuilder() to construct.
    private UnlockPersonalLineRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UnlockPersonalLineRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UnlockPersonalLineRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.internal_static_UnlockPersonalLineRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.internal_static_UnlockPersonalLineRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp.class, emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp.Builder.class);
    }

    private int paramCase_ = 0;
    private java.lang.Object param_;
    public enum ParamCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      LEVEL(1),
      CHAPTER_ID(6),
      PARAM_NOT_SET(0);
      private final int value;
      private ParamCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static ParamCase valueOf(int value) {
        return forNumber(value);
      }

      public static ParamCase forNumber(int value) {
        switch (value) {
          case 1: return LEVEL;
          case 6: return CHAPTER_ID;
          case 0: return PARAM_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public ParamCase
    getParamCase() {
      return ParamCase.forNumber(
          paramCase_);
    }

    public static final int PERSONAL_LINE_ID_FIELD_NUMBER = 5;
    private int personalLineId_ = 0;
    /**
     * <code>uint32 personal_line_id = 5;</code>
     * @return The personalLineId.
     */
    @java.lang.Override
    public int getPersonalLineId() {
      return personalLineId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 2;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int LEVEL_FIELD_NUMBER = 1;
    /**
     * <code>uint32 level = 1;</code>
     * @return Whether the level field is set.
     */
    @java.lang.Override
    public boolean hasLevel() {
      return paramCase_ == 1;
    }
    /**
     * <code>uint32 level = 1;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      if (paramCase_ == 1) {
        return (java.lang.Integer) param_;
      }
      return 0;
    }

    public static final int CHAPTER_ID_FIELD_NUMBER = 6;
    /**
     * <code>uint32 chapter_id = 6;</code>
     * @return Whether the chapterId field is set.
     */
    @java.lang.Override
    public boolean hasChapterId() {
      return paramCase_ == 6;
    }
    /**
     * <code>uint32 chapter_id = 6;</code>
     * @return The chapterId.
     */
    @java.lang.Override
    public int getChapterId() {
      if (paramCase_ == 6) {
        return (java.lang.Integer) param_;
      }
      return 0;
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
      if (paramCase_ == 1) {
        output.writeUInt32(
            1, (int)((java.lang.Integer) param_));
      }
      if (retcode_ != 0) {
        output.writeInt32(2, retcode_);
      }
      if (personalLineId_ != 0) {
        output.writeUInt32(5, personalLineId_);
      }
      if (paramCase_ == 6) {
        output.writeUInt32(
            6, (int)((java.lang.Integer) param_));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (paramCase_ == 1) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(
              1, (int)((java.lang.Integer) param_));
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, retcode_);
      }
      if (personalLineId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, personalLineId_);
      }
      if (paramCase_ == 6) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(
              6, (int)((java.lang.Integer) param_));
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
      if (!(obj instanceof emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp other = (emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp) obj;

      if (getPersonalLineId()
          != other.getPersonalLineId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getParamCase().equals(other.getParamCase())) return false;
      switch (paramCase_) {
        case 1:
          if (getLevel()
              != other.getLevel()) return false;
          break;
        case 6:
          if (getChapterId()
              != other.getChapterId()) return false;
          break;
        case 0:
        default:
      }
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
      hash = (37 * hash) + PERSONAL_LINE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPersonalLineId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      switch (paramCase_) {
        case 1:
          hash = (37 * hash) + LEVEL_FIELD_NUMBER;
          hash = (53 * hash) + getLevel();
          break;
        case 6:
          hash = (37 * hash) + CHAPTER_ID_FIELD_NUMBER;
          hash = (53 * hash) + getChapterId();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp prototype) {
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
     * Name: IFBACLBBNBH
     * CmdId: 471
     * </pre>
     *
     * Protobuf type {@code UnlockPersonalLineRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UnlockPersonalLineRsp)
        emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.internal_static_UnlockPersonalLineRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.internal_static_UnlockPersonalLineRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp.class, emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp.newBuilder()
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
        personalLineId_ = 0;
        retcode_ = 0;
        paramCase_ = 0;
        param_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.internal_static_UnlockPersonalLineRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp build() {
        emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp buildPartial() {
        emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp result = new emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        buildPartialOneofs(result);
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.personalLineId_ = personalLineId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.retcode_ = retcode_;
        }
      }

      private void buildPartialOneofs(emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp result) {
        result.paramCase_ = paramCase_;
        result.param_ = this.param_;
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
        if (other instanceof emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp) {
          return mergeFrom((emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp other) {
        if (other == emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp.getDefaultInstance()) return this;
        if (other.getPersonalLineId() != 0) {
          setPersonalLineId(other.getPersonalLineId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        switch (other.getParamCase()) {
          case LEVEL: {
            setLevel(other.getLevel());
            break;
          }
          case CHAPTER_ID: {
            setChapterId(other.getChapterId());
            break;
          }
          case PARAM_NOT_SET: {
            break;
          }
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
                param_ = input.readUInt32();
                paramCase_ = 1;
                break;
              } // case 8
              case 16: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 40: {
                personalLineId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 40
              case 48: {
                param_ = input.readUInt32();
                paramCase_ = 6;
                break;
              } // case 48
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
      private int paramCase_ = 0;
      private java.lang.Object param_;
      public ParamCase
          getParamCase() {
        return ParamCase.forNumber(
            paramCase_);
      }

      public Builder clearParam() {
        paramCase_ = 0;
        param_ = null;
        onChanged();
        return this;
      }

      private int bitField0_;

      private int personalLineId_ ;
      /**
       * <code>uint32 personal_line_id = 5;</code>
       * @return The personalLineId.
       */
      @java.lang.Override
      public int getPersonalLineId() {
        return personalLineId_;
      }
      /**
       * <code>uint32 personal_line_id = 5;</code>
       * @param value The personalLineId to set.
       * @return This builder for chaining.
       */
      public Builder setPersonalLineId(int value) {
        
        personalLineId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 personal_line_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearPersonalLineId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        personalLineId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 2;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        retcode_ = 0;
        onChanged();
        return this;
      }

      /**
       * <code>uint32 level = 1;</code>
       * @return Whether the level field is set.
       */
      public boolean hasLevel() {
        return paramCase_ == 1;
      }
      /**
       * <code>uint32 level = 1;</code>
       * @return The level.
       */
      public int getLevel() {
        if (paramCase_ == 1) {
          return (java.lang.Integer) param_;
        }
        return 0;
      }
      /**
       * <code>uint32 level = 1;</code>
       * @param value The level to set.
       * @return This builder for chaining.
       */
      public Builder setLevel(int value) {
        
        paramCase_ = 1;
        param_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevel() {
        if (paramCase_ == 1) {
          paramCase_ = 0;
          param_ = null;
          onChanged();
        }
        return this;
      }

      /**
       * <code>uint32 chapter_id = 6;</code>
       * @return Whether the chapterId field is set.
       */
      public boolean hasChapterId() {
        return paramCase_ == 6;
      }
      /**
       * <code>uint32 chapter_id = 6;</code>
       * @return The chapterId.
       */
      public int getChapterId() {
        if (paramCase_ == 6) {
          return (java.lang.Integer) param_;
        }
        return 0;
      }
      /**
       * <code>uint32 chapter_id = 6;</code>
       * @param value The chapterId to set.
       * @return This builder for chaining.
       */
      public Builder setChapterId(int value) {
        
        paramCase_ = 6;
        param_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 chapter_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearChapterId() {
        if (paramCase_ == 6) {
          paramCase_ = 0;
          param_ = null;
          onChanged();
        }
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


      // @@protoc_insertion_point(builder_scope:UnlockPersonalLineRsp)
    }

    // @@protoc_insertion_point(class_scope:UnlockPersonalLineRsp)
    private static final emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp();
    }

    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UnlockPersonalLineRsp>
        PARSER = new com.google.protobuf.AbstractParser<UnlockPersonalLineRsp>() {
      @java.lang.Override
      public UnlockPersonalLineRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<UnlockPersonalLineRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UnlockPersonalLineRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UnlockPersonalLineRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UnlockPersonalLineRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033UnlockPersonalLineRsp.proto\"r\n\025UnlockP" +
      "ersonalLineRsp\022\030\n\020personal_line_id\030\005 \001(\r" +
      "\022\017\n\007retcode\030\002 \001(\005\022\017\n\005level\030\001 \001(\rH\000\022\024\n\nch" +
      "apter_id\030\006 \001(\rH\000B\007\n\005paramB\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UnlockPersonalLineRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UnlockPersonalLineRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UnlockPersonalLineRsp_descriptor,
        new java.lang.String[] { "PersonalLineId", "Retcode", "Level", "ChapterId", "Param", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}