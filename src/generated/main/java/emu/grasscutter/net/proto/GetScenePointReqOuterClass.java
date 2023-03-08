// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetScenePointReq.proto

package emu.grasscutter.net.proto;

public final class GetScenePointReqOuterClass {
  private GetScenePointReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetScenePointReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetScenePointReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 scene_id = 9;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>bool PGBKOMBKBKG = 1;</code>
     * @return The pGBKOMBKBKG.
     */
    boolean getPGBKOMBKBKG();

    /**
     * <code>uint32 belong_uid = 3;</code>
     * @return The belongUid.
     */
    int getBelongUid();
  }
  /**
   * <pre>
   * Name: NGFIIOEAKAD
   * CmdId: 242
   * </pre>
   *
   * Protobuf type {@code GetScenePointReq}
   */
  public static final class GetScenePointReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetScenePointReq)
      GetScenePointReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetScenePointReq.newBuilder() to construct.
    private GetScenePointReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetScenePointReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetScenePointReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetScenePointReqOuterClass.internal_static_GetScenePointReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetScenePointReqOuterClass.internal_static_GetScenePointReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq.class, emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq.Builder.class);
    }

    public static final int SCENE_ID_FIELD_NUMBER = 9;
    private int sceneId_ = 0;
    /**
     * <code>uint32 scene_id = 9;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int PGBKOMBKBKG_FIELD_NUMBER = 1;
    private boolean pGBKOMBKBKG_ = false;
    /**
     * <code>bool PGBKOMBKBKG = 1;</code>
     * @return The pGBKOMBKBKG.
     */
    @java.lang.Override
    public boolean getPGBKOMBKBKG() {
      return pGBKOMBKBKG_;
    }

    public static final int BELONG_UID_FIELD_NUMBER = 3;
    private int belongUid_ = 0;
    /**
     * <code>uint32 belong_uid = 3;</code>
     * @return The belongUid.
     */
    @java.lang.Override
    public int getBelongUid() {
      return belongUid_;
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
      if (pGBKOMBKBKG_ != false) {
        output.writeBool(1, pGBKOMBKBKG_);
      }
      if (belongUid_ != 0) {
        output.writeUInt32(3, belongUid_);
      }
      if (sceneId_ != 0) {
        output.writeUInt32(9, sceneId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (pGBKOMBKBKG_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, pGBKOMBKBKG_);
      }
      if (belongUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, belongUid_);
      }
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, sceneId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq other = (emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq) obj;

      if (getSceneId()
          != other.getSceneId()) return false;
      if (getPGBKOMBKBKG()
          != other.getPGBKOMBKBKG()) return false;
      if (getBelongUid()
          != other.getBelongUid()) return false;
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
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (37 * hash) + PGBKOMBKBKG_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getPGBKOMBKBKG());
      hash = (37 * hash) + BELONG_UID_FIELD_NUMBER;
      hash = (53 * hash) + getBelongUid();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq prototype) {
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
     * Name: NGFIIOEAKAD
     * CmdId: 242
     * </pre>
     *
     * Protobuf type {@code GetScenePointReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetScenePointReq)
        emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetScenePointReqOuterClass.internal_static_GetScenePointReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetScenePointReqOuterClass.internal_static_GetScenePointReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq.class, emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq.newBuilder()
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
        sceneId_ = 0;
        pGBKOMBKBKG_ = false;
        belongUid_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetScenePointReqOuterClass.internal_static_GetScenePointReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq build() {
        emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq buildPartial() {
        emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq result = new emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.sceneId_ = sceneId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.pGBKOMBKBKG_ = pGBKOMBKBKG_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.belongUid_ = belongUid_;
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
        if (other instanceof emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq) {
          return mergeFrom((emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq other) {
        if (other == emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq.getDefaultInstance()) return this;
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (other.getPGBKOMBKBKG() != false) {
          setPGBKOMBKBKG(other.getPGBKOMBKBKG());
        }
        if (other.getBelongUid() != 0) {
          setBelongUid(other.getBelongUid());
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
                pGBKOMBKBKG_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 8
              case 24: {
                belongUid_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 72: {
                sceneId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 72
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

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 9;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 9;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private boolean pGBKOMBKBKG_ ;
      /**
       * <code>bool PGBKOMBKBKG = 1;</code>
       * @return The pGBKOMBKBKG.
       */
      @java.lang.Override
      public boolean getPGBKOMBKBKG() {
        return pGBKOMBKBKG_;
      }
      /**
       * <code>bool PGBKOMBKBKG = 1;</code>
       * @param value The pGBKOMBKBKG to set.
       * @return This builder for chaining.
       */
      public Builder setPGBKOMBKBKG(boolean value) {
        
        pGBKOMBKBKG_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool PGBKOMBKBKG = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPGBKOMBKBKG() {
        bitField0_ = (bitField0_ & ~0x00000002);
        pGBKOMBKBKG_ = false;
        onChanged();
        return this;
      }

      private int belongUid_ ;
      /**
       * <code>uint32 belong_uid = 3;</code>
       * @return The belongUid.
       */
      @java.lang.Override
      public int getBelongUid() {
        return belongUid_;
      }
      /**
       * <code>uint32 belong_uid = 3;</code>
       * @param value The belongUid to set.
       * @return This builder for chaining.
       */
      public Builder setBelongUid(int value) {
        
        belongUid_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 belong_uid = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearBelongUid() {
        bitField0_ = (bitField0_ & ~0x00000004);
        belongUid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GetScenePointReq)
    }

    // @@protoc_insertion_point(class_scope:GetScenePointReq)
    private static final emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq();
    }

    public static emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetScenePointReq>
        PARSER = new com.google.protobuf.AbstractParser<GetScenePointReq>() {
      @java.lang.Override
      public GetScenePointReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetScenePointReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetScenePointReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetScenePointReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetScenePointReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026GetScenePointReq.proto\"M\n\020GetScenePoin" +
      "tReq\022\020\n\010scene_id\030\t \001(\r\022\023\n\013PGBKOMBKBKG\030\001 " +
      "\001(\010\022\022\n\nbelong_uid\030\003 \001(\rB\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetScenePointReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetScenePointReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetScenePointReq_descriptor,
        new java.lang.String[] { "SceneId", "PGBKOMBKBKG", "BelongUid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
