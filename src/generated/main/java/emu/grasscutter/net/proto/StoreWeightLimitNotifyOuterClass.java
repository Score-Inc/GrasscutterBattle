// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StoreWeightLimitNotify.proto

package emu.grasscutter.net.proto;

public final class StoreWeightLimitNotifyOuterClass {
  private StoreWeightLimitNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StoreWeightLimitNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:StoreWeightLimitNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.StoreType store_type = 15;</code>
     * @return The enum numeric value on the wire for storeType.
     */
    int getStoreTypeValue();
    /**
     * <code>.StoreType store_type = 15;</code>
     * @return The storeType.
     */
    emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType getStoreType();

    /**
     * <code>uint32 weight_limit = 6;</code>
     * @return The weightLimit.
     */
    int getWeightLimit();

    /**
     * <code>uint32 reliquary_count_limit = 2;</code>
     * @return The reliquaryCountLimit.
     */
    int getReliquaryCountLimit();

    /**
     * <code>uint32 material_count_limit = 10;</code>
     * @return The materialCountLimit.
     */
    int getMaterialCountLimit();

    /**
     * <code>uint32 furniture_count_limit = 8;</code>
     * @return The furnitureCountLimit.
     */
    int getFurnitureCountLimit();

    /**
     * <code>uint32 weapon_count_limit = 13;</code>
     * @return The weaponCountLimit.
     */
    int getWeaponCountLimit();
  }
  /**
   * <pre>
   * Name: CJBHIOLLMHI
   * CmdId: 675
   * </pre>
   *
   * Protobuf type {@code StoreWeightLimitNotify}
   */
  public static final class StoreWeightLimitNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:StoreWeightLimitNotify)
      StoreWeightLimitNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StoreWeightLimitNotify.newBuilder() to construct.
    private StoreWeightLimitNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StoreWeightLimitNotify() {
      storeType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new StoreWeightLimitNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.internal_static_StoreWeightLimitNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.internal_static_StoreWeightLimitNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify.class, emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify.Builder.class);
    }

    public static final int STORE_TYPE_FIELD_NUMBER = 15;
    private int storeType_ = 0;
    /**
     * <code>.StoreType store_type = 15;</code>
     * @return The enum numeric value on the wire for storeType.
     */
    @java.lang.Override public int getStoreTypeValue() {
      return storeType_;
    }
    /**
     * <code>.StoreType store_type = 15;</code>
     * @return The storeType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType getStoreType() {
      emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType result = emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType.forNumber(storeType_);
      return result == null ? emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType.UNRECOGNIZED : result;
    }

    public static final int WEIGHT_LIMIT_FIELD_NUMBER = 6;
    private int weightLimit_ = 0;
    /**
     * <code>uint32 weight_limit = 6;</code>
     * @return The weightLimit.
     */
    @java.lang.Override
    public int getWeightLimit() {
      return weightLimit_;
    }

    public static final int RELIQUARY_COUNT_LIMIT_FIELD_NUMBER = 2;
    private int reliquaryCountLimit_ = 0;
    /**
     * <code>uint32 reliquary_count_limit = 2;</code>
     * @return The reliquaryCountLimit.
     */
    @java.lang.Override
    public int getReliquaryCountLimit() {
      return reliquaryCountLimit_;
    }

    public static final int MATERIAL_COUNT_LIMIT_FIELD_NUMBER = 10;
    private int materialCountLimit_ = 0;
    /**
     * <code>uint32 material_count_limit = 10;</code>
     * @return The materialCountLimit.
     */
    @java.lang.Override
    public int getMaterialCountLimit() {
      return materialCountLimit_;
    }

    public static final int FURNITURE_COUNT_LIMIT_FIELD_NUMBER = 8;
    private int furnitureCountLimit_ = 0;
    /**
     * <code>uint32 furniture_count_limit = 8;</code>
     * @return The furnitureCountLimit.
     */
    @java.lang.Override
    public int getFurnitureCountLimit() {
      return furnitureCountLimit_;
    }

    public static final int WEAPON_COUNT_LIMIT_FIELD_NUMBER = 13;
    private int weaponCountLimit_ = 0;
    /**
     * <code>uint32 weapon_count_limit = 13;</code>
     * @return The weaponCountLimit.
     */
    @java.lang.Override
    public int getWeaponCountLimit() {
      return weaponCountLimit_;
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
      if (reliquaryCountLimit_ != 0) {
        output.writeUInt32(2, reliquaryCountLimit_);
      }
      if (weightLimit_ != 0) {
        output.writeUInt32(6, weightLimit_);
      }
      if (furnitureCountLimit_ != 0) {
        output.writeUInt32(8, furnitureCountLimit_);
      }
      if (materialCountLimit_ != 0) {
        output.writeUInt32(10, materialCountLimit_);
      }
      if (weaponCountLimit_ != 0) {
        output.writeUInt32(13, weaponCountLimit_);
      }
      if (storeType_ != emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType.STORE_TYPE_NONE.getNumber()) {
        output.writeEnum(15, storeType_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reliquaryCountLimit_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, reliquaryCountLimit_);
      }
      if (weightLimit_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, weightLimit_);
      }
      if (furnitureCountLimit_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, furnitureCountLimit_);
      }
      if (materialCountLimit_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, materialCountLimit_);
      }
      if (weaponCountLimit_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, weaponCountLimit_);
      }
      if (storeType_ != emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType.STORE_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(15, storeType_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify other = (emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify) obj;

      if (storeType_ != other.storeType_) return false;
      if (getWeightLimit()
          != other.getWeightLimit()) return false;
      if (getReliquaryCountLimit()
          != other.getReliquaryCountLimit()) return false;
      if (getMaterialCountLimit()
          != other.getMaterialCountLimit()) return false;
      if (getFurnitureCountLimit()
          != other.getFurnitureCountLimit()) return false;
      if (getWeaponCountLimit()
          != other.getWeaponCountLimit()) return false;
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
      hash = (37 * hash) + STORE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + storeType_;
      hash = (37 * hash) + WEIGHT_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getWeightLimit();
      hash = (37 * hash) + RELIQUARY_COUNT_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getReliquaryCountLimit();
      hash = (37 * hash) + MATERIAL_COUNT_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getMaterialCountLimit();
      hash = (37 * hash) + FURNITURE_COUNT_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getFurnitureCountLimit();
      hash = (37 * hash) + WEAPON_COUNT_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getWeaponCountLimit();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify prototype) {
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
     * Name: CJBHIOLLMHI
     * CmdId: 675
     * </pre>
     *
     * Protobuf type {@code StoreWeightLimitNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:StoreWeightLimitNotify)
        emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.internal_static_StoreWeightLimitNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.internal_static_StoreWeightLimitNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify.class, emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify.newBuilder()
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
        storeType_ = 0;
        weightLimit_ = 0;
        reliquaryCountLimit_ = 0;
        materialCountLimit_ = 0;
        furnitureCountLimit_ = 0;
        weaponCountLimit_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.internal_static_StoreWeightLimitNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify build() {
        emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify buildPartial() {
        emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify result = new emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.storeType_ = storeType_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.weightLimit_ = weightLimit_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.reliquaryCountLimit_ = reliquaryCountLimit_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.materialCountLimit_ = materialCountLimit_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.furnitureCountLimit_ = furnitureCountLimit_;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.weaponCountLimit_ = weaponCountLimit_;
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
        if (other instanceof emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify) {
          return mergeFrom((emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify other) {
        if (other == emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify.getDefaultInstance()) return this;
        if (other.storeType_ != 0) {
          setStoreTypeValue(other.getStoreTypeValue());
        }
        if (other.getWeightLimit() != 0) {
          setWeightLimit(other.getWeightLimit());
        }
        if (other.getReliquaryCountLimit() != 0) {
          setReliquaryCountLimit(other.getReliquaryCountLimit());
        }
        if (other.getMaterialCountLimit() != 0) {
          setMaterialCountLimit(other.getMaterialCountLimit());
        }
        if (other.getFurnitureCountLimit() != 0) {
          setFurnitureCountLimit(other.getFurnitureCountLimit());
        }
        if (other.getWeaponCountLimit() != 0) {
          setWeaponCountLimit(other.getWeaponCountLimit());
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
                reliquaryCountLimit_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 16
              case 48: {
                weightLimit_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 48
              case 64: {
                furnitureCountLimit_ = input.readUInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 64
              case 80: {
                materialCountLimit_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 80
              case 104: {
                weaponCountLimit_ = input.readUInt32();
                bitField0_ |= 0x00000020;
                break;
              } // case 104
              case 120: {
                storeType_ = input.readEnum();
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

      private int storeType_ = 0;
      /**
       * <code>.StoreType store_type = 15;</code>
       * @return The enum numeric value on the wire for storeType.
       */
      @java.lang.Override public int getStoreTypeValue() {
        return storeType_;
      }
      /**
       * <code>.StoreType store_type = 15;</code>
       * @param value The enum numeric value on the wire for storeType to set.
       * @return This builder for chaining.
       */
      public Builder setStoreTypeValue(int value) {
        storeType_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.StoreType store_type = 15;</code>
       * @return The storeType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType getStoreType() {
        emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType result = emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType.forNumber(storeType_);
        return result == null ? emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType.UNRECOGNIZED : result;
      }
      /**
       * <code>.StoreType store_type = 15;</code>
       * @param value The storeType to set.
       * @return This builder for chaining.
       */
      public Builder setStoreType(emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        storeType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.StoreType store_type = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearStoreType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        storeType_ = 0;
        onChanged();
        return this;
      }

      private int weightLimit_ ;
      /**
       * <code>uint32 weight_limit = 6;</code>
       * @return The weightLimit.
       */
      @java.lang.Override
      public int getWeightLimit() {
        return weightLimit_;
      }
      /**
       * <code>uint32 weight_limit = 6;</code>
       * @param value The weightLimit to set.
       * @return This builder for chaining.
       */
      public Builder setWeightLimit(int value) {
        
        weightLimit_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 weight_limit = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearWeightLimit() {
        bitField0_ = (bitField0_ & ~0x00000002);
        weightLimit_ = 0;
        onChanged();
        return this;
      }

      private int reliquaryCountLimit_ ;
      /**
       * <code>uint32 reliquary_count_limit = 2;</code>
       * @return The reliquaryCountLimit.
       */
      @java.lang.Override
      public int getReliquaryCountLimit() {
        return reliquaryCountLimit_;
      }
      /**
       * <code>uint32 reliquary_count_limit = 2;</code>
       * @param value The reliquaryCountLimit to set.
       * @return This builder for chaining.
       */
      public Builder setReliquaryCountLimit(int value) {
        
        reliquaryCountLimit_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 reliquary_count_limit = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearReliquaryCountLimit() {
        bitField0_ = (bitField0_ & ~0x00000004);
        reliquaryCountLimit_ = 0;
        onChanged();
        return this;
      }

      private int materialCountLimit_ ;
      /**
       * <code>uint32 material_count_limit = 10;</code>
       * @return The materialCountLimit.
       */
      @java.lang.Override
      public int getMaterialCountLimit() {
        return materialCountLimit_;
      }
      /**
       * <code>uint32 material_count_limit = 10;</code>
       * @param value The materialCountLimit to set.
       * @return This builder for chaining.
       */
      public Builder setMaterialCountLimit(int value) {
        
        materialCountLimit_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 material_count_limit = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaterialCountLimit() {
        bitField0_ = (bitField0_ & ~0x00000008);
        materialCountLimit_ = 0;
        onChanged();
        return this;
      }

      private int furnitureCountLimit_ ;
      /**
       * <code>uint32 furniture_count_limit = 8;</code>
       * @return The furnitureCountLimit.
       */
      @java.lang.Override
      public int getFurnitureCountLimit() {
        return furnitureCountLimit_;
      }
      /**
       * <code>uint32 furniture_count_limit = 8;</code>
       * @param value The furnitureCountLimit to set.
       * @return This builder for chaining.
       */
      public Builder setFurnitureCountLimit(int value) {
        
        furnitureCountLimit_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 furniture_count_limit = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearFurnitureCountLimit() {
        bitField0_ = (bitField0_ & ~0x00000010);
        furnitureCountLimit_ = 0;
        onChanged();
        return this;
      }

      private int weaponCountLimit_ ;
      /**
       * <code>uint32 weapon_count_limit = 13;</code>
       * @return The weaponCountLimit.
       */
      @java.lang.Override
      public int getWeaponCountLimit() {
        return weaponCountLimit_;
      }
      /**
       * <code>uint32 weapon_count_limit = 13;</code>
       * @param value The weaponCountLimit to set.
       * @return This builder for chaining.
       */
      public Builder setWeaponCountLimit(int value) {
        
        weaponCountLimit_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 weapon_count_limit = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearWeaponCountLimit() {
        bitField0_ = (bitField0_ & ~0x00000020);
        weaponCountLimit_ = 0;
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


      // @@protoc_insertion_point(builder_scope:StoreWeightLimitNotify)
    }

    // @@protoc_insertion_point(class_scope:StoreWeightLimitNotify)
    private static final emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify();
    }

    public static emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StoreWeightLimitNotify>
        PARSER = new com.google.protobuf.AbstractParser<StoreWeightLimitNotify>() {
      @java.lang.Override
      public StoreWeightLimitNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<StoreWeightLimitNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StoreWeightLimitNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StoreWeightLimitNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StoreWeightLimitNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034StoreWeightLimitNotify.proto\032\017StoreTyp" +
      "e.proto\"\306\001\n\026StoreWeightLimitNotify\022\036\n\nst" +
      "ore_type\030\017 \001(\0162\n.StoreType\022\024\n\014weight_lim" +
      "it\030\006 \001(\r\022\035\n\025reliquary_count_limit\030\002 \001(\r\022" +
      "\034\n\024material_count_limit\030\n \001(\r\022\035\n\025furnitu" +
      "re_count_limit\030\010 \001(\r\022\032\n\022weapon_count_lim" +
      "it\030\r \001(\rB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.StoreTypeOuterClass.getDescriptor(),
        });
    internal_static_StoreWeightLimitNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_StoreWeightLimitNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StoreWeightLimitNotify_descriptor,
        new java.lang.String[] { "StoreType", "WeightLimit", "ReliquaryCountLimit", "MaterialCountLimit", "FurnitureCountLimit", "WeaponCountLimit", });
    emu.grasscutter.net.proto.StoreTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}