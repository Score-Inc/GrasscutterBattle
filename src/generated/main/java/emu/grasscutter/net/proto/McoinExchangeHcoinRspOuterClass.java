// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: McoinExchangeHcoinRsp.proto

package emu.grasscutter.net.proto;

public final class McoinExchangeHcoinRspOuterClass {
  private McoinExchangeHcoinRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface McoinExchangeHcoinRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:McoinExchangeHcoinRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 MIBMBPJHBBM = 2;</code>
     * @return The mIBMBPJHBBM.
     */
    int getMIBMBPJHBBM();

    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 CALAJIHCLCF = 4;</code>
     * @return The cALAJIHCLCF.
     */
    int getCALAJIHCLCF();
  }
  /**
   * <pre>
   * Name: NBMNMAAOFAN
   * CmdId: 636
   * </pre>
   *
   * Protobuf type {@code McoinExchangeHcoinRsp}
   */
  public static final class McoinExchangeHcoinRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:McoinExchangeHcoinRsp)
      McoinExchangeHcoinRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use McoinExchangeHcoinRsp.newBuilder() to construct.
    private McoinExchangeHcoinRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private McoinExchangeHcoinRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new McoinExchangeHcoinRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.internal_static_McoinExchangeHcoinRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.internal_static_McoinExchangeHcoinRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp.class, emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp.Builder.class);
    }

    public static final int MIBMBPJHBBM_FIELD_NUMBER = 2;
    private int mIBMBPJHBBM_ = 0;
    /**
     * <code>uint32 MIBMBPJHBBM = 2;</code>
     * @return The mIBMBPJHBBM.
     */
    @java.lang.Override
    public int getMIBMBPJHBBM() {
      return mIBMBPJHBBM_;
    }

    public static final int RETCODE_FIELD_NUMBER = 15;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int CALAJIHCLCF_FIELD_NUMBER = 4;
    private int cALAJIHCLCF_ = 0;
    /**
     * <code>uint32 CALAJIHCLCF = 4;</code>
     * @return The cALAJIHCLCF.
     */
    @java.lang.Override
    public int getCALAJIHCLCF() {
      return cALAJIHCLCF_;
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
      if (mIBMBPJHBBM_ != 0) {
        output.writeUInt32(2, mIBMBPJHBBM_);
      }
      if (cALAJIHCLCF_ != 0) {
        output.writeUInt32(4, cALAJIHCLCF_);
      }
      if (retcode_ != 0) {
        output.writeInt32(15, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mIBMBPJHBBM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, mIBMBPJHBBM_);
      }
      if (cALAJIHCLCF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, cALAJIHCLCF_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(15, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp other = (emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp) obj;

      if (getMIBMBPJHBBM()
          != other.getMIBMBPJHBBM()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getCALAJIHCLCF()
          != other.getCALAJIHCLCF()) return false;
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
      hash = (37 * hash) + MIBMBPJHBBM_FIELD_NUMBER;
      hash = (53 * hash) + getMIBMBPJHBBM();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + CALAJIHCLCF_FIELD_NUMBER;
      hash = (53 * hash) + getCALAJIHCLCF();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp prototype) {
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
     * Name: NBMNMAAOFAN
     * CmdId: 636
     * </pre>
     *
     * Protobuf type {@code McoinExchangeHcoinRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:McoinExchangeHcoinRsp)
        emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.internal_static_McoinExchangeHcoinRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.internal_static_McoinExchangeHcoinRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp.class, emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp.newBuilder()
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
        mIBMBPJHBBM_ = 0;
        retcode_ = 0;
        cALAJIHCLCF_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.internal_static_McoinExchangeHcoinRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp build() {
        emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp buildPartial() {
        emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp result = new emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.mIBMBPJHBBM_ = mIBMBPJHBBM_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.cALAJIHCLCF_ = cALAJIHCLCF_;
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
        if (other instanceof emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp) {
          return mergeFrom((emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp other) {
        if (other == emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp.getDefaultInstance()) return this;
        if (other.getMIBMBPJHBBM() != 0) {
          setMIBMBPJHBBM(other.getMIBMBPJHBBM());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getCALAJIHCLCF() != 0) {
          setCALAJIHCLCF(other.getCALAJIHCLCF());
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
                mIBMBPJHBBM_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 16
              case 32: {
                cALAJIHCLCF_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 32
              case 120: {
                retcode_ = input.readInt32();
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

      private int mIBMBPJHBBM_ ;
      /**
       * <code>uint32 MIBMBPJHBBM = 2;</code>
       * @return The mIBMBPJHBBM.
       */
      @java.lang.Override
      public int getMIBMBPJHBBM() {
        return mIBMBPJHBBM_;
      }
      /**
       * <code>uint32 MIBMBPJHBBM = 2;</code>
       * @param value The mIBMBPJHBBM to set.
       * @return This builder for chaining.
       */
      public Builder setMIBMBPJHBBM(int value) {
        
        mIBMBPJHBBM_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 MIBMBPJHBBM = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMIBMBPJHBBM() {
        bitField0_ = (bitField0_ & ~0x00000001);
        mIBMBPJHBBM_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 15;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 15;</code>
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
       * <code>int32 retcode = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int cALAJIHCLCF_ ;
      /**
       * <code>uint32 CALAJIHCLCF = 4;</code>
       * @return The cALAJIHCLCF.
       */
      @java.lang.Override
      public int getCALAJIHCLCF() {
        return cALAJIHCLCF_;
      }
      /**
       * <code>uint32 CALAJIHCLCF = 4;</code>
       * @param value The cALAJIHCLCF to set.
       * @return This builder for chaining.
       */
      public Builder setCALAJIHCLCF(int value) {
        
        cALAJIHCLCF_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 CALAJIHCLCF = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearCALAJIHCLCF() {
        bitField0_ = (bitField0_ & ~0x00000004);
        cALAJIHCLCF_ = 0;
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


      // @@protoc_insertion_point(builder_scope:McoinExchangeHcoinRsp)
    }

    // @@protoc_insertion_point(class_scope:McoinExchangeHcoinRsp)
    private static final emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp();
    }

    public static emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<McoinExchangeHcoinRsp>
        PARSER = new com.google.protobuf.AbstractParser<McoinExchangeHcoinRsp>() {
      @java.lang.Override
      public McoinExchangeHcoinRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<McoinExchangeHcoinRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<McoinExchangeHcoinRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_McoinExchangeHcoinRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_McoinExchangeHcoinRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033McoinExchangeHcoinRsp.proto\"R\n\025McoinEx" +
      "changeHcoinRsp\022\023\n\013MIBMBPJHBBM\030\002 \001(\r\022\017\n\007r" +
      "etcode\030\017 \001(\005\022\023\n\013CALAJIHCLCF\030\004 \001(\rB\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_McoinExchangeHcoinRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_McoinExchangeHcoinRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_McoinExchangeHcoinRsp_descriptor,
        new java.lang.String[] { "MIBMBPJHBBM", "Retcode", "CALAJIHCLCF", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
