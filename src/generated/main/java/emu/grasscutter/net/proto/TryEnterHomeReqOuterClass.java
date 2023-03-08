// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TryEnterHomeReq.proto

package emu.grasscutter.net.proto;

public final class TryEnterHomeReqOuterClass {
  private TryEnterHomeReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TryEnterHomeReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TryEnterHomeReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 target_point = 15;</code>
     * @return The targetPoint.
     */
    int getTargetPoint();

    /**
     * <code>bool MPAJHMEOAPK = 1;</code>
     * @return The mPAJHMEOAPK.
     */
    boolean getMPAJHMEOAPK();

    /**
     * <code>uint32 target_uid = 8;</code>
     * @return The targetUid.
     */
    int getTargetUid();

    /**
     * <code>bool NBNNPNAGOEA = 7;</code>
     * @return The nBNNPNAGOEA.
     */
    boolean getNBNNPNAGOEA();
  }
  /**
   * <pre>
   * Name: JBKOBACLLKE
   * CmdId: 4729
   * </pre>
   *
   * Protobuf type {@code TryEnterHomeReq}
   */
  public static final class TryEnterHomeReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TryEnterHomeReq)
      TryEnterHomeReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TryEnterHomeReq.newBuilder() to construct.
    private TryEnterHomeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TryEnterHomeReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TryEnterHomeReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.internal_static_TryEnterHomeReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.internal_static_TryEnterHomeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.class, emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.Builder.class);
    }

    public static final int TARGET_POINT_FIELD_NUMBER = 15;
    private int targetPoint_ = 0;
    /**
     * <code>uint32 target_point = 15;</code>
     * @return The targetPoint.
     */
    @java.lang.Override
    public int getTargetPoint() {
      return targetPoint_;
    }

    public static final int MPAJHMEOAPK_FIELD_NUMBER = 1;
    private boolean mPAJHMEOAPK_ = false;
    /**
     * <code>bool MPAJHMEOAPK = 1;</code>
     * @return The mPAJHMEOAPK.
     */
    @java.lang.Override
    public boolean getMPAJHMEOAPK() {
      return mPAJHMEOAPK_;
    }

    public static final int TARGET_UID_FIELD_NUMBER = 8;
    private int targetUid_ = 0;
    /**
     * <code>uint32 target_uid = 8;</code>
     * @return The targetUid.
     */
    @java.lang.Override
    public int getTargetUid() {
      return targetUid_;
    }

    public static final int NBNNPNAGOEA_FIELD_NUMBER = 7;
    private boolean nBNNPNAGOEA_ = false;
    /**
     * <code>bool NBNNPNAGOEA = 7;</code>
     * @return The nBNNPNAGOEA.
     */
    @java.lang.Override
    public boolean getNBNNPNAGOEA() {
      return nBNNPNAGOEA_;
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
      if (mPAJHMEOAPK_ != false) {
        output.writeBool(1, mPAJHMEOAPK_);
      }
      if (nBNNPNAGOEA_ != false) {
        output.writeBool(7, nBNNPNAGOEA_);
      }
      if (targetUid_ != 0) {
        output.writeUInt32(8, targetUid_);
      }
      if (targetPoint_ != 0) {
        output.writeUInt32(15, targetPoint_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mPAJHMEOAPK_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, mPAJHMEOAPK_);
      }
      if (nBNNPNAGOEA_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, nBNNPNAGOEA_);
      }
      if (targetUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, targetUid_);
      }
      if (targetPoint_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, targetPoint_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq other = (emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq) obj;

      if (getTargetPoint()
          != other.getTargetPoint()) return false;
      if (getMPAJHMEOAPK()
          != other.getMPAJHMEOAPK()) return false;
      if (getTargetUid()
          != other.getTargetUid()) return false;
      if (getNBNNPNAGOEA()
          != other.getNBNNPNAGOEA()) return false;
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
      hash = (37 * hash) + TARGET_POINT_FIELD_NUMBER;
      hash = (53 * hash) + getTargetPoint();
      hash = (37 * hash) + MPAJHMEOAPK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getMPAJHMEOAPK());
      hash = (37 * hash) + TARGET_UID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetUid();
      hash = (37 * hash) + NBNNPNAGOEA_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getNBNNPNAGOEA());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq prototype) {
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
     * Name: JBKOBACLLKE
     * CmdId: 4729
     * </pre>
     *
     * Protobuf type {@code TryEnterHomeReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TryEnterHomeReq)
        emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.internal_static_TryEnterHomeReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.internal_static_TryEnterHomeReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.class, emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.newBuilder()
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
        targetPoint_ = 0;
        mPAJHMEOAPK_ = false;
        targetUid_ = 0;
        nBNNPNAGOEA_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.internal_static_TryEnterHomeReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq build() {
        emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq buildPartial() {
        emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq result = new emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.targetPoint_ = targetPoint_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.mPAJHMEOAPK_ = mPAJHMEOAPK_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.targetUid_ = targetUid_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.nBNNPNAGOEA_ = nBNNPNAGOEA_;
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
        if (other instanceof emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq) {
          return mergeFrom((emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq other) {
        if (other == emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.getDefaultInstance()) return this;
        if (other.getTargetPoint() != 0) {
          setTargetPoint(other.getTargetPoint());
        }
        if (other.getMPAJHMEOAPK() != false) {
          setMPAJHMEOAPK(other.getMPAJHMEOAPK());
        }
        if (other.getTargetUid() != 0) {
          setTargetUid(other.getTargetUid());
        }
        if (other.getNBNNPNAGOEA() != false) {
          setNBNNPNAGOEA(other.getNBNNPNAGOEA());
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
                mPAJHMEOAPK_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 8
              case 56: {
                nBNNPNAGOEA_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 56
              case 64: {
                targetUid_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 64
              case 120: {
                targetPoint_ = input.readUInt32();
                bitField0_ |= 0x00000001;
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

      private int targetPoint_ ;
      /**
       * <code>uint32 target_point = 15;</code>
       * @return The targetPoint.
       */
      @java.lang.Override
      public int getTargetPoint() {
        return targetPoint_;
      }
      /**
       * <code>uint32 target_point = 15;</code>
       * @param value The targetPoint to set.
       * @return This builder for chaining.
       */
      public Builder setTargetPoint(int value) {
        
        targetPoint_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_point = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetPoint() {
        bitField0_ = (bitField0_ & ~0x00000001);
        targetPoint_ = 0;
        onChanged();
        return this;
      }

      private boolean mPAJHMEOAPK_ ;
      /**
       * <code>bool MPAJHMEOAPK = 1;</code>
       * @return The mPAJHMEOAPK.
       */
      @java.lang.Override
      public boolean getMPAJHMEOAPK() {
        return mPAJHMEOAPK_;
      }
      /**
       * <code>bool MPAJHMEOAPK = 1;</code>
       * @param value The mPAJHMEOAPK to set.
       * @return This builder for chaining.
       */
      public Builder setMPAJHMEOAPK(boolean value) {
        
        mPAJHMEOAPK_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool MPAJHMEOAPK = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMPAJHMEOAPK() {
        bitField0_ = (bitField0_ & ~0x00000002);
        mPAJHMEOAPK_ = false;
        onChanged();
        return this;
      }

      private int targetUid_ ;
      /**
       * <code>uint32 target_uid = 8;</code>
       * @return The targetUid.
       */
      @java.lang.Override
      public int getTargetUid() {
        return targetUid_;
      }
      /**
       * <code>uint32 target_uid = 8;</code>
       * @param value The targetUid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetUid(int value) {
        
        targetUid_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_uid = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetUid() {
        bitField0_ = (bitField0_ & ~0x00000004);
        targetUid_ = 0;
        onChanged();
        return this;
      }

      private boolean nBNNPNAGOEA_ ;
      /**
       * <code>bool NBNNPNAGOEA = 7;</code>
       * @return The nBNNPNAGOEA.
       */
      @java.lang.Override
      public boolean getNBNNPNAGOEA() {
        return nBNNPNAGOEA_;
      }
      /**
       * <code>bool NBNNPNAGOEA = 7;</code>
       * @param value The nBNNPNAGOEA to set.
       * @return This builder for chaining.
       */
      public Builder setNBNNPNAGOEA(boolean value) {
        
        nBNNPNAGOEA_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>bool NBNNPNAGOEA = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearNBNNPNAGOEA() {
        bitField0_ = (bitField0_ & ~0x00000008);
        nBNNPNAGOEA_ = false;
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


      // @@protoc_insertion_point(builder_scope:TryEnterHomeReq)
    }

    // @@protoc_insertion_point(class_scope:TryEnterHomeReq)
    private static final emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq();
    }

    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TryEnterHomeReq>
        PARSER = new com.google.protobuf.AbstractParser<TryEnterHomeReq>() {
      @java.lang.Override
      public TryEnterHomeReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<TryEnterHomeReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TryEnterHomeReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TryEnterHomeReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TryEnterHomeReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025TryEnterHomeReq.proto\"e\n\017TryEnterHomeR" +
      "eq\022\024\n\014target_point\030\017 \001(\r\022\023\n\013MPAJHMEOAPK\030" +
      "\001 \001(\010\022\022\n\ntarget_uid\030\010 \001(\r\022\023\n\013NBNNPNAGOEA" +
      "\030\007 \001(\010B\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TryEnterHomeReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TryEnterHomeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TryEnterHomeReq_descriptor,
        new java.lang.String[] { "TargetPoint", "MPAJHMEOAPK", "TargetUid", "NBNNPNAGOEA", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
