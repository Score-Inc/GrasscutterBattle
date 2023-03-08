// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Vector3Int.proto

package emu.grasscutter.net.proto;

public final class Vector3IntOuterClass {
  private Vector3IntOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Vector3IntOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Vector3Int)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 x = 1;</code>
     * @return The x.
     */
    int getX();

    /**
     * <code>int32 y = 2;</code>
     * @return The y.
     */
    int getY();

    /**
     * <code>int32 z = 3;</code>
     * @return The z.
     */
    int getZ();
  }
  /**
   * <pre>
   * Name: HEJPIHANNLH
   * </pre>
   *
   * Protobuf type {@code Vector3Int}
   */
  public static final class Vector3Int extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Vector3Int)
      Vector3IntOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Vector3Int.newBuilder() to construct.
    private Vector3Int(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Vector3Int() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Vector3Int();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.Vector3IntOuterClass.internal_static_Vector3Int_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Vector3IntOuterClass.internal_static_Vector3Int_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int.class, emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int.Builder.class);
    }

    public static final int X_FIELD_NUMBER = 1;
    private int x_ = 0;
    /**
     * <code>int32 x = 1;</code>
     * @return The x.
     */
    @java.lang.Override
    public int getX() {
      return x_;
    }

    public static final int Y_FIELD_NUMBER = 2;
    private int y_ = 0;
    /**
     * <code>int32 y = 2;</code>
     * @return The y.
     */
    @java.lang.Override
    public int getY() {
      return y_;
    }

    public static final int Z_FIELD_NUMBER = 3;
    private int z_ = 0;
    /**
     * <code>int32 z = 3;</code>
     * @return The z.
     */
    @java.lang.Override
    public int getZ() {
      return z_;
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
      if (x_ != 0) {
        output.writeInt32(1, x_);
      }
      if (y_ != 0) {
        output.writeInt32(2, y_);
      }
      if (z_ != 0) {
        output.writeInt32(3, z_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (x_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, x_);
      }
      if (y_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, y_);
      }
      if (z_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, z_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int other = (emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int) obj;

      if (getX()
          != other.getX()) return false;
      if (getY()
          != other.getY()) return false;
      if (getZ()
          != other.getZ()) return false;
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
      hash = (37 * hash) + X_FIELD_NUMBER;
      hash = (53 * hash) + getX();
      hash = (37 * hash) + Y_FIELD_NUMBER;
      hash = (53 * hash) + getY();
      hash = (37 * hash) + Z_FIELD_NUMBER;
      hash = (53 * hash) + getZ();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int prototype) {
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
     * Name: HEJPIHANNLH
     * </pre>
     *
     * Protobuf type {@code Vector3Int}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Vector3Int)
        emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3IntOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Vector3IntOuterClass.internal_static_Vector3Int_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Vector3IntOuterClass.internal_static_Vector3Int_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int.class, emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int.newBuilder()
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
        x_ = 0;
        y_ = 0;
        z_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Vector3IntOuterClass.internal_static_Vector3Int_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int build() {
        emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int buildPartial() {
        emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int result = new emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.x_ = x_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.y_ = y_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.z_ = z_;
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
        if (other instanceof emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int) {
          return mergeFrom((emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int other) {
        if (other == emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int.getDefaultInstance()) return this;
        if (other.getX() != 0) {
          setX(other.getX());
        }
        if (other.getY() != 0) {
          setY(other.getY());
        }
        if (other.getZ() != 0) {
          setZ(other.getZ());
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
                x_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                y_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                z_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

      private int x_ ;
      /**
       * <code>int32 x = 1;</code>
       * @return The x.
       */
      @java.lang.Override
      public int getX() {
        return x_;
      }
      /**
       * <code>int32 x = 1;</code>
       * @param value The x to set.
       * @return This builder for chaining.
       */
      public Builder setX(int value) {
        
        x_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 x = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearX() {
        bitField0_ = (bitField0_ & ~0x00000001);
        x_ = 0;
        onChanged();
        return this;
      }

      private int y_ ;
      /**
       * <code>int32 y = 2;</code>
       * @return The y.
       */
      @java.lang.Override
      public int getY() {
        return y_;
      }
      /**
       * <code>int32 y = 2;</code>
       * @param value The y to set.
       * @return This builder for chaining.
       */
      public Builder setY(int value) {
        
        y_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int32 y = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearY() {
        bitField0_ = (bitField0_ & ~0x00000002);
        y_ = 0;
        onChanged();
        return this;
      }

      private int z_ ;
      /**
       * <code>int32 z = 3;</code>
       * @return The z.
       */
      @java.lang.Override
      public int getZ() {
        return z_;
      }
      /**
       * <code>int32 z = 3;</code>
       * @param value The z to set.
       * @return This builder for chaining.
       */
      public Builder setZ(int value) {
        
        z_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>int32 z = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearZ() {
        bitField0_ = (bitField0_ & ~0x00000004);
        z_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Vector3Int)
    }

    // @@protoc_insertion_point(class_scope:Vector3Int)
    private static final emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int();
    }

    public static emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Vector3Int>
        PARSER = new com.google.protobuf.AbstractParser<Vector3Int>() {
      @java.lang.Override
      public Vector3Int parsePartialFrom(
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

    public static com.google.protobuf.Parser<Vector3Int> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Vector3Int> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Vector3IntOuterClass.Vector3Int getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Vector3Int_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Vector3Int_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020Vector3Int.proto\"-\n\nVector3Int\022\t\n\001x\030\001 " +
      "\001(\005\022\t\n\001y\030\002 \001(\005\022\t\n\001z\030\003 \001(\005B\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Vector3Int_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Vector3Int_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Vector3Int_descriptor,
        new java.lang.String[] { "X", "Y", "Z", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
