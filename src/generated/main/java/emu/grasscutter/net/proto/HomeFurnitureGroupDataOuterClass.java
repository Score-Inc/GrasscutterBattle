// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeFurnitureGroupData.proto

package emu.grasscutter.net.proto;

public final class HomeFurnitureGroupDataOuterClass {
  private HomeFurnitureGroupDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeFurnitureGroupDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeFurnitureGroupData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .HomeFurnitureData virtualFurnitureList = 12;</code>
     */
    java.util.List<emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData> 
        getVirtualFurnitureListList();
    /**
     * <code>repeated .HomeFurnitureData virtualFurnitureList = 12;</code>
     */
    emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData getVirtualFurnitureList(int index);
    /**
     * <code>repeated .HomeFurnitureData virtualFurnitureList = 12;</code>
     */
    int getVirtualFurnitureListCount();
    /**
     * <code>repeated .HomeFurnitureData virtualFurnitureList = 12;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> 
        getVirtualFurnitureListOrBuilderList();
    /**
     * <code>repeated .HomeFurnitureData virtualFurnitureList = 12;</code>
     */
    emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder getVirtualFurnitureListOrBuilder(
        int index);

    /**
     * <code>uint32 groupFurnitureIndex = 4;</code>
     * @return The groupFurnitureIndex.
     */
    int getGroupFurnitureIndex();
  }
  /**
   * Protobuf type {@code HomeFurnitureGroupData}
   */
  public static final class HomeFurnitureGroupData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeFurnitureGroupData)
      HomeFurnitureGroupDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeFurnitureGroupData.newBuilder() to construct.
    private HomeFurnitureGroupData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeFurnitureGroupData() {
      virtualFurnitureList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeFurnitureGroupData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.internal_static_HomeFurnitureGroupData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.internal_static_HomeFurnitureGroupData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData.class, emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData.Builder.class);
    }

    public static final int VIRTUALFURNITURELIST_FIELD_NUMBER = 12;
    @SuppressWarnings("serial")
    private java.util.List<emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData> virtualFurnitureList_;
    /**
     * <code>repeated .HomeFurnitureData virtualFurnitureList = 12;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData> getVirtualFurnitureListList() {
      return virtualFurnitureList_;
    }
    /**
     * <code>repeated .HomeFurnitureData virtualFurnitureList = 12;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> 
        getVirtualFurnitureListOrBuilderList() {
      return virtualFurnitureList_;
    }
    /**
     * <code>repeated .HomeFurnitureData virtualFurnitureList = 12;</code>
     */
    @java.lang.Override
    public int getVirtualFurnitureListCount() {
      return virtualFurnitureList_.size();
    }
    /**
     * <code>repeated .HomeFurnitureData virtualFurnitureList = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData getVirtualFurnitureList(int index) {
      return virtualFurnitureList_.get(index);
    }
    /**
     * <code>repeated .HomeFurnitureData virtualFurnitureList = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder getVirtualFurnitureListOrBuilder(
        int index) {
      return virtualFurnitureList_.get(index);
    }

    public static final int GROUPFURNITUREINDEX_FIELD_NUMBER = 4;
    private int groupFurnitureIndex_ = 0;
    /**
     * <code>uint32 groupFurnitureIndex = 4;</code>
     * @return The groupFurnitureIndex.
     */
    @java.lang.Override
    public int getGroupFurnitureIndex() {
      return groupFurnitureIndex_;
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
      if (groupFurnitureIndex_ != 0) {
        output.writeUInt32(4, groupFurnitureIndex_);
      }
      for (int i = 0; i < virtualFurnitureList_.size(); i++) {
        output.writeMessage(12, virtualFurnitureList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (groupFurnitureIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, groupFurnitureIndex_);
      }
      for (int i = 0; i < virtualFurnitureList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, virtualFurnitureList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData other = (emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData) obj;

      if (!getVirtualFurnitureListList()
          .equals(other.getVirtualFurnitureListList())) return false;
      if (getGroupFurnitureIndex()
          != other.getGroupFurnitureIndex()) return false;
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
      if (getVirtualFurnitureListCount() > 0) {
        hash = (37 * hash) + VIRTUALFURNITURELIST_FIELD_NUMBER;
        hash = (53 * hash) + getVirtualFurnitureListList().hashCode();
      }
      hash = (37 * hash) + GROUPFURNITUREINDEX_FIELD_NUMBER;
      hash = (53 * hash) + getGroupFurnitureIndex();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData prototype) {
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
     * Protobuf type {@code HomeFurnitureGroupData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeFurnitureGroupData)
        emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.internal_static_HomeFurnitureGroupData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.internal_static_HomeFurnitureGroupData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData.class, emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData.newBuilder()
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
        if (virtualFurnitureListBuilder_ == null) {
          virtualFurnitureList_ = java.util.Collections.emptyList();
        } else {
          virtualFurnitureList_ = null;
          virtualFurnitureListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        groupFurnitureIndex_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.internal_static_HomeFurnitureGroupData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData build() {
        emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData buildPartial() {
        emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData result = new emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData result) {
        if (virtualFurnitureListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            virtualFurnitureList_ = java.util.Collections.unmodifiableList(virtualFurnitureList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.virtualFurnitureList_ = virtualFurnitureList_;
        } else {
          result.virtualFurnitureList_ = virtualFurnitureListBuilder_.build();
        }
      }

      private void buildPartial0(emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.groupFurnitureIndex_ = groupFurnitureIndex_;
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
        if (other instanceof emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData) {
          return mergeFrom((emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData other) {
        if (other == emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData.getDefaultInstance()) return this;
        if (virtualFurnitureListBuilder_ == null) {
          if (!other.virtualFurnitureList_.isEmpty()) {
            if (virtualFurnitureList_.isEmpty()) {
              virtualFurnitureList_ = other.virtualFurnitureList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureVirtualFurnitureListIsMutable();
              virtualFurnitureList_.addAll(other.virtualFurnitureList_);
            }
            onChanged();
          }
        } else {
          if (!other.virtualFurnitureList_.isEmpty()) {
            if (virtualFurnitureListBuilder_.isEmpty()) {
              virtualFurnitureListBuilder_.dispose();
              virtualFurnitureListBuilder_ = null;
              virtualFurnitureList_ = other.virtualFurnitureList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              virtualFurnitureListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getVirtualFurnitureListFieldBuilder() : null;
            } else {
              virtualFurnitureListBuilder_.addAllMessages(other.virtualFurnitureList_);
            }
          }
        }
        if (other.getGroupFurnitureIndex() != 0) {
          setGroupFurnitureIndex(other.getGroupFurnitureIndex());
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
                groupFurnitureIndex_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 32
              case 98: {
                emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData m =
                    input.readMessage(
                        emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.parser(),
                        extensionRegistry);
                if (virtualFurnitureListBuilder_ == null) {
                  ensureVirtualFurnitureListIsMutable();
                  virtualFurnitureList_.add(m);
                } else {
                  virtualFurnitureListBuilder_.addMessage(m);
                }
                break;
              } // case 98
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

      private java.util.List<emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData> virtualFurnitureList_ =
        java.util.Collections.emptyList();
      private void ensureVirtualFurnitureListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          virtualFurnitureList_ = new java.util.ArrayList<emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData>(virtualFurnitureList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData, emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.Builder, emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> virtualFurnitureListBuilder_;

      /**
       * <code>repeated .HomeFurnitureData virtualFurnitureList = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData> getVirtualFurnitureListList() {
        if (virtualFurnitureListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(virtualFurnitureList_);
        } else {
          return virtualFurnitureListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .HomeFurnitureData virtualFurnitureList = 12;</code>
       */
      public int getVirtualFurnitureListCount() {
        if (virtualFurnitureListBuilder_ == null) {
          return virtualFurnitureList_.size();
        } else {
          return virtualFurnitureListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .HomeFurnitureData virtualFurnitureList = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData getVirtualFurnitureList(int index) {
        if (virtualFurnitureListBuilder_ == null) {
          return virtualFurnitureList_.get(index);
        } else {
          return virtualFurnitureListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .HomeFurnitureData virtualFurnitureList = 12;</code>
       */
      public Builder setVirtualFurnitureList(
          int index, emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData value) {
        if (virtualFurnitureListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureVirtualFurnitureListIsMutable();
          virtualFurnitureList_.set(index, value);
          onChanged();
        } else {
          virtualFurnitureListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeFurnitureData virtualFurnitureList = 12;</code>
       */
      public Builder setVirtualFurnitureList(
          int index, emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.Builder builderForValue) {
        if (virtualFurnitureListBuilder_ == null) {
          ensureVirtualFurnitureListIsMutable();
          virtualFurnitureList_.set(index, builderForValue.build());
          onChanged();
        } else {
          virtualFurnitureListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeFurnitureData virtualFurnitureList = 12;</code>
       */
      public Builder addVirtualFurnitureList(emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData value) {
        if (virtualFurnitureListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureVirtualFurnitureListIsMutable();
          virtualFurnitureList_.add(value);
          onChanged();
        } else {
          virtualFurnitureListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeFurnitureData virtualFurnitureList = 12;</code>
       */
      public Builder addVirtualFurnitureList(
          int index, emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData value) {
        if (virtualFurnitureListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureVirtualFurnitureListIsMutable();
          virtualFurnitureList_.add(index, value);
          onChanged();
        } else {
          virtualFurnitureListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeFurnitureData virtualFurnitureList = 12;</code>
       */
      public Builder addVirtualFurnitureList(
          emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.Builder builderForValue) {
        if (virtualFurnitureListBuilder_ == null) {
          ensureVirtualFurnitureListIsMutable();
          virtualFurnitureList_.add(builderForValue.build());
          onChanged();
        } else {
          virtualFurnitureListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeFurnitureData virtualFurnitureList = 12;</code>
       */
      public Builder addVirtualFurnitureList(
          int index, emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.Builder builderForValue) {
        if (virtualFurnitureListBuilder_ == null) {
          ensureVirtualFurnitureListIsMutable();
          virtualFurnitureList_.add(index, builderForValue.build());
          onChanged();
        } else {
          virtualFurnitureListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeFurnitureData virtualFurnitureList = 12;</code>
       */
      public Builder addAllVirtualFurnitureList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData> values) {
        if (virtualFurnitureListBuilder_ == null) {
          ensureVirtualFurnitureListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, virtualFurnitureList_);
          onChanged();
        } else {
          virtualFurnitureListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .HomeFurnitureData virtualFurnitureList = 12;</code>
       */
      public Builder clearVirtualFurnitureList() {
        if (virtualFurnitureListBuilder_ == null) {
          virtualFurnitureList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          virtualFurnitureListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .HomeFurnitureData virtualFurnitureList = 12;</code>
       */
      public Builder removeVirtualFurnitureList(int index) {
        if (virtualFurnitureListBuilder_ == null) {
          ensureVirtualFurnitureListIsMutable();
          virtualFurnitureList_.remove(index);
          onChanged();
        } else {
          virtualFurnitureListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .HomeFurnitureData virtualFurnitureList = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.Builder getVirtualFurnitureListBuilder(
          int index) {
        return getVirtualFurnitureListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .HomeFurnitureData virtualFurnitureList = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder getVirtualFurnitureListOrBuilder(
          int index) {
        if (virtualFurnitureListBuilder_ == null) {
          return virtualFurnitureList_.get(index);  } else {
          return virtualFurnitureListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .HomeFurnitureData virtualFurnitureList = 12;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> 
           getVirtualFurnitureListOrBuilderList() {
        if (virtualFurnitureListBuilder_ != null) {
          return virtualFurnitureListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(virtualFurnitureList_);
        }
      }
      /**
       * <code>repeated .HomeFurnitureData virtualFurnitureList = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.Builder addVirtualFurnitureListBuilder() {
        return getVirtualFurnitureListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.getDefaultInstance());
      }
      /**
       * <code>repeated .HomeFurnitureData virtualFurnitureList = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.Builder addVirtualFurnitureListBuilder(
          int index) {
        return getVirtualFurnitureListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.getDefaultInstance());
      }
      /**
       * <code>repeated .HomeFurnitureData virtualFurnitureList = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.Builder> 
           getVirtualFurnitureListBuilderList() {
        return getVirtualFurnitureListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData, emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.Builder, emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> 
          getVirtualFurnitureListFieldBuilder() {
        if (virtualFurnitureListBuilder_ == null) {
          virtualFurnitureListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData, emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.Builder, emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder>(
                  virtualFurnitureList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          virtualFurnitureList_ = null;
        }
        return virtualFurnitureListBuilder_;
      }

      private int groupFurnitureIndex_ ;
      /**
       * <code>uint32 groupFurnitureIndex = 4;</code>
       * @return The groupFurnitureIndex.
       */
      @java.lang.Override
      public int getGroupFurnitureIndex() {
        return groupFurnitureIndex_;
      }
      /**
       * <code>uint32 groupFurnitureIndex = 4;</code>
       * @param value The groupFurnitureIndex to set.
       * @return This builder for chaining.
       */
      public Builder setGroupFurnitureIndex(int value) {
        
        groupFurnitureIndex_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 groupFurnitureIndex = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupFurnitureIndex() {
        bitField0_ = (bitField0_ & ~0x00000002);
        groupFurnitureIndex_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeFurnitureGroupData)
    }

    // @@protoc_insertion_point(class_scope:HomeFurnitureGroupData)
    private static final emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData();
    }

    public static emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeFurnitureGroupData>
        PARSER = new com.google.protobuf.AbstractParser<HomeFurnitureGroupData>() {
      @java.lang.Override
      public HomeFurnitureGroupData parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeFurnitureGroupData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeFurnitureGroupData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeFurnitureGroupData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeFurnitureGroupData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034HomeFurnitureGroupData.proto\032\027HomeFurn" +
      "itureData.proto\"g\n\026HomeFurnitureGroupDat" +
      "a\0220\n\024virtualFurnitureList\030\014 \003(\0132\022.HomeFu" +
      "rnitureData\022\033\n\023groupFurnitureIndex\030\004 \001(\r" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.getDescriptor(),
        });
    internal_static_HomeFurnitureGroupData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeFurnitureGroupData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeFurnitureGroupData_descriptor,
        new java.lang.String[] { "VirtualFurnitureList", "GroupFurnitureIndex", });
    emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
